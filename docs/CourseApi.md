# CourseApi

All URIs are relative to *https://dev.cloud.scorm.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buildCoursePreviewLaunchLink**](CourseApi.md#buildCoursePreviewLaunchLink) | **POST** /courses/{courseId}/preview | Returns the launch link to use to preview this course
[**buildCoursePreviewLaunchLinkWithVersion**](CourseApi.md#buildCoursePreviewLaunchLinkWithVersion) | **POST** /courses/{courseId}/versions/{versionId}/preview | Returns the link to use to preview this course
[**createFetchAndImportCourseJob**](CourseApi.md#createFetchAndImportCourseJob) | **POST** /courses/importJobs | Start a job to fetch and import a course.
[**createUploadAndImportCourseJob**](CourseApi.md#createUploadAndImportCourseJob) | **POST** /courses/importJobs/upload | Upload a course and start an import job for it.
[**deleteCourse**](CourseApi.md#deleteCourse) | **DELETE** /courses/{courseId} | Delete &#x60;courseId&#x60;
[**deleteCourseConfigurationSetting**](CourseApi.md#deleteCourseConfigurationSetting) | **DELETE** /courses/{courseId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this course
[**deleteCourseTags**](CourseApi.md#deleteCourseTags) | **DELETE** /courses/{courseId}/tags | Delete tags for this course
[**deleteCourseVersion**](CourseApi.md#deleteCourseVersion) | **DELETE** /courses/{courseId}/versions/{versionId} | Delete version &#x60;versionId&#x60; of &#x60;courseId&#x60;
[**deleteCourseVersionConfigurationSetting**](CourseApi.md#deleteCourseVersionConfigurationSetting) | **DELETE** /courses/{courseId}/versions/{versionId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this course and version.
[**getCourse**](CourseApi.md#getCourse) | **GET** /courses/{courseId} | Get information about &#x60;courseId&#x60;
[**getCourseConfiguration**](CourseApi.md#getCourseConfiguration) | **GET** /courses/{courseId}/configuration | Returns all configuration settings for this course
[**getCourseStatements**](CourseApi.md#getCourseStatements) | **GET** /courses/{courseId}/xAPIStatements | Get xAPI statements for &#x60;courseId&#x60;
[**getCourseTags**](CourseApi.md#getCourseTags) | **GET** /courses/{courseId}/tags | Get the tags for this course
[**getCourseVersionConfiguration**](CourseApi.md#getCourseVersionConfiguration) | **GET** /courses/{courseId}/versions/{versionId}/configuration | Returns all configuration settings for this course and version.
[**getCourseVersionInfo**](CourseApi.md#getCourseVersionInfo) | **GET** /courses/{courseId}/versions/{versionId} | Get version &#x60;versionId&#x60; of &#x60;courseId&#x60;
[**getCourseVersionStatements**](CourseApi.md#getCourseVersionStatements) | **GET** /courses/{courseId}/versions/{versionId}/xAPIStatements | Get xAPI statements for version &#x60;versionId&#x60; of &#x60;courseId&#x60;
[**getCourseVersions**](CourseApi.md#getCourseVersions) | **GET** /courses/{courseId}/versions | Get all versions of &#x60;courseId&#x60;
[**getCourses**](CourseApi.md#getCourses) | **GET** /courses | Get all courses for &#x60;appId&#x60;
[**getImportJobStatus**](CourseApi.md#getImportJobStatus) | **GET** /courses/importJobs/{importJobId} | Check the status of an import job.
[**putCourseTags**](CourseApi.md#putCourseTags) | **PUT** /courses/{courseId}/tags | Set the tags for this course
[**putCourseTagsBatch**](CourseApi.md#putCourseTagsBatch) | **PUT** /courses/tags | Sets all of the provided tags on all of the provided courses
[**setCourseConfiguration**](CourseApi.md#setCourseConfiguration) | **POST** /courses/{courseId}/configuration | Set configuration settings for this course.
[**setCourseTitle**](CourseApi.md#setCourseTitle) | **PUT** /courses/{courseId}/title | Sets the course title for &#x60;courseId&#x60;
[**setCourseVersionConfiguration**](CourseApi.md#setCourseVersionConfiguration) | **POST** /courses/{courseId}/versions/{versionId}/configuration | Set configuration settings for this course and version.


<a name="buildCoursePreviewLaunchLink"></a>
# **buildCoursePreviewLaunchLink**
> LaunchLinkSchema buildCoursePreviewLaunchLink(courseId, launchLinkRequest, cssUrl)

Returns the launch link to use to preview this course

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
LaunchLinkRequestSchema launchLinkRequest = new LaunchLinkRequestSchema(); // LaunchLinkRequestSchema | 
String cssUrl = "cssUrl_example"; // String | 
try {
    LaunchLinkSchema result = apiInstance.buildCoursePreviewLaunchLink(courseId, launchLinkRequest, cssUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#buildCoursePreviewLaunchLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **launchLinkRequest** | [**LaunchLinkRequestSchema**](LaunchLinkRequestSchema.md)|  |
 **cssUrl** | **String**|  | [optional]

### Return type

[**LaunchLinkSchema**](LaunchLinkSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="buildCoursePreviewLaunchLinkWithVersion"></a>
# **buildCoursePreviewLaunchLinkWithVersion**
> LaunchLinkSchema buildCoursePreviewLaunchLinkWithVersion(courseId, versionId, launchLinkRequest)

Returns the link to use to preview this course

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Integer versionId = 56; // Integer | The course version
LaunchLinkRequestSchema launchLinkRequest = new LaunchLinkRequestSchema(); // LaunchLinkRequestSchema | 
try {
    LaunchLinkSchema result = apiInstance.buildCoursePreviewLaunchLinkWithVersion(courseId, versionId, launchLinkRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#buildCoursePreviewLaunchLinkWithVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **versionId** | **Integer**| The course version |
 **launchLinkRequest** | [**LaunchLinkRequestSchema**](LaunchLinkRequestSchema.md)|  |

### Return type

[**LaunchLinkSchema**](LaunchLinkSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFetchAndImportCourseJob"></a>
# **createFetchAndImportCourseJob**
> StringResultSchema createFetchAndImportCourseJob(courseId, importRequest, mayCreateNewVersion, postbackUrl)

Start a job to fetch and import a course.

An import job will be started to fetch and import the referenced file, and the import job ID will be returned. If the import is successful, the imported course will be registered using the courseId provided.\&quot;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use.
ImportFetchRequestSchema importRequest = new ImportFetchRequestSchema(); // ImportFetchRequestSchema | 
Boolean mayCreateNewVersion = false; // Boolean | Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn't already exist.
String postbackUrl = "postbackUrl_example"; // String | An optional parameter that specifies a URL to send a postback to when the course has finished uploading.
try {
    StringResultSchema result = apiInstance.createFetchAndImportCourseJob(courseId, importRequest, mayCreateNewVersion, postbackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#createFetchAndImportCourseJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. |
 **importRequest** | [**ImportFetchRequestSchema**](ImportFetchRequestSchema.md)|  |
 **mayCreateNewVersion** | **Boolean**| Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. | [optional] [default to false]
 **postbackUrl** | **String**| An optional parameter that specifies a URL to send a postback to when the course has finished uploading. | [optional]

### Return type

[**StringResultSchema**](StringResultSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUploadAndImportCourseJob"></a>
# **createUploadAndImportCourseJob**
> StringResultSchema createUploadAndImportCourseJob(courseId, mayCreateNewVersion, file, postbackUrl)

Upload a course and start an import job for it.

An import job will be started to import the posted file, and the import job ID will be returned. If the import is successful, the imported course will be registered using the courseId provided.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use.
Boolean mayCreateNewVersion = false; // Boolean | Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn't already exist.
File file = new File("/path/to/file.txt"); // File | The zip file of the course contents to import.
String postbackUrl = "postbackUrl_example"; // String | An optional parameter that specifies a URL to send a postback to when the course has finished uploading.
try {
    StringResultSchema result = apiInstance.createUploadAndImportCourseJob(courseId, mayCreateNewVersion, file, postbackUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#createUploadAndImportCourseJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| A unique identifier your application will use to identify the course after import. Your application is responsible both for generating this unique ID and for keeping track of the ID for later use. |
 **mayCreateNewVersion** | **Boolean**| Is it OK to create a new version of this course? If this is set to false and the course already exists, the upload will fail. If true and the course already exists then a new version will be created. No effect if the course doesn&#39;t already exist. | [optional] [default to false]
 **file** | **File**| The zip file of the course contents to import. | [optional]
 **postbackUrl** | **String**| An optional parameter that specifies a URL to send a postback to when the course has finished uploading. | [optional]

### Return type

[**StringResultSchema**](StringResultSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteCourse"></a>
# **deleteCourse**
> deleteCourse(courseId)

Delete &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
try {
    apiInstance.deleteCourse(courseId);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#deleteCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCourseConfigurationSetting"></a>
# **deleteCourseConfigurationSetting**
> deleteCourseConfigurationSetting(courseId, settingId)

Clears the &#x60;settingId&#x60; value for this course

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
String settingId = "settingId_example"; // String | 
try {
    apiInstance.deleteCourseConfigurationSetting(courseId, settingId);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#deleteCourseConfigurationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **settingId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCourseTags"></a>
# **deleteCourseTags**
> deleteCourseTags(courseId, tags)

Delete tags for this course

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
TagListSchema tags = new TagListSchema(); // TagListSchema | 
try {
    apiInstance.deleteCourseTags(courseId, tags);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#deleteCourseTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **tags** | [**TagListSchema**](TagListSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCourseVersion"></a>
# **deleteCourseVersion**
> deleteCourseVersion(courseId, versionId)

Delete version &#x60;versionId&#x60; of &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Integer versionId = 56; // Integer | The course version
try {
    apiInstance.deleteCourseVersion(courseId, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#deleteCourseVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **versionId** | **Integer**| The course version |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCourseVersionConfigurationSetting"></a>
# **deleteCourseVersionConfigurationSetting**
> deleteCourseVersionConfigurationSetting(courseId, versionId, settingId)

Clears the &#x60;settingId&#x60; value for this course and version.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Integer versionId = 56; // Integer | The course version
String settingId = "settingId_example"; // String | 
try {
    apiInstance.deleteCourseVersionConfigurationSetting(courseId, versionId, settingId);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#deleteCourseVersionConfigurationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **versionId** | **Integer**| The course version |
 **settingId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourse"></a>
# **getCourse**
> CourseSchema getCourse(courseId, includeRegistrationCount, includeCourseMetadata)

Get information about &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Boolean includeRegistrationCount = false; // Boolean | Include the registration count in the results
Boolean includeCourseMetadata = false; // Boolean | Include course metadata in the results. If the course has no metadata, adding this parameter has no effect.
try {
    CourseSchema result = apiInstance.getCourse(courseId, includeRegistrationCount, includeCourseMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **includeRegistrationCount** | **Boolean**| Include the registration count in the results | [optional] [default to false]
 **includeCourseMetadata** | **Boolean**| Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. | [optional] [default to false]

### Return type

[**CourseSchema**](CourseSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourseConfiguration"></a>
# **getCourseConfiguration**
> SettingListSchema getCourseConfiguration(courseId, includeMetadata)

Returns all configuration settings for this course

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Boolean includeMetadata = false; // Boolean | 
try {
    SettingListSchema result = apiInstance.getCourseConfiguration(courseId, includeMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourseConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **includeMetadata** | **Boolean**|  | [optional] [default to false]

### Return type

[**SettingListSchema**](SettingListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourseStatements"></a>
# **getCourseStatements**
> XapiStatementResult getCourseStatements(courseId, learnerId, since, until, more)

Get xAPI statements for &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
String learnerId = "learnerId_example"; // String | Only entries for the specified learner id will be included.
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
String more = "more_example"; // String | Value for this parameter will be provided in the 'more' property of registration lists, where needed. An opaque value, construction and parsing may change without notice.
try {
    XapiStatementResult result = apiInstance.getCourseStatements(courseId, learnerId, since, until, more);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourseStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **learnerId** | **String**| Only entries for the specified learner id will be included. | [optional]
 **since** | **OffsetDateTime**| Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **until** | **OffsetDateTime**| Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **more** | **String**| Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. | [optional]

### Return type

[**XapiStatementResult**](XapiStatementResult.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourseTags"></a>
# **getCourseTags**
> TagListSchema getCourseTags(courseId)

Get the tags for this course

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
try {
    TagListSchema result = apiInstance.getCourseTags(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourseTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |

### Return type

[**TagListSchema**](TagListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourseVersionConfiguration"></a>
# **getCourseVersionConfiguration**
> SettingListSchema getCourseVersionConfiguration(courseId, versionId, includeMetadata)

Returns all configuration settings for this course and version.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Integer versionId = 56; // Integer | The course version
Boolean includeMetadata = false; // Boolean | 
try {
    SettingListSchema result = apiInstance.getCourseVersionConfiguration(courseId, versionId, includeMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourseVersionConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **versionId** | **Integer**| The course version |
 **includeMetadata** | **Boolean**|  | [optional] [default to false]

### Return type

[**SettingListSchema**](SettingListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourseVersionInfo"></a>
# **getCourseVersionInfo**
> CourseSchema getCourseVersionInfo(courseId, versionId, includeRegistrationCount, includeCourseMetadata)

Get version &#x60;versionId&#x60; of &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Integer versionId = 56; // Integer | The course version
Boolean includeRegistrationCount = false; // Boolean | Include the registration count in the results
Boolean includeCourseMetadata = false; // Boolean | Include course metadata in the results. If the course has no metadata, adding this parameter has no effect.
try {
    CourseSchema result = apiInstance.getCourseVersionInfo(courseId, versionId, includeRegistrationCount, includeCourseMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourseVersionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **versionId** | **Integer**| The course version |
 **includeRegistrationCount** | **Boolean**| Include the registration count in the results | [optional] [default to false]
 **includeCourseMetadata** | **Boolean**| Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. | [optional] [default to false]

### Return type

[**CourseSchema**](CourseSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourseVersionStatements"></a>
# **getCourseVersionStatements**
> XapiStatementResult getCourseVersionStatements(courseId, versionId, learnerId, since, until, more)

Get xAPI statements for version &#x60;versionId&#x60; of &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Integer versionId = 56; // Integer | The course version
String learnerId = "learnerId_example"; // String | Only entries for the specified learner id will be included.
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
String more = "more_example"; // String | Value for this parameter will be provided in the 'more' property of registration lists, where needed. An opaque value, construction and parsing may change without notice.
try {
    XapiStatementResult result = apiInstance.getCourseVersionStatements(courseId, versionId, learnerId, since, until, more);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourseVersionStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **versionId** | **Integer**| The course version |
 **learnerId** | **String**| Only entries for the specified learner id will be included. | [optional]
 **since** | **OffsetDateTime**| Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **until** | **OffsetDateTime**| Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **more** | **String**| Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. | [optional]

### Return type

[**XapiStatementResult**](XapiStatementResult.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourseVersions"></a>
# **getCourseVersions**
> CourseListNonPagedSchema getCourseVersions(courseId, since, until, includeRegistrationCount, includeCourseMetadata)

Get all versions of &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
Boolean includeRegistrationCount = false; // Boolean | Include the registration count in the results
Boolean includeCourseMetadata = false; // Boolean | Include course metadata in the results. If the course has no metadata, adding this parameter has no effect.
try {
    CourseListNonPagedSchema result = apiInstance.getCourseVersions(courseId, since, until, includeRegistrationCount, includeCourseMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourseVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **since** | **OffsetDateTime**| Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **until** | **OffsetDateTime**| Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **includeRegistrationCount** | **Boolean**| Include the registration count in the results | [optional] [default to false]
 **includeCourseMetadata** | **Boolean**| Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. | [optional] [default to false]

### Return type

[**CourseListNonPagedSchema**](CourseListNonPagedSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourses"></a>
# **getCourses**
> CourseListSchema getCourses(more, since, until, filter, filterBy, orderBy, includeRegistrationCount, includeCourseMetadata, tags)

Get all courses for &#x60;appId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String more = "more_example"; // String | Value for this parameter will be provided in the 'more' property of registration lists, where needed. An opaque value, construction and parsing may change without notice.
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
String filter = "filter_example"; // String | Optional string which filters results by a specified field (described by filterBy).
String filterBy = "filterBy_example"; // String | Optional enum parameter for specifying the field on which to run the filter.  Defaults to course_id.
String orderBy = "orderBy_example"; // String | Optional enum parameter for specifying the field and order by which to sort the results.  Defaults to creation_date_desc.
Boolean includeRegistrationCount = false; // Boolean | Include the registration count in the results
Boolean includeCourseMetadata = false; // Boolean | Include course metadata in the results. If the course has no metadata, adding this parameter has no effect.
List<String> tags = Arrays.asList("tags_example"); // List<String> | 
try {
    CourseListSchema result = apiInstance.getCourses(more, since, until, filter, filterBy, orderBy, includeRegistrationCount, includeCourseMetadata, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **more** | **String**| Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. | [optional]
 **since** | **OffsetDateTime**| Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **until** | **OffsetDateTime**| Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **filter** | **String**| Optional string which filters results by a specified field (described by filterBy). | [optional]
 **filterBy** | **String**| Optional enum parameter for specifying the field on which to run the filter.  Defaults to course_id. | [optional] [enum: title, course_id, tags]
 **orderBy** | **String**| Optional enum parameter for specifying the field and order by which to sort the results.  Defaults to creation_date_desc. | [optional] [enum: title_asc, title_desc, creation_date_asc, creation_date_desc]
 **includeRegistrationCount** | **Boolean**| Include the registration count in the results | [optional] [default to false]
 **includeCourseMetadata** | **Boolean**| Include course metadata in the results. If the course has no metadata, adding this parameter has no effect. | [optional] [default to false]
 **tags** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**CourseListSchema**](CourseListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImportJobStatus"></a>
# **getImportJobStatus**
> ImportJobResultSchema getImportJobStatus(importJobId)

Check the status of an import job.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String importJobId = "importJobId_example"; // String | Id received when the import job was submitted to the importJobs resource.
try {
    ImportJobResultSchema result = apiInstance.getImportJobStatus(importJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getImportJobStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importJobId** | **String**| Id received when the import job was submitted to the importJobs resource. |

### Return type

[**ImportJobResultSchema**](ImportJobResultSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCourseTags"></a>
# **putCourseTags**
> putCourseTags(courseId, tags)

Set the tags for this course

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
TagListSchema tags = new TagListSchema(); // TagListSchema | 
try {
    apiInstance.putCourseTags(courseId, tags);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#putCourseTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **tags** | [**TagListSchema**](TagListSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCourseTagsBatch"></a>
# **putCourseTagsBatch**
> putCourseTagsBatch(batch)

Sets all of the provided tags on all of the provided courses

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
CourseTagsBatchSchema batch = new CourseTagsBatchSchema(); // CourseTagsBatchSchema | 
try {
    apiInstance.putCourseTagsBatch(batch);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#putCourseTagsBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch** | [**CourseTagsBatchSchema**](CourseTagsBatchSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setCourseConfiguration"></a>
# **setCourseConfiguration**
> setCourseConfiguration(courseId, configurationSettings)

Set configuration settings for this course.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
SettingsPostSchema configurationSettings = new SettingsPostSchema(); // SettingsPostSchema | 
try {
    apiInstance.setCourseConfiguration(courseId, configurationSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#setCourseConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **configurationSettings** | [**SettingsPostSchema**](SettingsPostSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setCourseTitle"></a>
# **setCourseTitle**
> String setCourseTitle(courseId, title)

Sets the course title for &#x60;courseId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
TitleSchema title = new TitleSchema(); // TitleSchema | 
try {
    String result = apiInstance.setCourseTitle(courseId, title);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#setCourseTitle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **title** | [**TitleSchema**](TitleSchema.md)|  |

### Return type

**String**

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setCourseVersionConfiguration"></a>
# **setCourseVersionConfiguration**
> setCourseVersionConfiguration(courseId, versionId, configurationSettings)

Set configuration settings for this course and version.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.CourseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

CourseApi apiInstance = new CourseApi();
String courseId = "courseId_example"; // String | 
Integer versionId = 56; // Integer | The course version
SettingsPostSchema configurationSettings = new SettingsPostSchema(); // SettingsPostSchema | 
try {
    apiInstance.setCourseVersionConfiguration(courseId, versionId, configurationSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#setCourseVersionConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**|  |
 **versionId** | **Integer**| The course version |
 **configurationSettings** | [**SettingsPostSchema**](SettingsPostSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

