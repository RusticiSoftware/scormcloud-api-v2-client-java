package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.ApplicationInfoListSchema;
import com.rusticisoftware.cloud.v2.client.model.ApplicationInfoSchema;
import com.rusticisoftware.cloud.v2.client.model.ApplicationListSchema;
import com.rusticisoftware.cloud.v2.client.model.ApplicationRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.ApplicationSchema;
import com.rusticisoftware.cloud.v2.client.model.CredentialCreatedSchema;
import com.rusticisoftware.cloud.v2.client.model.CredentialListSchema;
import com.rusticisoftware.cloud.v2.client.model.CredentialRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import java.time.OffsetDateTime;
import com.rusticisoftware.cloud.v2.client.model.SettingListSchema;
import com.rusticisoftware.cloud.v2.client.model.SettingsPostSchema;
import com.rusticisoftware.cloud.v2.client.model.StringResultSchema;
import com.rusticisoftware.cloud.v2.client.model.TokenRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.UpdateApplicationSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
   * Use the Application Management App to create a new Application 
   * Creates an application.  Applications are how resources are grouped together in SCORM Cloud.  Any courses, registrations, etc. will only be accessible via the credentials for the application they belong to.  &gt;**Note:** &gt;Application IDs are unique in that we do not allow the user to supply a custom value for this field.  The ID of the newly created application will be specified in the response from this method.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param applicationRequest  (required)
   * @return ApplicationSchema
   * @throws ApiException if fails to make API call
   */
  public ApplicationSchema createApplication(ApplicationRequestSchema applicationRequest) throws ApiException {
    return createApplicationWithHttpInfo(applicationRequest).getData();
      }

  /**
   * Use the Application Management App to create a new Application 
   * Creates an application.  Applications are how resources are grouped together in SCORM Cloud.  Any courses, registrations, etc. will only be accessible via the credentials for the application they belong to.  &gt;**Note:** &gt;Application IDs are unique in that we do not allow the user to supply a custom value for this field.  The ID of the newly created application will be specified in the response from this method.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param applicationRequest  (required)
   * @return ApiResponse&lt;ApplicationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApplicationSchema> createApplicationWithHttpInfo(ApplicationRequestSchema applicationRequest) throws ApiException {
    Object localVarPostBody = applicationRequest;
    
    // verify the required parameter 'applicationRequest' is set
    if (applicationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationRequest' when calling createApplication");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/applications";

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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };

    GenericType<ApplicationSchema> localVarReturnType = new GenericType<ApplicationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Use the Application Manager App to create a new secret key for an Application 
   * Creates a new credential (aka secret key) for use with the child application.  The credential will be used alongside the &#x60;childAppId&#x60; for basic auth requests.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param credentialRequest  (required)
   * @return CredentialCreatedSchema
   * @throws ApiException if fails to make API call
   */
  public CredentialCreatedSchema createCredential(String childAppId, CredentialRequestSchema credentialRequest) throws ApiException {
    return createCredentialWithHttpInfo(childAppId, credentialRequest).getData();
      }

  /**
   * Use the Application Manager App to create a new secret key for an Application 
   * Creates a new credential (aka secret key) for use with the child application.  The credential will be used alongside the &#x60;childAppId&#x60; for basic auth requests.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param credentialRequest  (required)
   * @return ApiResponse&lt;CredentialCreatedSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CredentialCreatedSchema> createCredentialWithHttpInfo(String childAppId, CredentialRequestSchema credentialRequest) throws ApiException {
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
    String localVarPath = "/appManagement/{childAppId}/credentials"
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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };

    GenericType<CredentialCreatedSchema> localVarReturnType = new GenericType<CredentialCreatedSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Obtain an OAuth token for scoped access to an Application 
   * Creates, signs and returns an OAuth2 token based on the provided permissions, if the credentials used to request the token have the permissions being requested.  &gt;**Note:** &gt;The token is not stored and therefore can not be modified or deleted.  The requested permissions are encoded in the token which is then signed. 
   * @param tokenRequest  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createToken(TokenRequestSchema tokenRequest) throws ApiException {
    return createTokenWithHttpInfo(tokenRequest).getData();
      }

  /**
   * Obtain an OAuth token for scoped access to an Application 
   * Creates, signs and returns an OAuth2 token based on the provided permissions, if the credentials used to request the token have the permissions being requested.  &gt;**Note:** &gt;The token is not stored and therefore can not be modified or deleted.  The requested permissions are encoded in the token which is then signed. 
   * @param tokenRequest  (required)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> createTokenWithHttpInfo(TokenRequestSchema tokenRequest) throws ApiException {
    Object localVarPostBody = tokenRequest;
    
    // verify the required parameter 'tokenRequest' is set
    if (tokenRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenRequest' when calling createToken");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/token";

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
   * Use the Application Management App to delete an Application 
   * Deletes the specified application.  All content within an application must be removed in order to allow deletion.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplication(String childAppId) throws ApiException {

    deleteApplicationWithHttpInfo(childAppId);
  }

  /**
   * Use the Application Management App to delete an Application 
   * Deletes the specified application.  All content within an application must be removed in order to allow deletion.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteApplicationWithHttpInfo(String childAppId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling deleteApplication");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/applications/{childAppId}"
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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a configuration setting explicitly set for an Application 
   * Clears the specified setting from the application.  This causes the setting to inherit a value from a higher level (e.g. system default if deleting from application, application level if deleting from learning standard). If the configuration setting was not set at the application level it will continue to persist and will require deletion from the level it was set. 
   * @param settingId  (required)
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if &#x60;learningStandard&#x60; is specified. Scopes settings to either single or multi-SCO content.  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationConfigurationSetting(String settingId, String learningStandard, Boolean singleSco) throws ApiException {

    deleteApplicationConfigurationSettingWithHttpInfo(settingId, learningStandard, singleSco);
  }

  /**
   * Delete a configuration setting explicitly set for an Application 
   * Clears the specified setting from the application.  This causes the setting to inherit a value from a higher level (e.g. system default if deleting from application, application level if deleting from learning standard). If the configuration setting was not set at the application level it will continue to persist and will require deletion from the level it was set. 
   * @param settingId  (required)
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if &#x60;learningStandard&#x60; is specified. Scopes settings to either single or multi-SCO content.  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteApplicationConfigurationSettingWithHttpInfo(String settingId, String learningStandard, Boolean singleSco) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'settingId' is set
    if (settingId == null) {
      throw new ApiException(400, "Missing the required parameter 'settingId' when calling deleteApplicationConfigurationSetting");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/configuration/{settingId}"
      .replaceAll("\\{" + "settingId" + "\\}", apiClient.escapeString(settingId.toString()));

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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Use the Application Management App to delete a secret key from an Application 
   * Deletes a credential belonging to the child application.  &gt;**Caution:** &gt;If the last secret key for an application is deleted it will not be able to use the SCORM Cloud API until another key is granted to it via &#x60;CreateCredential&#x60;.  It may also disable some website privileges.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param credentialId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCredential(String childAppId, String credentialId) throws ApiException {

    deleteCredentialWithHttpInfo(childAppId, credentialId);
  }

  /**
   * Use the Application Management App to delete a secret key from an Application 
   * Deletes a credential belonging to the child application.  &gt;**Caution:** &gt;If the last secret key for an application is deleted it will not be able to use the SCORM Cloud API until another key is granted to it via &#x60;CreateCredential&#x60;.  It may also disable some website privileges.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param credentialId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCredentialWithHttpInfo(String childAppId, String credentialId) throws ApiException {
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
    String localVarPath = "/appManagement/{childAppId}/credentials/{credentialId}"
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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get effective configuration settings for an Application 
   * Returns the effective configuration settings for the application.  Configuration settings at the application level will apply to all items within that application (courses, registrations, etc.).  If there is a configuration setting present at a more specific level (course, registration, etc.), that setting will override the one set at the application level.  &gt;**Note:** &gt;This resource lists configuration for two groupings of content: &gt;- ALL content in an application.  This is achieved by leaving &#x60;learningStandard&#x60; and   &#x60;singleSco&#x60; as &#x60;null&#x60;.  Anything set at the learningStandard/singleSco level will take precedence over these   settings. &gt;- Content falling into a learningStandard/singleSco category.  This allows setting more specific   defaults for a particular learningStandard/singleSco combination.   _Note: both &#x60;learningStandard&#x60; and &#x60;singleSco&#x60; must be provided, as this level is considered to be   identified by those items joined._ 
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if &#x60;learningStandard&#x60; is specified. Scopes settings to either single or multi-SCO content.  (optional)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getApplicationConfiguration(String learningStandard, Boolean singleSco, Boolean includeMetadata) throws ApiException {
    return getApplicationConfigurationWithHttpInfo(learningStandard, singleSco, includeMetadata).getData();
      }

  /**
   * Get effective configuration settings for an Application 
   * Returns the effective configuration settings for the application.  Configuration settings at the application level will apply to all items within that application (courses, registrations, etc.).  If there is a configuration setting present at a more specific level (course, registration, etc.), that setting will override the one set at the application level.  &gt;**Note:** &gt;This resource lists configuration for two groupings of content: &gt;- ALL content in an application.  This is achieved by leaving &#x60;learningStandard&#x60; and   &#x60;singleSco&#x60; as &#x60;null&#x60;.  Anything set at the learningStandard/singleSco level will take precedence over these   settings. &gt;- Content falling into a learningStandard/singleSco category.  This allows setting more specific   defaults for a particular learningStandard/singleSco combination.   _Note: both &#x60;learningStandard&#x60; and &#x60;singleSco&#x60; must be provided, as this level is considered to be   identified by those items joined._ 
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if &#x60;learningStandard&#x60; is specified. Scopes settings to either single or multi-SCO content.  (optional)
   * @param includeMetadata  (optional, default to false)
   * @return ApiResponse&lt;SettingListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SettingListSchema> getApplicationConfigurationWithHttpInfo(String learningStandard, Boolean singleSco, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/appManagement/configuration";

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
   * Use the Application Management App to get detailed information about an Application 
   * Returns detailed information about the application.  This includes name, create date, and delete permissions.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param includeCourseCount Include a count of courses for the application. (optional, default to false)
   * @param includeRegistrationCount Include a count of registrations created for the application during the current billing period. (optional, default to false)
   * @return ApplicationInfoSchema
   * @throws ApiException if fails to make API call
   */
  public ApplicationInfoSchema getApplicationInfo(String childAppId, Boolean includeCourseCount, Boolean includeRegistrationCount) throws ApiException {
    return getApplicationInfoWithHttpInfo(childAppId, includeCourseCount, includeRegistrationCount).getData();
      }

  /**
   * Use the Application Management App to get detailed information about an Application 
   * Returns detailed information about the application.  This includes name, create date, and delete permissions.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param includeCourseCount Include a count of courses for the application. (optional, default to false)
   * @param includeRegistrationCount Include a count of registrations created for the application during the current billing period. (optional, default to false)
   * @return ApiResponse&lt;ApplicationInfoSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApplicationInfoSchema> getApplicationInfoWithHttpInfo(String childAppId, Boolean includeCourseCount, Boolean includeRegistrationCount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling getApplicationInfo");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/applications/{childAppId}"
      .replaceAll("\\{" + "childAppId" + "\\}", apiClient.escapeString(childAppId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCourseCount", includeCourseCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };

    GenericType<ApplicationInfoSchema> localVarReturnType = new GenericType<ApplicationInfoSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * (Deprecated) Use the Application Management App to get basic data about all Applications in a Realm 
   * Returns a list of all applications which are in this Realm.  &gt;**Deprecated:** &gt;It is advised to use GetApplications instead of this endpoint, as this one now exists for backwards  compatibility.  This endpoint returns very limited data about **all** applications in a Realm and is not  paginated.  Because of this, this endpoint can run into issues and have very slow performance when attempting to  pull data for accounts with many applications.  The GetApplications endpoint alleviates this problem by using pagination to return a limited amount of applications at once, while also providing much more detail about every  application present in a Realm.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @return ApplicationListSchema
   * @throws ApiException if fails to make API call
   * @deprecated Use GetApplications instead.
   */
  @Deprecated
  public ApplicationListSchema getApplicationList() throws ApiException {
    return getApplicationListWithHttpInfo().getData();
      }

  /**
   * (Deprecated) Use the Application Management App to get basic data about all Applications in a Realm 
   * Returns a list of all applications which are in this Realm.  &gt;**Deprecated:** &gt;It is advised to use GetApplications instead of this endpoint, as this one now exists for backwards  compatibility.  This endpoint returns very limited data about **all** applications in a Realm and is not  paginated.  Because of this, this endpoint can run into issues and have very slow performance when attempting to  pull data for accounts with many applications.  The GetApplications endpoint alleviates this problem by using pagination to return a limited amount of applications at once, while also providing much more detail about every  application present in a Realm.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @return ApiResponse&lt;ApplicationListSchema&gt;
   * @throws ApiException if fails to make API call
   * @deprecated Use GetApplicationsWithHttpInfo instead.
   */
  @Deprecated
  public ApiResponse<ApplicationListSchema> getApplicationListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/appManagement/applications";

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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };

    GenericType<ApplicationListSchema> localVarReturnType = new GenericType<ApplicationListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Use the Application Management App to get a detailed list of Applications 
   * Returns a list of applications. Can be filtered using the request parameters to provide a subset of results.  This endpoint caches the course and registration counts of an application for 24 hours if either  &#x60;includeCourseCount&#x60; or &#x60;includeRegistrationCount&#x60; parameters, respectively, are set to &#x60;true&#x60;. Since these values are cached for an extended period, any changes made to the number of courses or  registrations in an application will not be reflected in the results of this endpoint until the caching period has passed.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time. If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results. When passing this token, no other filter parameters can be sent as part of the request. The resources will continue to respect the filters passed in by the original request.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource.  &gt;**Info:** &gt;If you want to get an up-to-date value of the course or registration count for a single application within the caching period, use the GetApplicationInfo endpoint with &#x60;includeCourseCount&#x60; and/or &#x60;includeRegistrationCount&#x60; set to &#x60;true&#x60;.  GetApplicationInfo *always* gathers the most up-to-date values and overwrites them in the cache, resetting the caching period for that application. 
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to app_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeCourseCount Include a count of courses for the application. (optional, default to false)
   * @param includeRegistrationCount Include a count of registrations created for the application during the current billing period. (optional, default to false)
   * @param includeTotalCount Include the total count of results matching the provided filters as a header on the initial request.  The header will not be present on subsequent requests resulting from passing the &#x60;more&#x60; token.  (optional, default to false)
   * @return ApplicationInfoListSchema
   * @throws ApiException if fails to make API call
   */
  public ApplicationInfoListSchema getApplications(OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more, Boolean includeCourseCount, Boolean includeRegistrationCount, Boolean includeTotalCount) throws ApiException {
    return getApplicationsWithHttpInfo(since, until, datetimeFilter, filter, filterBy, orderBy, more, includeCourseCount, includeRegistrationCount, includeTotalCount).getData();
      }

  /**
   * Use the Application Management App to get a detailed list of Applications 
   * Returns a list of applications. Can be filtered using the request parameters to provide a subset of results.  This endpoint caches the course and registration counts of an application for 24 hours if either  &#x60;includeCourseCount&#x60; or &#x60;includeRegistrationCount&#x60; parameters, respectively, are set to &#x60;true&#x60;. Since these values are cached for an extended period, any changes made to the number of courses or  registrations in an application will not be reflected in the results of this endpoint until the caching period has passed.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time. If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results. When passing this token, no other filter parameters can be sent as part of the request. The resources will continue to respect the filters passed in by the original request.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource.  &gt;**Info:** &gt;If you want to get an up-to-date value of the course or registration count for a single application within the caching period, use the GetApplicationInfo endpoint with &#x60;includeCourseCount&#x60; and/or &#x60;includeRegistrationCount&#x60; set to &#x60;true&#x60;.  GetApplicationInfo *always* gathers the most up-to-date values and overwrites them in the cache, resetting the caching period for that application. 
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to app_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeCourseCount Include a count of courses for the application. (optional, default to false)
   * @param includeRegistrationCount Include a count of registrations created for the application during the current billing period. (optional, default to false)
   * @param includeTotalCount Include the total count of results matching the provided filters as a header on the initial request.  The header will not be present on subsequent requests resulting from passing the &#x60;more&#x60; token.  (optional, default to false)
   * @return ApiResponse&lt;ApplicationInfoListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApplicationInfoListSchema> getApplicationsWithHttpInfo(OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more, Boolean includeCourseCount, Boolean includeRegistrationCount, Boolean includeTotalCount) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/appManagement/applicationList";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCourseCount", includeCourseCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTotalCount", includeTotalCount));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };

    GenericType<ApplicationInfoListSchema> localVarReturnType = new GenericType<ApplicationInfoListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Use the Application Manager App to get a list of secret keys for an Application 
   * Returns a list of all the credentials (aka secret keys) belonging to the child application.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @return CredentialListSchema
   * @throws ApiException if fails to make API call
   */
  public CredentialListSchema getCredentials(String childAppId) throws ApiException {
    return getCredentialsWithHttpInfo(childAppId).getData();
      }

  /**
   * Use the Application Manager App to get a list of secret keys for an Application 
   * Returns a list of all the credentials (aka secret keys) belonging to the child application.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @return ApiResponse&lt;CredentialListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CredentialListSchema> getCredentialsWithHttpInfo(String childAppId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling getCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/{childAppId}/credentials"
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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };

    GenericType<CredentialListSchema> localVarReturnType = new GenericType<CredentialListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update configuration settings for an Application 
   * Updates configuration settings at the application level.  This will explicitly set a value at the applicaiton level.  These settings will affect all items within the application which do not have their own explicit configuration set.  This can effectively be used to set application level defaults. 
   * @param configurationSettings  (required)
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if &#x60;learningStandard&#x60; is specified. Scopes settings to either single or multi-SCO content.  (optional)
   * @throws ApiException if fails to make API call
   */
  public void setApplicationConfiguration(SettingsPostSchema configurationSettings, String learningStandard, Boolean singleSco) throws ApiException {

    setApplicationConfigurationWithHttpInfo(configurationSettings, learningStandard, singleSco);
  }

  /**
   * Update configuration settings for an Application 
   * Updates configuration settings at the application level.  This will explicitly set a value at the applicaiton level.  These settings will affect all items within the application which do not have their own explicit configuration set.  This can effectively be used to set application level defaults. 
   * @param configurationSettings  (required)
   * @param learningStandard If specified, the request will be scoped to the provided learning standard. (optional)
   * @param singleSco Required if &#x60;learningStandard&#x60; is specified. Scopes settings to either single or multi-SCO content.  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setApplicationConfigurationWithHttpInfo(SettingsPostSchema configurationSettings, String learningStandard, Boolean singleSco) throws ApiException {
    Object localVarPostBody = configurationSettings;
    
    // verify the required parameter 'configurationSettings' is set
    if (configurationSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationSettings' when calling setApplicationConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/configuration";

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Use the Application Management App to update information about an Application 
   * Updates information about the application, such as the name and enabling/ disabling deletion operations for the application.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param applicationProperties  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateApplication(String childAppId, UpdateApplicationSchema applicationProperties) throws ApiException {

    updateApplicationWithHttpInfo(childAppId, applicationProperties);
  }

  /**
   * Use the Application Management App to update information about an Application 
   * Updates information about the application, such as the name and enabling/ disabling deletion operations for the application.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param applicationProperties  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateApplicationWithHttpInfo(String childAppId, UpdateApplicationSchema applicationProperties) throws ApiException {
    Object localVarPostBody = applicationProperties;
    
    // verify the required parameter 'childAppId' is set
    if (childAppId == null) {
      throw new ApiException(400, "Missing the required parameter 'childAppId' when calling updateApplication");
    }
    
    // verify the required parameter 'applicationProperties' is set
    if (applicationProperties == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationProperties' when calling updateApplication");
    }
    
    // create path and map variables
    String localVarPath = "/appManagement/applications/{childAppId}"
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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Use the Application Manager App to update an existing secret key for an Application 
   * Updates the name or status associated with the credential.  Disabling a credential will cause it to no longer be valid for authorization through the API.  &gt;**Caution:** &gt;If the last (or only) key for an application is disabled it may affect some website privileges.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param credentialId  (required)
   * @param credentialUpdate  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCredential(String childAppId, String credentialId, CredentialRequestSchema credentialUpdate) throws ApiException {

    updateCredentialWithHttpInfo(childAppId, credentialId, credentialUpdate);
  }

  /**
   * Use the Application Manager App to update an existing secret key for an Application 
   * Updates the name or status associated with the credential.  Disabling a credential will cause it to no longer be valid for authorization through the API.  &gt;**Caution:** &gt;If the last (or only) key for an application is disabled it may affect some website privileges.  &gt;**Note:** &gt;Each Realm has a special application called the **Application Management Application**.  When using this special application&#39;s credentials to authenticate with the API, you are able to perform actions on all the other applications within that Realm (and only those actions, this isn&#39;t a general purpose credential).  You can list, add, update, and delete both applications and credentials with this API resource. 
   * @param childAppId  (required)
   * @param credentialId  (required)
   * @param credentialUpdate  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateCredentialWithHttpInfo(String childAppId, String credentialId, CredentialRequestSchema credentialUpdate) throws ApiException {
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
    String localVarPath = "/appManagement/{childAppId}/credentials/{credentialId}"
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

    String[] localVarAuthNames = new String[] { "APP_MANAGEMENT", "OAUTH" };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
