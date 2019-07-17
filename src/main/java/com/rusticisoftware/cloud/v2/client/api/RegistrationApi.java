package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.CreateRegistrationSchema;
import com.rusticisoftware.cloud.v2.client.model.LaunchHistoryListSchema;
import com.rusticisoftware.cloud.v2.client.model.LaunchLinkRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.LaunchLinkSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import java.time.OffsetDateTime;
import com.rusticisoftware.cloud.v2.client.model.RegistrationListSchema;
import com.rusticisoftware.cloud.v2.client.model.RegistrationSchema;
import com.rusticisoftware.cloud.v2.client.model.SettingListSchema;
import com.rusticisoftware.cloud.v2.client.model.SettingsPostSchema;
import com.rusticisoftware.cloud.v2.client.model.TagListSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiStatementResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-16T16:01:27.387-05:00")
public class RegistrationApi {
  private ApiClient apiClient;

  public RegistrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RegistrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Create a new instance for this registration specified by the registration ID. 
   * @param registrationId id for this registration (required)
   * @throws ApiException if fails to make API call
   */
  public void createNewRegistrationInstance(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling createNewRegistrationInstance");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * This method is used to create a new registration. A registration will contain a few pieces of information such as a learner name, a learner id, and optionally, information about where activity data should be posted (for client consumption), as well as a way to specify simple authentication schemes for posting said data. A registration must be tied to a specific course at creation time. When the created registration is “launched”, the course specified at creation time will be launched. 
   * @param registration  (required)
   * @param courseVersion The version of the course you want to create the registration for. Unless you have a reason for using this you probably do not need to. (optional)
   * @throws ApiException if fails to make API call
   */
  public void createRegistration(CreateRegistrationSchema registration, Integer courseVersion) throws ApiException {
    Object localVarPostBody = registration;
    
    // verify the required parameter 'registration' is set
    if (registration == null) {
      throw new ApiException(400, "Missing the required parameter 'registration' when calling createRegistration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseVersion", courseVersion));

    
    
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
   * 
   * Delete &#x60;registrationId&#x60;.  This includes all instances of this registration. 
   * @param registrationId id for this registration (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistration(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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
   * 
   * Clears the &#x60;settingId&#x60; value for this registration. The effective value will become the value at the next level which has an explicit value set.  Possibilities are course, application, or default. 
   * @param registrationId id for this registration (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationConfigurationSetting(String registrationId, String settingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationConfigurationSetting");
    }
    
    // verify the required parameter 'settingId' is set
    if (settingId == null) {
      throw new ApiException(400, "Missing the required parameter 'settingId' when calling deleteRegistrationConfigurationSetting");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/configuration/{settingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()))
      .replaceAll("\\{" + "settingId" + "\\}", apiClient.escapeString(settingId.toString()));

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
   * 
   * Clears the &#x60;settingId&#x60; value for this registration instance. 
   * @param registrationId id for this registration (required)
   * @param instanceId The instance of this registration (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationInstanceConfigurationSetting(String registrationId, Integer instanceId, String settingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationInstanceConfigurationSetting");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling deleteRegistrationInstanceConfigurationSetting");
    }
    
    // verify the required parameter 'settingId' is set
    if (settingId == null) {
      throw new ApiException(400, "Missing the required parameter 'settingId' when calling deleteRegistrationInstanceConfigurationSetting");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/configuration/{settingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()))
      .replaceAll("\\{" + "settingId" + "\\}", apiClient.escapeString(settingId.toString()));

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
   * 
   * This method will reset the specified registration. This is essentially the same as deleting and recreating the registration, and as such, will delete all the data associated with the registration (including launch history, etc.). If the course for which the registration is registered has multiple versions, the registration being reset will automatically be registered for the latest version. 
   * @param registrationId id for this registration (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationProgress(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationProgress");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/progress".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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
   * 
   * Delete the provided tags for this registration. 
   * @param registrationId id for this registration (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationTags(String registrationId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling deleteRegistrationTags");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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
   * 
   * Delete global data associated with &#x60;registrationId&#x60;&#39;.  Calling this method will reset all global objectives associated with this registration, if any exist. 
   * @param registrationId id for this registration (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationsGlobalData(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationsGlobalData");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/globalData".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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
   * 
   * Returns all configuration settings for this registration. 
   * @param registrationId id for this registration (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getRegistrationConfiguration(String registrationId, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * 
   * Returns all configuration settings for this registration instance. 
   * @param registrationId id for this registration (required)
   * @param instanceId The instance of this registration (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getRegistrationInstanceConfiguration(String registrationId, Integer instanceId, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationInstanceConfiguration");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getRegistrationInstanceConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * 
   * Returns history of the launches of the specified instance of this registration. 
   * @param registrationId id for this registration (required)
   * @param instanceId The instance of this registration (required)
   * @param includeHistoryLog Whether to include the history log in the launch history (optional, default to false)
   * @return LaunchHistoryListSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchHistoryListSchema getRegistrationInstanceLaunchHistory(String registrationId, Integer instanceId, Boolean includeHistoryLog) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationInstanceLaunchHistory");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getRegistrationInstanceLaunchHistory");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/launchHistory".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeHistoryLog", includeHistoryLog));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<LaunchHistoryListSchema> localVarReturnType = new GenericType<LaunchHistoryListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get registration progress for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;&#39; 
   * @param registrationId id for this registration (required)
   * @param instanceId The instance of this registration (required)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return RegistrationSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationSchema getRegistrationInstanceProgress(String registrationId, Integer instanceId, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationInstanceProgress");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getRegistrationInstanceProgress");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeChildResults", includeChildResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeInteractionsAndObjectives", includeInteractionsAndObjectives));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRuntime", includeRuntime));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<RegistrationSchema> localVarReturnType = new GenericType<RegistrationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get xAPI statements for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;. 
   * @param registrationId id for this registration (required)
   * @param instanceId The instance of this registration (required)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getRegistrationInstanceStatements(String registrationId, Integer instanceId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationInstanceStatements");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getRegistrationInstanceStatements");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/xAPIStatements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
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

    GenericType<XapiStatementResult> localVarReturnType = new GenericType<XapiStatementResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get all the instances of this the registration specified by the registration ID 
   * @param registrationId id for this registration (required)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return RegistrationListSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationListSchema getRegistrationInstances(String registrationId, OffsetDateTime until, OffsetDateTime since, String more, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationInstances");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeChildResults", includeChildResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeInteractionsAndObjectives", includeInteractionsAndObjectives));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRuntime", includeRuntime));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<RegistrationListSchema> localVarReturnType = new GenericType<RegistrationListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns history of this registration&#39;s launches. 
   * @param registrationId id for this registration (required)
   * @param includeHistoryLog Whether to include the history log in the launch history (optional, default to false)
   * @return LaunchHistoryListSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchHistoryListSchema getRegistrationLaunchHistory(String registrationId, Boolean includeHistoryLog) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationLaunchHistory");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/launchHistory".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeHistoryLog", includeHistoryLog));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<LaunchHistoryListSchema> localVarReturnType = new GenericType<LaunchHistoryListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns the link to use to launch this registration. 
   * @param registrationId id for this registration (required)
   * @param launchLinkRequest  (required)
   * @return LaunchLinkSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchLinkSchema getRegistrationLaunchLink(String registrationId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
    Object localVarPostBody = launchLinkRequest;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationLaunchLink");
    }
    
    // verify the required parameter 'launchLinkRequest' is set
    if (launchLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'launchLinkRequest' when calling getRegistrationLaunchLink");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/launchLink".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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

    GenericType<LaunchLinkSchema> localVarReturnType = new GenericType<LaunchLinkSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get detailed information about the latest instance of &#x60;registrationId&#x60;. Additional detail may be obtained by using the optional query parameters. 
   * @param registrationId id for this registration (required)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return RegistrationSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationSchema getRegistrationProgress(String registrationId, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationProgress");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeChildResults", includeChildResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeInteractionsAndObjectives", includeInteractionsAndObjectives));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRuntime", includeRuntime));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<RegistrationSchema> localVarReturnType = new GenericType<RegistrationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get xAPI statements for &#x60;registrationId&#x60;. 
   * @param registrationId id for this registration (required)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getRegistrationStatements(String registrationId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationStatements");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/xAPIStatements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
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

    GenericType<XapiStatementResult> localVarReturnType = new GenericType<XapiStatementResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get a list of the tags applied to this registration. 
   * @param registrationId id for this registration (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getRegistrationTags(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationTags");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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

    GenericType<TagListSchema> localVarReturnType = new GenericType<TagListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Gets a list of registrations including a summary of the status of each registration. 
   * @param courseId Only registrations for the specified course id will be included. (optional)
   * @param learnerId Only registrations for the specified learner id will be included. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @param tags  (optional)
   * @return RegistrationListSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationListSchema getRegistrations(String courseId, String learnerId, OffsetDateTime since, OffsetDateTime until, String more, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime, List<String> tags) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/registrations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "learnerId", learnerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeChildResults", includeChildResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeInteractionsAndObjectives", includeInteractionsAndObjectives));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRuntime", includeRuntime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<RegistrationListSchema> localVarReturnType = new GenericType<RegistrationListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Set the tags for this registration. Note: any tags currently on this registration will be overwritten with the new array of tags. 
   * @param registrationId id for this registration (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putRegistrationTags(String registrationId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling putRegistrationTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling putRegistrationTags");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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
  /**
   * 
   * Sets all of the provided tags on all of the provided registrations. 
   * @param batch Object representing an array of ids to apply an array of tags to. (required)
   * @throws ApiException if fails to make API call
   */
  public void putRegistrationTagsBatch(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putRegistrationTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/tags".replaceAll("\\{format\\}","json");

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
  /**
   * 
   * This method is meant to check if a registration with &#x60;registrationId&#x60; exists in the system. 
   * @param registrationId id for this registration (required)
   * @throws ApiException if fails to make API call
   */
  public void registrationExists(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling registrationExists");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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


    apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Set configuration settings for this registration. 
   * @param registrationId id for this registration (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setRegistrationConfiguration(String registrationId, SettingsPostSchema configurationSettings) throws ApiException {
    Object localVarPostBody = configurationSettings;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling setRegistrationConfiguration");
    }
    
    // verify the required parameter 'configurationSettings' is set
    if (configurationSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationSettings' when calling setRegistrationConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Set configuration settings for this registration instance. 
   * @param registrationId id for this registration (required)
   * @param instanceId The instance of this registration (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setRegistrationInstanceConfiguration(String registrationId, Integer instanceId, SettingsPostSchema configurationSettings) throws ApiException {
    Object localVarPostBody = configurationSettings;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling setRegistrationInstanceConfiguration");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling setRegistrationInstanceConfiguration");
    }
    
    // verify the required parameter 'configurationSettings' is set
    if (configurationSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationSettings' when calling setRegistrationInstanceConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
