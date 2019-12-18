package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import com.rusticisoftware.cloud.v2.client.model.TagListSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
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
   * Deletes all of the information associated with a learner in an application, by learner id. 
   * Deletes all of the information associated with a learner in an application, by learner id. This is meant for use with complying with GDPR requests from learners. 
   * @param learnerId The id of the learner for which to remove all data from an application (required)
   * @param userEmail The email of the user initiating this request on behalf of the learner being deleted. This must be a valid primary email address for a SCORM Cloud realm which this application is in. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAllLearnerData(String learnerId, String userEmail) throws ApiException {
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
    String localVarPath = "/learner/{learnerId}/delete-information".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete the tags for this learner 
   * Delete the tags for this learner 
   * @param learnerId The id of the learner for which to remove all data from an application (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteLearnerTags(String learnerId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/learner/{learnerId}/tags".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get the tags for this learner 
   * Get the tags for this learner 
   * @param learnerId The id of the learner for which to remove all data from an application (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getLearnerTags(String learnerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'learnerId' is set
    if (learnerId == null) {
      throw new ApiException(400, "Missing the required parameter 'learnerId' when calling getLearnerTags");
    }
    
    // create path and map variables
    String localVarPath = "/learner/{learnerId}/tags".replaceAll("\\{format\\}","json")
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
   * Set the tags for this learner 
   * Set the tags for this learner 
   * @param learnerId The id of the learner for which to remove all data from an application (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putLearnerTags(String learnerId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/learner/{learnerId}/tags".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Sets all of the provided tags on all of the provided learners
   * Sets all of the provided tags on all of the provided learners 
   * @param batch Object representing an array of ids to apply an array of tags to. (required)
   * @throws ApiException if fails to make API call
   */
  public void putLearnerTagsBatch(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putLearnerTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/learner/tags".replaceAll("\\{format\\}","json");

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
