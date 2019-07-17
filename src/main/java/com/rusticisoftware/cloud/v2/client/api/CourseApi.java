package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.CourseListNonPagedSchema;
import com.rusticisoftware.cloud.v2.client.model.CourseListSchema;
import com.rusticisoftware.cloud.v2.client.model.CourseSchema;
import java.io.File;
import com.rusticisoftware.cloud.v2.client.model.ImportFetchRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.ImportJobResultSchema;
import com.rusticisoftware.cloud.v2.client.model.LaunchLinkRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.LaunchLinkSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import java.time.OffsetDateTime;
import com.rusticisoftware.cloud.v2.client.model.ResponseError;
import com.rusticisoftware.cloud.v2.client.model.SettingListSchema;
import com.rusticisoftware.cloud.v2.client.model.SettingsPostSchema;
import com.rusticisoftware.cloud.v2.client.model.StringResultSchema;
import com.rusticisoftware.cloud.v2.client.model.TagListSchema;
import com.rusticisoftware.cloud.v2.client.model.TitleSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiStatementResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-16T16:01:27.387-05:00")
public class CourseApi {
  private ApiClient apiClient;

  public CourseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CourseApi(ApiClient apiClient) {
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
   * Returns the launch link to use to preview this course. 
   * @param courseId  (required)
   * @param launchLinkRequest  (required)
   * @param cssUrl  (optional)
   * @return LaunchLinkSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchLinkSchema buildCoursePreviewLaunchLink(String courseId, LaunchLinkRequestSchema launchLinkRequest, String cssUrl) throws ApiException {
    Object localVarPostBody = launchLinkRequest;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling buildCoursePreviewLaunchLink");
    }
    
    // verify the required parameter 'launchLinkRequest' is set
    if (launchLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'launchLinkRequest' when calling buildCoursePreviewLaunchLink");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/preview".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cssUrl", cssUrl));

    
    
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
   * Returns the link to use to preview a particular version of a course. 
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @param launchLinkRequest  (required)
   * @return LaunchLinkSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchLinkSchema buildCoursePreviewLaunchLinkWithVersion(String courseId, Integer versionId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
    Object localVarPostBody = launchLinkRequest;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling buildCoursePreviewLaunchLinkWithVersion");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling buildCoursePreviewLaunchLinkWithVersion");
    }
    
    // verify the required parameter 'launchLinkRequest' is set
    if (launchLinkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'launchLinkRequest' when calling buildCoursePreviewLaunchLinkWithVersion");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/preview".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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
   * An import job will be started to fetch and import the referenced file, and the import job ID will be returned. If the import is successful, the imported course will be registered using the courseId provided.  To check the progress of the import job, GetImportJobStatus should be called with the job ID returned from this call.
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param importRequest  (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createFetchAndImportCourseJob(String courseId, ImportFetchRequestSchema importRequest, Boolean mayCreateNewVersion, String postbackUrl) throws ApiException {
    Object localVarPostBody = importRequest;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createFetchAndImportCourseJob");
    }
    
    // verify the required parameter 'importRequest' is set
    if (importRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'importRequest' when calling createFetchAndImportCourseJob");
    }
    
    // create path and map variables
    String localVarPath = "/courses/importJobs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mayCreateNewVersion", mayCreateNewVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postbackUrl", postbackUrl));

    
    
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
   * 
   * An import job will be started to import the posted file, and the import job ID will be returned. If the import is successful, the imported course will be registered using the courseId provided.  To check the progress of the import job, GetImportJobStatus should be called with the job ID returned from this call. 
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @param file The zip file of the course contents to import. (optional)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createUploadAndImportCourseJob(String courseId, Boolean mayCreateNewVersion, String postbackUrl, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createUploadAndImportCourseJob");
    }
    
    // create path and map variables
    String localVarPath = "/courses/importJobs/upload".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mayCreateNewVersion", mayCreateNewVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postbackUrl", postbackUrl));

    
    if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Delete course identified by &#x60;courseId&#x60;.  When a course is deleted, so is everything connected to this course.  This includes:  - Registrations - Invitations - Dispatches - Debug Logs 
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourse(String courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourse");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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
   * Clears the value of the given &#x60;settingId&#x60; for this course.  The effective setting value will become any value set at the application level (if this value is set at the application level) or the default setting. 
   * @param courseId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseConfigurationSetting(String courseId, String settingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourseConfigurationSetting");
    }
    
    // verify the required parameter 'settingId' is set
    if (settingId == null) {
      throw new ApiException(400, "Missing the required parameter 'settingId' when calling deleteCourseConfigurationSetting");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/configuration/{settingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
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
   * Delete the provided tags from this course. 
   * @param courseId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseTags(String courseId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourseTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling deleteCourseTags");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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
   * Delete &#x60;versionId&#x60; of &#x60;courseId&#x60;.  If this is the last remaining version of this course, the course itself will be deleted and no longer accessible. 
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseVersion(String courseId, Integer versionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourseVersion");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling deleteCourseVersion");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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
   * Clears the &#x60;settingId&#x60; value for this course and version. 
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseVersionConfigurationSetting(String courseId, Integer versionId, String settingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourseVersionConfigurationSetting");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling deleteCourseVersionConfigurationSetting");
    }
    
    // verify the required parameter 'settingId' is set
    if (settingId == null) {
      throw new ApiException(400, "Missing the required parameter 'settingId' when calling deleteCourseVersionConfigurationSetting");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/configuration/{settingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()))
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
   * Get detailed information about &#x60;courseId&#x60;.  Futher detail can be obtained with the optional query parameters flags. 
   * @param courseId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return CourseSchema
   * @throws ApiException if fails to make API call
   */
  public CourseSchema getCourse(String courseId, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourse");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCourseMetadata", includeCourseMetadata));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<CourseSchema> localVarReturnType = new GenericType<CourseSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns all effective configuration settings for this course.  For any setting which is not explicitly set at the course level, the effective value will be either the value set at the application level (if there is one) or the default value for the setting. 
   * @param courseId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getCourseConfiguration(String courseId, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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
   * Get xAPI statements for &#x60;courseId&#x60;. 
   * @param courseId  (required)
   * @param learnerId Only entries for the specified learner id will be included. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getCourseStatements(String courseId, String learnerId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseStatements");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/xAPIStatements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "learnerId", learnerId));
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
   * Get a list of the tags for this course. 
   * @param courseId  (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getCourseTags(String courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseTags");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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
   * Returns all configuration settings for this course and version. 
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getCourseVersionConfiguration(String courseId, Integer versionId, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseVersionConfiguration");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getCourseVersionConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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
   * Get specific version &#x60;versionId&#x60; of &#x60;courseId&#x60; 
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return CourseSchema
   * @throws ApiException if fails to make API call
   */
  public CourseSchema getCourseVersionInfo(String courseId, Integer versionId, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseVersionInfo");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getCourseVersionInfo");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCourseMetadata", includeCourseMetadata));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<CourseSchema> localVarReturnType = new GenericType<CourseSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get xAPI statements for version &#x60;versionId&#x60; of &#x60;courseId&#x60; 
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @param learnerId Only entries for the specified learner id will be included. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getCourseVersionStatements(String courseId, Integer versionId, String learnerId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseVersionStatements");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getCourseVersionStatements");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/xAPIStatements".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "learnerId", learnerId));
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
   * Get information about all versions of &#x60;courseId&#x60;.  This can be useful to see information such as registration counts and modification times across the versions of a course. 
   * @param courseId  (required)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return CourseListNonPagedSchema
   * @throws ApiException if fails to make API call
   */
  public CourseListNonPagedSchema getCourseVersions(String courseId, OffsetDateTime since, OffsetDateTime until, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseVersions");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCourseMetadata", includeCourseMetadata));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<CourseListNonPagedSchema> localVarReturnType = new GenericType<CourseListNonPagedSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get all courses for the &#x60;appId&#x60; which was used to authenticate this call. 
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  Defaults to course_id. (optional)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  Defaults to creation_date_desc. (optional)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @param tags  (optional)
   * @return CourseListSchema
   * @throws ApiException if fails to make API call
   */
  public CourseListSchema getCourses(String more, OffsetDateTime since, OffsetDateTime until, String filter, String filterBy, String orderBy, Boolean includeRegistrationCount, Boolean includeCourseMetadata, List<String> tags) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/courses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCourseMetadata", includeCourseMetadata));
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

    GenericType<CourseListSchema> localVarReturnType = new GenericType<CourseListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Check the status of an import job.  This can be called incrementally to check to progress of a call to either of the import options. 
   * @param importJobId Id received when the import job was submitted to the importJobs resource. (required)
   * @return ImportJobResultSchema
   * @throws ApiException if fails to make API call
   */
  public ImportJobResultSchema getImportJobStatus(String importJobId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'importJobId' is set
    if (importJobId == null) {
      throw new ApiException(400, "Missing the required parameter 'importJobId' when calling getImportJobStatus");
    }
    
    // create path and map variables
    String localVarPath = "/courses/importJobs/{importJobId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "importJobId" + "\\}", apiClient.escapeString(importJobId.toString()));

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

    GenericType<ImportJobResultSchema> localVarReturnType = new GenericType<ImportJobResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Set the tags for this course.  Note: any tags currently on this course will be overwritten with the new array of tags. 
   * @param courseId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putCourseTags(String courseId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling putCourseTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling putCourseTags");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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
   * Sets all of the provided tags on all of the provided courses. 
   * @param batch Object representing an array of ids to apply an array of tags to. (required)
   * @throws ApiException if fails to make API call
   */
  public void putCourseTagsBatch(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putCourseTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/courses/tags".replaceAll("\\{format\\}","json");

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
   * Set configuration settings for this course.  Setting a value at this level will override any value which is set at the application level. 
   * @param courseId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setCourseConfiguration(String courseId, SettingsPostSchema configurationSettings) throws ApiException {
    Object localVarPostBody = configurationSettings;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling setCourseConfiguration");
    }
    
    // verify the required parameter 'configurationSettings' is set
    if (configurationSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationSettings' when calling setCourseConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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
   * Sets the course title for the provided courseId. 
   * @param courseId  (required)
   * @param title  (required)
   * @throws ApiException if fails to make API call
   */
  public void setCourseTitle(String courseId, TitleSchema title) throws ApiException {
    Object localVarPostBody = title;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling setCourseTitle");
    }
    
    // verify the required parameter 'title' is set
    if (title == null) {
      throw new ApiException(400, "Missing the required parameter 'title' when calling setCourseTitle");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/title".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

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
   * Set configuration settings for this course and version. 
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setCourseVersionConfiguration(String courseId, Integer versionId, SettingsPostSchema configurationSettings) throws ApiException {
    Object localVarPostBody = configurationSettings;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling setCourseVersionConfiguration");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling setCourseVersionConfiguration");
    }
    
    // verify the required parameter 'configurationSettings' is set
    if (configurationSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationSettings' when calling setCourseVersionConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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
