package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.BatchTagsSchema;
import com.rusticisoftware.cloud.v2.client.model.CreatePrivateInvitationSchema;
import com.rusticisoftware.cloud.v2.client.model.CreatePublicInvitationSchema;
import com.rusticisoftware.cloud.v2.client.model.InvitationJobStatusSchema;
import com.rusticisoftware.cloud.v2.client.model.InvitationSummaryList;
import com.rusticisoftware.cloud.v2.client.model.InvitationSummarySchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import java.time.OffsetDateTime;
import com.rusticisoftware.cloud.v2.client.model.PrivateInvitationList;
import com.rusticisoftware.cloud.v2.client.model.PrivateInvitationSchema;
import com.rusticisoftware.cloud.v2.client.model.PublicInvitationList;
import com.rusticisoftware.cloud.v2.client.model.PublicInvitationSchema;
import com.rusticisoftware.cloud.v2.client.model.TagListSchema;
import com.rusticisoftware.cloud.v2.client.model.UserInvitationList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class InvitationsApi {
  private ApiClient apiClient;

  public InvitationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvitationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a private invitation to a course.
   * Create a private invitation to a course.  The provided information will be used to create new registrations for all of the provided e-mail addresses, and send asynchronously send e-mails to those addresses inviting them to the course.  To check the status of this process, a subsequent call to &#x60;/invitations/private/{invitationId}/status&#x60; must be made.
   * @param privateInvitationRequest  (required)
   * @return InvitationSummarySchema
   * @throws ApiException if fails to make API call
   */
  public InvitationSummarySchema createPrivateInvitation(CreatePrivateInvitationSchema privateInvitationRequest) throws ApiException {
    Object localVarPostBody = privateInvitationRequest;
    
    // verify the required parameter 'privateInvitationRequest' is set
    if (privateInvitationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'privateInvitationRequest' when calling createPrivateInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private".replaceAll("\\{format\\}","json");

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

    GenericType<InvitationSummarySchema> localVarReturnType = new GenericType<InvitationSummarySchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a publicly accessible invitation to a course.
   * Create a publicly accessible invitation to a course.
   * @param publicInvitationRequest A description of the public invitation to be created. (required)
   * @return PublicInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationSchema createPublicInvitation(CreatePublicInvitationSchema publicInvitationRequest) throws ApiException {
    Object localVarPostBody = publicInvitationRequest;
    
    // verify the required parameter 'publicInvitationRequest' is set
    if (publicInvitationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'publicInvitationRequest' when calling createPublicInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/public".replaceAll("\\{format\\}","json");

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

    GenericType<PublicInvitationSchema> localVarReturnType = new GenericType<PublicInvitationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete tags for this invitation
   * 
   * @param invitationId invitation id (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInvitationTags(String invitationId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling deleteInvitationTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling deleteInvitationTags");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/{invitationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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
   * Get a list of invitation summaries.
   * Get a summary of all the invitations for an appId, both public and private.
   * @param courseId Limit the results to invitations with courseIds that match the filter. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param datetimeFilter A string describing what the since/until parameters will be applied to. Options are: &#39;created&#39; or &#39;updated&#39;.  If not provided, it will default to &#x60;updated&#x60;. (optional, default to updated)
   * @param tags  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return InvitationSummaryList
   * @throws ApiException if fails to make API call
   */
  public InvitationSummaryList getAllInvitations(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invitations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
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

    GenericType<InvitationSummaryList> localVarReturnType = new GenericType<InvitationSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the tags for this invitation
   * 
   * @param invitationId invitation id (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getInvitationTags(String invitationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getInvitationTags");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/{invitationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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
   * Get a information about a private invitation.
   * Get a information about a private invitation.
   * @param invitationId invitation id (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return PrivateInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PrivateInvitationSchema getPrivateInvitation(String invitationId, Boolean includeRegistrationCount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPrivateInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private/{invitationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<PrivateInvitationSchema> localVarReturnType = new GenericType<PrivateInvitationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the status of an invitation job.
   * Get the status of a job to send out private invitations.
   * @param invitationId invitation id (required)
   * @return InvitationJobStatusSchema
   * @throws ApiException if fails to make API call
   */
  public InvitationJobStatusSchema getPrivateInvitationJobStatus(String invitationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPrivateInvitationJobStatus");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private/{invitationId}/jobStatus".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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

    GenericType<InvitationJobStatusSchema> localVarReturnType = new GenericType<InvitationJobStatusSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of all private invitations.
   * Retrieves a list of all private invitations, optionally filtered by the given parameters.
   * @param courseId Limit the results to invitations with courseIds that match the filter. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param datetimeFilter A string describing what the since/until parameters will be applied to. Options are: &#39;created&#39; or &#39;updated&#39;.  If not provided, it will default to &#x60;updated&#x60;. (optional, default to updated)
   * @param tags  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return PrivateInvitationList
   * @throws ApiException if fails to make API call
   */
  public PrivateInvitationList getPrivateInvitations(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invitations/private".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
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

    GenericType<PrivateInvitationList> localVarReturnType = new GenericType<PrivateInvitationList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of user invitations.
   * Get a list of objects which contain the specific information about each user to whom this invitation was sent.
   * @param invitationId invitation id (required)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param includeRegistrationReport  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return UserInvitationList
   * @throws ApiException if fails to make API call
   */
  public UserInvitationList getPrivateUserInvitations(String invitationId, OffsetDateTime since, OffsetDateTime until, Boolean includeRegistrationReport, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPrivateUserInvitations");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private/{invitationId}/userInvitations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationReport", includeRegistrationReport));
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

    GenericType<UserInvitationList> localVarReturnType = new GenericType<UserInvitationList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a information about a public invitation.
   * Get a information about a public invitation.
   * @param invitationId invitation id (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return PublicInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationSchema getPublicInvitation(String invitationId, Boolean includeRegistrationCount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPublicInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/public/{invitationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationCount", includeRegistrationCount));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<PublicInvitationSchema> localVarReturnType = new GenericType<PublicInvitationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of all public invitations.
   * Retrieves a list of all public invitations, optionally filtered by the given parameters.
   * @param courseId Limit the results to invitations with courseIds that match the filter. (optional)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param datetimeFilter A string describing what the since/until parameters will be applied to. Options are: &#39;created&#39; or &#39;updated&#39;.  If not provided, it will default to &#x60;updated&#x60;. (optional, default to updated)
   * @param tags  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return PublicInvitationList
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationList getPublicInvitations(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invitations/public".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "courseId", courseId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));
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

    GenericType<PublicInvitationList> localVarReturnType = new GenericType<PublicInvitationList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of user invitations.
   * Get a list of objects which contain the specific information about each user who visited the invitation link.
   * @param invitationId invitation id (required)
   * @param since Only items updated since the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param until Only items updated before the specified ISO 8601 TimeStamp (inclusive) are included. If a time zone is not specified, UTC time zone will be used. (optional)
   * @param includeRegistrationReport  (optional)
   * @param more Value for this parameter will be provided in the &#39;more&#39; property of registration lists, where needed. An opaque value, construction and parsing may change without notice. (optional)
   * @return UserInvitationList
   * @throws ApiException if fails to make API call
   */
  public UserInvitationList getPublicUserInvitations(String invitationId, OffsetDateTime since, OffsetDateTime until, Boolean includeRegistrationReport, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPublicUserInvitations");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/public/{invitationId}/userInvitations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationReport", includeRegistrationReport));
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

    GenericType<UserInvitationList> localVarReturnType = new GenericType<UserInvitationList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set the tags for this invitation
   * 
   * @param invitationId invitation id (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putInvitationTags(String invitationId, TagListSchema tags) throws ApiException {
    Object localVarPostBody = tags;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling putInvitationTags");
    }
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling putInvitationTags");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/{invitationId}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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
   * Sets all of the provided tags on all of the provided invitations
   * 
   * @param batch Object representing an array of ids to apply an array of tags to. (required)
   * @throws ApiException if fails to make API call
   */
  public void putInvitationTagsBatch(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putInvitationTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/tags".replaceAll("\\{format\\}","json");

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
   * Update attributes of this invitation.
   * Updates certain attributes of this invitation, and returns the invitation its new state.  The following attributes can be updated: - allowLaunch - invitationEmail - postBack - expirationDate NOTE: Any attributes not in the above list will not be considered for update.
   * @param invitationId invitation id (required)
   * @param invitationUpdateSchema A PrivateInvitationSchema with values to update.  This can be a sparse schema only containing the values to be updated.  Any value not allowed for update will be ignored. (required)
   * @return PrivateInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PrivateInvitationSchema updatePrivateInvitation(String invitationId, PrivateInvitationSchema invitationUpdateSchema) throws ApiException {
    Object localVarPostBody = invitationUpdateSchema;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling updatePrivateInvitation");
    }
    
    // verify the required parameter 'invitationUpdateSchema' is set
    if (invitationUpdateSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationUpdateSchema' when calling updatePrivateInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private/{invitationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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

    GenericType<PrivateInvitationSchema> localVarReturnType = new GenericType<PrivateInvitationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update attributes of this invitation.
   * Updates certain attributes of this invitation, and returns the invitation its new state.  The following attributes can be updated: - allowLaunch - allowNewRegistrations - postBack - expirationDate - registrationCap NOTE: Any attributes not in the above list will not be considered for update.
   * @param invitationId invitation id (required)
   * @param invitationUpdateSchema A PublicInvitationSchema with values to update.  This can be a sparse schema only containing the values to be updated.  Any value not allowed for update will be ignored. (required)
   * @return PublicInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationSchema updatePublicInvitation(String invitationId, PublicInvitationSchema invitationUpdateSchema) throws ApiException {
    Object localVarPostBody = invitationUpdateSchema;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling updatePublicInvitation");
    }
    
    // verify the required parameter 'invitationUpdateSchema' is set
    if (invitationUpdateSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationUpdateSchema' when calling updatePublicInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/public/{invitationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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

    GenericType<PublicInvitationSchema> localVarReturnType = new GenericType<PublicInvitationSchema>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
