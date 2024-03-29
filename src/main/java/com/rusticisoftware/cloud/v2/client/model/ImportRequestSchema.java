/*
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rusticisoftware.cloud.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.rusticisoftware.cloud.v2.client.model.ImportConnectorRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.ImportFetchRequestSchema;
import com.rusticisoftware.cloud.v2.client.model.ImportMediaFileReferenceRequestSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request to import a new course. Exactly one of the schemas must be supplied, depending on the desired import behavior. 
 */
@ApiModel(description = "Request to import a new course. Exactly one of the schemas must be supplied, depending on the desired import behavior. ")
public class ImportRequestSchema {
  @JsonProperty("fetchRequest")
  private ImportFetchRequestSchema fetchRequest = null;

  @JsonProperty("mediaFileReferenceRequest")
  private ImportMediaFileReferenceRequestSchema mediaFileReferenceRequest = null;

  @JsonProperty("connectorReferenceRequest")
  private ImportConnectorRequestSchema connectorReferenceRequest = null;

  public ImportRequestSchema fetchRequest(ImportFetchRequestSchema fetchRequest) {
    this.fetchRequest = fetchRequest;
    return this;
  }

  /**
   * Get fetchRequest
   * @return fetchRequest
  **/
  @ApiModelProperty(value = "")
  public ImportFetchRequestSchema getFetchRequest() {
    return fetchRequest;
  }

  public void setFetchRequest(ImportFetchRequestSchema fetchRequest) {
    this.fetchRequest = fetchRequest;
  }

  public ImportRequestSchema mediaFileReferenceRequest(ImportMediaFileReferenceRequestSchema mediaFileReferenceRequest) {
    this.mediaFileReferenceRequest = mediaFileReferenceRequest;
    return this;
  }

  /**
   * Get mediaFileReferenceRequest
   * @return mediaFileReferenceRequest
  **/
  @ApiModelProperty(value = "")
  public ImportMediaFileReferenceRequestSchema getMediaFileReferenceRequest() {
    return mediaFileReferenceRequest;
  }

  public void setMediaFileReferenceRequest(ImportMediaFileReferenceRequestSchema mediaFileReferenceRequest) {
    this.mediaFileReferenceRequest = mediaFileReferenceRequest;
  }

  public ImportRequestSchema connectorReferenceRequest(ImportConnectorRequestSchema connectorReferenceRequest) {
    this.connectorReferenceRequest = connectorReferenceRequest;
    return this;
  }

  /**
   * Get connectorReferenceRequest
   * @return connectorReferenceRequest
  **/
  @ApiModelProperty(value = "")
  public ImportConnectorRequestSchema getConnectorReferenceRequest() {
    return connectorReferenceRequest;
  }

  public void setConnectorReferenceRequest(ImportConnectorRequestSchema connectorReferenceRequest) {
    this.connectorReferenceRequest = connectorReferenceRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportRequestSchema importRequestSchema = (ImportRequestSchema) o;
    return Objects.equals(this.fetchRequest, importRequestSchema.fetchRequest) &&
        Objects.equals(this.mediaFileReferenceRequest, importRequestSchema.mediaFileReferenceRequest) &&
        Objects.equals(this.connectorReferenceRequest, importRequestSchema.connectorReferenceRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fetchRequest, mediaFileReferenceRequest, connectorReferenceRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportRequestSchema {\n");
    
    sb.append("    fetchRequest: ").append(toIndentedString(fetchRequest)).append("\n");
    sb.append("    mediaFileReferenceRequest: ").append(toIndentedString(mediaFileReferenceRequest)).append("\n");
    sb.append("    connectorReferenceRequest: ").append(toIndentedString(connectorReferenceRequest)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

