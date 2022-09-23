package com.rusticisoftware.cloud.v2.client.api;

import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiResponse;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rusticisoftware.cloud.v2.client.model.ConnectorListSchema;
import com.rusticisoftware.cloud.v2.client.model.CreateConnectorSchema;
import com.rusticisoftware.cloud.v2.client.model.MessageSchema;
import com.rusticisoftware.cloud.v2.client.model.StringResultSchema;
import com.rusticisoftware.cloud.v2.client.model.UpdateConnectorSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
public class ContentConnectorsApi {
  private ApiClient apiClient;

  public ContentConnectorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContentConnectorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * A call to this method will create a new content connector and return a newly created Id for it. 
   * @param connector  (required)
   * @return StringResultSchema
   * @throws ApiException if fails to make API call
   */
  public StringResultSchema createConnector(CreateConnectorSchema connector) throws ApiException {
    return createConnectorWithHttpInfo(connector).getData();
      }

  /**
   * 
   * A call to this method will create a new content connector and return a newly created Id for it. 
   * @param connector  (required)
   * @return ApiResponse&lt;StringResultSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringResultSchema> createConnectorWithHttpInfo(CreateConnectorSchema connector) throws ApiException {
    Object localVarPostBody = connector;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling createConnector");
    }
    
    // create path and map variables
    String localVarPath = "/contentConnectors";

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a connector 
   * Delete the specified connector. 
   * @param connectorId the connector id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteConnector(String connectorId) throws ApiException {

    deleteConnectorWithHttpInfo(connectorId);
  }

  /**
   * Delete a connector 
   * Delete the specified connector. 
   * @param connectorId the connector id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteConnectorWithHttpInfo(String connectorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorId' is set
    if (connectorId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorId' when calling deleteConnector");
    }
    
    // create path and map variables
    String localVarPath = "/contentConnectors/{connectorId}"
      .replaceAll("\\{" + "connectorId" + "\\}", apiClient.escapeString(connectorId.toString()));

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
   * Get a list of all Content Connectors for the application 
   * Get list of all Content Connectors in this application. 
   * @param includeAdditionalInstanceInformation  (optional)
   * @return ConnectorListSchema
   * @throws ApiException if fails to make API call
   */
  public ConnectorListSchema getConnectorsList(Boolean includeAdditionalInstanceInformation) throws ApiException {
    return getConnectorsListWithHttpInfo(includeAdditionalInstanceInformation).getData();
      }

  /**
   * Get a list of all Content Connectors for the application 
   * Get list of all Content Connectors in this application. 
   * @param includeAdditionalInstanceInformation  (optional)
   * @return ApiResponse&lt;ConnectorListSchema&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConnectorListSchema> getConnectorsListWithHttpInfo(Boolean includeAdditionalInstanceInformation) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/contentConnectors";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAdditionalInstanceInformation", includeAdditionalInstanceInformation));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "APP_NORMAL", "OAUTH" };

    GenericType<ConnectorListSchema> localVarReturnType = new GenericType<ConnectorListSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Update the configuration or enabled flag associated with &#x60;connectorId&#x60;. 
   * @param connectorId the connector id (required)
   * @param connector  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateConnector(String connectorId, UpdateConnectorSchema connector) throws ApiException {

    updateConnectorWithHttpInfo(connectorId, connector);
  }

  /**
   * 
   * Update the configuration or enabled flag associated with &#x60;connectorId&#x60;. 
   * @param connectorId the connector id (required)
   * @param connector  (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateConnectorWithHttpInfo(String connectorId, UpdateConnectorSchema connector) throws ApiException {
    Object localVarPostBody = connector;
    
    // verify the required parameter 'connectorId' is set
    if (connectorId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorId' when calling updateConnector");
    }
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling updateConnector");
    }
    
    // create path and map variables
    String localVarPath = "/contentConnectors/{connectorId}"
      .replaceAll("\\{" + "connectorId" + "\\}", apiClient.escapeString(connectorId.toString()));

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
