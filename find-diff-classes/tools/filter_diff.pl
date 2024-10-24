#!/usr/bin/perl

use strict;
use warnings;

my $state = 'top';
my $keep = 1;
my $saved = '';
my $savedOld = '';
my $savedNew = '';
my $nDropped = 0;

# Did a virtualinvoke on java.lang.Object change to an interfaceinvoke (on a probably different interface type)?
# Need to call with arguments swapped too to check the other direction.
sub isVirtualInvokeToInterfaceInvoke($$) {
	my ($old, $new) = @_;
	if ($state eq 'inChange') {
		my ($v, $w, $rest) = $old =~ m/\A< (v\d+) = virtualinvoke (v\d+)\.<java\.lang\.Object: (.+;)\n/;
		#print "maybeOutput(): old=<$old>, new=<$new>, v=<$v>, w=<$w>, rest=<$rest>\n";		#DEBUG
		if (defined $v and $new =~ m/\A> \Q$v\E = interfaceinvoke \Q$w\E\.<.+: \Q$rest\E\n\z/) {
			return 1;
		}
	}

	return 0;
}

# Does the difference look like one of the probably-uninteresting renumbering-only changes to a staticinvoke of a method named bootstrap$() that occurred in org.jsoup:jsoup:1.16.2?
# Reflexive so no need to call twice.
#
# Example from jsoup:
# 532c532
# < v4 = staticinvoke <org.jsoup.internal.StringUtil$init__17: java.util.function.Supplier bootstrap$()>();
# ---
# > v4 = staticinvoke <org.jsoup.internal.StringUtil$init__6: java.util.function.Supplier bootstrap$()>();
sub isBootstrapMethodRenumbering($$) {
	my ($old, $new) = @_;
	if ($state eq 'inChange') {
		my ($start, $end) = $old =~ m/\A< (v\d+ = staticinvoke <[^:]+\$[^:]+__)\d+(: \S+ bootstrap\$\(.*\)>\(.*\);\n)/;
		if (defined $start and $new =~ m/\A> \Q$start\E\d+\Q$end\E\z/) {
			return 1;
		}
	}

	return 0;
}

sub maybeOutput() {
#	print STDERR "maybeOutput() called, state=<$state>, length(saved)=<" . length($saved) . ">.\n";		#DEBUG
	# Decide whether to keep this change
	if (isVirtualInvokeToInterfaceInvoke($savedOld, $savedNew) || isVirtualInvokeToInterfaceInvoke($savedNew, $savedOld)) {
		$keep = 0;
	} elsif (isBootstrapMethodRenumbering($savedOld, $savedNew)) {
		$keep = 0;
	} else {
		$keep = 1;
	}

	if ($keep) {
		print $saved;
	} else {
		++$nDropped;
	}

	$keep = 1;
	$saved = '';
	$savedOld = '';
	$savedNew = '';
}

while (<>) {
#	print STDERR "Read <$_>.\n";		#DEBUG
	#if (/^(?:[<>] |---)/) {
	if (/^(?:(< .*\n?)|(> .*\n?)|(---\n?))\z/) {
		#print STDERR "defined(\$1)=<" . defined($1) . ">\n";		#DEBUG
		$savedOld .= $1 if defined $1;
		$savedNew .= $2 if defined $2;
		$saved .= $_;
		#print STDERR "savedOld=<$savedOld>\n";		#DEBUG
		#print STDERR "savedNew=<$savedNew>\n";		#DEBUG
	} else {
		maybeOutput();
		$saved = $_;

		if (/^\d+(?:,\d+)?c\d+(?:,\d+)?\n/) {
			$state = 'inChange';
		} elsif (/^\d+a\d+(?:,\d+)?\n/) {
			$state = 'inAdd';
		} elsif (/^\d+(?:,\d+)?d\d+\n/) {
			$state = 'inDel';
		} else {
			die "Expected a change, addition or deletion at line $.";
		}
	}
}

maybeOutput();

print STDERR "$nDropped changes dropped.\n";
