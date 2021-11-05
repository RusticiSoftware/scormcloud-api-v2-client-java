package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.CreateDispatchListSchema;
import com.rusticisoftware.cloud.v2.client.model.DestinationListSchema;
import com.rusticisoftware.cloud.v2.client.model.DestinationSchema;
import com.rusticisoftware.cloud.v2.client.model.DispatchListSchema;
import com.rusticisoftware.cloud.v2.client.model.DispatchLtiInfoSchema;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
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
   * Create a group of Destinations 
   * Creates a group of destinations.  A destination is a label used to identify an entity outside of SCORM Cloud, such as an LMS.  Used in conjunction with dispatches to provide access control mechanisms for the courses distributed to the destination. 
   * @param destinationsList  (required)
   * @throws ApiException if fails to make API call
   */
  public void createDestinations(DestinationListSchema destinationsList) throws ApiException {

    createDestinationsWithHttpInfo(destinationsList);
  }

  /**
   * Create a group of Destinations 
   * Creates a group of destinations.  A destination is a label used to identify an entity outside of SCORM Cloud, such as an LMS.  Used in conjunction with dispatches to provide access control mechanisms for the courses distributed to the destination. 
   * @param destinationsList  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createDestinationsWithHttpInfo(DestinationListSchema destinationsList) throws ApiException {
    Object localVarPostBody = destinationsList;
    
    // verify the required parameter 'destinationsList' is set
    if (destinationsList == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationsList' when calling createDestinations");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations";

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
   * Create a group of Dispatches 
   * Creates a group of dispatches.  Dispatches are the connection between a course and a destination.  A dispatch zip package is a distributable course stub which, upon launch in a third-party LMS, will reference and launch the underlying course in SCORM Cloud.  As an extension, dispatches allow for limiting access control even after the zip file has been given to the destination.  &gt;**Caution:** &gt;Only one dispatch can exist for a given course-destination combination.  If calling this method with the same course and destination supplied, the old one will be loaded for modification.  An exception to this is if a dispatchId is passed in the body, the request will fail with a 400 response warning that the dispatch already exists.  This is to prevent confusion over which dispatchId is to be used in future requests. 
   * @param dispatchList  (required)
   * @throws ApiException if fails to make API call
   */
  public void createDispatches(CreateDispatchListSchema dispatchList) throws ApiException {

    createDispatchesWithHttpInfo(dispatchList);
  }

  /**
   * Create a group of Dispatches 
   * Creates a group of dispatches.  Dispatches are the connection between a course and a destination.  A dispatch zip package is a distributable course stub which, upon launch in a third-party LMS, will reference and launch the underlying course in SCORM Cloud.  As an extension, dispatches allow for limiting access control even after the zip file has been given to the destination.  &gt;**Caution:** &gt;Only one dispatch can exist for a given course-destination combination.  If calling this method with the same course and destination supplied, the old one will be loaded for modification.  An exception to this is if a dispatchId is passed in the body, the request will fail with a 400 response warning that the dispatch already exists.  This is to prevent confusion over which dispatchId is to be used in future requests. 
   * @param dispatchList  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createDispatchesWithHttpInfo(CreateDispatchListSchema dispatchList) throws ApiException {
    Object localVarPostBody = dispatchList;
    
    // verify the required parameter 'dispatchList' is set
    if (dispatchList == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchList' when calling createDispatches");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches";

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
   * Delete a Destination 
   * Deletes the specified destination.  &gt;**Caution:** &gt;This will also delete all dispatches belonging to the destination. 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestination(String destinationId) throws ApiException {

    deleteDestinationWithHttpInfo(destinationId);
  }

  /**
   * Delete a Destination 
   * Deletes the specified destination.  &gt;**Caution:** &gt;This will also delete all dispatches belonging to the destination. 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDestinationWithHttpInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling deleteDestination");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a Destination&#39;s Dispatches 
   * Deletes all the dispatches from the destination.  &gt;**Caution:** &gt;This will invalidate any existing dispatch packages, rendering them unlaunchable. 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestinationDispatches(String destinationId) throws ApiException {

    deleteDestinationDispatchesWithHttpInfo(destinationId);
  }

  /**
   * Delete a Destination&#39;s Dispatches 
   * Deletes all the dispatches from the destination.  &gt;**Caution:** &gt;This will invalidate any existing dispatch packages, rendering them unlaunchable. 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDestinationDispatchesWithHttpInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling deleteDestinationDispatches");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete tags from a Destination 
   * Deletes the specified tags from the destination.  Deleting tags that do not exist will still result in a success. 
   * @param destinationId Identifier for the destination (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestinationTags(String destinationId, TagListSchema tags) throws ApiException {

    deleteDestinationTagsWithHttpInfo(destinationId, tags);
  }

  /**
   * Delete tags from a Destination 
   * Deletes the specified tags from the destination.  Deleting tags that do not exist will still result in a success. 
   * @param destinationId Identifier for the destination (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDestinationTagsWithHttpInfo(String destinationId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/dispatch/destinations/{destinationId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a Dispatch 
   * Deletes the specified dispatch.  &gt;**Caution:** &gt;This will invalidate any existing dispatch packages, rendering them unlaunchable. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDispatch(String dispatchId) throws ApiException {

    deleteDispatchWithHttpInfo(dispatchId);
  }

  /**
   * Delete a Dispatch 
   * Deletes the specified dispatch.  &gt;**Caution:** &gt;This will invalidate any existing dispatch packages, rendering them unlaunchable. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDispatchWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling deleteDispatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete postback information from a Dispatch 
   * Clears the postback settings from the dispatch.  This causes the postback settings to inherit a value from a higher level (e.g. application).  If there is no setting at the application level, this will disable postbacks for the dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDispatchPostbackInfo(String dispatchId) throws ApiException {

    deleteDispatchPostbackInfoWithHttpInfo(dispatchId);
  }

  /**
   * Delete postback information from a Dispatch 
   * Clears the postback settings from the dispatch.  This causes the postback settings to inherit a value from a higher level (e.g. application).  If there is no setting at the application level, this will disable postbacks for the dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDispatchPostbackInfoWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling deleteDispatchPostbackInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/postback"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete tags from a Dispatch 
   * Deletes the specified tags from the dispatch.  Deleting tags that do not exist will still result in a success. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDispatchTags(String dispatchId, TagListSchema tags) throws ApiException {

    deleteDispatchTagsWithHttpInfo(dispatchId, tags);
  }

  /**
   * Delete tags from a Dispatch 
   * Deletes the specified tags from the dispatch.  Deleting tags that do not exist will still result in a success. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDispatchTagsWithHttpInfo(String dispatchId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/dispatch/dispatches/{dispatchId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a group of Dispatches 
   * Deletes the specified group of dispatches.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Caution:** &gt;This will invalidate any existing dispatch packages, rendering them unlaunchable.  &gt;**Note:** &gt;One of the filter parameters (i.e. &#x60;courseId&#x60;, &#x60;since&#x60;/&#x60;until&#x60;, &#x60;tags&#x60;, or &#x60;filter&#x60;) needs to be provided.  This is to prevent accidental deletion of all dispatches.  If you do wish to update all dispatches, try setting the since parameter to a value prior to the creation of any dispatches.  &gt;**Info:** &gt;If using one of our client libraries, refer to its README for additional information on how to work with the &#x60;X-Total-Count&#x60; header. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @throws ApiException if fails to make API call
   */
  public void deleteDispatches(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy) throws ApiException {

    deleteDispatchesWithHttpInfo(courseId, since, until, datetimeFilter, tags, filter, filterBy);
  }

  /**
   * Delete a group of Dispatches 
   * Deletes the specified group of dispatches.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Caution:** &gt;This will invalidate any existing dispatch packages, rendering them unlaunchable.  &gt;**Note:** &gt;One of the filter parameters (i.e. &#x60;courseId&#x60;, &#x60;since&#x60;/&#x60;until&#x60;, &#x60;tags&#x60;, or &#x60;filter&#x60;) needs to be provided.  This is to prevent accidental deletion of all dispatches.  If you do wish to update all dispatches, try setting the since parameter to a value prior to the creation of any dispatches.  &gt;**Info:** &gt;If using one of our client libraries, refer to its README for additional information on how to work with the &#x60;X-Total-Count&#x60; header. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDispatchesWithHttpInfo(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    
    
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
   * Update registration instancing status for a Destination&#39;s Dispatches 
   * Updates the restration instancing status for all dispatches distributed to the destination.  Registration instancing is the default for dispatches, in order to support versioning of dispatches.  A small portion of users may experience duplicate registrations with content dispatched to some LMS platforms.  If you happen to be dispatching content to an LMS with this issue, disabling registration instancing here will resolve the problems. However, dispatch versioning will also be disabled. 
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void enableRegistrationInstancing(String destinationId, EnabledSchema enabled) throws ApiException {

    enableRegistrationInstancingWithHttpInfo(destinationId, enabled);
  }

  /**
   * Update registration instancing status for a Destination&#39;s Dispatches 
   * Updates the restration instancing status for all dispatches distributed to the destination.  Registration instancing is the default for dispatches, in order to support versioning of dispatches.  A small portion of users may experience duplicate registrations with content dispatched to some LMS platforms.  If you happen to be dispatching content to an LMS with this issue, disabling registration instancing here will resolve the problems. However, dispatch versioning will also be disabled. 
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> enableRegistrationInstancingWithHttpInfo(String destinationId, EnabledSchema enabled) throws ApiException {
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
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/registrationInstancing"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get detailed information about a Destination 
   * Returns detailed information about the destination.  This includes name, tags, and launchAuth information. 
   * @param destinationId Identifier for the destination (required)
   * @return DestinationSchema
   * @throws ApiException if fails to make API call
   */
  public DestinationSchema getDestination(String destinationId) throws ApiException {
    return getDestinationWithHttpInfo(destinationId).getData();
      }

  /**
   * Get detailed information about a Destination 
   * Returns detailed information about the destination.  This includes name, tags, and launchAuth information. 
   * @param destinationId Identifier for the destination (required)
   * @return ApiResponse&lt;DestinationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationSchema> getDestinationWithHttpInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestination");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}"
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
   * Get registration count for a Destination&#39;s Dispatches 
   * Returns the registration count for all dispatches distributed to the destination.  &gt;**Note:** &gt;The count here is a convenience counter.  Since it has the capability of being reset, it may not match the actual billed registration count for a dispatch. 
   * @param destinationId Identifier for the destination (required)
   * @return IntegerResultSchema
   * @throws ApiException if fails to make API call
   */
  public IntegerResultSchema getDestinationDispatchRegistrationCount(String destinationId) throws ApiException {
    return getDestinationDispatchRegistrationCountWithHttpInfo(destinationId).getData();
      }

  /**
   * Get registration count for a Destination&#39;s Dispatches 
   * Returns the registration count for all dispatches distributed to the destination.  &gt;**Note:** &gt;The count here is a convenience counter.  Since it has the capability of being reset, it may not match the actual billed registration count for a dispatch. 
   * @param destinationId Identifier for the destination (required)
   * @return ApiResponse&lt;IntegerResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IntegerResultSchema> getDestinationDispatchRegistrationCountWithHttpInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/registrationCount"
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
   * Download a zip file for a Destination&#39;s Dispatches 
   * Downloads a zip file containing all of the dispatch packages for the destination.  A dispatch zip package is a distributable course stub which, upon launch in a third-party LMS, will reference and launch the underlying course in SCORM Cloud. 
   * @param destinationId Identifier for the destination (required)
   * @param type The type of dispatch package to export (SCORM_12 only supported in SCORM Cloud today) (optional, default to SCORM_12)
   * @param cssUrl  (optional)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getDestinationDispatchZip(String destinationId, String type, String cssUrl, List<String> tags) throws ApiException {
    return getDestinationDispatchZipWithHttpInfo(destinationId, type, cssUrl, tags).getData();
      }

  /**
   * Download a zip file for a Destination&#39;s Dispatches 
   * Downloads a zip file containing all of the dispatch packages for the destination.  A dispatch zip package is a distributable course stub which, upon launch in a third-party LMS, will reference and launch the underlying course in SCORM Cloud. 
   * @param destinationId Identifier for the destination (required)
   * @param type The type of dispatch package to export (SCORM_12 only supported in SCORM Cloud today) (optional, default to SCORM_12)
   * @param cssUrl  (optional)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> getDestinationDispatchZipWithHttpInfo(String destinationId, String type, String cssUrl, List<String> tags) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationDispatchZip");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/zip"
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
   * Get a list of a Destination&#39;s Dispatches 
   * Returns a list of dispatches belonging to the destination.  Can be filtered using the request parameters to provide a subset of results.  Using the &#x60;courseId&#x60; filter should only ever yield 0 or 1 results, as a dispatch is the intersection of a course and a destination.  This can be useful for identifying if a certain course is dispatched to the destination.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param destinationId Identifier for the destination (required)
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return DispatchListSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchListSchema getDestinationDispatches(String destinationId, String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    return getDestinationDispatchesWithHttpInfo(destinationId, courseId, since, until, datetimeFilter, tags, filter, filterBy, orderBy, more).getData();
      }

  /**
   * Get a list of a Destination&#39;s Dispatches 
   * Returns a list of dispatches belonging to the destination.  Can be filtered using the request parameters to provide a subset of results.  Using the &#x60;courseId&#x60; filter should only ever yield 0 or 1 results, as a dispatch is the intersection of a course and a destination.  This can be useful for identifying if a certain course is dispatched to the destination.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param destinationId Identifier for the destination (required)
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;DispatchListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DispatchListSchema> getDestinationDispatchesWithHttpInfo(String destinationId, String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationDispatches");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches"
      .replaceAll("\\{" + "destinationId" + "\\}", apiClient.escapeString(destinationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
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

    GenericType<DispatchListSchema> localVarReturnType = new GenericType<DispatchListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user PII hashing status for a Destination 
   * Returns whether or not user PII hashing is enabled for the destination.  Enabling it will cause all user PII to be hashed.  Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param destinationId Identifier for the destination (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getDestinationHashUserInfo(String destinationId) throws ApiException {
    return getDestinationHashUserInfoWithHttpInfo(destinationId).getData();
      }

  /**
   * Get user PII hashing status for a Destination 
   * Returns whether or not user PII hashing is enabled for the destination.  Enabling it will cause all user PII to be hashed.  Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param destinationId Identifier for the destination (required)
   * @return ApiResponse&lt;EnabledSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnabledSchema> getDestinationHashUserInfoWithHttpInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationHashUserInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/hashUserInfo"
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
   * Get tags for a Destination 
   * Returns the tags for the destination. 
   * @param destinationId Identifier for the destination (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getDestinationTags(String destinationId) throws ApiException {
    return getDestinationTagsWithHttpInfo(destinationId).getData();
      }

  /**
   * Get tags for a Destination 
   * Returns the tags for the destination. 
   * @param destinationId Identifier for the destination (required)
   * @return ApiResponse&lt;TagListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagListSchema> getDestinationTagsWithHttpInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling getDestinationTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/tags"
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
   * Get a list of Destinations 
   * Returns a list of destinations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to destination_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return DestinationListSchema
   * @throws ApiException if fails to make API call
   */
  public DestinationListSchema getDestinations(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    return getDestinationsWithHttpInfo(courseId, since, until, datetimeFilter, tags, filter, filterBy, orderBy, more).getData();
      }

  /**
   * Get a list of Destinations 
   * Returns a list of destinations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to destination_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;DestinationListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationListSchema> getDestinationsWithHttpInfo(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
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

    GenericType<DestinationListSchema> localVarReturnType = new GenericType<DestinationListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get detailed information about a Dispatch 
   * Returns detailed information about the dispatch.  This includes destination and course IDs, as well as registration count. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return DispatchSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchSchema getDispatch(String dispatchId) throws ApiException {
    return getDispatchWithHttpInfo(dispatchId).getData();
      }

  /**
   * Get detailed information about a Dispatch 
   * Returns detailed information about the dispatch.  This includes destination and course IDs, as well as registration count. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return ApiResponse&lt;DispatchSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DispatchSchema> getDispatchWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}"
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
   * Get enabled status of a Dispatch 
   * Returns the enabled status for the dispatch.  This is an access control measure allowing you to turn access to a previously distributed dispatch packages on or off. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getDispatchEnabled(String dispatchId) throws ApiException {
    return getDispatchEnabledWithHttpInfo(dispatchId).getData();
      }

  /**
   * Get enabled status of a Dispatch 
   * Returns the enabled status for the dispatch.  This is an access control measure allowing you to turn access to a previously distributed dispatch packages on or off. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return ApiResponse&lt;EnabledSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnabledSchema> getDispatchEnabledWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/enabled"
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
   * Get user PII hashing status for a Dispatch 
   * Returns whether or not user PII hashing is enabled for the dispatch.  Enabling it will cause all user PII to be hashed.  Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getDispatchHashUserInfo(String dispatchId) throws ApiException {
    return getDispatchHashUserInfoWithHttpInfo(dispatchId).getData();
      }

  /**
   * Get user PII hashing status for a Dispatch 
   * Returns whether or not user PII hashing is enabled for the dispatch.  Enabling it will cause all user PII to be hashed.  Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return ApiResponse&lt;EnabledSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnabledSchema> getDispatchHashUserInfoWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchHashUserInfo");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/hashUserInfo"
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
   * Get registration count for a Dispatch 
   * Returns the registration count for the dispatch, as well as the date and time of the last count reset, if any.  &gt;**Note:** &gt;The count here is a convenience counter.  Since it has the capability of being reset, it may not match the actual billed registration count for a dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return DispatchRegistrationCountSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchRegistrationCountSchema getDispatchRegistrationCount(String dispatchId) throws ApiException {
    return getDispatchRegistrationCountWithHttpInfo(dispatchId).getData();
      }

  /**
   * Get registration count for a Dispatch 
   * Returns the registration count for the dispatch, as well as the date and time of the last count reset, if any.  &gt;**Note:** &gt;The count here is a convenience counter.  Since it has the capability of being reset, it may not match the actual billed registration count for a dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return ApiResponse&lt;DispatchRegistrationCountSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DispatchRegistrationCountSchema> getDispatchRegistrationCountWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/registrationCount"
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
   * Get tags for a Dispatch 
   * Returns the tags for the dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getDispatchTags(String dispatchId) throws ApiException {
    return getDispatchTagsWithHttpInfo(dispatchId).getData();
      }

  /**
   * Get tags for a Dispatch 
   * Returns the tags for the dispatch. 
   * @param dispatchId Identifier for the dispatch (required)
   * @return ApiResponse&lt;TagListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagListSchema> getDispatchTagsWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchTags");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/tags"
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
   * Download a zip package for a Dispatch 
   * Downloads a zip package for the dispatch.  A dispatch zip package is a distributable course stub which, upon launch in a third-party LMS, will reference and launch the underlying course in SCORM Cloud. As an extension, dispatches allow for limiting access control even after the zip file has been given to the destination. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param type The type of dispatch package to export (currently only SCORM_12 available) (optional, default to SCORM_12)
   * @param cssUrl Custom CSS to apply to the dispatch package (optional)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getDispatchZip(String dispatchId, String type, String cssUrl) throws ApiException {
    return getDispatchZipWithHttpInfo(dispatchId, type, cssUrl).getData();
      }

  /**
   * Download a zip package for a Dispatch 
   * Downloads a zip package for the dispatch.  A dispatch zip package is a distributable course stub which, upon launch in a third-party LMS, will reference and launch the underlying course in SCORM Cloud. As an extension, dispatches allow for limiting access control even after the zip file has been given to the destination. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param type The type of dispatch package to export (currently only SCORM_12 available) (optional, default to SCORM_12)
   * @param cssUrl Custom CSS to apply to the dispatch package (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> getDispatchZipWithHttpInfo(String dispatchId, String type, String cssUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getDispatchZip");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/zip"
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
   * Get a list of Dispatches 
   * Returns a list of dispatches.  Can be filtered using the request parameters to provide a subset of results.  Using the &#x60;courseId&#x60; filter will allow for viewing which destinations the course has been dispatched to.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return DispatchListSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchListSchema getDispatches(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    return getDispatchesWithHttpInfo(courseId, since, until, datetimeFilter, tags, filter, filterBy, orderBy, more).getData();
      }

  /**
   * Get a list of Dispatches 
   * Returns a list of dispatches.  Can be filtered using the request parameters to provide a subset of results.  Using the &#x60;courseId&#x60; filter will allow for viewing which destinations the course has been dispatched to.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;DispatchListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DispatchListSchema> getDispatchesWithHttpInfo(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
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

    GenericType<DispatchListSchema> localVarReturnType = new GenericType<DispatchListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the information necessary to launch this dispatch using the IMS LTI 1.1 specification. 
   * 
   * @param dispatchId Identifier for the dispatch (required)
   * @return DispatchLtiInfoSchema
   * @throws ApiException if fails to make API call
   */
  public DispatchLtiInfoSchema getLTIDispatch(String dispatchId) throws ApiException {
    return getLTIDispatchWithHttpInfo(dispatchId).getData();
      }

  /**
   * Get the information necessary to launch this dispatch using the IMS LTI 1.1 specification. 
   * 
   * @param dispatchId Identifier for the dispatch (required)
   * @return ApiResponse&lt;DispatchLtiInfoSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DispatchLtiInfoSchema> getLTIDispatchWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling getLTIDispatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/lti"
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

    GenericType<DispatchLtiInfoSchema> localVarReturnType = new GenericType<DispatchLtiInfoSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add tags to a Destination 
   * Applies the provided tags to the destination.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDestinations). 
   * @param destinationId Identifier for the destination (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putDestinationTags(String destinationId, TagListSchema tags) throws ApiException {

    putDestinationTagsWithHttpInfo(destinationId, tags);
  }

  /**
   * Add tags to a Destination 
   * Applies the provided tags to the destination.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDestinations). 
   * @param destinationId Identifier for the destination (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putDestinationTagsWithHttpInfo(String destinationId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/dispatch/destinations/{destinationId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add a group of tags to a group of Destinations 
   * Applies all of the provided tags on all of the provided destinations.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDestinations). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public void putDestinationTagsBatch(BatchTagsSchema batch) throws ApiException {

    putDestinationTagsBatchWithHttpInfo(batch);
  }

  /**
   * Add a group of tags to a group of Destinations 
   * Applies all of the provided tags on all of the provided destinations.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDestinations). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putDestinationTagsBatchWithHttpInfo(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putDestinationTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/tags";

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
   * Add tags to a Dispatch 
   * Applies the provided tags to the dispatch.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDispatches). 
   * @param dispatchId Identifier for the dispatch (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putDispatchTags(String dispatchId, TagListSchema tags) throws ApiException {

    putDispatchTagsWithHttpInfo(dispatchId, tags);
  }

  /**
   * Add tags to a Dispatch 
   * Applies the provided tags to the dispatch.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDispatches). 
   * @param dispatchId Identifier for the dispatch (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putDispatchTagsWithHttpInfo(String dispatchId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/dispatch/dispatches/{dispatchId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add a group of tags to a group of Dispatches 
   * Applies all of the provided tags on all of the provided dispatches.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDispatches). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public void putDispatchTagsBatch(BatchTagsSchema batch) throws ApiException {

    putDispatchTagsBatchWithHttpInfo(batch);
  }

  /**
   * Add a group of tags to a group of Dispatches 
   * Applies all of the provided tags on all of the provided dispatches.  Tags are used to easily identify resources. Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetDispatches). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putDispatchTagsBatchWithHttpInfo(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putDispatchTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/tags";

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
   * Reset registration counts for a Destination&#39;s Dispatches 
   * Clears the registration count for all dispatches distributed to the destination.  This resets the registration counter on the dispatch itself, but has no effect on the existing registrations.  Can be used in situations where the license for the course material has been renewed. 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public void resetDestinationDispatchRegistrationCount(String destinationId) throws ApiException {

    resetDestinationDispatchRegistrationCountWithHttpInfo(destinationId);
  }

  /**
   * Reset registration counts for a Destination&#39;s Dispatches 
   * Clears the registration count for all dispatches distributed to the destination.  This resets the registration counter on the dispatch itself, but has no effect on the existing registrations.  Can be used in situations where the license for the course material has been renewed. 
   * @param destinationId Identifier for the destination (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> resetDestinationDispatchRegistrationCountWithHttpInfo(String destinationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'destinationId' is set
    if (destinationId == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationId' when calling resetDestinationDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/registrationCount"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Reset registration count for a Dispatch 
   * Clears the registration count for the dispatch.  This resets the registration counter on the dispatch itself, but has no effect on the existing registrations.  Can be used in situations where the license for the course material has been renewed. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public void resetDispatchRegistrationCount(String dispatchId) throws ApiException {

    resetDispatchRegistrationCountWithHttpInfo(dispatchId);
  }

  /**
   * Reset registration count for a Dispatch 
   * Clears the registration count for the dispatch.  This resets the registration counter on the dispatch itself, but has no effect on the existing registrations.  Can be used in situations where the license for the course material has been renewed. 
   * @param dispatchId Identifier for the dispatch (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> resetDispatchRegistrationCountWithHttpInfo(String dispatchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dispatchId' is set
    if (dispatchId == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchId' when calling resetDispatchRegistrationCount");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches/{dispatchId}/registrationCount"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create or update a Destination 
   * Creates or updates information about the destination.  -If the destination is being created, a name should be provided in the DestinationSchema.  If one is not present in the request an error will be thrown. -If the destination is instead being updated, only non-null values that are provided will be updated.  You may also optionally supply the e-mail address of the user to be associated with this destination.  This e-mail address should correspond to a SCORM Cloud user account. 
   * @param destinationId Identifier for the destination (required)
   * @param destination  (required)
   * @throws ApiException if fails to make API call
   */
  public void setDestination(String destinationId, DestinationSchema destination) throws ApiException {

    setDestinationWithHttpInfo(destinationId, destination);
  }

  /**
   * Create or update a Destination 
   * Creates or updates information about the destination.  -If the destination is being created, a name should be provided in the DestinationSchema.  If one is not present in the request an error will be thrown. -If the destination is instead being updated, only non-null values that are provided will be updated.  You may also optionally supply the e-mail address of the user to be associated with this destination.  This e-mail address should correspond to a SCORM Cloud user account. 
   * @param destinationId Identifier for the destination (required)
   * @param destination  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setDestinationWithHttpInfo(String destinationId, DestinationSchema destination) throws ApiException {
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
    String localVarPath = "/dispatch/destinations/{destinationId}"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update enabled status for a Destination&#39;s Dispatches 
   * Updates the enabled status for all dispatches distributed to the destination.  This is an access control measure allowing you to turn access to a previously distributed dispatch packages on or off. 
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void setDestinationDispatchEnabled(String destinationId, EnabledSchema enabled) throws ApiException {

    setDestinationDispatchEnabledWithHttpInfo(destinationId, enabled);
  }

  /**
   * Update enabled status for a Destination&#39;s Dispatches 
   * Updates the enabled status for all dispatches distributed to the destination.  This is an access control measure allowing you to turn access to a previously distributed dispatch packages on or off. 
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setDestinationDispatchEnabledWithHttpInfo(String destinationId, EnabledSchema enabled) throws ApiException {
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
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/enabled"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update enabled status for a Dispatch 
   * Updates the enabled status for the dispatch.  This is an access control measure allowing you to turn access to a previously distributed dispatch packages on or off. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void setDispatchEnabled(String dispatchId, EnabledSchema enabled) throws ApiException {

    setDispatchEnabledWithHttpInfo(dispatchId, enabled);
  }

  /**
   * Update enabled status for a Dispatch 
   * Updates the enabled status for the dispatch.  This is an access control measure allowing you to turn access to a previously distributed dispatch packages on or off. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setDispatchEnabledWithHttpInfo(String dispatchId, EnabledSchema enabled) throws ApiException {
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
    String localVarPath = "/dispatch/dispatches/{dispatchId}/enabled"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update user PII hashing status for a Destination
   * Updates user PII hashing status for the destination.  Enabling it will cause all user PII to be hashed. Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateDestinationHashUserInfo(String destinationId, EnabledSchema enabled) throws ApiException {

    updateDestinationHashUserInfoWithHttpInfo(destinationId, enabled);
  }

  /**
   * Update user PII hashing status for a Destination
   * Updates user PII hashing status for the destination.  Enabling it will cause all user PII to be hashed. Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param destinationId Identifier for the destination (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateDestinationHashUserInfoWithHttpInfo(String destinationId, EnabledSchema enabled) throws ApiException {
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
    String localVarPath = "/dispatch/destinations/{destinationId}/dispatches/hashUserInfo"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update information about a Dispatch 
   * Updates information about the dispatch, such as the expiration date and registration cap.  Only non-null values that are provided will be updated. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param dispatchProperties  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateDispatch(String dispatchId, UpdateDispatchSchema dispatchProperties) throws ApiException {

    updateDispatchWithHttpInfo(dispatchId, dispatchProperties);
  }

  /**
   * Update information about a Dispatch 
   * Updates information about the dispatch, such as the expiration date and registration cap.  Only non-null values that are provided will be updated. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param dispatchProperties  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateDispatchWithHttpInfo(String dispatchId, UpdateDispatchSchema dispatchProperties) throws ApiException {
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
    String localVarPath = "/dispatch/dispatches/{dispatchId}"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update user PII hashing status for a Dispatch
   * Updates user PII hashing status for the dispatch.  Enabling it will cause all user PII to be hashed. Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateDispatchHashUserInfo(String dispatchId, EnabledSchema enabled) throws ApiException {

    updateDispatchHashUserInfoWithHttpInfo(dispatchId, enabled);
  }

  /**
   * Update user PII hashing status for a Dispatch
   * Updates user PII hashing status for the dispatch.  Enabling it will cause all user PII to be hashed. Hashing PII will anonymize the learner data from the dispatched course.  This will make looking up specific details about a learner difficult. 
   * @param dispatchId Identifier for the dispatch (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateDispatchHashUserInfoWithHttpInfo(String dispatchId, EnabledSchema enabled) throws ApiException {
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
    String localVarPath = "/dispatch/dispatches/{dispatchId}/hashUserInfo"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a group of Dispatches 
   * Updates information about a group of dispatches, such as registration cap, expiration date, and postback information. Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;One of the filter parameters (i.e. &#x60;courseId&#x60;, &#x60;since&#x60;/&#x60;until&#x60;, &#x60;tags&#x60;, or &#x60;filter&#x60;) needs to be provided.  This is to prevent accidental modification of all dispatches.  If you do wish to update all dispatches, try setting the since parameter to a value prior to the creation of any dispatches.  &gt;**Info:** &gt;If using one of our client libraries, refer to its README for additional information on how to work with the &#x60;X-Total-Count&#x60; header. 
   * @param dispatchProperties  (required)
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @throws ApiException if fails to make API call
   */
  public void updateDispatches(UpdateDispatchSchema dispatchProperties, String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy) throws ApiException {

    updateDispatchesWithHttpInfo(dispatchProperties, courseId, since, until, datetimeFilter, tags, filter, filterBy);
  }

  /**
   * Update a group of Dispatches 
   * Updates information about a group of dispatches, such as registration cap, expiration date, and postback information. Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;One of the filter parameters (i.e. &#x60;courseId&#x60;, &#x60;since&#x60;/&#x60;until&#x60;, &#x60;tags&#x60;, or &#x60;filter&#x60;) needs to be provided.  This is to prevent accidental modification of all dispatches.  If you do wish to update all dispatches, try setting the since parameter to a value prior to the creation of any dispatches.  &gt;**Info:** &gt;If using one of our client libraries, refer to its README for additional information on how to work with the &#x60;X-Total-Count&#x60; header. 
   * @param dispatchProperties  (required)
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to dispatch_id)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateDispatchesWithHttpInfo(UpdateDispatchSchema dispatchProperties, String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy) throws ApiException {
    Object localVarPostBody = dispatchProperties;
    
    // verify the required parameter 'dispatchProperties' is set
    if (dispatchProperties == null) {
      throw new ApiException(400, "Missing the required parameter 'dispatchProperties' when calling updateDispatches");
    }
    
    // create path and map variables
    String localVarPath = "/dispatch/dispatches";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));

    
    
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
}
