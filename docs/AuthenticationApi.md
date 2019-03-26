# AuthenticationApi

All URIs are relative to *https://dev.cloud.scorm.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppToken**](AuthenticationApi.md#getAppToken) | **POST** /oauth/authenticate/application/token | Authenticates for a oauth token


<a name="getAppToken"></a>
# **getAppToken**
> ApplicationToken getAppToken(scope, expiration)

Authenticates for a oauth token

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

AuthenticationApi apiInstance = new AuthenticationApi();
String scope = "scope_example"; // String | 
Integer expiration = 300; // Integer | 
try {
    ApplicationToken result = apiInstance.getAppToken(scope, expiration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getAppToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**|  |
 **expiration** | **Integer**|  | [optional] [default to 300]

### Return type

[**ApplicationToken**](ApplicationToken.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

