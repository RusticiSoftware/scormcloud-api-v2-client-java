package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
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
import com.rusticisoftware.cloud.v2.client.model.PrivateInvitationUpdateSchema;
import com.rusticisoftware.cloud.v2.client.model.PublicInvitationList;
import com.rusticisoftware.cloud.v2.client.model.PublicInvitationSchema;
import com.rusticisoftware.cloud.v2.client.model.PublicInvitationUpdateSchema;
import com.rusticisoftware.cloud.v2.client.model.TagListSchema;
import com.rusticisoftware.cloud.v2.client.model.UserInvitationList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
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
   * Create a Private Invitation to a Course 
   * Creates a private invitation job which sends emails with a link to the course.  Invitations are meant as a way to provide access to your content.  Registrations will be created from the provided email addresses.  The email job will asynchronously send emails to those addresses inviting them to the course.  When the learners visit the link in the email, the course will be launched with the already created registration.  The private invitation ID can be used with GetPrivateInvitationJobStatus to view the status of the email job.  &gt;**Info:** &gt;While invitations are a way to provide access to your content, the majority of use cases would be better suited by creating a registration and building a launch link with the registration endpoints instead.  Invitations build upon registrations by grouping a set of registrations together and adding access control measures to said group. Invitations could be used to pass yearly compliance training to an entire company.  Invitations also have an associated expiration date which determines when the course will no longer be launchable. 
   * @param privateInvitationRequest  (required)
   * @return InvitationSummarySchema
   * @throws ApiException if fails to make API call
   */
  public InvitationSummarySchema createPrivateInvitation(CreatePrivateInvitationSchema privateInvitationRequest) throws ApiException {
    return createPrivateInvitationWithHttpInfo(privateInvitationRequest).getData();
      }

  /**
   * Create a Private Invitation to a Course 
   * Creates a private invitation job which sends emails with a link to the course.  Invitations are meant as a way to provide access to your content.  Registrations will be created from the provided email addresses.  The email job will asynchronously send emails to those addresses inviting them to the course.  When the learners visit the link in the email, the course will be launched with the already created registration.  The private invitation ID can be used with GetPrivateInvitationJobStatus to view the status of the email job.  &gt;**Info:** &gt;While invitations are a way to provide access to your content, the majority of use cases would be better suited by creating a registration and building a launch link with the registration endpoints instead.  Invitations build upon registrations by grouping a set of registrations together and adding access control measures to said group. Invitations could be used to pass yearly compliance training to an entire company.  Invitations also have an associated expiration date which determines when the course will no longer be launchable. 
   * @param privateInvitationRequest  (required)
   * @return ApiResponse&lt;InvitationSummarySchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InvitationSummarySchema> createPrivateInvitationWithHttpInfo(CreatePrivateInvitationSchema privateInvitationRequest) throws ApiException {
    Object localVarPostBody = privateInvitationRequest;
    
    // verify the required parameter 'privateInvitationRequest' is set
    if (privateInvitationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'privateInvitationRequest' when calling createPrivateInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private";

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
   * Create a Public Invitation to a Course 
   * Creates an invitation link to the course which can then be publicly distributed.  Invitations are meant as a way to provide access to your content.  When a learner visits the link, they will be prompted for name and email, a registration will be created from the information provided, and they will be redirected to the course.  Since anyone visiting the link will create a registration, it is highly advised that you set the &#x60;registrationCap&#x60; parameter when calling this method.  &gt;**Info:** &gt;While invitations are a way to provide access to your content, the majority of use cases would be better suited by creating a registration and building a launch link with the registration endpoints instead.  Invitations build upon registrations by grouping a set of registrations together and adding access control measures to said group. Invitations could be used to pass yearly compliance training to an entire company.  Invitations also have an associated expiration date which determines when the course will no longer be launchable. 
   * @param publicInvitationRequest A description of the public invitation to be created. (required)
   * @return PublicInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationSchema createPublicInvitation(CreatePublicInvitationSchema publicInvitationRequest) throws ApiException {
    return createPublicInvitationWithHttpInfo(publicInvitationRequest).getData();
      }

  /**
   * Create a Public Invitation to a Course 
   * Creates an invitation link to the course which can then be publicly distributed.  Invitations are meant as a way to provide access to your content.  When a learner visits the link, they will be prompted for name and email, a registration will be created from the information provided, and they will be redirected to the course.  Since anyone visiting the link will create a registration, it is highly advised that you set the &#x60;registrationCap&#x60; parameter when calling this method.  &gt;**Info:** &gt;While invitations are a way to provide access to your content, the majority of use cases would be better suited by creating a registration and building a launch link with the registration endpoints instead.  Invitations build upon registrations by grouping a set of registrations together and adding access control measures to said group. Invitations could be used to pass yearly compliance training to an entire company.  Invitations also have an associated expiration date which determines when the course will no longer be launchable. 
   * @param publicInvitationRequest A description of the public invitation to be created. (required)
   * @return ApiResponse&lt;PublicInvitationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicInvitationSchema> createPublicInvitationWithHttpInfo(CreatePublicInvitationSchema publicInvitationRequest) throws ApiException {
    Object localVarPostBody = publicInvitationRequest;
    
    // verify the required parameter 'publicInvitationRequest' is set
    if (publicInvitationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'publicInvitationRequest' when calling createPublicInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/public";

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
   * Delete tags from an Invitation 
   * Deletes the specified tags from the invitation.  Deleting tags that do not exist will still result in a success. 
   * @param invitationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteInvitationTags(String invitationId, TagListSchema tags) throws ApiException {

    deleteInvitationTagsWithHttpInfo(invitationId, tags);
  }

  /**
   * Delete tags from an Invitation 
   * Deletes the specified tags from the invitation.  Deleting tags that do not exist will still result in a success. 
   * @param invitationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteInvitationTagsWithHttpInfo(String invitationId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/invitations/{invitationId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a list of Invitations 
   * Returns a list of invitations (both public and private).  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to invitation_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return InvitationSummaryList
   * @throws ApiException if fails to make API call
   */
  public InvitationSummaryList getAllInvitations(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    return getAllInvitationsWithHttpInfo(courseId, since, until, datetimeFilter, tags, filter, filterBy, orderBy, more).getData();
      }

  /**
   * Get a list of Invitations 
   * Returns a list of invitations (both public and private).  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to invitation_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;InvitationSummaryList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InvitationSummaryList> getAllInvitationsWithHttpInfo(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invitations";

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

    GenericType<InvitationSummaryList> localVarReturnType = new GenericType<InvitationSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get tags for an Invitation 
   * Returns the tags for the invitation. 
   * @param invitationId  (required)
   * @return TagListSchema
   * @throws ApiException if fails to make API call
   */
  public TagListSchema getInvitationTags(String invitationId) throws ApiException {
    return getInvitationTagsWithHttpInfo(invitationId).getData();
      }

  /**
   * Get tags for an Invitation 
   * Returns the tags for the invitation. 
   * @param invitationId  (required)
   * @return ApiResponse&lt;TagListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagListSchema> getInvitationTagsWithHttpInfo(String invitationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getInvitationTags");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/{invitationId}/tags"
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
   * Get detailed information about a Private Invitation 
   * Returns detailed information about the private invitation.  This includes the email sent, course ID, and whether new the invitation can still be launched or not. 
   * @param invitationId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return PrivateInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PrivateInvitationSchema getPrivateInvitation(String invitationId, Boolean includeRegistrationCount) throws ApiException {
    return getPrivateInvitationWithHttpInfo(invitationId, includeRegistrationCount).getData();
      }

  /**
   * Get detailed information about a Private Invitation 
   * Returns detailed information about the private invitation.  This includes the email sent, course ID, and whether new the invitation can still be launched or not. 
   * @param invitationId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return ApiResponse&lt;PrivateInvitationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrivateInvitationSchema> getPrivateInvitationWithHttpInfo(String invitationId, Boolean includeRegistrationCount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPrivateInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private/{invitationId}"
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
   * Get email job status for a Private Invitation 
   * Check the status of a private invitation email job.  This can be called incrementally to check the progress of the emails. 
   * @param invitationId  (required)
   * @return InvitationJobStatusSchema
   * @throws ApiException if fails to make API call
   */
  public InvitationJobStatusSchema getPrivateInvitationJobStatus(String invitationId) throws ApiException {
    return getPrivateInvitationJobStatusWithHttpInfo(invitationId).getData();
      }

  /**
   * Get email job status for a Private Invitation 
   * Check the status of a private invitation email job.  This can be called incrementally to check the progress of the emails. 
   * @param invitationId  (required)
   * @return ApiResponse&lt;InvitationJobStatusSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InvitationJobStatusSchema> getPrivateInvitationJobStatusWithHttpInfo(String invitationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPrivateInvitationJobStatus");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private/{invitationId}/jobStatus"
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
   * Get a list of Private Invitations 
   * Returns a list of private invitations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to invitation_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return PrivateInvitationList
   * @throws ApiException if fails to make API call
   */
  public PrivateInvitationList getPrivateInvitations(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    return getPrivateInvitationsWithHttpInfo(courseId, since, until, datetimeFilter, tags, filter, filterBy, orderBy, more).getData();
      }

  /**
   * Get a list of Private Invitations 
   * Returns a list of private invitations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to invitation_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;PrivateInvitationList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrivateInvitationList> getPrivateInvitationsWithHttpInfo(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invitations/private";

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

    GenericType<PrivateInvitationList> localVarReturnType = new GenericType<PrivateInvitationList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of Private User Invitations 
   * Get a list of user who were invited to view the course.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param invitationId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to registration_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeRegistrationReport Optional flag to include basic registration information (optional)
   * @return UserInvitationList
   * @throws ApiException if fails to make API call
   */
  public UserInvitationList getPrivateUserInvitations(String invitationId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more, Boolean includeRegistrationReport) throws ApiException {
    return getPrivateUserInvitationsWithHttpInfo(invitationId, since, until, datetimeFilter, filter, filterBy, orderBy, more, includeRegistrationReport).getData();
      }

  /**
   * Get a list of Private User Invitations 
   * Get a list of user who were invited to view the course.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param invitationId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to registration_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeRegistrationReport Optional flag to include basic registration information (optional)
   * @return ApiResponse&lt;UserInvitationList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserInvitationList> getPrivateUserInvitationsWithHttpInfo(String invitationId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more, Boolean includeRegistrationReport) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPrivateUserInvitations");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/private/{invitationId}/userInvitations"
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationReport", includeRegistrationReport));

    
    
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
   * Get detailed information about a Public Invitation 
   * Returns detailed information about the public invitation.  This includes url, registration cap, and whether new learners can accept the invitation or not. 
   * @param invitationId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return PublicInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationSchema getPublicInvitation(String invitationId, Boolean includeRegistrationCount) throws ApiException {
    return getPublicInvitationWithHttpInfo(invitationId, includeRegistrationCount).getData();
      }

  /**
   * Get detailed information about a Public Invitation 
   * Returns detailed information about the public invitation.  This includes url, registration cap, and whether new learners can accept the invitation or not. 
   * @param invitationId  (required)
   * @param includeRegistrationCount Include the registration count in the results (optional, default to false)
   * @return ApiResponse&lt;PublicInvitationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicInvitationSchema> getPublicInvitationWithHttpInfo(String invitationId, Boolean includeRegistrationCount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPublicInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/public/{invitationId}"
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
   * Get a list of Public Invitations 
   * Returns a list of public invitations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to invitation_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return PublicInvitationList
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationList getPublicInvitations(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    return getPublicInvitationsWithHttpInfo(courseId, since, until, datetimeFilter, tags, filter, filterBy, orderBy, more).getData();
      }

  /**
   * Get a list of Public Invitations 
   * Returns a list of public invitations.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param courseId Only retrieve resources having &#x60;courseId&#x60; (optional)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param tags Filter items matching any tag provided (not all) (optional)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to invitation_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @return ApiResponse&lt;PublicInvitationList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicInvitationList> getPublicInvitationsWithHttpInfo(String courseId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, List<String> tags, String filter, String filterBy, String orderBy, String more) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/invitations/public";

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

    GenericType<PublicInvitationList> localVarReturnType = new GenericType<PublicInvitationList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of Public User Invitations 
   * Returns a list of users who have visited the public invitation link.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param invitationId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to registration_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeRegistrationReport Optional flag to include basic registration information (optional)
   * @return UserInvitationList
   * @throws ApiException if fails to make API call
   */
  public UserInvitationList getPublicUserInvitations(String invitationId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more, Boolean includeRegistrationReport) throws ApiException {
    return getPublicUserInvitationsWithHttpInfo(invitationId, since, until, datetimeFilter, filter, filterBy, orderBy, more, includeRegistrationReport).getData();
      }

  /**
   * Get a list of Public User Invitations 
   * Returns a list of users who have visited the public invitation link.  Can be filtered using the request parameters to provide a subset of results.  &gt;**Note:** &gt;This request is paginated and will only provide a limited amount of resources at a time.  If there are more results to be collected, a &#x60;more&#x60; token provided with the response which can be passed to get the next page of results.  When passing this token, no other filter parameters can be sent as part of the request.  The resources will continue to respect the filters passed in by the original request. 
   * @param invitationId  (required)
   * @param since Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param until Filter by ISO 8601 TimeStamp inclusive (defaults to UTC) (optional)
   * @param datetimeFilter Specifies field that &#x60;since&#x60; and &#x60;until&#x60; parameters are applied against (optional, default to updated)
   * @param filter Optional string which filters results by a specified field (described by filterBy). (optional)
   * @param filterBy Optional enum parameter for specifying the field on which to run the filter.  (optional, default to registration_id)
   * @param orderBy Optional enum parameter for specifying the field and order by which to sort the results.  (optional, default to updated_asc)
   * @param more Pagination token returned as &#x60;more&#x60; property of multi page list requests (optional)
   * @param includeRegistrationReport Optional flag to include basic registration information (optional)
   * @return ApiResponse&lt;UserInvitationList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserInvitationList> getPublicUserInvitationsWithHttpInfo(String invitationId, OffsetDateTime since, OffsetDateTime until, String datetimeFilter, String filter, String filterBy, String orderBy, String more, Boolean includeRegistrationReport) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invitationId' is set
    if (invitationId == null) {
      throw new ApiException(400, "Missing the required parameter 'invitationId' when calling getPublicUserInvitations");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/public/{invitationId}/userInvitations"
      .replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetimeFilter", datetimeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterBy", filterBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "more", more));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRegistrationReport", includeRegistrationReport));

    
    
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
   * Add tags to an Invitation 
   * Applies the provided tags to the invitation.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetInvitations). 
   * @param invitationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public void putInvitationTags(String invitationId, TagListSchema tags) throws ApiException {

    putInvitationTagsWithHttpInfo(invitationId, tags);
  }

  /**
   * Add tags to an Invitation 
   * Applies the provided tags to the invitation.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetInvitations). 
   * @param invitationId  (required)
   * @param tags  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putInvitationTagsWithHttpInfo(String invitationId, TagListSchema tags) throws ApiException {
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
    String localVarPath = "/invitations/{invitationId}/tags"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add a group of tags to a group of Invitations 
   * Applies all of the provided tags on all of the provided invitations.  Both public and private invitations may be tagged via this operation.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetInvitations). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public void putInvitationTagsBatch(BatchTagsSchema batch) throws ApiException {

    putInvitationTagsBatchWithHttpInfo(batch);
  }

  /**
   * Add a group of tags to a group of Invitations 
   * Applies all of the provided tags on all of the provided invitations.  Both public and private invitations may be tagged via this operation.  Tags are used to easily identify resources.  Adding tags can enable more refined searches when making calls to certain endpoints (e.g. GetInvitations). 
   * @param batch Array of ids, and array of tags for bulk tag operations (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putInvitationTagsBatchWithHttpInfo(BatchTagsSchema batch) throws ApiException {
    Object localVarPostBody = batch;
    
    // verify the required parameter 'batch' is set
    if (batch == null) {
      throw new ApiException(400, "Missing the required parameter 'batch' when calling putInvitationTagsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/invitations/tags";

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
   * Update information about a Private Invitation 
   * Updates information about the private invitation, such as the expiration date and registration cap.  Only non-null values that are provided will be updated. 
   * @param invitationId  (required)
   * @param invitationUpdateSchema Object with values to be updated.  Any value not specified above will be ignored.  (required)
   * @return PrivateInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PrivateInvitationSchema updatePrivateInvitation(String invitationId, PrivateInvitationUpdateSchema invitationUpdateSchema) throws ApiException {
    return updatePrivateInvitationWithHttpInfo(invitationId, invitationUpdateSchema).getData();
      }

  /**
   * Update information about a Private Invitation 
   * Updates information about the private invitation, such as the expiration date and registration cap.  Only non-null values that are provided will be updated. 
   * @param invitationId  (required)
   * @param invitationUpdateSchema Object with values to be updated.  Any value not specified above will be ignored.  (required)
   * @return ApiResponse&lt;PrivateInvitationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrivateInvitationSchema> updatePrivateInvitationWithHttpInfo(String invitationId, PrivateInvitationUpdateSchema invitationUpdateSchema) throws ApiException {
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
    String localVarPath = "/invitations/private/{invitationId}"
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
   * Update information about a Public Invitation 
   * Updates information about the public invitation, such as the expiration date and registration cap.  Only non-null values that are provided will be updated. 
   * @param invitationId  (required)
   * @param invitationUpdateSchema Object with values to be updated.  Any value not specified above will be ignored.  (required)
   * @return PublicInvitationSchema
   * @throws ApiException if fails to make API call
   */
  public PublicInvitationSchema updatePublicInvitation(String invitationId, PublicInvitationUpdateSchema invitationUpdateSchema) throws ApiException {
    return updatePublicInvitationWithHttpInfo(invitationId, invitationUpdateSchema).getData();
      }

  /**
   * Update information about a Public Invitation 
   * Updates information about the public invitation, such as the expiration date and registration cap.  Only non-null values that are provided will be updated. 
   * @param invitationId  (required)
   * @param invitationUpdateSchema Object with values to be updated.  Any value not specified above will be ignored.  (required)
   * @return ApiResponse&lt;PublicInvitationSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicInvitationSchema> updatePublicInvitationWithHttpInfo(String invitationId, PublicInvitationUpdateSchema invitationUpdateSchema) throws ApiException {
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
    String localVarPath = "/invitations/public/{invitationId}"
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
