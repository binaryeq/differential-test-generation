/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 11 00:25:38 GMT 2024
 */

package org.glassfish.jersey.client.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.glassfish.jersey.client.internal.LocalizationMessages;
import org.glassfish.jersey.internal.l10n.Localizable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalizationMessages_ESTest extends LocalizationMessages_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      String string0 = LocalizationMessages.USE_ENCODING_IGNORED(object0, object1, object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      String string0 = LocalizationMessages.USE_ENCODING_IGNORED(object0, object1, object1);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Object object0 = new Object();
      String string0 = LocalizationMessages.NEGATIVE_CHUNK_SIZE("Negative chunked HTTP transfer coding chunk size value specified in the client configuration property: [null] Reverting to programmatically set default: [null]", object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableAUTHENTICATION_CREDENTIALS_MISSING_BASIC();
      assertEquals("authentication.credentials.missing.basic", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCOLLECTION_UPDATER_TYPE_UNSUPPORTED();
      assertEquals("collection.updater.type.unsupported", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_INPUT_PARAMETER((Object) null);
      assertEquals("null.input.parameter", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_CLOSING_OUTPUT_STREAM();
      assertEquals("error.closing.output.stream", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_KEYSTORE_PASWORD();
      Localizable localizable1 = LocalizationMessages.localizableNEGATIVE_INPUT_PARAMETER(localizable0);
      assertEquals("null.keystore.pasword", localizable0.getKey());
      assertEquals("negative.input.parameter", localizable1.getKey());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableAUTHENTICATION_CREDENTIALS_REQUEST_PASSWORD_UNSUPPORTED();
      assertEquals("authentication.credentials.request.password.unsupported", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_CONNECTOR_PROVIDER();
      Object object0 = new Object();
      Localizable localizable1 = LocalizationMessages.localizableUSE_ENCODING_IGNORED("The proxy URI (\"java.lang.Object@7d8eecbb\") property MUST be an instance of String or URI.", object0, localizable0);
      assertEquals("null.connector.provider", localizable0.getKey());
      assertEquals("use.encoding.ignored", localizable1.getKey());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_KEYSTORE();
      assertEquals("null.keystore", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Object object0 = new Object();
      Localizable localizable0 = LocalizationMessages.localizableIGNORED_ASYNC_THREADPOOL_SIZE(object0);
      assertEquals("ignored.async.threadpool.size", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Object object0 = new Object();
      Localizable localizable0 = LocalizationMessages.localizableERROR_HTTP_METHOD_ENTITY_NULL(object0);
      assertEquals("error.http.method.entity.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizablePOSTINVOCATION_INTERCEPTOR_RESOLVE();
      assertEquals("postinvocation.interceptor.resolve", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizablePOSTINVOCATION_INTERCEPTOR_MULTIPLE_RESOLVES();
      assertEquals("postinvocation.interceptor.multiple.resolves", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_URI_BUILDER_NULL();
      assertEquals("client.uri.builder.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableREQUEST_ENTITY_ALREADY_WRITTEN();
      assertEquals("request.entity.already.written", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_INVOCATION_LINK_NULL();
      Localizable localizable1 = LocalizationMessages.localizableNEGATIVE_CHUNK_SIZE(localizable0, localizable0);
      assertEquals("negative.chunk.size", localizable1.getKey());
      assertEquals("client.invocation.link.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_RESPONSE("Error during initialization of random generator of Digest authentication.");
      assertEquals("error.service.locator.provider.instance.response", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_RESPONSE_RESOLVED_URI_NOT_ABSOLUTE();
      assertEquals("client.response.resolved.uri.not.absolute", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_RX_PROVIDER_NULL();
      assertEquals("client.rx.provider.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizablePREINVOCATION_INTERCEPTOR_MULTIPLE_ABORTIONS();
      assertEquals("preinvocation.interceptor.multiple.abortions", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableHTTPURLCONNECTION_REPLACES_GET_WITH_ENTITY();
      assertEquals("httpurlconnection.replaces.get.with.entity", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_REQUEST_CANCELLED();
      assertEquals("error.request.cancelled", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_URI_TEMPLATE_NULL();
      assertEquals("client.uri.template.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_DIGEST_FILTER_GENERATOR();
      assertEquals("error.digest.filter.generator", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableAUTHENTICATION_CREDENTIALS_NOT_PROVIDED_BASIC();
      assertEquals("authentication.credentials.not.provided.basic", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableREQUEST_ENTITY_WRITER_NULL();
      assertEquals("request.entity.writer.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_INVOCATION_BUILDER();
      assertEquals("null.invocation.builder", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizablePREINVOCATION_INTERCEPTOR_ABORT_WITH();
      assertEquals("preinvocation.interceptor.abortWith", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Object object0 = new Object();
      Localizable localizable0 = LocalizationMessages.localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_REQUEST(object0);
      assertEquals("error.service.locator.provider.instance.request", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableUNEXPECTED_ERROR_RESPONSE_PROCESSING();
      Localizable localizable1 = LocalizationMessages.localizableWRONG_PROXY_URI_TYPE(localizable0);
      assertEquals("unexpected.error.response.processing", localizable0.getKey());
      assertEquals("wrong.proxy.uri.type", localizable1.getKey());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCHUNKED_INPUT_MEDIA_TYPE_NULL();
      assertEquals("chunked.input.media.type.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_SSL_CONTEXT();
      assertEquals("null.ssl.context", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_PARAMETER_TYPE_PROCESSING("Invocation builder must not be null.");
      assertEquals("error.parameter.type.processing", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_EXECUTOR_SERVICE();
      Localizable localizable1 = LocalizationMessages.localizableUSING_FIXED_ASYNC_THREADPOOL(localizable0);
      assertEquals("null.executor.service", localizable0.getKey());
      assertEquals("using.fixed.async.threadpool", localizable1.getKey());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Object object0 = new Object();
      Localizable localizable0 = LocalizationMessages.localizableERROR_LISTENER_CLOSE(object0);
      assertEquals("error.listener.close", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_SCHEDULED_EXECUTOR_SERVICE();
      assertEquals("null.scheduled.executor.service", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_RESPONSE_STATUS_NULL();
      assertEquals("client.response.status.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_COMMITTING_OUTPUT_STREAM();
      assertEquals("error.committing.output.stream", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCHUNKED_INPUT_STREAM_CLOSING_ERROR();
      assertEquals("chunked.input.stream.closing.error", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCHUNKED_INPUT_CLOSED();
      assertEquals("chunked.input.closed", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_KEYSTORE_PASWORD();
      Localizable localizable1 = LocalizationMessages.localizableERROR_LISTENER_INIT(localizable0);
      assertEquals("error.listener.init", localizable1.getKey());
      assertEquals("null.keystore.pasword", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_INSTANCE_CLOSED();
      assertEquals("client.instance.closed", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_URI_NULL();
      assertEquals("client.uri.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableRESPONSE_TYPE_IS_NULL();
      assertEquals("response.type.is.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableNULL_TRUSTSTORE();
      assertEquals("null.truststore", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableRESTRICTED_HEADER_PROPERTY_SETTING_TRUE("Restricted headers are not enabled using [Unsupported collection type.] system property (setting only takes effect on connections created after the property has been set/changed).");
      assertEquals("restricted.header.property.setting.true", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableRESPONSE_TO_EXCEPTION_CONVERSION_FAILED();
      assertEquals("response.to.exception.conversion.failed", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizablePREINVOCATION_INTERCEPTOR_EXCEPTION();
      assertEquals("preinvocation.interceptor.exception", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableEXCEPTION_SUPPRESSED();
      assertEquals("exception.suppressed", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_SHUTDOWNHOOK_CLOSE("Unexpected error during response processing.");
      assertEquals("error.shutdownhook.close", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizablePOSTINVOCATION_INTERCEPTOR_EXCEPTION();
      assertEquals("postinvocation.interceptor.exception", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Object object0 = new Object();
      Localizable localizable0 = LocalizationMessages.localizableDIGEST_FILTER_QOP_UNSUPPORTED(object0);
      assertEquals("digest.filter.qop.unsupported", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableRESTRICTED_HEADER_POSSIBLY_IGNORED("Unsupported collection type.");
      assertEquals("restricted.header.possibly.ignored", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableAUTHENTICATION_CREDENTIALS_MISSING_DIGEST();
      assertEquals("authentication.credentials.missing.digest", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_URI_BUILDER_NULL();
      assertEquals("URI builder of the newly created target must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_KEYSTORE();
      assertEquals("Custom key store, if set, must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      String string0 = LocalizationMessages.AUTHENTICATION_CREDENTIALS_REQUEST_PASSWORD_UNSUPPORTED();
      assertEquals("Unsupported password type class. Password passed in the request property must be String or byte[].", string0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_HTTP_METHOD_ENTITY_NOT_NULL("ClientRequestContext#abortWith has been utilized multiple times.");
      assertEquals("Entity must be null for http method ClientRequestContext#abortWith has been utilized multiple times..", string0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      String string0 = LocalizationMessages.POSTINVOCATION_INTERCEPTOR_MULTIPLE_RESOLVES();
      assertEquals("ExceptionContext#resolve has been utilized multiple times.", string0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableERROR_HTTP_METHOD_ENTITY_NOT_NULL("Custom key store password must not be null.");
      assertEquals("error.http.method.entity.not.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_RX_PROVIDER_NULL();
      assertEquals("RxInvokerProvider returned null.", string0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = LocalizationMessages.PREINVOCATION_INTERCEPTOR_EXCEPTION();
      assertEquals("PreInvocationInterceptor threw exception.", string0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_SCHEDULED_EXECUTOR_SERVICE();
      assertEquals("ScheduledExecutorService must not be set to null.", string0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_SHUTDOWNHOOK_CLOSE("URI of the newly created target must not be null.");
      assertEquals("Client shutdown hook URI of the newly created target must not be null. failed.", string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_KEYSTORE_PASWORD();
      assertEquals("Custom key store password must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Object object0 = new Object();
      String string0 = LocalizationMessages.RESTRICTED_HEADER_PROPERTY_SETTING_FALSE(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_URI_NULL();
      assertEquals("URI of the newly created target must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = LocalizationMessages.RESPONSE_TO_EXCEPTION_CONVERSION_FAILED();
      assertEquals("Failed to convert a response into an exception.", string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_INVOCATION_BUILDER();
      assertEquals("Invocation builder must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = LocalizationMessages.CHUNKED_INPUT_CLOSED();
      assertEquals("Chunked input has been closed already.", string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_RESPONSE_RESOLVED_URI_NULL();
      assertEquals("Client response resolved URI must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = LocalizationMessages.PREINVOCATION_INTERCEPTOR_ABORT_WITH();
      assertEquals("PreInvocationInterceptor utilized ClientRequestContext#abortWith.", string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = LocalizationMessages.AUTHENTICATION_CREDENTIALS_NOT_PROVIDED_BASIC();
      assertEquals("No credentials are provided for basic authentication. Request will be sent without an Authorization header.", string0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = LocalizationMessages.IGNORED_ASYNC_THREADPOOL_SIZE("Client response resolved URI must be absolute.");
      assertEquals("Zero or negative asynchronous thread pool size specified in the client configuration property: [Client response resolved URI must be absolute.] Using default cached thread pool.", string0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = LocalizationMessages.RESTRICTED_HEADER_PROPERTY_SETTING_TRUE("Client response resolved URI must not be null.");
      assertEquals("Restricted headers are enabled using [Client response resolved URI must not be null.] system property(setting only takes effect onconnections created after the property has been set/changed).", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      LocalizationMessages localizationMessages0 = new LocalizationMessages();
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_INPUT_PARAMETER("Custom trust store, if set, must not be null.");
      assertEquals("Input method parameter Custom trust store, if set, must not be null. must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      String string0 = LocalizationMessages.USING_FIXED_ASYNC_THREADPOOL("Exceptions were thrown. See suppressed exceptions for the list.");
      assertEquals("Using fixed-size thread pool of size [Exceptions were thrown. See suppressed exceptions for the list.] for asynchronous client invocations.", string0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_LISTENER_CLOSE("The entity was already written in this request. The entity can be written (serialized into the output stream) only once per a request.");
      assertEquals("ClientLifecycleListener The entity was already written in this request. The entity can be written (serialized into the output stream) only once per a request. failed to close properly.", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_REQUEST_CANCELLED();
      assertEquals("Request cancelled by the client call.", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_REQUEST("Custom key store, if set, must not be null.");
      assertEquals("Incorrect type of request instance Custom key store, if set, must not be null.. Parameter must be a default Jersey ClientRequestContext implementation.", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = LocalizationMessages.WRONG_PROXY_URI_TYPE("PostInvocationInterceptor threw exception.");
      assertEquals("The proxy URI (\"PostInvocationInterceptor threw exception.\") property MUST be an instance of String or URI.", string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_INVOCATION_LINK_NULL();
      assertEquals("Link of the newly created invocation must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = LocalizationMessages.RESPONSE_TYPE_IS_NULL();
      assertEquals("Requested response type is null.", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = LocalizationMessages.PREINVOCATION_INTERCEPTOR_MULTIPLE_ABORTIONS();
      assertEquals("ClientRequestContext#abortWith has been utilized multiple times.", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = LocalizationMessages.CHUNKED_INPUT_MEDIA_TYPE_NULL();
      assertEquals("Specified chunk media type must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_CONNECTOR_PROVIDER();
      assertEquals("ConnectorProvider must not be set to null.", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = LocalizationMessages.NEGATIVE_INPUT_PARAMETER("Requested response type is null.");
      assertEquals("\"Input parameter Requested response type is null. must not be negative.\"", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_URI_TEMPLATE_NULL();
      assertEquals("URI template of the newly created target must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = LocalizationMessages.REQUEST_ENTITY_WRITER_NULL();
      assertEquals("The entity of the client request is null.", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_INSTANCE_CLOSED();
      assertEquals("Client instance has been closed.", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = LocalizationMessages.AUTHENTICATION_CREDENTIALS_MISSING_DIGEST();
      assertEquals("Credentials must be defined for digest authentication. Define username and password either when creating HttpAuthenticationFeature or use specific credentials for each request using the request property (see HttpAuthenticationFeature).", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = LocalizationMessages.AUTHENTICATION_CREDENTIALS_MISSING_BASIC();
      assertEquals("Credentials must be defined for basic authentication. Define username and password either when creating HttpAuthenticationFeature or use specific credentials for each request using the request property (see HttpAuthenticationFeature).", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_RX_PROVIDER_NOT_REGISTERED("ScheduledExecutorService must not be set to null.");
      assertEquals("RxInvokerProvider for type ScheduledExecutorService must not be set to null. is not registered.", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_TARGET_LINK_NULL();
      Localizable localizable1 = LocalizationMessages.localizableCLIENT_RX_PROVIDER_NOT_REGISTERED(localizable0);
      assertEquals("client.rx.provider.not.registered", localizable1.getKey());
      assertEquals("client.target.link.null", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = LocalizationMessages.UNEXPECTED_ERROR_RESPONSE_PROCESSING();
      assertEquals("Unexpected error during response processing.", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_HTTP_METHOD_ENTITY_NULL("PreInvocationInterceptor threw exception.");
      assertEquals("Entity must not be null for http method PreInvocationInterceptor threw exception..", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = LocalizationMessages.RESTRICTED_HEADER_POSSIBLY_IGNORED("PostInvocationInterceptor threw exception.");
      assertEquals("Attempt to send restricted header(s) while the [PostInvocationInterceptor threw exception.] system property not set. Header(s) will possibly be ignored.", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Object object0 = new Object();
      String string0 = LocalizationMessages.ERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_RESPONSE(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = LocalizationMessages.POSTINVOCATION_INTERCEPTOR_EXCEPTION();
      assertEquals("PostInvocationInterceptor threw exception.", string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = LocalizationMessages.REQUEST_ENTITY_ALREADY_WRITTEN();
      assertEquals("The entity was already written in this request. The entity can be written (serialized into the output stream) only once per a request.", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Localizable localizable0 = LocalizationMessages.localizableCLIENT_RESPONSE_RESOLVED_URI_NULL();
      String string0 = LocalizationMessages.DIGEST_FILTER_QOP_UNSUPPORTED(localizable0);
      assertEquals("The qop (quality of protection) = Client response resolved URI must not be null. extension requested by the server is not supported by Jersey HttpDigestAuthFilter. Cannot authenticate against the server using Http Digest Authentication.", string0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = LocalizationMessages.POSTINVOCATION_INTERCEPTOR_RESOLVE();
      assertEquals("ExceptionContext#resolve has been utilized.", string0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_COMMITTING_OUTPUT_STREAM();
      assertEquals("Error while committing the request output stream.", string0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Object object0 = new Object();
      Localizable localizable0 = LocalizationMessages.localizableRESTRICTED_HEADER_PROPERTY_SETTING_FALSE(object0);
      assertEquals("restricted.header.property.setting.false", localizable0.getKey());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_RESPONSE_RESOLVED_URI_NOT_ABSOLUTE();
      assertEquals("Client response resolved URI must be absolute.", string0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_TRUSTSTORE();
      assertEquals("Custom trust store, if set, must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_PARAMETER_TYPE_PROCESSING("ExceptionContext#resolve has been utilized.");
      assertEquals("Could not process parameter type ExceptionContext#resolve has been utilized..", string0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      String string0 = LocalizationMessages.CHUNKED_INPUT_STREAM_CLOSING_ERROR();
      assertEquals("Error closing chunked inputs underlying response input stream.", string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = LocalizationMessages.EXCEPTION_SUPPRESSED();
      assertEquals("Exceptions were thrown. See suppressed exceptions for the list.", string0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_DIGEST_FILTER_GENERATOR();
      assertEquals("Error during initialization of random generator of Digest authentication.", string0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      String string0 = LocalizationMessages.ERROR_CLOSING_OUTPUT_STREAM();
      assertEquals("Error when closing the output stream.", string0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = LocalizationMessages.HTTPURLCONNECTION_REPLACES_GET_WITH_ENTITY();
      assertEquals("Detected non-empty entity on a HTTP GET request. The underlying HTTP transport connector may decide to change the request method to POST.", string0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Object object0 = new Object();
      String string0 = LocalizationMessages.ERROR_LISTENER_INIT(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_SSL_CONTEXT();
      assertEquals("Custom client SSL context, if set, must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_RESPONSE_STATUS_NULL();
      assertEquals("Client response status must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = LocalizationMessages.CLIENT_TARGET_LINK_NULL();
      assertEquals("Link to the newly created target must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = LocalizationMessages.COLLECTION_UPDATER_TYPE_UNSUPPORTED();
      assertEquals("Unsupported collection type.", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      String string0 = LocalizationMessages.NULL_EXECUTOR_SERVICE();
      assertEquals("ExecutorService must not be set to null.", string0);
  }
}
