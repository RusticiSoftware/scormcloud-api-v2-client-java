package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.AssetFileSchema;
import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.CourseListNonPagedSchema;
import com.rusticisoftware.cloud.v2.client.model.CourseListSchema;
import com.rusticisoftware.cloud.v2.client.model.CourseSchema;
import java.io.File;
import com.rusticisoftware.cloud.v2.client.model.FileListSchema;
import com.rusticisoftware.cloud.v2.client.model.ImportAssetRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.ImportFetchRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.ImportJobResultSchema;
import com.rusticisoftware.cloud.v2.client.model.ImportRequestSchema;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
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
   * Get a launch link to preview a Course 
   * Returns the launch link to use to preview the course.  Course preview does not require an underlying registration. As such, no interactions will be tracked during the preview launch.  Previews are meant to be a way to confirm the course looks and acts the way it should.  &gt;**Note:** &gt;The cmi5 standard does not support the ability to preview a course.  A launch link can be built for a cmi5 course, but visiting the link will result in an error page.  More details can be found in this [article explaining the complications behind cmi5 preview launches](https://support.scorm.com/hc/en-us/articles/1260805676710). 
   * @param courseId  (required)
   * @param launchLinkRequest  (required)
   * @return LaunchLinkSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchLinkSchema buildCoursePreviewLaunchLink(String courseId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
    return buildCoursePreviewLaunchLinkWithHttpInfo(courseId, launchLinkRequest).getData();
      }

  /**
   * Get a launch link to preview a Course 
   * Returns the launch link to use to preview the course.  Course preview does not require an underlying registration. As such, no interactions will be tracked during the preview launch.  Previews are meant to be a way to confirm the course looks and acts the way it should.  &gt;**Note:** &gt;The cmi5 standard does not support the ability to preview a course.  A launch link can be built for a cmi5 course, but visiting the link will result in an error page.  More details can be found in this [article explaining the complications behind cmi5 preview launches](https://support.scorm.com/hc/en-us/articles/1260805676710). 
   * @param courseId  (required)
   * @param launchLinkRequest  (required)
   * @return ApiResponse&lt;LaunchLinkSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LaunchLinkSchema> buildCoursePreviewLaunchLinkWithHttpInfo(String courseId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/preview"
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

    GenericType<LaunchLinkSchema> localVarReturnType = new GenericType<LaunchLinkSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a launch link to preview a Course Version 
   * Returns the launch link to use to preview the course version.  Course preview does not require an underlying registration.  As such, no interactions will be tracked during the preview launch.  Previews are meant to be a way to confirm the course looks and acts the way it should.  &gt;**Note:** &gt;The cmi5 standard does not support the ability to preview a course.  A launch link can be built for a cmi5 course, but visiting the link will result in an error page.  More details can be found in this [article explaining the complications behind cmi5 preview launches](https://support.scorm.com/hc/en-us/articles/1260805676710). 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param launchLinkRequest  (required)
   * @return LaunchLinkSchema
   * @throws ApiException if fails to make API call
   */
  public LaunchLinkSchema buildCoursePreviewLaunchLinkWithVersion(String courseId, Integer versionId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
    return buildCoursePreviewLaunchLinkWithVersionWithHttpInfo(courseId, versionId, launchLinkRequest).getData();
      }

  /**
   * Get a launch link to preview a Course Version 
   * Returns the launch link to use to preview the course version.  Course preview does not require an underlying registration.  As such, no interactions will be tracked during the preview launch.  Previews are meant to be a way to confirm the course looks and acts the way it should.  &gt;**Note:** &gt;The cmi5 standard does not support the ability to preview a course.  A launch link can be built for a cmi5 course, but visiting the link will result in an error page.  More details can be found in this [article explaining the complications behind cmi5 preview launches](https://support.scorm.com/hc/en-us/articles/1260805676710). 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param launchLinkRequest  (required)
   * @return ApiResponse&lt;LaunchLinkSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LaunchLinkSchema> buildCoursePreviewLaunchLinkWithVersionWithHttpInfo(String courseId, Integer versionId, LaunchLinkRequestSchema launchLinkRequest) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/versions/{versionId}/preview"
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
   * Create a Course from a package fetched from an external source 
   * Creates a course from a package fetched and imported from the provided url.  The package will be downloaded from the url and stored in SCORM Cloud.  An import job ID will be returned, which can be used with GetImportJobStatus to view the status of the import.  Courses represent the learning material a learner will progress through.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes. 
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param importRequest  (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createFetchAndImportCourseJob(String courseId, ImportFetchRequestSchema importRequest, Boolean mayCreateNewVersion, String postbackUrl) throws ApiException {
    return createFetchAndImportCourseJobWithHttpInfo(courseId, importRequest, mayCreateNewVersion, postbackUrl).getData();
      }

  /**
   * Create a Course from a package fetched from an external source 
   * Creates a course from a package fetched and imported from the provided url.  The package will be downloaded from the url and stored in SCORM Cloud.  An import job ID will be returned, which can be used with GetImportJobStatus to view the status of the import.  Courses represent the learning material a learner will progress through.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes. 
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param importRequest  (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> createFetchAndImportCourseJobWithHttpInfo(String courseId, ImportFetchRequestSchema importRequest, Boolean mayCreateNewVersion, String postbackUrl) throws ApiException {
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
    String localVarPath = "/courses/importJobs";

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
   * Create a Course from a fetched or referenced external media file 
   * Creates a course from one of the following methods: fetchRequest, mediaFileReferenceRequest, or connectorReferenceRequest. In all cases, an import job ID will be returned, which can be used with GetImportJobStatus to view the status of the import.  Courses represent the learning material a learner will progress through.  - A fetchRequest performs the same actions as CreateFetchAndImportCourseJob.  A course will be created from a package fetched from the provided url.  The package will be downloaded from the url and stored in SCORM Cloud. - A mediaFileReferenceRequest will not store the file in SCORM Cloud.  Instead it will reference the media file at the time the learner needs to view the file from the provided url. - A connectorReferenceRequest is used to import content from an external content connector, for example an LTI 1.3 tool.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes.  &gt;**Info:** &gt;Unless working with media files, it is typical to use one of the other two import methods. &gt;- CreateUploadAndImportCourseJob would be used if the course is in your local file system. &gt;- CreateFetchAndImportCourseJob would be better suited for situations where the course is uploaded remotely but is accessible via a public url. 
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param importRequest  (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createNoUploadAndImportCourseJob(String courseId, ImportRequestSchema importRequest, Boolean mayCreateNewVersion, String postbackUrl) throws ApiException {
    return createNoUploadAndImportCourseJobWithHttpInfo(courseId, importRequest, mayCreateNewVersion, postbackUrl).getData();
      }

  /**
   * Create a Course from a fetched or referenced external media file 
   * Creates a course from one of the following methods: fetchRequest, mediaFileReferenceRequest, or connectorReferenceRequest. In all cases, an import job ID will be returned, which can be used with GetImportJobStatus to view the status of the import.  Courses represent the learning material a learner will progress through.  - A fetchRequest performs the same actions as CreateFetchAndImportCourseJob.  A course will be created from a package fetched from the provided url.  The package will be downloaded from the url and stored in SCORM Cloud. - A mediaFileReferenceRequest will not store the file in SCORM Cloud.  Instead it will reference the media file at the time the learner needs to view the file from the provided url. - A connectorReferenceRequest is used to import content from an external content connector, for example an LTI 1.3 tool.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes.  &gt;**Info:** &gt;Unless working with media files, it is typical to use one of the other two import methods. &gt;- CreateUploadAndImportCourseJob would be used if the course is in your local file system. &gt;- CreateFetchAndImportCourseJob would be better suited for situations where the course is uploaded remotely but is accessible via a public url. 
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param importRequest  (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> createNoUploadAndImportCourseJobWithHttpInfo(String courseId, ImportRequestSchema importRequest, Boolean mayCreateNewVersion, String postbackUrl) throws ApiException {
    Object localVarPostBody = importRequest;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createNoUploadAndImportCourseJob");
    }
    
    // verify the required parameter 'importRequest' is set
    if (importRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'importRequest' when calling createNoUploadAndImportCourseJob");
    }
    
    // create path and map variables
    String localVarPath = "/courses/importJobs/noUpload";

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
   * Create a Course from an uploaded package 
   * Creates a course from a package uploaded from your file system.  The package will be sent as part of the request and will be stored in SCORM Cloud.  An import job ID will be returned, which can be used with GetImportJobStatus to view the status of the import.  Courses represent the learning material a learner will progress through.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes. 
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @param uploadedContentType The MIME type identifier for the content to be uploaded. This is required if uploading a media file (.pdf, .mp3, or .mp4). (optional, default to application/zip)
   * @param contentMetadata Serialized &#39;mediaFileMetadata&#39; schema. (optional)
   * @param file The zip file of the course contents to import.  (optional)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createUploadAndImportCourseJob(String courseId, Boolean mayCreateNewVersion, String postbackUrl, String uploadedContentType, String contentMetadata, File file) throws ApiException {
    return createUploadAndImportCourseJobWithHttpInfo(courseId, mayCreateNewVersion, postbackUrl, uploadedContentType, contentMetadata, file).getData();
      }

  /**
   * Create a Course from an uploaded package 
   * Creates a course from a package uploaded from your file system.  The package will be sent as part of the request and will be stored in SCORM Cloud.  An import job ID will be returned, which can be used with GetImportJobStatus to view the status of the import.  Courses represent the learning material a learner will progress through.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes. 
   * @param courseId A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. (required)
   * @param mayCreateNewVersion Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. (optional, default to false)
   * @param postbackUrl An optional parameter that specifies a URL to send a postback to when the course has finished uploading. (optional)
   * @param uploadedContentType The MIME type identifier for the content to be uploaded. This is required if uploading a media file (.pdf, .mp3, or .mp4). (optional, default to application/zip)
   * @param contentMetadata Serialized &#39;mediaFileMetadata&#39; schema. (optional)
   * @param file The zip file of the course contents to import.  (optional)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> createUploadAndImportCourseJobWithHttpInfo(String courseId, Boolean mayCreateNewVersion, String postbackUrl, String uploadedContentType, String contentMetadata, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling createUploadAndImportCourseJob");
    }
    
    // create path and map variables
    String localVarPath = "/courses/importJobs/upload";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mayCreateNewVersion", mayCreateNewVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postbackUrl", postbackUrl));

    if (uploadedContentType != null)
      localVarHeaderParams.put("uploadedContentType", apiClient.parameterToString(uploadedContentType));

    if (contentMetadata != null)
      localVarFormParams.put("contentMetadata", contentMetadata);
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
   * Delete a Course 
   * Deletes the specified course.  &gt;**Caution:** &gt;When a course is deleted, so is everything connected to the course.  This includes: &gt;- Registrations &gt;- Invitations &gt;- Dispatches &gt;- Debug Logs 
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourse(String courseId) throws ApiException {

    deleteCourseWithHttpInfo(courseId);
  }

  /**
   * Delete a Course 
   * Deletes the specified course.  &gt;**Caution:** &gt;When a course is deleted, so is everything connected to the course.  This includes: &gt;- Registrations &gt;- Invitations &gt;- Dispatches &gt;- Debug Logs 
   * @param courseId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCourseWithHttpInfo(String courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourse");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete an asset file from a Course 
   * Deletes the asset file at the specified relative path from the latest version of the course. GetCourseFileList can be used to find the relative path of the file.  &gt;**Caution:** &gt;This may have unintended consequences if the asset is still being linked to in other files in the course.  Make sure that other files relying on this asset are modified or removed as well.  This can be done with the ImportCourseAssetFile or UploadCourseAssetFile endpoints. 
   * @param courseId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseAsset(String courseId, String relativePath) throws ApiException {

    deleteCourseAssetWithHttpInfo(courseId, relativePath);
  }

  /**
   * Delete an asset file from a Course 
   * Deletes the asset file at the specified relative path from the latest version of the course. GetCourseFileList can be used to find the relative path of the file.  &gt;**Caution:** &gt;This may have unintended consequences if the asset is still being linked to in other files in the course.  Make sure that other files relying on this asset are modified or removed as well.  This can be done with the ImportCourseAssetFile or UploadCourseAssetFile endpoints. 
   * @param courseId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCourseAssetWithHttpInfo(String courseId, String relativePath) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourseAsset");
    }
    
    // verify the required parameter 'relativePath' is set
    if (relativePath == null) {
      throw new ApiException(400, "Missing the required parameter 'relativePath' when calling deleteCourseAsset");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/asset"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relativePath", relativePath));

    
    
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
   * Delete a configuration setting explicitly set for a Course 
   * Clears the specified setting from the course.  This causes the setting to inherit a value from a higher level (e.g. application).  If the configuration setting was not set at the course level it will continue to persist and will require deletion from the level it was set. 
   * @param courseId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseConfigurationSetting(String courseId, String settingId) throws ApiException {

    deleteCourseConfigurationSettingWithHttpInfo(courseId, settingId);
  }

  /**
   * Delete a configuration setting explicitly set for a Course 
   * Clears the specified setting from the course.  This causes the setting to inherit a value from a higher level (e.g. application).  If the configuration setting was not set at the course level it will continue to persist and will require deletion from the level it was set. 
   * @param courseId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCourseConfigurationSettingWithHttpInfo(String courseId, String settingId) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/configuration/{settingId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete tags from a Course 
   * Deletes the specified tags from the course.  Deleting tags that do not exist will still result in a success. 
   * @param courseId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseTags(String courseId, TagListSchema tags) throws ApiException {

    deleteCourseTagsWithHttpInfo(courseId, tags);
  }

  /**
   * Delete tags from a Course 
   * Deletes the specified tags from the course.  Deleting tags that do not exist will still result in a success. 
   * @param courseId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCourseTagsWithHttpInfo(String courseId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a Course Version 
   * Deletes the specified version of the course.  If deleting the last remaining version of the course, the course itself will be deleted and no longer accessible.  &gt;**Caution:** &gt;When a course is deleted, so is everything connected to this course.  This includes: &gt;- Registrations &gt;- Invitations &gt;- Dispatches &gt;- Debug Logs 
   * @param courseId  (required)
   * @param versionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseVersion(String courseId, Integer versionId) throws ApiException {

    deleteCourseVersionWithHttpInfo(courseId, versionId);
  }

  /**
   * Delete a Course Version 
   * Deletes the specified version of the course.  If deleting the last remaining version of the course, the course itself will be deleted and no longer accessible.  &gt;**Caution:** &gt;When a course is deleted, so is everything connected to this course.  This includes: &gt;- Registrations &gt;- Invitations &gt;- Dispatches &gt;- Debug Logs 
   * @param courseId  (required)
   * @param versionId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCourseVersionWithHttpInfo(String courseId, Integer versionId) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/versions/{versionId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete an asset file from a Course Version 
   * Deletes the asset file at the specified relative path from the course version.  GetCourseVersionFileList can be used to find the relative path of the file.  &gt;**Caution:** &gt;This may have unintended consequences if the asset is still being linked to in other files in the course.  Make sure that other files relying on this asset are modified or removed as well.  This can be done with the ImportCourseVersionAssetFile or UploadCourseVersionAssetFile endpoints. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseVersionAsset(String courseId, Integer versionId, String relativePath) throws ApiException {

    deleteCourseVersionAssetWithHttpInfo(courseId, versionId, relativePath);
  }

  /**
   * Delete an asset file from a Course Version 
   * Deletes the asset file at the specified relative path from the course version.  GetCourseVersionFileList can be used to find the relative path of the file.  &gt;**Caution:** &gt;This may have unintended consequences if the asset is still being linked to in other files in the course.  Make sure that other files relying on this asset are modified or removed as well.  This can be done with the ImportCourseVersionAssetFile or UploadCourseVersionAssetFile endpoints. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCourseVersionAssetWithHttpInfo(String courseId, Integer versionId, String relativePath) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteCourseVersionAsset");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling deleteCourseVersionAsset");
    }
    
    // verify the required parameter 'relativePath' is set
    if (relativePath == null) {
      throw new ApiException(400, "Missing the required parameter 'relativePath' when calling deleteCourseVersionAsset");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/asset"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relativePath", relativePath));

    
    
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
   * Delete a configuration setting explicitly set for a Course Version 
   * Clears the specified setting from the course version.  This causes the setting to inherit a value from a higher level (e.g. application).  If the configuration setting was not set at the course level it will continue to persist and will require deletion from the level it was set. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCourseVersionConfigurationSetting(String courseId, Integer versionId, String settingId) throws ApiException {

    deleteCourseVersionConfigurationSettingWithHttpInfo(courseId, versionId, settingId);
  }

  /**
   * Delete a configuration setting explicitly set for a Course Version 
   * Clears the specified setting from the course version.  This causes the setting to inherit a value from a higher level (e.g. application).  If the configuration setting was not set at the course level it will continue to persist and will require deletion from the level it was set. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param settingId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCourseVersionConfigurationSettingWithHttpInfo(String courseId, Integer versionId, String settingId) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/versions/{versionId}/configuration/{settingId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get detailed information about a Course 
   * Returns detailed information about the course.  This includes title, update date, learning standard, and version. 
   * @param courseId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return CourseSchema
   * @throws ApiException if fails to make API call
   */
  public CourseSchema getCourse(String courseId, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    return getCourseWithHttpInfo(courseId, includeRegistrationCount, includeCourseMetadata).getData();
      }

  /**
   * Get detailed information about a Course 
   * Returns detailed information about the course.  This includes title, update date, learning standard, and version. 
   * @param courseId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return ApiResponse&lt;CourseSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CourseSchema> getCourseWithHttpInfo(String courseId, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourse");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}"
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
   * Download an asset file from a Course 
   * Downloads the asset file at the specified relative path from the latest version of the course. GetCourseFileList can be used to find the relative path of the file. 
   * @param courseId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getCourseAsset(String courseId, String relativePath) throws ApiException {
    return getCourseAssetWithHttpInfo(courseId, relativePath).getData();
      }

  /**
   * Download an asset file from a Course 
   * Downloads the asset file at the specified relative path from the latest version of the course. GetCourseFileList can be used to find the relative path of the file. 
   * @param courseId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> getCourseAssetWithHttpInfo(String courseId, String relativePath) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseAsset");
    }
    
    // verify the required parameter 'relativePath' is set
    if (relativePath == null) {
      throw new ApiException(400, "Missing the required parameter 'relativePath' when calling getCourseAsset");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/asset"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relativePath", relativePath));

    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get effective configuration settings for a Course 
   * Returns the effective configuration settings for the course.  If not set at the course level, the setting will inherit a value from a higher level (e.g. application).  If there is a configuration setting present at a more specific level, that setting will override the one set at the course level. 
   * @param courseId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getCourseConfiguration(String courseId, Boolean includeMetadata) throws ApiException {
    return getCourseConfigurationWithHttpInfo(courseId, includeMetadata).getData();
      }

  /**
   * Get effective configuration settings for a Course 
   * Returns the effective configuration settings for the course.  If not set at the course level, the setting will inherit a value from a higher level (e.g. application).  If there is a configuration setting present at a more specific level, that setting will override the one set at the course level. 
   * @param courseId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return ApiResponse&lt;SettingListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SettingListSchema> getCourseConfigurationWithHttpInfo(String courseId, Boolean includeMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/configuration"
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
   * Get a list of asset files in a Course 
   * Returns a list of asset files in the course.  Included will be the relative path to use for the other course asset manipulation calls. 
   * @param courseId  (required)
   * @return FileListSchema
   * @throws ApiException if fails to make API call
   */
  public FileListSchema getCourseFileList(String courseId) throws ApiException {
    return getCourseFileListWithHttpInfo(courseId).getData();
      }

  /**
   * Get a list of asset files in a Course 
   * Returns a list of asset files in the course.  Included will be the relative path to use for the other course asset manipulation calls. 
   * @param courseId  (required)
   * @return ApiResponse&lt;FileListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FileListSchema> getCourseFileListWithHttpInfo(String courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseFileList");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/asset/list"
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

    GenericType<FileListSchema> localVarReturnType = new GenericType<FileListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get xAPI statements for a Course 
   * Returns xAPI statements for the course. 
   * @param courseId  (required)
   * @param learnerId Only entries for the specified learner id will be included. (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getCourseStatements(String courseId, String learnerId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    return getCourseStatementsWithHttpInfo(courseId, learnerId, since, until, more).getData();
      }

  /**
   * Get xAPI statements for a Course 
   * Returns xAPI statements for the course. 
   * @param courseId  (required)
   * @param learnerId Only entries for the specified learner id will be included. (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;XapiStatementResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiStatementResult> getCourseStatementsWithHttpInfo(String courseId, String learnerId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseStatements");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/xAPIStatements"
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
   * Get tags for a Course 
   * Returns the tags for the course. 
   * @param courseId  (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getCourseTags(String courseId) throws ApiException {
    return getCourseTagsWithHttpInfo(courseId).getData();
      }

  /**
   * Get tags for a Course 
   * Returns the tags for the course. 
   * @param courseId  (required)
   * @return ApiResponse&lt;TagListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagListSchema> getCourseTagsWithHttpInfo(String courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseTags");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/tags"
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
   * Download an asset file from a specific Course Version 
   * Downloads the asset file at the provided relative path from the course version.  GetCourseVersionFileList can be used to find the relative path of the file. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getCourseVersionAsset(String courseId, Integer versionId, String relativePath) throws ApiException {
    return getCourseVersionAssetWithHttpInfo(courseId, versionId, relativePath).getData();
      }

  /**
   * Download an asset file from a specific Course Version 
   * Downloads the asset file at the provided relative path from the course version.  GetCourseVersionFileList can be used to find the relative path of the file. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param relativePath Relative path of the asset within the course.  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> getCourseVersionAssetWithHttpInfo(String courseId, Integer versionId, String relativePath) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseVersionAsset");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getCourseVersionAsset");
    }
    
    // verify the required parameter 'relativePath' is set
    if (relativePath == null) {
      throw new ApiException(400, "Missing the required parameter 'relativePath' when calling getCourseVersionAsset");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/asset"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relativePath", relativePath));

    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get effective configuration settings for a Course Version 
   * Returns the effective configuration settings for the course version.  If not set at the course level, the setting will inherit a value from a higher level (e.g. application).  If there is a configuration setting present at a more specific level, that setting will override the one set at the course level. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return SettingListSchema
   * @throws ApiException if fails to make API call
   */
  public SettingListSchema getCourseVersionConfiguration(String courseId, Integer versionId, Boolean includeMetadata) throws ApiException {
    return getCourseVersionConfigurationWithHttpInfo(courseId, versionId, includeMetadata).getData();
      }

  /**
   * Get effective configuration settings for a Course Version 
   * Returns the effective configuration settings for the course version.  If not set at the course level, the setting will inherit a value from a higher level (e.g. application).  If there is a configuration setting present at a more specific level, that setting will override the one set at the course level. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param includeMetadata  (optional, default to false)
   * @return ApiResponse&lt;SettingListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SettingListSchema> getCourseVersionConfigurationWithHttpInfo(String courseId, Integer versionId, Boolean includeMetadata) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/versions/{versionId}/configuration"
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
   * Get a list of asset files in a Course Version 
   * Returns a list of asset files in the course version.  Included will be the relative path to use for the other course asset manipulation calls. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return FileListSchema
   * @throws ApiException if fails to make API call
   */
  public FileListSchema getCourseVersionFileList(String courseId, Integer versionId) throws ApiException {
    return getCourseVersionFileListWithHttpInfo(courseId, versionId).getData();
      }

  /**
   * Get a list of asset files in a Course Version 
   * Returns a list of asset files in the course version.  Included will be the relative path to use for the other course asset manipulation calls. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return ApiResponse&lt;FileListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FileListSchema> getCourseVersionFileListWithHttpInfo(String courseId, Integer versionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseVersionFileList");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getCourseVersionFileList");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/asset/list"
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

    GenericType<FileListSchema> localVarReturnType = new GenericType<FileListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get detailed information about a Course Version 
   * Returns detailed information about the course version.  This includes update date and registration count (if optional value is passed in). 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return CourseSchema
   * @throws ApiException if fails to make API call
   */
  public CourseSchema getCourseVersionInfo(String courseId, Integer versionId, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    return getCourseVersionInfoWithHttpInfo(courseId, versionId, includeRegistrationCount, includeCourseMetadata).getData();
      }

  /**
   * Get detailed information about a Course Version 
   * Returns detailed information about the course version.  This includes update date and registration count (if optional value is passed in). 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return ApiResponse&lt;CourseSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CourseSchema> getCourseVersionInfoWithHttpInfo(String courseId, Integer versionId, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/versions/{versionId}"
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
   * Get xAPI statements for a Course Version 
   * Returns xAPI statements for the course version. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param learnerId Only entries for the specified learner id will be included. (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return XapiStatementResult
   * @throws ApiException if fails to make API call
   */
  public XapiStatementResult getCourseVersionStatements(String courseId, Integer versionId, String learnerId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
    return getCourseVersionStatementsWithHttpInfo(courseId, versionId, learnerId, since, until, more).getData();
      }

  /**
   * Get xAPI statements for a Course Version 
   * Returns xAPI statements for the course version. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param learnerId Only entries for the specified learner id will be included. (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;XapiStatementResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<XapiStatementResult> getCourseVersionStatementsWithHttpInfo(String courseId, Integer versionId, String learnerId, OffsetDateTime since, OffsetDateTime until, String more) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/versions/{versionId}/xAPIStatements"
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
   * Get a list of a Course&#39;s Versions 
   * Returns information about all versions of the course.  This can be useful to see information such as registration counts and modification times across the versions of a course. 
   * @param courseId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return CourseListNonPagedSchema
   * @throws ApiException if fails to make API call
   */
  public CourseListNonPagedSchema getCourseVersions(String courseId, OffsetDateTime since, OffsetDateTime until, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    return getCourseVersionsWithHttpInfo(courseId, since, until, includeRegistrationCount, includeCourseMetadata).getData();
      }

  /**
   * Get a list of a Course&#39;s Versions 
   * Returns information about all versions of the course.  This can be useful to see information such as registration counts and modification times across the versions of a course. 
   * @param courseId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @return ApiResponse&lt;CourseListNonPagedSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CourseListNonPagedSchema> getCourseVersionsWithHttpInfo(String courseId, OffsetDateTime since, OffsetDateTime until, Boolean includeRegistrationCount, Boolean includeCourseMetadata) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseVersions");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions"
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
   * Download a zip package for a Course 
   * Downloads a zip package for the course.  The course zip package contains all of the files (assets) needed for a learner to take the course.  The returned zip will contain all of the files orginally uploaded with the course, as well as any modifications made through updating/ adding new assets.  &gt;**Info:** &gt;If looking to retrieve a specific file from a course, use &#x60;GetCourseAsset&#x60; instead. 
   * @param courseId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getCourseZip(String courseId) throws ApiException {
    return getCourseZipWithHttpInfo(courseId).getData();
      }

  /**
   * Download a zip package for a Course 
   * Downloads a zip package for the course.  The course zip package contains all of the files (assets) needed for a learner to take the course.  The returned zip will contain all of the files orginally uploaded with the course, as well as any modifications made through updating/ adding new assets.  &gt;**Info:** &gt;If looking to retrieve a specific file from a course, use &#x60;GetCourseAsset&#x60; instead. 
   * @param courseId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> getCourseZipWithHttpInfo(String courseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseZip");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/zip"
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

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of Courses 
   * Returns a list of courses.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to course_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to created_desc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return CourseListSchema
   * @throws ApiException if fails to make API call
   */
  public CourseListSchema getCourses(OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more, Boolean includeCourseMetadata, Boolean includeRegistrationCount) throws ApiException {
    return getCoursesWithHttpInfo(since, until, datetimeFilter, tags, filter, filterBy, orderBy, more, includeCourseMetadata, includeRegistrationCount).getData();
      }

  /**
   * Get a list of Courses 
   * Returns a list of courses.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to course_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to created_desc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeCourseMetadata Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. (optional, default to false)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return ApiResponse&lt;CourseListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CourseListSchema> getCoursesWithHttpInfo(OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more, Boolean includeCourseMetadata, Boolean includeRegistrationCount) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/courses";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCourseMetadata", includeCourseMetadata));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));

    
    
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
   * Get import job status for a Course 
   * Check the status of a course import.  This can be called incrementally to check the progress of a call to any of the import options.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes. 
   * @param importJobId Id received when the import job was submitted to the importJobs resource. (required)
   * @return ImportJobResultSchema
   * @throws ApiException if fails to make API call
   */
  public ImportJobResultSchema getImportJobStatus(String importJobId) throws ApiException {
    return getImportJobStatusWithHttpInfo(importJobId).getData();
      }

  /**
   * Get import job status for a Course 
   * Check the status of a course import.  This can be called incrementally to check the progress of a call to any of the import options.  &gt;**Note:** &gt;The import job ID used for calls to GetImportJobStatus are only valid for one week after the course import finishes. 
   * @param importJobId Id received when the import job was submitted to the importJobs resource. (required)
   * @return ApiResponse&lt;ImportJobResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ImportJobResultSchema> getImportJobStatusWithHttpInfo(String importJobId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'importJobId' is set
    if (importJobId == null) {
      throw new ApiException(400, "Missing the required parameter 'importJobId' when calling getImportJobStatus");
    }
    
    // create path and map variables
    String localVarPath = "/courses/importJobs/{importJobId}"
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
   * Download a zip package for a Course Version 
   * Downloads a zip package for the course version.  The course zip package contains all of the files (assets) needed for a learner to take the course.  The returned zip will contain all of the files orginally uploaded with the course, as well as any modifications made through updating/ adding new assets.  &gt;**Info:** &gt;If looking to retrieve a specific file from a course version, use &#x60;GetCourseVersionAsset&#x60; instead. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getVersionedCourseZip(String courseId, Integer versionId) throws ApiException {
    return getVersionedCourseZipWithHttpInfo(courseId, versionId).getData();
      }

  /**
   * Download a zip package for a Course Version 
   * Downloads a zip package for the course version.  The course zip package contains all of the files (assets) needed for a learner to take the course.  The returned zip will contain all of the files orginally uploaded with the course, as well as any modifications made through updating/ adding new assets.  &gt;**Info:** &gt;If looking to retrieve a specific file from a course version, use &#x60;GetCourseVersionAsset&#x60; instead. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> getVersionedCourseZipWithHttpInfo(String courseId, Integer versionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getVersionedCourseZip");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getVersionedCourseZip");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/zip"
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

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Import an asset file for a Course 
   * Creates or updates an asset file fetched from the provided url into the course.  The file will be downloaded from the url and stored in SCORM Cloud.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param assetSchema  (required)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return AssetFileSchema
   * @throws ApiException if fails to make API call
   */
  public AssetFileSchema importCourseAssetFile(String courseId, ImportAssetRequestSchema assetSchema, String updateAssetPolicy) throws ApiException {
    return importCourseAssetFileWithHttpInfo(courseId, assetSchema, updateAssetPolicy).getData();
      }

  /**
   * Import an asset file for a Course 
   * Creates or updates an asset file fetched from the provided url into the course.  The file will be downloaded from the url and stored in SCORM Cloud.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param assetSchema  (required)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return ApiResponse&lt;AssetFileSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetFileSchema> importCourseAssetFileWithHttpInfo(String courseId, ImportAssetRequestSchema assetSchema, String updateAssetPolicy) throws ApiException {
    Object localVarPostBody = assetSchema;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importCourseAssetFile");
    }
    
    // verify the required parameter 'assetSchema' is set
    if (assetSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'assetSchema' when calling importCourseAssetFile");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/asset"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateAssetPolicy", updateAssetPolicy));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<AssetFileSchema> localVarReturnType = new GenericType<AssetFileSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Import an asset file for a Course Version 
   * Creates or updates an asset file fetched from the provided url into the course version.  The file will be downloaded from the url and stored in SCORM Cloud.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param assetSchema  (required)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return AssetFileSchema
   * @throws ApiException if fails to make API call
   */
  public AssetFileSchema importCourseVersionAssetFile(String courseId, Integer versionId, ImportAssetRequestSchema assetSchema, String updateAssetPolicy) throws ApiException {
    return importCourseVersionAssetFileWithHttpInfo(courseId, versionId, assetSchema, updateAssetPolicy).getData();
      }

  /**
   * Import an asset file for a Course Version 
   * Creates or updates an asset file fetched from the provided url into the course version.  The file will be downloaded from the url and stored in SCORM Cloud.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param assetSchema  (required)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return ApiResponse&lt;AssetFileSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetFileSchema> importCourseVersionAssetFileWithHttpInfo(String courseId, Integer versionId, ImportAssetRequestSchema assetSchema, String updateAssetPolicy) throws ApiException {
    Object localVarPostBody = assetSchema;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importCourseVersionAssetFile");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling importCourseVersionAssetFile");
    }
    
    // verify the required parameter 'assetSchema' is set
    if (assetSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'assetSchema' when calling importCourseVersionAssetFile");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/asset"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateAssetPolicy", updateAssetPolicy));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<AssetFileSchema> localVarReturnType = new GenericType<AssetFileSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add tags to a Course 
   * Applies the provided tags to the course.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetCourses). 
   * @param courseId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putCourseTags(String courseId, TagListSchema tags) throws ApiException {

    putCourseTagsWithHttpInfo(courseId, tags);
  }

  /**
   * Add tags to a Course 
   * Applies the provided tags to the course.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetCourses). 
   * @param courseId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putCourseTagsWithHttpInfo(String courseId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add a group of tags to a group of Courses 
   * Applies all of the provided tags on all of the provided courses.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetCourses). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public void putCourseTagsBatch(BatchTagsSchema batch) throws ApiException {

    putCourseTagsBatchWithHttpInfo(batch);
  }

  /**
   * Add a group of tags to a group of Courses 
   * Applies all of the provided tags on all of the provided courses.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetCourses). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putCourseTagsBatchWithHttpInfo(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putCourseTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/courses/tags";

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
   * Update configuration settings for a Course 
   * Updates configuration settings at the course level.  This will explicitly set a value at the course level and override any settings from a higher level.  These settings will affect all items within the course which do not have their own explicit configuration set.  This can effectively be used to set course level defaults. 
   * @param courseId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setCourseConfiguration(String courseId, SettingsPostSchema configurationSettings) throws ApiException {

    setCourseConfigurationWithHttpInfo(courseId, configurationSettings);
  }

  /**
   * Update configuration settings for a Course 
   * Updates configuration settings at the course level.  This will explicitly set a value at the course level and override any settings from a higher level.  These settings will affect all items within the course which do not have their own explicit configuration set.  This can effectively be used to set course level defaults. 
   * @param courseId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setCourseConfigurationWithHttpInfo(String courseId, SettingsPostSchema configurationSettings) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/configuration"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update title for a Course 
   * Updates the title of the course. 
   * @param courseId  (required)
   * @param title  (required)
   * @throws ApiException if fails to make API call
   */
  public void setCourseTitle(String courseId, TitleSchema title) throws ApiException {

    setCourseTitleWithHttpInfo(courseId, title);
  }

  /**
   * Update title for a Course 
   * Updates the title of the course. 
   * @param courseId  (required)
   * @param title  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setCourseTitleWithHttpInfo(String courseId, TitleSchema title) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/title"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update configuration settings for a Course Version 
   * Updates configuration settings at the course level.  This will explicitly set a value at the course level and override any settings from a higher level.  These settings will affect all items within the course which do not have their own explicit configuration set.  This can effectively be used to set course level defaults. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public void setCourseVersionConfiguration(String courseId, Integer versionId, SettingsPostSchema configurationSettings) throws ApiException {

    setCourseVersionConfigurationWithHttpInfo(courseId, versionId, configurationSettings);
  }

  /**
   * Update configuration settings for a Course Version 
   * Updates configuration settings at the course level.  This will explicitly set a value at the course level and override any settings from a higher level.  These settings will affect all items within the course which do not have their own explicit configuration set.  This can effectively be used to set course level defaults. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param configurationSettings  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setCourseVersionConfigurationWithHttpInfo(String courseId, Integer versionId, SettingsPostSchema configurationSettings) throws ApiException {
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
    String localVarPath = "/courses/{courseId}/versions/{versionId}/configuration"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Upload an asset file for a Course 
   * Creates or updates an asset file uploaded from your file system into the course.  The file will be sent as part of the request and will be stored in SCORM Cloud alongside the course.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param destination Relative path from the course&#39;s base directory where the asset file will be uploaded. &#x60;/Etiquette/Course.html&#x60; will upload the file into the Etiquette folder of the course.  (required)
   * @param file The asset file to import into the course.  (optional)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return AssetFileSchema
   * @throws ApiException if fails to make API call
   */
  public AssetFileSchema uploadCourseAssetFile(String courseId, String destination, File file, String updateAssetPolicy) throws ApiException {
    return uploadCourseAssetFileWithHttpInfo(courseId, destination, file, updateAssetPolicy).getData();
      }

  /**
   * Upload an asset file for a Course 
   * Creates or updates an asset file uploaded from your file system into the course.  The file will be sent as part of the request and will be stored in SCORM Cloud alongside the course.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param destination Relative path from the course&#39;s base directory where the asset file will be uploaded. &#x60;/Etiquette/Course.html&#x60; will upload the file into the Etiquette folder of the course.  (required)
   * @param file The asset file to import into the course.  (optional)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return ApiResponse&lt;AssetFileSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetFileSchema> uploadCourseAssetFileWithHttpInfo(String courseId, String destination, File file, String updateAssetPolicy) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling uploadCourseAssetFile");
    }
    
    // verify the required parameter 'destination' is set
    if (destination == null) {
      throw new ApiException(400, "Missing the required parameter 'destination' when calling uploadCourseAssetFile");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/asset/upload"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateAssetPolicy", updateAssetPolicy));

    
    if (file != null)
      localVarFormParams.put("file", file);
if (destination != null)
      localVarFormParams.put("destination", destination);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<AssetFileSchema> localVarReturnType = new GenericType<AssetFileSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload an asset file for Course Version 
   * Creates or updates an asset file uploaded from your file system into the course version.  The file will be sent as part of the request and will be stored in SCORM Cloud alongside the course.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param destination Relative path from the course&#39;s base directory where the asset file will be uploaded. &#x60;/Etiquette/Course.html&#x60; will upload the file into the Etiquette folder of the course.  (required)
   * @param file The asset file to import into the course.  (optional)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return AssetFileSchema
   * @throws ApiException if fails to make API call
   */
  public AssetFileSchema uploadCourseVersionAssetFile(String courseId, Integer versionId, String destination, File file, String updateAssetPolicy) throws ApiException {
    return uploadCourseVersionAssetFileWithHttpInfo(courseId, versionId, destination, file, updateAssetPolicy).getData();
      }

  /**
   * Upload an asset file for Course Version 
   * Creates or updates an asset file uploaded from your file system into the course version.  The file will be sent as part of the request and will be stored in SCORM Cloud alongside the course.  This is a useful way to modify the course structure without needing to reimport the whole course after you&#39;ve made changes.  &gt;**Info:** &gt;If the course structure is being heavily modified, consider creating a new version instead.  This can be done by calling one of the course import jobs while passing true for &#x60;mayCreateNewVersion&#x60;. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param destination Relative path from the course&#39;s base directory where the asset file will be uploaded. &#x60;/Etiquette/Course.html&#x60; will upload the file into the Etiquette folder of the course.  (required)
   * @param file The asset file to import into the course.  (optional)
   * @param updateAssetPolicy Describes how SCORM Cloud should handle importing asset files with respect to overwriting files. Valid values are &#39;reject&#39;, &#39;strict&#39;, and &#39;lax&#39;. A &#39;reject&#39; policy request will fail if the asset file already exists on the system (&#39;overwriting&#39; not allowed). A &#39;strict&#39; policy request will fail if the asset file does not already exist (&#39;overwriting&#39; is required). A &#39;lax&#39; policy request will not consider whether the file already exists (i.e., it will attempt to import in all cases).  (optional, default to lax)
   * @return ApiResponse&lt;AssetFileSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetFileSchema> uploadCourseVersionAssetFileWithHttpInfo(String courseId, Integer versionId, String destination, File file, String updateAssetPolicy) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling uploadCourseVersionAssetFile");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling uploadCourseVersionAssetFile");
    }
    
    // verify the required parameter 'destination' is set
    if (destination == null) {
      throw new ApiException(400, "Missing the required parameter 'destination' when calling uploadCourseVersionAssetFile");
    }
    
    // create path and map variables
    String localVarPath = "/courses/{courseId}/versions/{versionId}/asset/upload"
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updateAssetPolicy", updateAssetPolicy));

    
    if (file != null)
      localVarFormParams.put("file", file);
if (destination != null)
      localVarFormParams.put("destination", destination);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<AssetFileSchema> localVarReturnType = new GenericType<AssetFileSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
