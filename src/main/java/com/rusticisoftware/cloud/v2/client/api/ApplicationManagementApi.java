package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import com.rusticisoftware.cloud.v2.client.model.ApplicationSchema;
import com.rusticisoftware.cloud.v2.client.model.CredentialCreatedSchema;
import com.rusticisoftware.cloud.v2.client.model.CredentialRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.StringResultSchema;
import com.rusticisoftware.cloud.v2.client.model.TokenRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.SettingListSchema;
import com.rusticisoftware.cloud.v2.client.model.ApplicationListSchema;
import com.rusticisoftware.cloud.v2.client.model.CredentialListSchema;
import com.rusticisoftware.cloud.v2.client.model.SettingsPostSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T23:15:50.683-05:00")
public class ApplicationManagementApi {
  private ApiClient apiClient;

  public ApplicationManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new application
   * 
   * @param applicationName  (required)
   * @return ApplicationSchema
   * @throws ApiException if fails to make API call
   */
  public ApplicationSchema createApplication(String applicationName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationName' is set
    if (applicationName == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationName' when calling createApplication");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/applications/{applicationName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "applicationName" + "\\}", apiClient.escapeString(applicationName.toString()));

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

    GenericType<ApplicationSchema> localVarReturnType = new GenericType<ApplicationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create credential
   * 
   * @param childAppId  (required)
   * @param credentialRequest  (required)
   * @return CredentialCreatedSchema
   * @throws ApiException if fails to make API call
   */
  public CredentialCreatedSchema createCredential(String childAppId, CredentialRequestSchema credentialRequest) throws ApiException {
    Object localVarPostBody = credentialRequest;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling createCredential");
    }
    
    // verify the required parameter 'credentialRequest' is set
    if (credentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialRequest' when calling createCredential");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/{childAppId}/credentials".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "childAppId" + "\\}", apiClient.escapeString(childAppId.toString()));

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

    GenericType<CredentialCreatedSchema> localVarReturnType = new GenericType<CredentialCreatedSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create token
   * Creates, signs and returns a token based on the provided permissions, if the credentials used to request the token have the permissions being requested. Note: the token is not stored and therefore can not be modified or deleted. The requested permissions are encoded in the token which is then signed. As long as the secret used to create it is not changed the token will be valid until it expires.
   * @param tokenRequest  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createToken(TokenRequestSchema tokenRequest) throws ApiException {
    Object localVarPostBody = tokenRequest;
    
    // verify the required parameter 'tokenRequest' is set
    if (tokenRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenRequest' when calling createToken");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/token".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "APP_NORMAL" };

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an application.  If the application contains content, it must first be manually removed before calling this method, else an error will be thrown.
   * 
   * @param childAppId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplication(String childAppId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling deleteApplication");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/applications/{childAppId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "childAppId" + "\\}", apiClient.escapeString(childAppId.toString()));

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
   * Removes &#x60;credentialId&#x60; credentials
   * 
   * @param childAppId  (required)
   * @param credentialId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCredential(String childAppId, String credentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling deleteCredential");
    }
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling deleteCredential");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/{childAppId}/credentials/{credentialId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "childAppId" + "\\}", apiClient.escapeString(childAppId.toString()))
      .replaceAll("\\{" + "credentialId" + "\\}", apiClient.escapeString(credentialId.toString()));

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
   * Returns all configuration settings for this level
   * 
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if learningStandard is specified. Scopes settings to whether a package has only one SCO or assignable unit within it or not. To apply a configuration setting to a learning standard for single and multi-SCO content, it must be set for both scopes. (optional)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getApplicationConfiguration(String learningStandard, Boolean singleSco, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/appManagement/configuration".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "learningStandard", learningStandard));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "singleSco", singleSco));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeMetadata", includeMetadata));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<SettingListSchema> localVarReturnType = new GenericType<SettingListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get list of all applications in this realm.
   * 
   * @return ApplicationListSchema
   * @throws ApiException if fails to make API call
   */
  public ApplicationListSchema getApplicationList() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/appManagement/applications".replaceAll("\\{format\\}","json");

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

    GenericType<ApplicationListSchema> localVarReturnType = new GenericType<ApplicationListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List of credentials
   * 
   * @param childAppId  (required)
   * @return CredentialListSchema
   * @throws ApiException if fails to make API call
   */
  public CredentialListSchema getCredentials(String childAppId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling getCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/{childAppId}/credentials".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "childAppId" + "\\}", apiClient.escapeString(childAppId.toString()));

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

    GenericType<CredentialListSchema> localVarReturnType = new GenericType<CredentialListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set configuration settings for this level.
   * 
   * @param configurationSettings  (required)
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if learningStandard is specified. Scopes settings to whether a package has only one SCO or assignable unit within it or not. To apply a configuration setting to a learning standard for single and multi-SCO content, it must be set for both scopes. (optional)
   * @throws ApiException if fails to make API call
   */
  public void setApplicationConfiguration(SettingsPostSchema configurationSettings, String learningStandard, Boolean singleSco) throws ApiException {
    Object localVarPostBody = configurationSettings;
    
    // verify the required parameter 'configurationSettings' is set
    if (configurationSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationSettings' when calling setApplicationConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/configuration".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "learningStandard", learningStandard));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "singleSco", singleSco));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update the name or status associated with &#x60;credentialId&#x60;
   * 
   * @param childAppId  (required)
   * @param credentialId  (required)
   * @param credentialUpdate  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCredential(String childAppId, String credentialId, CredentialRequestSchema credentialUpdate) throws ApiException {
    Object localVarPostBody = credentialUpdate;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling updateCredential");
    }
    
    // verify the required parameter 'credentialId' is set
    if (credentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialId' when calling updateCredential");
    }
    
    // verify the required parameter 'credentialUpdate' is set
    if (credentialUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialUpdate' when calling updateCredential");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/{childAppId}/credentials/{credentialId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "childAppId" + "\\}", apiClient.escapeString(childAppId.toString()))
      .replaceAll("\\{" + "credentialId" + "\\}", apiClient.escapeString(credentialId.toString()));

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
