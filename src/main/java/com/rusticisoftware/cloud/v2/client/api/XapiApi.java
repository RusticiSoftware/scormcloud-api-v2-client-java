package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
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
   * Create an xAPI Statement Pipe 
   * Creates an xAPI statement pipe.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the creation of the xAPI statement pipe takes place. 
   * @param xapiStatementPipe  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createStatementPipe(XapiStatementPipePostSchema xapiStatementPipe) throws ApiException {
    return createStatementPipeWithHttpInfo(xapiStatementPipe).getData();
      }

  /**
   * Create an xAPI Statement Pipe 
   * Creates an xAPI statement pipe.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the creation of the xAPI statement pipe takes place. 
   * @param xapiStatementPipe  (required)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> createStatementPipeWithHttpInfo(XapiStatementPipePostSchema xapiStatementPipe) throws ApiException {
    Object localVarPostBody = xapiStatementPipe;
    
    // verify the required parameter 'xapiStatementPipe' is set
    if (xapiStatementPipe == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiStatementPipe' when calling createStatementPipe");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes";

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
   * Create xAPI Credentials 
   * Creates an xAPI credential combination from the provided secret and a generated ID. 
   * @param xapiCredential  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createXapiCredential(XapiCredentialPostSchema xapiCredential) throws ApiException {
    return createXapiCredentialWithHttpInfo(xapiCredential).getData();
      }

  /**
   * Create xAPI Credentials 
   * Creates an xAPI credential combination from the provided secret and a generated ID. 
   * @param xapiCredential  (required)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> createXapiCredentialWithHttpInfo(XapiCredentialPostSchema xapiCredential) throws ApiException {
    Object localVarPostBody = xapiCredential;
    
    // verify the required parameter 'xapiCredential' is set
    if (xapiCredential == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredential' when calling createXapiCredential");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/credentials";

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
   * Delete an xAPI Statement Pipe 
   * Deletes the specified xAPI statement pipe  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the deletion takes place.  Recreating a statement pipe with the same ID too quickly could cause the statement pipe to end up in a faulty state. 
   * @param statementPipeId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStatementPipe(String statementPipeId) throws ApiException {

    deleteStatementPipeWithHttpInfo(statementPipeId);
  }

  /**
   * Delete an xAPI Statement Pipe 
   * Deletes the specified xAPI statement pipe  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the deletion takes place.  Recreating a statement pipe with the same ID too quickly could cause the statement pipe to end up in a faulty state. 
   * @param statementPipeId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteStatementPipeWithHttpInfo(String statementPipeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'statementPipeId' is set
    if (statementPipeId == null) {
      throw new ApiException(400, "Missing the required parameter 'statementPipeId' when calling deleteStatementPipe");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes/{statementPipeId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete xAPI Credentials 
   * Deletes the specified xAPI credentials. 
   * @param xapiCredentialId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteXapiCredential(String xapiCredentialId) throws ApiException {

    deleteXapiCredentialWithHttpInfo(xapiCredentialId);
  }

  /**
   * Delete xAPI Credentials 
   * Deletes the specified xAPI credentials. 
   * @param xapiCredentialId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteXapiCredentialWithHttpInfo(String xapiCredentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xapiCredentialId' is set
    if (xapiCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredentialId' when calling deleteXapiCredential");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/credentials/{xapiCredentialId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get detailed information about an xAPI Statement Pipe 
   * Returns detailed information about the xAPI pipe.  This includes source and target urls, the last time a statement was successfully forwarded, and how many attempts have been made to send data to the target url. 
   * @param statementPipeId  (required)
   * @return XapiStatementPipeSchema
   * @throws ApiException if fails to make API call
   */
  public XapiStatementPipeSchema getStatementPipe(String statementPipeId) throws ApiException {
    return getStatementPipeWithHttpInfo(statementPipeId).getData();
      }

  /**
   * Get detailed information about an xAPI Statement Pipe 
   * Returns detailed information about the xAPI pipe.  This includes source and target urls, the last time a statement was successfully forwarded, and how many attempts have been made to send data to the target url. 
   * @param statementPipeId  (required)
   * @return ApiResponse&lt;XapiStatementPipeSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiStatementPipeSchema> getStatementPipeWithHttpInfo(String statementPipeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'statementPipeId' is set
    if (statementPipeId == null) {
      throw new ApiException(400, "Missing the required parameter 'statementPipeId' when calling getStatementPipe");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes/{statementPipeId}"
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
   * Get a list of xAPI Statement Pipes 
   * Returns a list of all xAPI statement pipes. 
   * @return XapiStatementPipeListSchema
   * @throws ApiException if fails to make API call
   */
  public XapiStatementPipeListSchema getStatementPipes() throws ApiException {
    return getStatementPipesWithHttpInfo().getData();
      }

  /**
   * Get a list of xAPI Statement Pipes 
   * Returns a list of all xAPI statement pipes. 
   * @return ApiResponse&lt;XapiStatementPipeListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiStatementPipeListSchema> getStatementPipesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/xapi/statementPipes";

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
   * Get detailed information about the xAPI Credentials 
   * Returns detailed information about the xAPI credentials.  This includes the id (username), secret (password), permissions, and whether or not the credentials are enabled. 
   * @param xapiCredentialId  (required)
   * @return XapiCredentialSchema
   * @throws ApiException if fails to make API call
   */
  public XapiCredentialSchema getXapiCredential(String xapiCredentialId) throws ApiException {
    return getXapiCredentialWithHttpInfo(xapiCredentialId).getData();
      }

  /**
   * Get detailed information about the xAPI Credentials 
   * Returns detailed information about the xAPI credentials.  This includes the id (username), secret (password), permissions, and whether or not the credentials are enabled. 
   * @param xapiCredentialId  (required)
   * @return ApiResponse&lt;XapiCredentialSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiCredentialSchema> getXapiCredentialWithHttpInfo(String xapiCredentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xapiCredentialId' is set
    if (xapiCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'xapiCredentialId' when calling getXapiCredential");
    }
    
    // create path and map variables
    String localVarPath = "/xapi/credentials/{xapiCredentialId}"
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
   * Get a list of xAPI Credentials 
   * Returns a list of xAPI credentials.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to credential_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return XapiCredentialsListSchema
   * @throws ApiException if fails to make API call
   */
  public XapiCredentialsListSchema getXapiCredentials(OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more) throws ApiException {
    return getXapiCredentialsWithHttpInfo(since, until, datetimeFilter, filter, filterBy, orderBy, more).getData();
      }

  /**
   * Get a list of xAPI Credentials 
   * Returns a list of xAPI credentials.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to credential_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;XapiCredentialsListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiCredentialsListSchema> getXapiCredentialsWithHttpInfo(OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/xapi/credentials";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
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
   * Create or update an xAPI Statement Pipe 
   * Creates or updates information about the xAPI statement pipe.  - If the xAPI statement pipe is instead being updated, the pipe will start over and forward any statements it finds, even if it had already forwarded those statements.  If the pipe being edited is currently being processed, then this request will fail with a status code of 409.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the creation of the xAPI statement pipe takes place. 
   * @param statementPipeId  (required)
   * @param xapiStatementPipe  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema setStatementPipe(String statementPipeId, XapiStatementPipePutSchema xapiStatementPipe) throws ApiException {
    return setStatementPipeWithHttpInfo(statementPipeId, xapiStatementPipe).getData();
      }

  /**
   * Create or update an xAPI Statement Pipe 
   * Creates or updates information about the xAPI statement pipe.  - If the xAPI statement pipe is instead being updated, the pipe will start over and forward any statements it finds, even if it had already forwarded those statements.  If the pipe being edited is currently being processed, then this request will fail with a status code of 409.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the creation of the xAPI statement pipe takes place. 
   * @param statementPipeId  (required)
   * @param xapiStatementPipe  (required)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> setStatementPipeWithHttpInfo(String statementPipeId, XapiStatementPipePutSchema xapiStatementPipe) throws ApiException {
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
    String localVarPath = "/xapi/statementPipes/{statementPipeId}"
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
   * Create or update xAPI Credentials 
   * Creates or updates information about the xAPI credentials. 
   * @param xapiCredentialId  (required)
   * @param xapiCredential  (required)
   * @throws ApiException if fails to make API call
   */
  public void setXapiCredential(String xapiCredentialId, XapiCredentialPostSchema xapiCredential) throws ApiException {

    setXapiCredentialWithHttpInfo(xapiCredentialId, xapiCredential);
  }

  /**
   * Create or update xAPI Credentials 
   * Creates or updates information about the xAPI credentials. 
   * @param xapiCredentialId  (required)
   * @param xapiCredential  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setXapiCredentialWithHttpInfo(String xapiCredentialId, XapiCredentialPostSchema xapiCredential) throws ApiException {
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
    String localVarPath = "/xapi/credentials/{xapiCredentialId}"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
