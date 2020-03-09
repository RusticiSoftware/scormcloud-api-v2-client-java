package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.EnabledSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import com.rusticisoftware.cloud.v2.client.model.StringResultSchema;
import com.rusticisoftware.cloud.v2.client.model.ZoomiCompanyId;
import com.rusticisoftware.cloud.v2.client.model.ZoomiCourseOptionsSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T09:44:40.358-06:00")
public class ZoomiApi {
  private ApiClient apiClient;

  public ZoomiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ZoomiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete the keys for an application.
   * Delete the keys for an application.
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationZoomiKeys() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/zoomi/key".replaceAll("\\{format\\}","json");

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
   * Deletes the course in zoomi
   * Deletes the course in zoomi
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteZoomiCourse(String courseId, Integer versionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling deleteZoomiCourse");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling deleteZoomiCourse");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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
   * Gets the zoomi company id of an application.
   * Gets the zoomi company id of an application.
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema getApplicationZoomiCompanyId() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/zoomi".replaceAll("\\{format\\}","json");

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

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets the public key for an application.
   * Gets the public key for an application.
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema getApplicationZoomiPublicKey() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/zoomi/key".replaceAll("\\{format\\}","json");

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

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets the zoomi enabled value of a course
   * Gets the zoomi enabled value of a course
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getCourseZoomiEnabled(String courseId, Integer versionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getCourseZoomiEnabled");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getCourseZoomiEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}/enabled".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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
   * Gets the status for a course and imports to Zoomi
   * Gets the status for a course and imports to Zoomi
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema getZoomiCourseStatus(String courseId, Integer versionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling getZoomiCourseStatus");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getZoomiCourseStatus");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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

    GenericType<StringResultSchema> localVarReturnType = new GenericType<StringResultSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set the zoomi company id value of an application.
   * Set the zoomi company id value of an application.
   * @param zoomiCompanyId  (required)
   * @throws ApiException if fails to make API call
   */
  public void setApplicationZoomiCompanyId(ZoomiCompanyId zoomiCompanyId) throws ApiException {
    Object localVarPostBody = zoomiCompanyId;
    
    // verify the required parameter 'zoomiCompanyId' is set
    if (zoomiCompanyId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoomiCompanyId' when calling setApplicationZoomiCompanyId");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi".replaceAll("\\{format\\}","json");

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
   * Set the zoomi enabled value of a course.
   * Set the zoomi enabled value of a course.
   * @param courseId  (required)
   * @param versionId The course version (required)
   * @param zoomiCourseOptions  (optional)
   * @throws ApiException if fails to make API call
   */
  public void setCourseZoomiEnabled(String courseId, Integer versionId, ZoomiCourseOptionsSchema zoomiCourseOptions) throws ApiException {
    Object localVarPostBody = zoomiCourseOptions;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling setCourseZoomiEnabled");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling setCourseZoomiEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}/enabled".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "courseId" + "\\}", apiClient.escapeString(courseId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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
