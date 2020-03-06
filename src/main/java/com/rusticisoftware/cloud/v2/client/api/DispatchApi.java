package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.CreateDispatchListSchema;
import com.rusticisoftware.cloud.v2.client.model.DestinationListSchema;
import com.rusticisoftware.cloud.v2.client.model.DestinationSchema;
import com.rusticisoftware.cloud.v2.client.model.DispatchListSchema;
import com.rusticisoftware.cloud.v2.client.model.DispatchRegistrationCountSchema;
import com.rusticisoftware.cloud.v2.client.model.DispatchSchema;
import com.rusticisoftware.cloud.v2.client.model.EnabledSchema;
import java.io.File;
import com.rusticisoftware.cloud.v2.client.model.IntegerResultSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import java.time.OffsetDateTime;
import com.rusticisoftware.cloud.v2.client.model.TagListSchema;
import com.rusticisoftware.cloud.v2.client.model.UpdateDispatchSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T09:44:40.358-06:00")
public class DispatchApi {
  private ApiClient apiClient;

  public DispatchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DispatchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * DestinationsByTenant
   * Create multiple destinations.
   * @param destinationsList  (required)
   * @throws ApiException if fails to make API call
   */
  public void createDestinations(DestinationListSchema destinationsList) throws ApiException {
    Object localVarPostBody = destinationsList;
    
    // verify the required parameter 'destinationsList' is set
    if (destinationsList == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationsList' when calling createDestinations");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations".replaceAll("\\{format\\}","json");

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
   * Create dispatches.
   * Create multiple dispatches at once. 
   * @param dispatchList  (required)
   * @throws ApiException if fails to make API call
   */
  public void createDispatches(CreateDispatchListSchema dispatchList) throws ApiException {
    Object localVarPostBody = dispatchList;
    
    // verify the required parameter 'dispatchList' is set
    if (dispatchList == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchList' when calling createDispatches");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches".replaceAll("\\{format\\}","json");

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
   * Delete destination 
   * Delete the destination with &#x60;destinationId&#x60; 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestination(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling deleteDestination");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Delete dispatches in destination 
   * Delete the dispatches in a destination 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestinationDispatches(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling deleteDestinationDispatches");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Delete the tags for this destination 
   * Delete the tags for this destination 
   * @param destinationId Identifier for the destination (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestinationTags(String destinationId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling deleteDestinationTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling deleteDestinationTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Delete the dispatch with &#x60;dispatchId&#x60;. 
   * Delete the dispatch with &#x60;dispatchId&#x60;. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDispatch(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling deleteDispatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * DispatchesByTenantAndDispatchId
   * Delete the postback info dispatch with &#39;dispatchId&#39;. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDispatchPostbackInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling deleteDispatchPostbackInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/postback".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * Delete the tags for this dispatch. 
   * Delete the tags for this dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDispatchTags(String dispatchId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling deleteDispatchTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling deleteDispatchTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * DestinationsDispatchesRegistrationInstancing
   * Enable or disable registration instancing.
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void enableRegistrationInstancing(String destinationId, EnabledSchema enabled) throws ApiException {
    Object localVarPostBody = enabled;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling enableRegistrationInstancing");
    }
    
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new ApiException(400, "Missing the required parameter 'enabled' when calling enableRegistrationInstancing");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/registrationInstancing".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Get destination information by destinationId.
   * Gets detailed information about a destination belonging to a destinationId.
   * @param destinationId Identifier for the destination (required)
   * @return DestinationSchema
   * @throws ApiException if fails to make API call
   */
  public DestinationSchema getDestination(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestination");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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

    GenericType<DestinationSchema> localVarReturnType = new GenericType<DestinationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * DestinationsDispatchesRegistrationCount
   * Get an aggregate count of all related dispatch registrations.
   * @param destinationId Identifier for the destination (required)
   * @return IntegerResultSchema
   * @throws ApiException if fails to make API call
   */
  public IntegerResultSchema getDestinationDispatchRegistrationCount(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/registrationCount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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

    GenericType<IntegerResultSchema> localVarReturnType = new GenericType<IntegerResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a ZIP of related dispatches.
   * Returns a zip file containing all of the dispatch packages for a destination.
   * @param destinationId Identifier for the destination (required)
   * @param type The type of dispatch package to export (SCORM12 only supported in cloud today) (optional, default to SCORM12)
   * @param cssUrl  (optional)
   * @param tags  (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getDestinationDispatchZip(String destinationId, String type, String cssUrl, List<String> tags) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationDispatchZip");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/zip".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cssUrl", cssUrl));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));

    
    
    final String[] localVarAccepts = {
      "application/zip"
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
   * Get a list of dispatches in this destination
   * Get a list of related dispatches.
   * @param destinationId Identifier for the destination (required)
   * @param courseId Only retreive resources having &#x60;courseId&#x60;  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param tags  (optional)
   * @param datetimeFilter A string describing what the since/until parameters will be applied to. Options are: &#39;created&#39; or &#39;updated&#39;.  If not provided, it will default to &#x60;updated&#x60;. (optional, default to updated)
   * @param orderBy  (optional)
   * @return DispatchListSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchListSchema getDestinationDispatches(String destinationId, String courseId, String more, OffsetDateTime since, OffsetDateTime until, List<String> tags, String datetimeFilter, String orderBy) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationDispatches");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<DispatchListSchema> localVarReturnType = new GenericType<DispatchListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * True if the destination is set to hash user info, or false if it is disabled.
   * True if the destination is set to hash user info, or false if it is disabled.
   * @param destinationId Identifier for the destination (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getDestinationHashUserInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationHashUserInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/hashUserInfo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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

    GenericType<EnabledSchema> localVarReturnType = new GenericType<EnabledSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the tags for this destination 
   * Get the tags for this destination 
   * @param destinationId Identifier for the destination (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getDestinationTags(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * getAllDestinations
   * Get a list of destinations.
   * @param courseId Only retreive resources having &#x60;courseId&#x60;  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param tags  (optional)
   * @param datetimeFilter A string describing what the since/until parameters will be applied to. Options are: &#39;created&#39; or &#39;updated&#39;.  If not provided, it will default to &#x60;updated&#x60;. (optional, default to updated)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  Defaults to updated_asc (optional, default to updated_asc)
   * @return DestinationListSchema
   * @throws ApiException if fails to make API call
   */
  public DestinationListSchema getDestinations(String courseId, String more, OffsetDateTime since, OffsetDateTime until, List<String> tags, String datetimeFilter, String orderBy) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<DestinationListSchema> localVarReturnType = new GenericType<DestinationListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get dispatch by id.
   * Get the dispatch with &#x60;dispatchId&#x60;. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return DispatchSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchSchema getDispatch(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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

    GenericType<DispatchSchema> localVarReturnType = new GenericType<DispatchSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the &#x60;enabled&#x60; status for &#x60;dispatchId&#x60;. 
   * Get the &#x60;enabled&#x60; status for &#x60;dispatchId&#x60;.  True if the dispatch is enabled, or false if it is disabled. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getDispatchEnabled(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/enabled".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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

    GenericType<EnabledSchema> localVarReturnType = new GenericType<EnabledSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get if this dispatch has PII hashing enabled.
   * Get if this dispatch has PII hashing enabled. True if the dispatch is set to hash user info, or false if it is disabled. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getDispatchHashUserInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchHashUserInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/hashUserInfo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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

    GenericType<EnabledSchema> localVarReturnType = new GenericType<EnabledSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the registration count for &#x60;dispatchId&#x60;. 
   * Get the registration count for this dispatch, and the date and time of the last count reset, if any. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return DispatchRegistrationCountSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchRegistrationCountSchema getDispatchRegistrationCount(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/registrationCount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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

    GenericType<DispatchRegistrationCountSchema> localVarReturnType = new GenericType<DispatchRegistrationCountSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the tags for this dispatch. 
   * Get the tags for this dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getDispatchTags(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * Get the ZIP for the dispatchId.
   * Get the ZIP for the dispatch with &#x60;dispatchId&#x60; 
   * @param dispatchId Identifier for the dispatch (required)
   * @param type The type of dispatch package to export (SCORM12 only supported in cloud today) (optional, default to SCORM12)
   * @param cssUrl  (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getDispatchZip(String dispatchId, String type, String cssUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchZip");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/zip".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cssUrl", cssUrl));

    
    
    final String[] localVarAccepts = {
      "application/zip"
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
   * All Dispatches in the system for an AppId
   * Get a list of dispatches.
   * @param courseId Only retreive resources having &#x60;courseId&#x60;  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param tags  (optional)
   * @param datetimeFilter A string describing what the since/until parameters will be applied to. Options are: &#39;created&#39; or &#39;updated&#39;.  If not provided, it will default to &#x60;updated&#x60;. (optional, default to updated)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  Defaults to updated_asc (optional, default to updated_asc)
   * @return DispatchListSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchListSchema getDispatches(String courseId, String more, OffsetDateTime since, OffsetDateTime until, List<String> tags, String datetimeFilter, String orderBy) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<DispatchListSchema> localVarReturnType = new GenericType<DispatchListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set the tags for this destination 
   * Set the tags for this destination 
   * @param destinationId Identifier for the destination (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putDestinationTags(String destinationId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling putDestinationTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling putDestinationTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Sets all of the provided tags on all of the provided destinations
   * Sets all of the provided tags on all of the provided destinations
   * @param batch Object representing an array of ids to apply an array of tags to. (required)
   * @throws ApiException if fails to make API call
   */
  public void putDestinationTagsBatch(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putDestinationTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/tags".replaceAll("\\{format\\}","json");

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
   * Set the tags for this dispatch. 
   * Set the tags for this dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putDispatchTags(String dispatchId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling putDispatchTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling putDispatchTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * Sets all of the provided tags on all of the provided dispatches 
   * Sets all of the provided tags on all of the provided dispatches 
   * @param batch Object representing an array of ids to apply an array of tags to. (required)
   * @throws ApiException if fails to make API call
   */
  public void putDispatchTagsBatch(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putDispatchTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/tags".replaceAll("\\{format\\}","json");

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
   * DestinationsDispatchesRegistrationCount
   * Reset registration counts for all related dispatches.
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public void resetDestinationDispatchRegistrationCount(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling resetDestinationDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/registrationCount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Reset registration count. 
   * Reset the registration count for this dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public void resetDispatchRegistrationCount(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling resetDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/registrationCount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * Creates or updates the destination identified by the &#x60;destinationId&#x60; provided in the path. If the destination is being created, a name should be provided in the DestinationSchema, else an error will be thrown.  You may also optionally supply the e-mail address of the user to be associated with this destination.  This e-mail address should correspond to a SCORM Cloud user account. If you do not supply an e-mail address upon the creation of a destination, the owner of the Realm will be used.  This can, of course, also be changed via calling this method to update an existing destination. 
   * @param destinationId Identifier for the destination (required)
   * @param destination  (required)
   * @throws ApiException if fails to make API call
   */
  public void setDestination(String destinationId, DestinationSchema destination) throws ApiException {
    Object localVarPostBody = destination;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling setDestination");
    }
    
    // verify the required parameter 'destination' is set
    if (destination == null) {
      throw new ApiException(400, "Missing the required parameter 'destination' when calling setDestination");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * DestinationsDispatchesEnabledByTenant
   * Enable or disable all related dispatches.
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void setDestinationDispatchEnabled(String destinationId, EnabledSchema enabled) throws ApiException {
    Object localVarPostBody = enabled;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling setDestinationDispatchEnabled");
    }
    
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new ApiException(400, "Missing the required parameter 'enabled' when calling setDestinationDispatchEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/enabled".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Set the &#x60;enabled&#x60; status for &#x60;dispatchId&#x60;. 
   * Set the &#x60;enabled&#x60; status for &#x60;dispatchId&#x60;. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void setDispatchEnabled(String dispatchId, EnabledSchema enabled) throws ApiException {
    Object localVarPostBody = enabled;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling setDispatchEnabled");
    }
    
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new ApiException(400, "Missing the required parameter 'enabled' when calling setDispatchEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/enabled".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * Enable or disable hashing of the user info for the destination.
   * Enable or disable hashing of the user info for the destination.
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateDestinationHashUserInfo(String destinationId, EnabledSchema enabled) throws ApiException {
    Object localVarPostBody = enabled;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling updateDestinationHashUserInfo");
    }
    
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new ApiException(400, "Missing the required parameter 'enabled' when calling updateDestinationHashUserInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/hashUserInfo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

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
   * Update the dispatch with &#x60;dispatchId&#x60;. 
   * Update the dispatch with &#x60;dispatchId&#x60;. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param dispatchProperties  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateDispatch(String dispatchId, UpdateDispatchSchema dispatchProperties) throws ApiException {
    Object localVarPostBody = dispatchProperties;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling updateDispatch");
    }
    
    // verify the required parameter 'dispatchProperties' is set
    if (dispatchProperties == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchProperties' when calling updateDispatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
   * Enable or disable hashing of the user info for the dispatch.
   * Enable or disable hashing of the user info for the dispatch.
   * @param dispatchId Identifier for the dispatch (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateDispatchHashUserInfo(String dispatchId, EnabledSchema enabled) throws ApiException {
    Object localVarPostBody = enabled;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling updateDispatchHashUserInfo");
    }
    
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new ApiException(400, "Missing the required parameter 'enabled' when calling updateDispatchHashUserInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/hashUserInfo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dispatchId" + "\\}", apiClient.escapeString(dispatchId.toString()));

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
}
