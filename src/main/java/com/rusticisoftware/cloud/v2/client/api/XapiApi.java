package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import java.time.OffsetDateTime;
import com.rusticisoftware.cloud.v2.client.model.StringResultSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiCredentialPostSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiCredentialSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiCredentialsListSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiStatementPipeListSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiStatementPipePostSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiStatementPipePutSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiStatementPipeSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
public class XapiApi {
  private ApiClient apiClient;

  public XapiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public XapiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an xAPI statement pipe.
   * Create an xAPI statement pipe.
   * @param xapiStatementPipe  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createStatementPipe(XapiStatementPipePostSchema xapiStatementPipe) throws ApiException {
    Object localVarPostBody = xapiStatementPipe;
    
    // verify the required parameter 'xapiStatementPipe' is set
    if (xapiStatementPipe == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiStatementPipe' when calling createStatementPipe");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a xAPI credential.
   * Create a xAPI credential.
   * @param xapiCredential  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createXapiCredential(XapiCredentialPostSchema xapiCredential) throws ApiException {
    Object localVarPostBody = xapiCredential;
    
    // verify the required parameter 'xapiCredential' is set
    if (xapiCredential == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredential' when calling createXapiCredential");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/credentials".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes this xAPI pipe.
   * Caution: avoid re-creating a pipe with the same ID quickly after a delete. The old version could still be processing, in which case the new pipe could be updated improperly by the processor. 
   * @param statementPipeId id for this xAPI statement pipe (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStatementPipe(String statementPipeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'statementPipeId' is set
    if (statementPipeId == null) {
      throw new ApiException(400, "Missing the required parameter 'statementPipeId' when calling deleteStatementPipe");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes/{statementPipeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statementPipeId" + "\\}", apiClient.escapeString(statementPipeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes the xAPI credentials specified by the xAPI credentials id
   * Deletes the xAPI credentials specified by the xAPI credentials id
   * @param xapiCredentialId id for this xAPI credential (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteXapiCredential(String xapiCredentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xapiCredentialId' is set
    if (xapiCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredentialId' when calling deleteXapiCredential");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/credentials/{xapiCredentialId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "xapiCredentialId" + "\\}", apiClient.escapeString(xapiCredentialId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieves xAPI pipe for &#x60;xapiPipeId&#x60;
   * Retrieves xAPI pipe for &#x60;xapiPipeId&#x60;
   * @param statementPipeId id for this xAPI statement pipe (required)
   * @return XapiStatementPipeSchema
   * @throws ApiException if fails to make API call
   */
  public XapiStatementPipeSchema getStatementPipe(String statementPipeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'statementPipeId' is set
    if (statementPipeId == null) {
      throw new ApiException(400, "Missing the required parameter 'statementPipeId' when calling getStatementPipe");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes/{statementPipeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statementPipeId" + "\\}", apiClient.escapeString(statementPipeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<XapiStatementPipeSchema> localVarReturnType = new GenericType<XapiStatementPipeSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all of the xapiPipes for &#x60;appId&#x60;
   * Get all of the xapiPipes for &#x60;appId&#x60;
   * @return XapiStatementPipeListSchema
   * @throws ApiException if fails to make API call
   */
  public XapiStatementPipeListSchema getStatementPipes() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<XapiStatementPipeListSchema> localVarReturnType = new GenericType<XapiStatementPipeListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves the xAPI credentials specified by the xAPI credentials id.
   * Retrieves the xAPI credentials specified by the xAPI credentials id.
   * @param xapiCredentialId id for this xAPI credential (required)
   * @return XapiCredentialSchema
   * @throws ApiException if fails to make API call
   */
  public XapiCredentialSchema getXapiCredential(String xapiCredentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xapiCredentialId' is set
    if (xapiCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredentialId' when calling getXapiCredential");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/credentials/{xapiCredentialId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "xapiCredentialId" + "\\}", apiClient.escapeString(xapiCredentialId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<XapiCredentialSchema> localVarReturnType = new GenericType<XapiCredentialSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the list of xapiCredentials
   * Get the list of xapiCredentials
   * @param since Only &lt;&lt;resourcePathName&gt;&gt; updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of &lt;&lt;resourcePathName&gt;&gt; lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return XapiCredentialsListSchema
   * @throws ApiException if fails to make API call
   */
  public XapiCredentialsListSchema getXapiCredentials(OffsetDateTime since, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/xapi/credentials".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<XapiCredentialsListSchema> localVarReturnType = new GenericType<XapiCredentialsListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Edit an existing xAPI pipe or create a new one.
   * Editing a pipe will cause it to start over and forward any statements it finds, even if the prior version of the pipe had already forwarded those statements. If the pipe being edited is currently being processed, the this request will fail with a status code of 409. 
   * @param statementPipeId id for this xAPI statement pipe (required)
   * @param xapiStatementPipe  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema setStatementPipe(String statementPipeId, XapiStatementPipePutSchema xapiStatementPipe) throws ApiException {
    Object localVarPostBody = xapiStatementPipe;
    
    // verify the required parameter 'statementPipeId' is set
    if (statementPipeId == null) {
      throw new ApiException(400, "Missing the required parameter 'statementPipeId' when calling setStatementPipe");
    }
    
    // verify the required parameter 'xapiStatementPipe' is set
    if (xapiStatementPipe == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiStatementPipe' when calling setStatementPipe");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes/{statementPipeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statementPipeId" + "\\}", apiClient.escapeString(statementPipeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Edit an existing xAPI credential or create a new one, specified by the xAPI credentials id
   * Edit an existing xAPI credential or create a new one, specified by the xAPI credentials id
   * @param xapiCredentialId id for this xAPI credential (required)
   * @param xapiCredential  (required)
   * @throws ApiException if fails to make API call
   */
  public void setXapiCredential(String xapiCredentialId, XapiCredentialPostSchema xapiCredential) throws ApiException {
    Object localVarPostBody = xapiCredential;
    
    // verify the required parameter 'xapiCredentialId' is set
    if (xapiCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredentialId' when calling setXapiCredential");
    }
    
    // verify the required parameter 'xapiCredential' is set
    if (xapiCredential == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredential' when calling setXapiCredential");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/credentials/{xapiCredentialId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "xapiCredentialId" + "\\}", apiClient.escapeString(xapiCredentialId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
