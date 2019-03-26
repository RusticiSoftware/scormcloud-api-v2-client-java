# RegistrationApi

All URIs are relative to *https://dev.cloud.scorm.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewRegistrationInstance**](RegistrationApi.md#createNewRegistrationInstance) | **POST** /registrations/{registrationId}/instances | Create a new instance for this registration specified by the registration ID
[**createRegistration**](RegistrationApi.md#createRegistration) | **POST** /registrations | Create a registration.
[**deleteRegistration**](RegistrationApi.md#deleteRegistration) | **DELETE** /registrations/{registrationId} | Delete &#x60;registrationId&#x60;
[**deleteRegistrationConfigurationSetting**](RegistrationApi.md#deleteRegistrationConfigurationSetting) | **DELETE** /registrations/{registrationId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this registration
[**deleteRegistrationInstanceConfigurationSetting**](RegistrationApi.md#deleteRegistrationInstanceConfigurationSetting) | **DELETE** /registrations/{registrationId}/instances/{instanceId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this registration instance
[**deleteRegistrationProgress**](RegistrationApi.md#deleteRegistrationProgress) | **DELETE** /registrations/{registrationId}/progress | Delete registration progress (clear registration)
[**deleteRegistrationTags**](RegistrationApi.md#deleteRegistrationTags) | **DELETE** /registrations/{registrationId}/tags | Delete tags for this registration
[**deleteRegistrationsGlobalData**](RegistrationApi.md#deleteRegistrationsGlobalData) | **DELETE** /registrations/{registrationId}/globalData | Delete global data associated with &#x60;registrationId&#x60;
[**getRegistrationConfiguration**](RegistrationApi.md#getRegistrationConfiguration) | **GET** /registrations/{registrationId}/configuration | Returns all configuration settings for this registration
[**getRegistrationInstanceConfiguration**](RegistrationApi.md#getRegistrationInstanceConfiguration) | **GET** /registrations/{registrationId}/instances/{instanceId}/configuration | Returns all configuration settings for this registration instance
[**getRegistrationInstanceLaunchHistory**](RegistrationApi.md#getRegistrationInstanceLaunchHistory) | **GET** /registrations/{registrationId}/instances/{instanceId}/launchHistory | Returns history of this registration&#39;s launches
[**getRegistrationInstanceProgress**](RegistrationApi.md#getRegistrationInstanceProgress) | **GET** /registrations/{registrationId}/instances/{instanceId} | Get registration progress for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;
[**getRegistrationInstanceStatements**](RegistrationApi.md#getRegistrationInstanceStatements) | **GET** /registrations/{registrationId}/instances/{instanceId}/xAPIStatements | Get xAPI statements for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;
[**getRegistrationInstances**](RegistrationApi.md#getRegistrationInstances) | **GET** /registrations/{registrationId}/instances | Get all the instances of this the registration specified by the registration ID
[**getRegistrationLaunchHistory**](RegistrationApi.md#getRegistrationLaunchHistory) | **GET** /registrations/{registrationId}/launchHistory | Returns history of this registration&#39;s launches
[**getRegistrationLaunchLink**](RegistrationApi.md#getRegistrationLaunchLink) | **POST** /registrations/{registrationId}/launchLink | Returns the link to use to launch this registration
[**getRegistrationProgress**](RegistrationApi.md#getRegistrationProgress) | **GET** /registrations/{registrationId} | Get registration progress for &#x60;registrationId&#x60;
[**getRegistrationStatements**](RegistrationApi.md#getRegistrationStatements) | **GET** /registrations/{registrationId}/xAPIStatements | Get xAPI statements for &#x60;registrationId&#x60;
[**getRegistrationTags**](RegistrationApi.md#getRegistrationTags) | **GET** /registrations/{registrationId}/tags | Get the tags for this registration
[**getRegistrations**](RegistrationApi.md#getRegistrations) | **GET** /registrations | Gets a list of registrations including a summary of the status of each registration.
[**putRegistrationTags**](RegistrationApi.md#putRegistrationTags) | **PUT** /registrations/{registrationId}/tags | Set the tags for this registration
[**putRegistrationTagsBatch**](RegistrationApi.md#putRegistrationTagsBatch) | **PUT** /registrations/tags | Sets all of the provided tags on all of the provided registrations
[**registrationExists**](RegistrationApi.md#registrationExists) | **HEAD** /registrations/{registrationId} | Does this registration exist?
[**setRegistrationConfiguration**](RegistrationApi.md#setRegistrationConfiguration) | **POST** /registrations/{registrationId}/configuration | Set configuration settings for this registration.
[**setRegistrationInstanceConfiguration**](RegistrationApi.md#setRegistrationInstanceConfiguration) | **POST** /registrations/{registrationId}/instances/{instanceId}/configuration | Set configuration settings for this registration instance.


<a name="createNewRegistrationInstance"></a>
# **createNewRegistrationInstance**
> createNewRegistrationInstance(registrationId)

Create a new instance for this registration specified by the registration ID

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
try {
    apiInstance.createNewRegistrationInstance(registrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#createNewRegistrationInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRegistration"></a>
# **createRegistration**
> createRegistration(registration, courseVersion)

Create a registration.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
CreateRegistrationSchema registration = new CreateRegistrationSchema(); // CreateRegistrationSchema | 
Integer courseVersion = 56; // Integer | The version of the course you want to create the registration for. Unless you have a reason for using this you probably do not need to.
try {
    apiInstance.createRegistration(registration, courseVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#createRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registration** | [**CreateRegistrationSchema**](CreateRegistrationSchema.md)|  |
 **courseVersion** | **Integer**| The version of the course you want to create the registration for. Unless you have a reason for using this you probably do not need to. | [optional]

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRegistration"></a>
# **deleteRegistration**
> deleteRegistration(registrationId)

Delete &#x60;registrationId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
try {
    apiInstance.deleteRegistration(registrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#deleteRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRegistrationConfigurationSetting"></a>
# **deleteRegistrationConfigurationSetting**
> deleteRegistrationConfigurationSetting(registrationId, settingId)

Clears the &#x60;settingId&#x60; value for this registration

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
String settingId = "settingId_example"; // String | 
try {
    apiInstance.deleteRegistrationConfigurationSetting(registrationId, settingId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#deleteRegistrationConfigurationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **settingId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRegistrationInstanceConfigurationSetting"></a>
# **deleteRegistrationInstanceConfigurationSetting**
> deleteRegistrationInstanceConfigurationSetting(registrationId, instanceId, settingId)

Clears the &#x60;settingId&#x60; value for this registration instance

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Integer instanceId = 56; // Integer | The instance of this registration
String settingId = "settingId_example"; // String | 
try {
    apiInstance.deleteRegistrationInstanceConfigurationSetting(registrationId, instanceId, settingId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#deleteRegistrationInstanceConfigurationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **instanceId** | **Integer**| The instance of this registration |
 **settingId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRegistrationProgress"></a>
# **deleteRegistrationProgress**
> deleteRegistrationProgress(registrationId)

Delete registration progress (clear registration)

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
try {
    apiInstance.deleteRegistrationProgress(registrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#deleteRegistrationProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRegistrationTags"></a>
# **deleteRegistrationTags**
> deleteRegistrationTags(registrationId, tags)

Delete tags for this registration

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
TagListSchema tags = new TagListSchema(); // TagListSchema | 
try {
    apiInstance.deleteRegistrationTags(registrationId, tags);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#deleteRegistrationTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **tags** | [**TagListSchema**](TagListSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRegistrationsGlobalData"></a>
# **deleteRegistrationsGlobalData**
> deleteRegistrationsGlobalData(registrationId)

Delete global data associated with &#x60;registrationId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
try {
    apiInstance.deleteRegistrationsGlobalData(registrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#deleteRegistrationsGlobalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationConfiguration"></a>
# **getRegistrationConfiguration**
> SettingListSchema getRegistrationConfiguration(registrationId, includeMetadata)

Returns all configuration settings for this registration

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Boolean includeMetadata = false; // Boolean | 
try {
    SettingListSchema result = apiInstance.getRegistrationConfiguration(registrationId, includeMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **includeMetadata** | **Boolean**|  | [optional] [default to false]

### Return type

[**SettingListSchema**](SettingListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationInstanceConfiguration"></a>
# **getRegistrationInstanceConfiguration**
> SettingListSchema getRegistrationInstanceConfiguration(registrationId, instanceId, includeMetadata)

Returns all configuration settings for this registration instance

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Integer instanceId = 56; // Integer | The instance of this registration
Boolean includeMetadata = false; // Boolean | 
try {
    SettingListSchema result = apiInstance.getRegistrationInstanceConfiguration(registrationId, instanceId, includeMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationInstanceConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **instanceId** | **Integer**| The instance of this registration |
 **includeMetadata** | **Boolean**|  | [optional] [default to false]

### Return type

[**SettingListSchema**](SettingListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationInstanceLaunchHistory"></a>
# **getRegistrationInstanceLaunchHistory**
> LaunchHistoryListSchema getRegistrationInstanceLaunchHistory(registrationId, instanceId, includeHistoryLog)

Returns history of this registration&#39;s launches

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Integer instanceId = 56; // Integer | The instance of this registration
Boolean includeHistoryLog = false; // Boolean | Whether to include the history log in the launch history
try {
    LaunchHistoryListSchema result = apiInstance.getRegistrationInstanceLaunchHistory(registrationId, instanceId, includeHistoryLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationInstanceLaunchHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **instanceId** | **Integer**| The instance of this registration |
 **includeHistoryLog** | **Boolean**| Whether to include the history log in the launch history | [optional] [default to false]

### Return type

[**LaunchHistoryListSchema**](LaunchHistoryListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationInstanceProgress"></a>
# **getRegistrationInstanceProgress**
> RegistrationSchema getRegistrationInstanceProgress(registrationId, instanceId, includeChildResults, includeInteractionsAndObjectives, includeRuntime)

Get registration progress for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Integer instanceId = 56; // Integer | The instance of this registration
Boolean includeChildResults = false; // Boolean | Include information about each learning object, not just the top level in the results
Boolean includeInteractionsAndObjectives = false; // Boolean | Include interactions and objectives in the results
Boolean includeRuntime = false; // Boolean | Include runtime details in the results
try {
    RegistrationSchema result = apiInstance.getRegistrationInstanceProgress(registrationId, instanceId, includeChildResults, includeInteractionsAndObjectives, includeRuntime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationInstanceProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **instanceId** | **Integer**| The instance of this registration |
 **includeChildResults** | **Boolean**| Include information about each learning object, not just the top level in the results | [optional] [default to false]
 **includeInteractionsAndObjectives** | **Boolean**| Include interactions and objectives in the results | [optional] [default to false]
 **includeRuntime** | **Boolean**| Include runtime details in the results | [optional] [default to false]

### Return type

[**RegistrationSchema**](RegistrationSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationInstanceStatements"></a>
# **getRegistrationInstanceStatements**
> XapiStatementResult getRegistrationInstanceStatements(registrationId, instanceId, since, until, more)

Get xAPI statements for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Integer instanceId = 56; // Integer | The instance of this registration
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
String more = "more_example"; // String | Value for this parameter will be provided in the 'more' property of registration lists, where needed. An opaque value, construction and parsing may change without notice.
try {
    XapiStatementResult result = apiInstance.getRegistrationInstanceStatements(registrationId, instanceId, since, until, more);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationInstanceStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **instanceId** | **Integer**| The instance of this registration |
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

<a name="getRegistrationInstances"></a>
# **getRegistrationInstances**
> RegistrationListSchema getRegistrationInstances(registrationId, until, since, more, includeChildResults, includeInteractionsAndObjectives, includeRuntime)

Get all the instances of this the registration specified by the registration ID

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
String more = "more_example"; // String | Value for this parameter will be provided in the 'more' property of registration lists, where needed. An opaque value, construction and parsing may change without notice.
Boolean includeChildResults = false; // Boolean | Include information about each learning object, not just the top level in the results
Boolean includeInteractionsAndObjectives = false; // Boolean | Include interactions and objectives in the results
Boolean includeRuntime = false; // Boolean | Include runtime details in the results
try {
    RegistrationListSchema result = apiInstance.getRegistrationInstances(registrationId, until, since, more, includeChildResults, includeInteractionsAndObjectives, includeRuntime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **until** | **OffsetDateTime**| Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **since** | **OffsetDateTime**| Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **more** | **String**| Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. | [optional]
 **includeChildResults** | **Boolean**| Include information about each learning object, not just the top level in the results | [optional] [default to false]
 **includeInteractionsAndObjectives** | **Boolean**| Include interactions and objectives in the results | [optional] [default to false]
 **includeRuntime** | **Boolean**| Include runtime details in the results | [optional] [default to false]

### Return type

[**RegistrationListSchema**](RegistrationListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationLaunchHistory"></a>
# **getRegistrationLaunchHistory**
> LaunchHistoryListSchema getRegistrationLaunchHistory(registrationId, includeHistoryLog)

Returns history of this registration&#39;s launches

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Boolean includeHistoryLog = false; // Boolean | Whether to include the history log in the launch history
try {
    LaunchHistoryListSchema result = apiInstance.getRegistrationLaunchHistory(registrationId, includeHistoryLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationLaunchHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **includeHistoryLog** | **Boolean**| Whether to include the history log in the launch history | [optional] [default to false]

### Return type

[**LaunchHistoryListSchema**](LaunchHistoryListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationLaunchLink"></a>
# **getRegistrationLaunchLink**
> LaunchLinkSchema getRegistrationLaunchLink(registrationId, launchLinkRequest)

Returns the link to use to launch this registration

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
LaunchLinkRequestSchema launchLinkRequest = new LaunchLinkRequestSchema(); // LaunchLinkRequestSchema | 
try {
    LaunchLinkSchema result = apiInstance.getRegistrationLaunchLink(registrationId, launchLinkRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationLaunchLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **launchLinkRequest** | [**LaunchLinkRequestSchema**](LaunchLinkRequestSchema.md)|  |

### Return type

[**LaunchLinkSchema**](LaunchLinkSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationProgress"></a>
# **getRegistrationProgress**
> RegistrationSchema getRegistrationProgress(registrationId, includeChildResults, includeInteractionsAndObjectives, includeRuntime)

Get registration progress for &#x60;registrationId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Boolean includeChildResults = false; // Boolean | Include information about each learning object, not just the top level in the results
Boolean includeInteractionsAndObjectives = false; // Boolean | Include interactions and objectives in the results
Boolean includeRuntime = false; // Boolean | Include runtime details in the results
try {
    RegistrationSchema result = apiInstance.getRegistrationProgress(registrationId, includeChildResults, includeInteractionsAndObjectives, includeRuntime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **includeChildResults** | **Boolean**| Include information about each learning object, not just the top level in the results | [optional] [default to false]
 **includeInteractionsAndObjectives** | **Boolean**| Include interactions and objectives in the results | [optional] [default to false]
 **includeRuntime** | **Boolean**| Include runtime details in the results | [optional] [default to false]

### Return type

[**RegistrationSchema**](RegistrationSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrationStatements"></a>
# **getRegistrationStatements**
> XapiStatementResult getRegistrationStatements(registrationId, since, until, more)

Get xAPI statements for &#x60;registrationId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
String more = "more_example"; // String | Value for this parameter will be provided in the 'more' property of registration lists, where needed. An opaque value, construction and parsing may change without notice.
try {
    XapiStatementResult result = apiInstance.getRegistrationStatements(registrationId, since, until, more);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
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

<a name="getRegistrationTags"></a>
# **getRegistrationTags**
> TagListSchema getRegistrationTags(registrationId)

Get the tags for this registration

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
try {
    TagListSchema result = apiInstance.getRegistrationTags(registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrationTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |

### Return type

[**TagListSchema**](TagListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRegistrations"></a>
# **getRegistrations**
> RegistrationListSchema getRegistrations(courseId, learnerId, since, until, more, includeChildResults, includeInteractionsAndObjectives, includeRuntime)

Gets a list of registrations including a summary of the status of each registration.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String courseId = "courseId_example"; // String | Only registrations for the specified course id will be included.
String learnerId = "learnerId_example"; // String | Only registrations for the specified learner id will be included.
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
OffsetDateTime until = new OffsetDateTime(); // OffsetDateTime | Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used.
String more = "more_example"; // String | Value for this parameter will be provided in the 'more' property of registration lists, where needed. An opaque value, construction and parsing may change without notice.
Boolean includeChildResults = false; // Boolean | Include information about each learning object, not just the top level in the results
Boolean includeInteractionsAndObjectives = false; // Boolean | Include interactions and objectives in the results
Boolean includeRuntime = false; // Boolean | Include runtime details in the results
try {
    RegistrationListSchema result = apiInstance.getRegistrations(courseId, learnerId, since, until, more, includeChildResults, includeInteractionsAndObjectives, includeRuntime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#getRegistrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| Only registrations for the specified course id will be included. | [optional]
 **learnerId** | **String**| Only registrations for the specified learner id will be included. | [optional]
 **since** | **OffsetDateTime**| Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **until** | **OffsetDateTime**| Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. | [optional]
 **more** | **String**| Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. | [optional]
 **includeChildResults** | **Boolean**| Include information about each learning object, not just the top level in the results | [optional] [default to false]
 **includeInteractionsAndObjectives** | **Boolean**| Include interactions and objectives in the results | [optional] [default to false]
 **includeRuntime** | **Boolean**| Include runtime details in the results | [optional] [default to false]

### Return type

[**RegistrationListSchema**](RegistrationListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRegistrationTags"></a>
# **putRegistrationTags**
> putRegistrationTags(registrationId, tags)

Set the tags for this registration

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
TagListSchema tags = new TagListSchema(); // TagListSchema | 
try {
    apiInstance.putRegistrationTags(registrationId, tags);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#putRegistrationTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **tags** | [**TagListSchema**](TagListSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRegistrationTagsBatch"></a>
# **putRegistrationTagsBatch**
> putRegistrationTagsBatch(batch)

Sets all of the provided tags on all of the provided registrations

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
RegistrationTagsBatchSchema batch = new RegistrationTagsBatchSchema(); // RegistrationTagsBatchSchema | 
try {
    apiInstance.putRegistrationTagsBatch(batch);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#putRegistrationTagsBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch** | [**RegistrationTagsBatchSchema**](RegistrationTagsBatchSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registrationExists"></a>
# **registrationExists**
> registrationExists(registrationId)

Does this registration exist?

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
try {
    apiInstance.registrationExists(registrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registrationExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setRegistrationConfiguration"></a>
# **setRegistrationConfiguration**
> setRegistrationConfiguration(registrationId, configurationSettings)

Set configuration settings for this registration.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
SettingsPostSchema configurationSettings = new SettingsPostSchema(); // SettingsPostSchema | 
try {
    apiInstance.setRegistrationConfiguration(registrationId, configurationSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#setRegistrationConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **configurationSettings** | [**SettingsPostSchema**](SettingsPostSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setRegistrationInstanceConfiguration"></a>
# **setRegistrationInstanceConfiguration**
> setRegistrationInstanceConfiguration(registrationId, instanceId, configurationSettings)

Set configuration settings for this registration instance.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
String registrationId = "registrationId_example"; // String | id for this registration
Integer instanceId = 56; // Integer | The instance of this registration
SettingsPostSchema configurationSettings = new SettingsPostSchema(); // SettingsPostSchema | 
try {
    apiInstance.setRegistrationInstanceConfiguration(registrationId, instanceId, configurationSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#setRegistrationInstanceConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| id for this registration |
 **instanceId** | **Integer**| The instance of this registration |
 **configurationSettings** | [**SettingsPostSchema**](SettingsPostSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

