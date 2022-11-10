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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateConnectorSchema
 */
public class CreateConnectorSchema {
  @JsonProperty("contentConnectorType")
  private String contentConnectorType = null;

  @JsonProperty("configuration")
  private Object _configuration = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  public CreateConnectorSchema contentConnectorType(String contentConnectorType) {
    this.contentConnectorType = contentConnectorType;
    return this;
  }

  /**
   * type of this content connector
   * @return contentConnectorType
  **/
  @ApiModelProperty(required = true, value = "type of this content connector")
  public String getContentConnectorType() {
    return contentConnectorType;
  }

  public void setContentConnectorType(String contentConnectorType) {
    this.contentConnectorType = contentConnectorType;
  }

  public CreateConnectorSchema _configuration(Object _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * configuration for this content connector, format is implementation specific
   * @return _configuration
  **/
  @ApiModelProperty(required = true, value = "configuration for this content connector, format is implementation specific")
  public Object getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Object _configuration) {
    this._configuration = _configuration;
  }

  public CreateConnectorSchema enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * is this connector enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "is this connector enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConnectorSchema createConnectorSchema = (CreateConnectorSchema) o;
    return Objects.equals(this.contentConnectorType, createConnectorSchema.contentConnectorType) &&
        Objects.equals(this._configuration, createConnectorSchema._configuration) &&
        Objects.equals(this.enabled, createConnectorSchema.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentConnectorType, _configuration, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConnectorSchema {\n");
    
    sb.append("    contentConnectorType: ").append(toIndentedString(contentConnectorType)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

