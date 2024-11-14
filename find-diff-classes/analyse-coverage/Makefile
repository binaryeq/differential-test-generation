# Designed to be run with make -f analyse-coverage/Makefile from the parent dir.

DB := /home/wtwhite/code/craw-redhat-oss/sqlite/crawl.sqlite

all: upload-to-db.done

# Have to do these in a single recipe since SQLite forbids concurrent writes
upload-to-db.done: all_tests.tsv all_covered_methods.tsv
	sqlite3 $(DB) < analyse-coverage/import_all_tests.sql
	sqlite3 $(DB) < analyse-coverage/import_all_covered_methods.sql
	touch $@

include generated.covered_methods.mk

generated.covered_methods.mk:
	find run -name '*.jacoco.xml' | perl -lne 'my $$target = $$_; $$target =~ s|\.jacoco\.xml$$|.covered_methods.tsv|; print "$$target: $$_\nall_covered_methods.tsv: $$target\n";' > $@

all_covered_methods.tsv: generated.covered_methods.mk
	find run -name '*.covered_methods.tsv' | xargs cat | sort > $@

%.covered_methods.tsv: %.jacoco.xml
	java -cp analyse-coverage/target/classes io.github.bineq.Main --segment-path $< > $@

all_tests.tsv:
	find run -name '*.jacoco.xml' | perl -lne 'print join("\t", $$1, $$2, $$3, $$4, $$5) if m|^run/([^/]+)/(.+)/([^/]+)/([^/]+)/([^/]+)\.jacoco\.xml$$|' > $@
