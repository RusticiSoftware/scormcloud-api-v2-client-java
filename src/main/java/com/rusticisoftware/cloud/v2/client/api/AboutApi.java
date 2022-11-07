package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.AboutSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AboutApi {
  private ApiClient apiClient;

  public AboutApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AboutApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get back the API version and Application name 
   * Get back the API version and application name.  The return value for this method will never change. This method largely exists for API parity with our on-premise or Managed Hosting products, which may return different release numbers from this endpoint.  For SCORM Cloud, this is effectively equal to the &#x60;/ping&#x60; resource. 
   * @return AboutSchema
   * @throws ApiException if fails to make API call
   */
  public AboutSchema getAbout() throws ApiException {
    return getAboutWithHttpInfo().getData();
      }

  /**
   * Get back the API version and Application name 
   * Get back the API version and application name.  The return value for this method will never change. This method largely exists for API parity with our on-premise or Managed Hosting products, which may return different release numbers from this endpoint.  For SCORM Cloud, this is effectively equal to the &#x60;/ping&#x60; resource. 
   * @return ApiResponse&lt;AboutSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AboutSchema> getAboutWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/about";

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

    GenericType<AboutSchema> localVarReturnType = new GenericType<AboutSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
