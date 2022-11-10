package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.ApplicationToken;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationApi {
  private ApiClient apiClient;

  public AuthenticationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Obtain an OAuth token for scoped access to an Application 
   * Creates, signs and returns an OAuth2 token based on the provided permissions, if the credentials used to request the token have the permissions being requested.  &gt;**Note:** &gt;The token is not stored and therefore can not be modified or deleted.  The requested permissions are encoded in the token which is then signed. 
   * @param scope Space separated string of OAuth scopes, e.g. \&quot;write:course read:registration\&quot;.  (required)
   * @param expiration Amount of seconds until the OAuth token expires.  (optional, default to 300)
   * @return ApplicationToken
   * @throws ApiException if fails to make API call
   */
  public ApplicationToken getAppToken(String scope, Integer expiration) throws ApiException {
    return getAppTokenWithHttpInfo(scope, expiration).getData();
      }

  /**
   * Obtain an OAuth token for scoped access to an Application 
   * Creates, signs and returns an OAuth2 token based on the provided permissions, if the credentials used to request the token have the permissions being requested.  &gt;**Note:** &gt;The token is not stored and therefore can not be modified or deleted.  The requested permissions are encoded in the token which is then signed. 
   * @param scope Space separated string of OAuth scopes, e.g. \&quot;write:course read:registration\&quot;.  (required)
   * @param expiration Amount of seconds until the OAuth token expires.  (optional, default to 300)
   * @return ApiResponse&lt;ApplicationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApplicationToken> getAppTokenWithHttpInfo(String scope, Integer expiration) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'scope' is set
    if (scope == null) {
      throw new ApiException(400, "Missing the required parameter 'scope' when calling getAppToken");
    }
    
    // create path and map variables
    String localVarPath = "/oauth/authenticate/application/token";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (scope != null)
      localVarFormParams.put("scope", scope);
if (expiration != null)
      localVarFormParams.put("expiration", expiration);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL" };

    GenericType<ApplicationToken> localVarReturnType = new GenericType<ApplicationToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
