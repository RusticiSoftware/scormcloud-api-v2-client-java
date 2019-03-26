# ApplicationManagementApi

All URIs are relative to *https://cloud.scorm.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplication**](ApplicationManagementApi.md#createApplication) | **PUT** /appManagement/applications/{applicationName} | Create a new application
[**createCredential**](ApplicationManagementApi.md#createCredential) | **POST** /appManagement/{childAppId}/credentials | Create credential
[**createToken**](ApplicationManagementApi.md#createToken) | **POST** /appManagement/token | Create token
[**deleteApplication**](ApplicationManagementApi.md#deleteApplication) | **DELETE** /appManagement/applications/{childAppId} | Delete an application.  If the application contains content, it must first be manually removed before calling this method, else an error will be thrown.
[**deleteCredential**](ApplicationManagementApi.md#deleteCredential) | **DELETE** /appManagement/{childAppId}/credentials/{credentialId} | Removes &#x60;credentialId&#x60; credentials
[**getApplicationConfiguration**](ApplicationManagementApi.md#getApplicationConfiguration) | **GET** /appManagement/configuration | Returns all configuration settings for this level
[**getApplicationList**](ApplicationManagementApi.md#getApplicationList) | **GET** /appManagement/applications | Get list of all applications in this realm.
[**getCredentials**](ApplicationManagementApi.md#getCredentials) | **GET** /appManagement/{childAppId}/credentials | List of credentials
[**setApplicationConfiguration**](ApplicationManagementApi.md#setApplicationConfiguration) | **POST** /appManagement/configuration | Set configuration settings for this level.
[**updateCredential**](ApplicationManagementApi.md#updateCredential) | **PUT** /appManagement/{childAppId}/credentials/{credentialId} | Update the name or status associated with &#x60;credentialId&#x60;


<a name="createApplication"></a>
# **createApplication**
> ApplicationSchema createApplication(applicationName)

Create a new application

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
String applicationName = "applicationName_example"; // String | 
try {
    ApplicationSchema result = apiInstance.createApplication(applicationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#createApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationName** | **String**|  |

### Return type

[**ApplicationSchema**](ApplicationSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCredential"></a>
# **createCredential**
> CredentialCreatedSchema createCredential(childAppId, credentialRequest)

Create credential

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
String childAppId = "childAppId_example"; // String | 
CredentialRequestSchema credentialRequest = new CredentialRequestSchema(); // CredentialRequestSchema | 
try {
    CredentialCreatedSchema result = apiInstance.createCredential(childAppId, credentialRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#createCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAppId** | **String**|  |
 **credentialRequest** | [**CredentialRequestSchema**](CredentialRequestSchema.md)|  |

### Return type

[**CredentialCreatedSchema**](CredentialCreatedSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createToken"></a>
# **createToken**
> StringResultSchema createToken(tokenRequest)

Create token

Creates, signs and returns a token based on the provided permissions, if the credentials used to request the token have the permissions being requested. Note: the token is not stored and therefore can not be modified or deleted. The requested permissions are encoded in the token which is then signed. As long as the secret used to create it is not changed the token will be valid until it expires.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
TokenRequestSchema tokenRequest = new TokenRequestSchema(); // TokenRequestSchema | 
try {
    StringResultSchema result = apiInstance.createToken(tokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenRequest** | [**TokenRequestSchema**](TokenRequestSchema.md)|  |

### Return type

[**StringResultSchema**](StringResultSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApplication"></a>
# **deleteApplication**
> deleteApplication(childAppId)

Delete an application.  If the application contains content, it must first be manually removed before calling this method, else an error will be thrown.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
String childAppId = "childAppId_example"; // String | 
try {
    apiInstance.deleteApplication(childAppId);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#deleteApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAppId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCredential"></a>
# **deleteCredential**
> deleteCredential(childAppId, credentialId)

Removes &#x60;credentialId&#x60; credentials

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
String childAppId = "childAppId_example"; // String | 
String credentialId = "credentialId_example"; // String | 
try {
    apiInstance.deleteCredential(childAppId, credentialId);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#deleteCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAppId** | **String**|  |
 **credentialId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApplicationConfiguration"></a>
# **getApplicationConfiguration**
> SettingListSchema getApplicationConfiguration(learningStandard, singleSco, includeMetadata)

Returns all configuration settings for this level

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
String learningStandard = "learningStandard_example"; // String | If specified, the request will be scoped to the provided learning standard.
Boolean singleSco = true; // Boolean | Required if learningStandard is specified. Scopes settings to whether a package has only one SCO or assignable unit within it or not. To apply a configuration setting to a learning standard for single and multi-SCO content, it must be set for both scopes.
Boolean includeMetadata = false; // Boolean | 
try {
    SettingListSchema result = apiInstance.getApplicationConfiguration(learningStandard, singleSco, includeMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#getApplicationConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **learningStandard** | **String**| If specified, the request will be scoped to the provided learning standard. | [optional] [enum: SCORM_11, SCORM_12, SCORM_2004_2ND_EDITION, SCORM_2004_3RD_EDITION, SCORM_2004_4TH_EDITION, AICC, XAPI, CMI5]
 **singleSco** | **Boolean**| Required if learningStandard is specified. Scopes settings to whether a package has only one SCO or assignable unit within it or not. To apply a configuration setting to a learning standard for single and multi-SCO content, it must be set for both scopes. | [optional]
 **includeMetadata** | **Boolean**|  | [optional] [default to false]

### Return type

[**SettingListSchema**](SettingListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApplicationList"></a>
# **getApplicationList**
> ApplicationListSchema getApplicationList()

Get list of all applications in this realm.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
try {
    ApplicationListSchema result = apiInstance.getApplicationList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#getApplicationList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApplicationListSchema**](ApplicationListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCredentials"></a>
# **getCredentials**
> CredentialListSchema getCredentials(childAppId)

List of credentials

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
String childAppId = "childAppId_example"; // String | 
try {
    CredentialListSchema result = apiInstance.getCredentials(childAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#getCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAppId** | **String**|  |

### Return type

[**CredentialListSchema**](CredentialListSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setApplicationConfiguration"></a>
# **setApplicationConfiguration**
> setApplicationConfiguration(configurationSettings, learningStandard, singleSco)

Set configuration settings for this level.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
SettingsPostSchema configurationSettings = new SettingsPostSchema(); // SettingsPostSchema | 
String learningStandard = "learningStandard_example"; // String | If specified, the request will be scoped to the provided learning standard.
Boolean singleSco = true; // Boolean | Required if learningStandard is specified. Scopes settings to whether a package has only one SCO or assignable unit within it or not. To apply a configuration setting to a learning standard for single and multi-SCO content, it must be set for both scopes.
try {
    apiInstance.setApplicationConfiguration(configurationSettings, learningStandard, singleSco);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#setApplicationConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurationSettings** | [**SettingsPostSchema**](SettingsPostSchema.md)|  |
 **learningStandard** | **String**| If specified, the request will be scoped to the provided learning standard. | [optional] [enum: SCORM_11, SCORM_12, SCORM_2004_2ND_EDITION, SCORM_2004_3RD_EDITION, SCORM_2004_4TH_EDITION, AICC, XAPI, CMI5]
 **singleSco** | **Boolean**| Required if learningStandard is specified. Scopes settings to whether a package has only one SCO or assignable unit within it or not. To apply a configuration setting to a learning standard for single and multi-SCO content, it must be set for both scopes. | [optional]

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCredential"></a>
# **updateCredential**
> updateCredential(childAppId, credentialId, credentialUpdate)

Update the name or status associated with &#x60;credentialId&#x60;

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

ApplicationManagementApi apiInstance = new ApplicationManagementApi();
String childAppId = "childAppId_example"; // String | 
String credentialId = "credentialId_example"; // String | 
CredentialRequestSchema credentialUpdate = new CredentialRequestSchema(); // CredentialRequestSchema | 
try {
    apiInstance.updateCredential(childAppId, credentialId, credentialUpdate);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationManagementApi#updateCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childAppId** | **String**|  |
 **credentialId** | **String**|  |
 **credentialUpdate** | [**CredentialRequestSchema**](CredentialRequestSchema.md)|  |

### Return type

null (empty response body)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

