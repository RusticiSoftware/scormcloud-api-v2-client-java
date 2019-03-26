# PingApi

All URIs are relative to *https://cloud.scorm.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pingAppId**](PingApi.md#pingAppId) | **GET** /ping | Get back a message indicating that the API is working.


<a name="pingAppId"></a>
# **pingAppId**
> PingSchema pingAppId()

Get back a message indicating that the API is working.

### Example
```java
// Import classes:
//import com.rusticisoftware.cloud.v2.client.ApiClient;
//import com.rusticisoftware.cloud.v2.client.ApiException;
//import com.rusticisoftware.cloud.v2.client.Configuration;
//import com.rusticisoftware.cloud.v2.client.auth.*;
//import com.rusticisoftware.cloud.v2.client.api.PingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: APP_NORMAL
HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
APP_NORMAL.setUsername("YOUR USERNAME");
APP_NORMAL.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: OAUTH
OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
OAUTH.setAccessToken("YOUR ACCESS TOKEN");

PingApi apiInstance = new PingApi();
try {
    PingSchema result = apiInstance.pingAppId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PingApi#pingAppId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PingSchema**](PingSchema.md)

### Authorization

[APP_NORMAL](../README.md#APP_NORMAL), [OAUTH](../README.md#OAUTH)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

