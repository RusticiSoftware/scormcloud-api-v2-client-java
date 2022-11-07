package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
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
import com.rusticisoftware.cloud.v2.client.model.PostBackSchema;
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
   * Get a launch link for a Registration 
   * Returns the launch link to use to launch the course for the registration.   Launch links are meant as a way to provide access to your content.  When a learner visits the link, the course will be launched and registration progress will start to be tracked. 
   * @param registrationId  (required)
   * @param launchLinkRequest  (required)
   * @return LaunchLinkSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchLinkSchema buildRegistrationLaunchLink(String registrationId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
    return buildRegistrationLaunchLinkWithHttpInfo(registrationId, launchLinkRequest).getData();
      }

  /**
   * Get a launch link for a Registration 
   * Returns the launch link to use to launch the course for the registration.   Launch links are meant as a way to provide access to your content.  When a learner visits the link, the course will be launched and registration progress will start to be tracked. 
   * @param registrationId  (required)
   * @param launchLinkRequest  (required)
   * @return ApiResponse&lt;LaunchLinkSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LaunchLinkSchema> buildRegistrationLaunchLinkWithHttpInfo(String registrationId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
    Object localVarPostBody = launchLinkRequest;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling buildRegistrationLaunchLink");
    }
    
    // verify the required parameter 'launchLinkRequest' is set
    if (launchLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'launchLinkRequest' when calling buildRegistrationLaunchLink");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/launchLink"
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
   * Create a Registration Instance 
   * Creates a new instance of the registration.  Registration instances will be automatically created when a learner launches a new version of the course.  This allows for tracking registration progress for each of the versions of the course the learner has taken.  When the created registration instance is \&quot;launched\&quot;, the course specified at creation time will be launched. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public void createNewRegistrationInstance(String registrationId) throws ApiException {

    createNewRegistrationInstanceWithHttpInfo(registrationId);
  }

  /**
   * Create a Registration Instance 
   * Creates a new instance of the registration.  Registration instances will be automatically created when a learner launches a new version of the course.  This allows for tracking registration progress for each of the versions of the course the learner has taken.  When the created registration instance is \&quot;launched\&quot;, the course specified at creation time will be launched. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createNewRegistrationInstanceWithHttpInfo(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling createNewRegistrationInstance");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create a Registration 
   * Creates a new registration.  Registrations are the billable unit in SCORM Cloud, and represent a link between a learner and a course.  A registration will contain a few pieces of information such as learner identifiers, the id of the course being registered for, and several other optional fields. A registration must be tied to a specific course at creation time.  When the created registration is \&quot;launched\&quot;, the course specified at creation time will be launched. 
   * @param registration  (required)
   * @param courseVersion Unless you have a reason for using this you probably do not need to.  (optional)
   * @throws ApiException if fails to make API call
   */
  public void createRegistration(CreateRegistrationSchema registration, Integer courseVersion) throws ApiException {

    createRegistrationWithHttpInfo(registration, courseVersion);
  }

  /**
   * Create a Registration 
   * Creates a new registration.  Registrations are the billable unit in SCORM Cloud, and represent a link between a learner and a course.  A registration will contain a few pieces of information such as learner identifiers, the id of the course being registered for, and several other optional fields. A registration must be tied to a specific course at creation time.  When the created registration is \&quot;launched\&quot;, the course specified at creation time will be launched. 
   * @param registration  (required)
   * @param courseVersion Unless you have a reason for using this you probably do not need to.  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createRegistrationWithHttpInfo(CreateRegistrationSchema registration, Integer courseVersion) throws ApiException {
    Object localVarPostBody = registration;
    
    // verify the required parameter 'registration' is set
    if (registration == null) {
      throw new ApiException(400, "Missing the required parameter 'registration' when calling createRegistration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations";

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a Registration 
   * Deletes the specified registration.  &gt;**Caution:** &gt;This will also delete all instances of the registration. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistration(String registrationId) throws ApiException {

    deleteRegistrationWithHttpInfo(registrationId);
  }

  /**
   * Delete a Registration 
   * Deletes the specified registration.  &gt;**Caution:** &gt;This will also delete all instances of the registration. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationWithHttpInfo(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a configuration setting explicitly set for a Registration 
   * Clears the specified setting from the registration.  This causes the setting to inherit a value from a higher level (e.g. course).  If the configuration setting was not set at the registration level it will continue to persist and will require deletion from the level it was set. 
   * @param registrationId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationConfigurationSetting(String registrationId, String settingId) throws ApiException {

    deleteRegistrationConfigurationSettingWithHttpInfo(registrationId, settingId);
  }

  /**
   * Delete a configuration setting explicitly set for a Registration 
   * Clears the specified setting from the registration.  This causes the setting to inherit a value from a higher level (e.g. course).  If the configuration setting was not set at the registration level it will continue to persist and will require deletion from the level it was set. 
   * @param registrationId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationConfigurationSettingWithHttpInfo(String registrationId, String settingId) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/configuration/{settingId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Reset global data for a Registration 
   * Deletes the global data associated with the registration, but the registration itself will remain.  This means any progress towards the global objectives will be removed. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationGlobalData(String registrationId) throws ApiException {

    deleteRegistrationGlobalDataWithHttpInfo(registrationId);
  }

  /**
   * Reset global data for a Registration 
   * Deletes the global data associated with the registration, but the registration itself will remain.  This means any progress towards the global objectives will be removed. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationGlobalDataWithHttpInfo(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationGlobalData");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/globalData"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a Registration Instance 
   * Deletes the specified instance of the registration.  If deleting the last remaining instance of the registration, the registration itself will be deleted along with any associated data. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationInstance(String registrationId, Integer instanceId) throws ApiException {

    deleteRegistrationInstanceWithHttpInfo(registrationId, instanceId);
  }

  /**
   * Delete a Registration Instance 
   * Deletes the specified instance of the registration.  If deleting the last remaining instance of the registration, the registration itself will be deleted along with any associated data. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationInstanceWithHttpInfo(String registrationId, Integer instanceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationInstance");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling deleteRegistrationInstance");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a configuration setting explicitly set for a Registration Instance 
   * Clears the specified setting from the registration instance.  This causes the setting to inherit a value from a higher level (e.g. course).  If the configuration setting was not set at the registration level it will continue to persist and will require deletion from the level it was set. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationInstanceConfigurationSetting(String registrationId, Integer instanceId, String settingId) throws ApiException {

    deleteRegistrationInstanceConfigurationSettingWithHttpInfo(registrationId, instanceId, settingId);
  }

  /**
   * Delete a configuration setting explicitly set for a Registration Instance 
   * Clears the specified setting from the registration instance.  This causes the setting to inherit a value from a higher level (e.g. course).  If the configuration setting was not set at the registration level it will continue to persist and will require deletion from the level it was set. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationInstanceConfigurationSettingWithHttpInfo(String registrationId, Integer instanceId, String settingId) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/configuration/{settingId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Reset a Registration 
   * Deletes the data associated with the registration, but the registration itself will remain.  This means any of the launch history, and progress will be removed.  After the data has been deleted, the registration will automatically register itself for the latest version of the course. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationProgress(String registrationId) throws ApiException {

    deleteRegistrationProgressWithHttpInfo(registrationId);
  }

  /**
   * Reset a Registration 
   * Deletes the data associated with the registration, but the registration itself will remain.  This means any of the launch history, and progress will be removed.  After the data has been deleted, the registration will automatically register itself for the latest version of the course. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationProgressWithHttpInfo(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistrationProgress");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/progress"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete tags from a Registration 
   * Deletes the specified tags from the registration.  Deleting tags that do not exist will still result in a success. 
   * @param registrationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistrationTags(String registrationId, TagListSchema tags) throws ApiException {

    deleteRegistrationTagsWithHttpInfo(registrationId, tags);
  }

  /**
   * Delete tags from a Registration 
   * Deletes the specified tags from the registration.  Deleting tags that do not exist will still result in a success. 
   * @param registrationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationTagsWithHttpInfo(String registrationId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Check that a Registration exists 
   * Checks that the registration exists within SCORM Cloud.  &gt;**Info:** &gt;No registration data will be returned for this call. A successful &#x60;200&#x60; response indicates that the registration exists. If the registration does not exist, a &#x60;404&#x60; error will be returned instead. If you are looking for information about the registration, try calling &#x60;GetRegistrationProgress&#x60; instead. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getRegistration(String registrationId) throws ApiException {

    getRegistrationWithHttpInfo(registrationId);
  }

  /**
   * Check that a Registration exists 
   * Checks that the registration exists within SCORM Cloud.  &gt;**Info:** &gt;No registration data will be returned for this call. A successful &#x60;200&#x60; response indicates that the registration exists. If the registration does not exist, a &#x60;404&#x60; error will be returned instead. If you are looking for information about the registration, try calling &#x60;GetRegistrationProgress&#x60; instead. 
   * @param registrationId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> getRegistrationWithHttpInfo(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}"
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


    return apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get effective configuration settings for a Registration 
   * Returns the effective configuration settings for the registration.  If not set at the registration level, the setting will inherit a value from a higher level (e.g. course).  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getRegistrationConfiguration(String registrationId, Boolean includeMetadata) throws ApiException {
    return getRegistrationConfigurationWithHttpInfo(registrationId, includeMetadata).getData();
      }

  /**
   * Get effective configuration settings for a Registration 
   * Returns the effective configuration settings for the registration.  If not set at the registration level, the setting will inherit a value from a higher level (e.g. course).  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return ApiResponse&lt;SettingListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SettingListSchema> getRegistrationConfigurationWithHttpInfo(String registrationId, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/configuration"
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
   * Get effective configuration settings for a Registration Instance 
   * Returns the effective configuration settings for the registration instance.  If not set at the registration level, the setting will inherit a value from a higher level (e.g. course).  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getRegistrationInstanceConfiguration(String registrationId, Integer instanceId, Boolean includeMetadata) throws ApiException {
    return getRegistrationInstanceConfigurationWithHttpInfo(registrationId, instanceId, includeMetadata).getData();
      }

  /**
   * Get effective configuration settings for a Registration Instance 
   * Returns the effective configuration settings for the registration instance.  If not set at the registration level, the setting will inherit a value from a higher level (e.g. course).  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return ApiResponse&lt;SettingListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SettingListSchema> getRegistrationInstanceConfigurationWithHttpInfo(String registrationId, Integer instanceId, Boolean includeMetadata) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/configuration"
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
   * Get launch history for a Registration Instance 
   * Returns the launch history of the registration instance.  This includes completion status, time taken, and pass/fail status. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param includeHistoryLog Whether to include the history log in the launch history (optional, default to false)
   * @return LaunchHistoryListSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchHistoryListSchema getRegistrationInstanceLaunchHistory(String registrationId, Integer instanceId, Boolean includeHistoryLog) throws ApiException {
    return getRegistrationInstanceLaunchHistoryWithHttpInfo(registrationId, instanceId, includeHistoryLog).getData();
      }

  /**
   * Get launch history for a Registration Instance 
   * Returns the launch history of the registration instance.  This includes completion status, time taken, and pass/fail status. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param includeHistoryLog Whether to include the history log in the launch history (optional, default to false)
   * @return ApiResponse&lt;LaunchHistoryListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LaunchHistoryListSchema> getRegistrationInstanceLaunchHistoryWithHttpInfo(String registrationId, Integer instanceId, Boolean includeHistoryLog) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/launchHistory"
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
   * Get detailed information about a Registration Instance 
   * Returns detailed information about the registration instance.  This includes completion status, time taken, score, and pass/fail status. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return RegistrationSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationSchema getRegistrationInstanceProgress(String registrationId, Integer instanceId, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    return getRegistrationInstanceProgressWithHttpInfo(registrationId, instanceId, includeChildResults, includeInteractionsAndObjectives, includeRuntime).getData();
      }

  /**
   * Get detailed information about a Registration Instance 
   * Returns detailed information about the registration instance.  This includes completion status, time taken, score, and pass/fail status. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return ApiResponse&lt;RegistrationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RegistrationSchema> getRegistrationInstanceProgressWithHttpInfo(String registrationId, Integer instanceId, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}"
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
   * Get xAPI statements for a Registration Instance 
   * Returns xAPI statements for the registration instance. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getRegistrationInstanceStatements(String registrationId, Integer instanceId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    return getRegistrationInstanceStatementsWithHttpInfo(registrationId, instanceId, since, until, more).getData();
      }

  /**
   * Get xAPI statements for a Registration Instance 
   * Returns xAPI statements for the registration instance. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;XapiStatementResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiStatementResult> getRegistrationInstanceStatementsWithHttpInfo(String registrationId, Integer instanceId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/xAPIStatements"
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
   * Get a list of a Registration&#39;s Instances 
   * Returns information about all instances of the registration.  This can be useful to see information such as registration progress across versions of a course. 
   * @param registrationId  (required)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return RegistrationListSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationListSchema getRegistrationInstances(String registrationId, OffsetDateTime until, OffsetDateTime since, String more, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    return getRegistrationInstancesWithHttpInfo(registrationId, until, since, more, includeChildResults, includeInteractionsAndObjectives, includeRuntime).getData();
      }

  /**
   * Get a list of a Registration&#39;s Instances 
   * Returns information about all instances of the registration.  This can be useful to see information such as registration progress across versions of a course. 
   * @param registrationId  (required)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return ApiResponse&lt;RegistrationListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RegistrationListSchema> getRegistrationInstancesWithHttpInfo(String registrationId, OffsetDateTime until, OffsetDateTime since, String more, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationInstances");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/instances"
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
   * Get launch history for a Registration 
   * Returns the launch history of the registration.  This includes completion status, time taken, and pass/fail status. 
   * @param registrationId  (required)
   * @param includeHistoryLog Whether to include the history log in the launch history (optional, default to false)
   * @return LaunchHistoryListSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchHistoryListSchema getRegistrationLaunchHistory(String registrationId, Boolean includeHistoryLog) throws ApiException {
    return getRegistrationLaunchHistoryWithHttpInfo(registrationId, includeHistoryLog).getData();
      }

  /**
   * Get launch history for a Registration 
   * Returns the launch history of the registration.  This includes completion status, time taken, and pass/fail status. 
   * @param registrationId  (required)
   * @param includeHistoryLog Whether to include the history log in the launch history (optional, default to false)
   * @return ApiResponse&lt;LaunchHistoryListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LaunchHistoryListSchema> getRegistrationLaunchHistoryWithHttpInfo(String registrationId, Boolean includeHistoryLog) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationLaunchHistory");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/launchHistory"
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
   * Get detailed information about a Registration 
   * Returns detailed information about the registration.  This includes completion status, time taken, score, and pass/fail status.  &gt;**Info:** &gt;If you find yourself making multiple calls to this endpoint, it may be worthwhile to utilize our [postback mechanism](https://cloud.scorm.com/docs/v2/guides/postback/) instead.  The main premise is that you would set up an endpoint on your end, and when we detect a change to the registration progress: completion status, time taken, score, or pass/fail status, we would send a message to your system with the registration progress. 
   * @param registrationId  (required)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return RegistrationSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationSchema getRegistrationProgress(String registrationId, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    return getRegistrationProgressWithHttpInfo(registrationId, includeChildResults, includeInteractionsAndObjectives, includeRuntime).getData();
      }

  /**
   * Get detailed information about a Registration 
   * Returns detailed information about the registration.  This includes completion status, time taken, score, and pass/fail status.  &gt;**Info:** &gt;If you find yourself making multiple calls to this endpoint, it may be worthwhile to utilize our [postback mechanism](https://cloud.scorm.com/docs/v2/guides/postback/) instead.  The main premise is that you would set up an endpoint on your end, and when we detect a change to the registration progress: completion status, time taken, score, or pass/fail status, we would send a message to your system with the registration progress. 
   * @param registrationId  (required)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @return ApiResponse&lt;RegistrationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RegistrationSchema> getRegistrationProgressWithHttpInfo(String registrationId, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationProgress");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}"
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
   * Get xAPI statements for a Registration 
   * Returns xAPI statements for the registration. 
   * @param registrationId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getRegistrationStatements(String registrationId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    return getRegistrationStatementsWithHttpInfo(registrationId, since, until, more).getData();
      }

  /**
   * Get xAPI statements for a Registration 
   * Returns xAPI statements for the registration. 
   * @param registrationId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;XapiStatementResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiStatementResult> getRegistrationStatementsWithHttpInfo(String registrationId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationStatements");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/xAPIStatements"
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
   * Get tags for a Registration 
   * Returns the tags for the registration. 
   * @param registrationId  (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getRegistrationTags(String registrationId) throws ApiException {
    return getRegistrationTagsWithHttpInfo(registrationId).getData();
      }

  /**
   * Get tags for a Registration 
   * Returns the tags for the registration. 
   * @param registrationId  (required)
   * @return ApiResponse&lt;TagListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagListSchema> getRegistrationTagsWithHttpInfo(String registrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling getRegistrationTags");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/{registrationId}/tags"
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
   * Get a list of Registrations 
   * Returns a list of registrations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request.  &gt;**Info:** &gt;If you find yourself making multiple calls to this endpoint, it may be worthwhile to utilize our [postback mechanism](https://cloud.scorm.com/docs/v2/guides/postback/) instead.  The main premise is that you would set up an endpoint on your end, and when we detect a change to the registration progress: completion status, time taken, score, or pass/fail status, we would send a message to your system with the registration progress. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param learnerId Only retrieve resources having &#x60;learnerId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to created)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to registration_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to created_desc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @param includeTotalCount Include the total count of results matching the provided filters as a header on the initial request.  The header will not be present on subsequent requests resulting from passing the &#x60;more&#x60; token.  (optional, default to false)
   * @return RegistrationListSchema
   * @throws ApiException if fails to make API call
   */
  public RegistrationListSchema getRegistrations(String courseId, String learnerId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime, Boolean includeTotalCount) throws ApiException {
    return getRegistrationsWithHttpInfo(courseId, learnerId, since, until, datetimeFilter, tags, filter, filterBy, orderBy, more, includeChildResults, includeInteractionsAndObjectives, includeRuntime, includeTotalCount).getData();
      }

  /**
   * Get a list of Registrations 
   * Returns a list of registrations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request.  &gt;**Info:** &gt;If you find yourself making multiple calls to this endpoint, it may be worthwhile to utilize our [postback mechanism](https://cloud.scorm.com/docs/v2/guides/postback/) instead.  The main premise is that you would set up an endpoint on your end, and when we detect a change to the registration progress: completion status, time taken, score, or pass/fail status, we would send a message to your system with the registration progress. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param learnerId Only retrieve resources having &#x60;learnerId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to created)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to registration_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to created_desc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeChildResults Include information about each learning object, not just the top level in the results (optional, default to false)
   * @param includeInteractionsAndObjectives Include interactions and objectives in the results (optional, default to false)
   * @param includeRuntime Include runtime details in the results (optional, default to false)
   * @param includeTotalCount Include the total count of results matching the provided filters as a header on the initial request.  The header will not be present on subsequent requests resulting from passing the &#x60;more&#x60; token.  (optional, default to false)
   * @return ApiResponse&lt;RegistrationListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RegistrationListSchema> getRegistrationsWithHttpInfo(String courseId, String learnerId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more, Boolean includeChildResults, Boolean includeInteractionsAndObjectives, Boolean includeRuntime, Boolean includeTotalCount) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/registrations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "learnerId", learnerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeChildResults", includeChildResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeInteractionsAndObjectives", includeInteractionsAndObjectives));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRuntime", includeRuntime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTotalCount", includeTotalCount));

    
    
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
   * Add tags to a Registration 
   * Applies the provided tags to the registration.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetRegistrations). 
   * @param registrationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putRegistrationTags(String registrationId, TagListSchema tags) throws ApiException {

    putRegistrationTagsWithHttpInfo(registrationId, tags);
  }

  /**
   * Add tags to a Registration 
   * Applies the provided tags to the registration.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetRegistrations). 
   * @param registrationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putRegistrationTagsWithHttpInfo(String registrationId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add a group of tags to a group of Registrations 
   * Applies all of the provided tags on all of the provided registrations.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetRegistrations). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public void putRegistrationTagsBatch(BatchTagsSchema batch) throws ApiException {

    putRegistrationTagsBatchWithHttpInfo(batch);
  }

  /**
   * Add a group of tags to a group of Registrations 
   * Applies all of the provided tags on all of the provided registrations.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetRegistrations). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putRegistrationTagsBatchWithHttpInfo(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putRegistrationTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/tags";

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
  /**
   * Update configuration settings for a Registration 
   * Updates configuration settings at the registration level.  This will explicitly set a value at the registration level and override any settings from a higher level.  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setRegistrationConfiguration(String registrationId, SettingsPostSchema configurationSettings) throws ApiException {

    setRegistrationConfigurationWithHttpInfo(registrationId, configurationSettings);
  }

  /**
   * Update configuration settings for a Registration 
   * Updates configuration settings at the registration level.  This will explicitly set a value at the registration level and override any settings from a higher level.  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRegistrationConfigurationWithHttpInfo(String registrationId, SettingsPostSchema configurationSettings) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/configuration"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update configuration settings for a Registration Instance 
   * Updates configuration settings at the registration level.  This will explicitly set a value at the registration level and override any settings from a higher level.  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setRegistrationInstanceConfiguration(String registrationId, Integer instanceId, SettingsPostSchema configurationSettings) throws ApiException {

    setRegistrationInstanceConfigurationWithHttpInfo(registrationId, instanceId, configurationSettings);
  }

  /**
   * Update configuration settings for a Registration Instance 
   * Updates configuration settings at the registration level.  This will explicitly set a value at the registration level and override any settings from a higher level.  Registrations are the bottom most level in the configuration hierarchy, so the values present at the registration level will be what are used when a course is launched. 
   * @param registrationId  (required)
   * @param instanceId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRegistrationInstanceConfigurationWithHttpInfo(String registrationId, Integer instanceId, SettingsPostSchema configurationSettings) throws ApiException {
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
    String localVarPath = "/registrations/{registrationId}/instances/{instanceId}/configuration"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Send a test postback with the provided configuration 
   * Sends a postback with dummy data to the url specified.  The postback will use additional information from the configuration provided with the request (e.g. a provided username/password will be sent along with the postback to allow for logging in to a secure page.  The format of the data sent will differ depending on whether &#x60;httpbasic&#x60; or &#x60;form&#x60; is passed for &#x60;authType&#x60;.  - With httpbasic, an authorization header will be sent with the base64 encoded credentials.  The body will be JSON formatted data. - With form, the username and password will be sent in the body of the request along with the data.  The whole body will be url encoded.  &gt;**Note:** &gt;The data that will be sent to the provided url is the same format as the output of the GetRegistrationProgress endpoint. 
   * @param postBack  (required)
   * @throws ApiException if fails to make API call
   */
  public void testRegistrationPostback(PostBackSchema postBack) throws ApiException {

    testRegistrationPostbackWithHttpInfo(postBack);
  }

  /**
   * Send a test postback with the provided configuration 
   * Sends a postback with dummy data to the url specified.  The postback will use additional information from the configuration provided with the request (e.g. a provided username/password will be sent along with the postback to allow for logging in to a secure page.  The format of the data sent will differ depending on whether &#x60;httpbasic&#x60; or &#x60;form&#x60; is passed for &#x60;authType&#x60;.  - With httpbasic, an authorization header will be sent with the base64 encoded credentials.  The body will be JSON formatted data. - With form, the username and password will be sent in the body of the request along with the data.  The whole body will be url encoded.  &gt;**Note:** &gt;The data that will be sent to the provided url is the same format as the output of the GetRegistrationProgress endpoint. 
   * @param postBack  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> testRegistrationPostbackWithHttpInfo(PostBackSchema postBack) throws ApiException {
    Object localVarPostBody = postBack;
    
    // verify the required parameter 'postBack' is set
    if (postBack == null) {
      throw new ApiException(400, "Missing the required parameter 'postBack' when calling testRegistrationPostback");
    }
    
    // create path and map variables
    String localVarPath = "/registrations/postBackTest";

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
