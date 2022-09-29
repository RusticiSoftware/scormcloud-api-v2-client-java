package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
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
   * Delete the Zoomi keys for an Application 
   * Deletes the Zoomi keys for an application. 
   * @throws ApiException if fails to make API call
   */
  public void deleteApplicationZoomiKeys() throws ApiException {

    deleteApplicationZoomiKeysWithHttpInfo();
  }

  /**
   * Delete the Zoomi keys for an Application 
   * Deletes the Zoomi keys for an application. 
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteApplicationZoomiKeysWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/zoomi/key";

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
   * Delete the Course from Zoomi 
   * Deletes the course from Zoomi, but the course will remain in SCORM Cloud. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteZoomiCourse(String courseId, Integer versionId) throws ApiException {

    deleteZoomiCourseWithHttpInfo(courseId, versionId);
  }

  /**
   * Delete the Course from Zoomi 
   * Deletes the course from Zoomi, but the course will remain in SCORM Cloud. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteZoomiCourseWithHttpInfo(String courseId, Integer versionId) throws ApiException {
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
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}"
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get the Zoomi company ID of an Application 
   * Returns the Zoomi company ID of an application. 
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema getApplicationZoomiCompanyId() throws ApiException {
    return getApplicationZoomiCompanyIdWithHttpInfo().getData();
      }

  /**
   * Get the Zoomi company ID of an Application 
   * Returns the Zoomi company ID of an application. 
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> getApplicationZoomiCompanyIdWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/zoomi";

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
   * Get the Zoomi public key for an Application 
   * Returns the Zoomi public key for an application. 
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema getApplicationZoomiPublicKey() throws ApiException {
    return getApplicationZoomiPublicKeyWithHttpInfo().getData();
      }

  /**
   * Get the Zoomi public key for an Application 
   * Returns the Zoomi public key for an application. 
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> getApplicationZoomiPublicKeyWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/zoomi/key";

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
   * Get the Zoomi enabled value of a Course Version 
   * Returns the Zoomi enabled value of a course version. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return EnabledSchema
   * @throws ApiException if fails to make API call
   */
  public EnabledSchema getCourseZoomiEnabled(String courseId, Integer versionId) throws ApiException {
    return getCourseZoomiEnabledWithHttpInfo(courseId, versionId).getData();
      }

  /**
   * Get the Zoomi enabled value of a Course Version 
   * Returns the Zoomi enabled value of a course version. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return ApiResponse&lt;EnabledSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnabledSchema> getCourseZoomiEnabledWithHttpInfo(String courseId, Integer versionId) throws ApiException {
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
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}/enabled"
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
   * Get the status for a Course from Zoomi 
   * Returns the status for a course and starts the upload process to Zoomi if not started. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema getZoomiCourseStatus(String courseId, Integer versionId) throws ApiException {
    return getZoomiCourseStatusWithHttpInfo(courseId, versionId).getData();
      }

  /**
   * Get the status for a Course from Zoomi 
   * Returns the status for a course and starts the upload process to Zoomi if not started. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> getZoomiCourseStatusWithHttpInfo(String courseId, Integer versionId) throws ApiException {
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
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}"
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
   * Begin the import process with Zoomi 
   * Begins the import process with Zoomi.  Must be followed up by a status call. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param zoomiCourseOptions  (required)
   * @throws ApiException if fails to make API call
   */
  public void importCourseVersionToZoomi(String courseId, Integer versionId, ZoomiCourseOptionsSchema zoomiCourseOptions) throws ApiException {

    importCourseVersionToZoomiWithHttpInfo(courseId, versionId, zoomiCourseOptions);
  }

  /**
   * Begin the import process with Zoomi 
   * Begins the import process with Zoomi.  Must be followed up by a status call. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param zoomiCourseOptions  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> importCourseVersionToZoomiWithHttpInfo(String courseId, Integer versionId, ZoomiCourseOptionsSchema zoomiCourseOptions) throws ApiException {
    Object localVarPostBody = zoomiCourseOptions;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling importCourseVersionToZoomi");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling importCourseVersionToZoomi");
    }
    
    // verify the required parameter 'zoomiCourseOptions' is set
    if (zoomiCourseOptions == null) {
      throw new ApiException(400, "Missing the required parameter 'zoomiCourseOptions' when calling importCourseVersionToZoomi");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}/import"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set the Zoomi company ID of an Application 
   * Sets the Zoomi company ID value of an application. 
   * @param zoomiCompanyId  (required)
   * @throws ApiException if fails to make API call
   */
  public void setApplicationZoomiCompanyId(ZoomiCompanyId zoomiCompanyId) throws ApiException {

    setApplicationZoomiCompanyIdWithHttpInfo(zoomiCompanyId);
  }

  /**
   * Set the Zoomi company ID of an Application 
   * Sets the Zoomi company ID value of an application. 
   * @param zoomiCompanyId  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setApplicationZoomiCompanyIdWithHttpInfo(ZoomiCompanyId zoomiCompanyId) throws ApiException {
    Object localVarPostBody = zoomiCompanyId;
    
    // verify the required parameter 'zoomiCompanyId' is set
    if (zoomiCompanyId == null) {
      throw new ApiException(400, "Missing the required parameter 'zoomiCompanyId' when calling setApplicationZoomiCompanyId");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi";

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
   * Set the Zoomi enabled value of a Course Version 
   * Sets the Zoomi enabled value of a course version. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public void setCourseZoomiEnabled(String courseId, Integer versionId, EnabledSchema enabled) throws ApiException {

    setCourseZoomiEnabledWithHttpInfo(courseId, versionId, enabled);
  }

  /**
   * Set the Zoomi enabled value of a Course Version 
   * Sets the Zoomi enabled value of a course version. 
   * @param courseId  (required)
   * @param versionId  (required)
   * @param enabled  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setCourseZoomiEnabledWithHttpInfo(String courseId, Integer versionId, EnabledSchema enabled) throws ApiException {
    Object localVarPostBody = enabled;
    
    // verify the required parameter 'courseId' is set
    if (courseId == null) {
      throw new ApiException(400, "Missing the required parameter 'courseId' when calling setCourseZoomiEnabled");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling setCourseZoomiEnabled");
    }
    
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new ApiException(400, "Missing the required parameter 'enabled' when calling setCourseZoomiEnabled");
    }
    
    // create path and map variables
    String localVarPath = "/zoomi/course/{courseId}/version/{versionId}/enabled"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
