package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import com.rusticisoftware.cloud.v2.client.model.ReportageAccountInfoSchema;
import com.rusticisoftware.cloud.v2.client.model.ReportageAuthTokenSchema;
import com.rusticisoftware.cloud.v2.client.model.ReportageLinkSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportingApi {
  private ApiClient apiClient;

  public ReportingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get account information 
   * Returns all of the account information for the specified application. 
   * @return ReportageAccountInfoSchema
   * @throws ApiException if fails to make API call
   */
  public ReportageAccountInfoSchema getAccountInfo() throws ApiException {
    return getAccountInfoWithHttpInfo().getData();
      }

  /**
   * Get account information 
   * Returns all of the account information for the specified application. 
   * @return ApiResponse&lt;ReportageAccountInfoSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportageAccountInfoSchema> getAccountInfoWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reporting/accountInfo";

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

    GenericType<ReportageAccountInfoSchema> localVarReturnType = new GenericType<ReportageAccountInfoSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a Reportage session authentication token 
   * Returns a session authentication token to use when launching Reportage. 
   * @param navPermission The navigation permissions for this Reportage session (required)
   * @param admin Grant admin privileges to this Reportage session (optional, default to false)
   * @return ReportageAuthTokenSchema
   * @throws ApiException if fails to make API call
   */
  public ReportageAuthTokenSchema getReportageAuthToken(String navPermission, Boolean admin) throws ApiException {
    return getReportageAuthTokenWithHttpInfo(navPermission, admin).getData();
      }

  /**
   * Get a Reportage session authentication token 
   * Returns a session authentication token to use when launching Reportage. 
   * @param navPermission The navigation permissions for this Reportage session (required)
   * @param admin Grant admin privileges to this Reportage session (optional, default to false)
   * @return ApiResponse&lt;ReportageAuthTokenSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportageAuthTokenSchema> getReportageAuthTokenWithHttpInfo(String navPermission, Boolean admin) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'navPermission' is set
    if (navPermission == null) {
      throw new ApiException(400, "Missing the required parameter 'navPermission' when calling getReportageAuthToken");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/reportageAuth";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "navPermission", navPermission));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "admin", admin));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<ReportageAuthTokenSchema> localVarReturnType = new GenericType<ReportageAuthTokenSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a link to a page in Reportage with the given permissions 
   * Returns the link to use for viewing Reportage.  In order to generate a link, GetReportageAuthToken will need to be called to generate an auth token with the necessary permissions. 
   * @param auth The Reportage authentication token retrieved from a previous call to &#x60;GET reportageAuth&#x60; (required)
   * @param reportUrl The Reportage URL to try and access.  Common values are the Reportage homepage &#x60;https://cloud.scorm.com/Reportage/reportage.php?appId&#x3D;{{your appId}}&#x60; or a URL pointing to a specific report within Reportage.  The latter type of URL includes lots of parameters of the report, such as the date range, demographic (via tags), specific course or learner, and so on.  (required)
   * @return ReportageLinkSchema
   * @throws ApiException if fails to make API call
   */
  public ReportageLinkSchema getReportageLink(String auth, String reportUrl) throws ApiException {
    return getReportageLinkWithHttpInfo(auth, reportUrl).getData();
      }

  /**
   * Get a link to a page in Reportage with the given permissions 
   * Returns the link to use for viewing Reportage.  In order to generate a link, GetReportageAuthToken will need to be called to generate an auth token with the necessary permissions. 
   * @param auth The Reportage authentication token retrieved from a previous call to &#x60;GET reportageAuth&#x60; (required)
   * @param reportUrl The Reportage URL to try and access.  Common values are the Reportage homepage &#x60;https://cloud.scorm.com/Reportage/reportage.php?appId&#x3D;{{your appId}}&#x60; or a URL pointing to a specific report within Reportage.  The latter type of URL includes lots of parameters of the report, such as the date range, demographic (via tags), specific course or learner, and so on.  (required)
   * @return ApiResponse&lt;ReportageLinkSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportageLinkSchema> getReportageLinkWithHttpInfo(String auth, String reportUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'auth' is set
    if (auth == null) {
      throw new ApiException(400, "Missing the required parameter 'auth' when calling getReportageLink");
    }
    
    // verify the required parameter 'reportUrl' is set
    if (reportUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'reportUrl' when calling getReportageLink");
    }
    
    // create path and map variables
    String localVarPath = "/reporting/reportageLink";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auth", auth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportUrl", reportUrl));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<ReportageLinkSchema> localVarReturnType = new GenericType<ReportageLinkSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
