package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.LearnerSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import com.rusticisoftware.cloud.v2.client.model.TagListSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
public class LearnerApi {
  private ApiClient apiClient;

  public LearnerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LearnerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Deletes all PII for a learnerId 
   * Deletes all of the PII information for the learner.  This is meant for use with complying with GDPR requests from learners.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the deletion of PII information takes place. 
   * @param learnerId The id of the learner (required)
   * @param userEmail The email of the user initiating this request on behalf of the learner being deleted. This must be a valid primary email address for a SCORM Cloud realm which this application is in.  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAllLearnerData(String learnerId, String userEmail) throws ApiException {

    deleteAllLearnerDataWithHttpInfo(learnerId, userEmail);
  }

  /**
   * Deletes all PII for a learnerId 
   * Deletes all of the PII information for the learner.  This is meant for use with complying with GDPR requests from learners.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the deletion of PII information takes place. 
   * @param learnerId The id of the learner (required)
   * @param userEmail The email of the user initiating this request on behalf of the learner being deleted. This must be a valid primary email address for a SCORM Cloud realm which this application is in.  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAllLearnerDataWithHttpInfo(String learnerId, String userEmail) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'learnerId' is set
    if (learnerId == null) {
      throw new ApiException(400, "Missing the required parameter 'learnerId' when calling deleteAllLearnerData");
    }
    
    // verify the required parameter 'userEmail' is set
    if (userEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'userEmail' when calling deleteAllLearnerData");
    }
    
    // create path and map variables
    String localVarPath = "/learner/{learnerId}/delete-information"
      .replaceAll("\\{" + "learnerId" + "\\}", apiClient.escapeString(learnerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userEmail", userEmail));

    
    
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
   * Delete tags from a learnerId 
   * Delete the specified tags from the learner.  Deleting tags that do not exist will still result in a success. 
   * @param learnerId The id of the learner (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLearnerTags(String learnerId, TagListSchema tags) throws ApiException {

    deleteLearnerTagsWithHttpInfo(learnerId, tags);
  }

  /**
   * Delete tags from a learnerId 
   * Delete the specified tags from the learner.  Deleting tags that do not exist will still result in a success. 
   * @param learnerId The id of the learner (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteLearnerTagsWithHttpInfo(String learnerId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'learnerId' is set
    if (learnerId == null) {
      throw new ApiException(400, "Missing the required parameter 'learnerId' when calling deleteLearnerTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling deleteLearnerTags");
    }
    
    // create path and map variables
    String localVarPath = "/learner/{learnerId}/tags"
      .replaceAll("\\{" + "learnerId" + "\\}", apiClient.escapeString(learnerId.toString()));

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
   * Get tags for a learnerId 
   * Returns the tags for the learner. 
   * @param learnerId The id of the learner (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getLearnerTags(String learnerId) throws ApiException {
    return getLearnerTagsWithHttpInfo(learnerId).getData();
      }

  /**
   * Get tags for a learnerId 
   * Returns the tags for the learner. 
   * @param learnerId The id of the learner (required)
   * @return ApiResponse&lt;TagListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagListSchema> getLearnerTagsWithHttpInfo(String learnerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'learnerId' is set
    if (learnerId == null) {
      throw new ApiException(400, "Missing the required parameter 'learnerId' when calling getLearnerTags");
    }
    
    // create path and map variables
    String localVarPath = "/learner/{learnerId}/tags"
      .replaceAll("\\{" + "learnerId" + "\\}", apiClient.escapeString(learnerId.toString()));

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
   * Add tags to a learnerId 
   * Applies the provided tags to the learner.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when working with Reportage. 
   * @param learnerId The id of the learner (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putLearnerTags(String learnerId, TagListSchema tags) throws ApiException {

    putLearnerTagsWithHttpInfo(learnerId, tags);
  }

  /**
   * Add tags to a learnerId 
   * Applies the provided tags to the learner.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when working with Reportage. 
   * @param learnerId The id of the learner (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putLearnerTagsWithHttpInfo(String learnerId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'learnerId' is set
    if (learnerId == null) {
      throw new ApiException(400, "Missing the required parameter 'learnerId' when calling putLearnerTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling putLearnerTags");
    }
    
    // create path and map variables
    String localVarPath = "/learner/{learnerId}/tags"
      .replaceAll("\\{" + "learnerId" + "\\}", apiClient.escapeString(learnerId.toString()));

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
   * Add a group of tags to a group of learnerIds 
   * Applies all of the provided tags on all of the provided learners.  Tags are used to easily identify resources. Adding tags can enable more refined searches when working with Reportage. 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public void putLearnerTagsBatch(BatchTagsSchema batch) throws ApiException {

    putLearnerTagsBatchWithHttpInfo(batch);
  }

  /**
   * Add a group of tags to a group of learnerIds 
   * Applies all of the provided tags on all of the provided learners.  Tags are used to easily identify resources. Adding tags can enable more refined searches when working with Reportage. 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putLearnerTagsBatchWithHttpInfo(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putLearnerTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/learner/tags";

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
   * Update all Registrations for a learnerId 
   * Updates information about a group of registrations, such as learner email and name.  A learner in SCORM Cloud is not an entity on its own.  In fact, learners only exist as information on individual registrations.  This method will update the information on each of the registrations that the provided &#x60;learnerId&#x60; is attached to.  &gt;**Caution:** &gt;Providing an empty string will cause the value in SCORM Cloud to be set to empty.  This may have unintended consequences with regards to functionality.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the changes on the registrations take place. 
   * @param learnerId The id of the learner (required)
   * @param learnerInfo  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateLearnerInfo(String learnerId, LearnerSchema learnerInfo) throws ApiException {

    updateLearnerInfoWithHttpInfo(learnerId, learnerInfo);
  }

  /**
   * Update all Registrations for a learnerId 
   * Updates information about a group of registrations, such as learner email and name.  A learner in SCORM Cloud is not an entity on its own.  In fact, learners only exist as information on individual registrations.  This method will update the information on each of the registrations that the provided &#x60;learnerId&#x60; is attached to.  &gt;**Caution:** &gt;Providing an empty string will cause the value in SCORM Cloud to be set to empty.  This may have unintended consequences with regards to functionality.  &gt;**Note:** &gt;This method is asynchronous.  A returned success status indicates a background process has been started, but there will still be a delay before the changes on the registrations take place. 
   * @param learnerId The id of the learner (required)
   * @param learnerInfo  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateLearnerInfoWithHttpInfo(String learnerId, LearnerSchema learnerInfo) throws ApiException {
    Object localVarPostBody = learnerInfo;
    
    // verify the required parameter 'learnerId' is set
    if (learnerId == null) {
      throw new ApiException(400, "Missing the required parameter 'learnerId' when calling updateLearnerInfo");
    }
    
    // verify the required parameter 'learnerInfo' is set
    if (learnerInfo == null) {
      throw new ApiException(400, "Missing the required parameter 'learnerInfo' when calling updateLearnerInfo");
    }
    
    // create path and map variables
    String localVarPath = "/learner/{learnerId}/updateInfo"
      .replaceAll("\\{" + "learnerId" + "\\}", apiClient.escapeString(learnerId.toString()));

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
}
