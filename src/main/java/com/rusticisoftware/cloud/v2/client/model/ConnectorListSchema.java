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
import com.rusticisoftware.cloud.v2.client.model.ConnectorSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * List of content connectors.
 */
@ApiModel(description = "List of content connectors.")
public class ConnectorListSchema {
  @JsonProperty("connectorEntries")
  private List<ConnectorSchema> connectorEntries = null;

  public ConnectorListSchema connectorEntries(List<ConnectorSchema> connectorEntries) {
    this.connectorEntries = connectorEntries;
    return this;
  }

  public ConnectorListSchema addConnectorEntriesItem(ConnectorSchema connectorEntriesItem) {
    if (this.connectorEntries == null) {
      this.connectorEntries = new ArrayList<>();
    }
    this.connectorEntries.add(connectorEntriesItem);
    return this;
  }

  /**
   * Get connectorEntries
   * @return connectorEntries
  **/
  @ApiModelProperty(value = "")
  public List<ConnectorSchema> getConnectorEntries() {
    return connectorEntries;
  }

  public void setConnectorEntries(List<ConnectorSchema> connectorEntries) {
    this.connectorEntries = connectorEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorListSchema connectorListSchema = (ConnectorListSchema) o;
    return Objects.equals(this.connectorEntries, connectorListSchema.connectorEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorListSchema {\n");
    
    sb.append("    connectorEntries: ").append(toIndentedString(connectorEntries)).append("\n");
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

