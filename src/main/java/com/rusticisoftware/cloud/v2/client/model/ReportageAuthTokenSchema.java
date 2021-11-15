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
 * ReportageAuthTokenSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class ReportageAuthTokenSchema {
  @JsonProperty("authEnabled")
  private Boolean authEnabled = null;

  @JsonProperty("queryString")
  private String queryString = null;

  public ReportageAuthTokenSchema authEnabled(Boolean authEnabled) {
    this.authEnabled = authEnabled;
    return this;
  }

  /**
   * Get authEnabled
   * @return authEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isAuthEnabled() {
    return authEnabled;
  }

  public void setAuthEnabled(Boolean authEnabled) {
    this.authEnabled = authEnabled;
  }

  public ReportageAuthTokenSchema queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Get queryString
   * @return queryString
  **/
  @ApiModelProperty(value = "")
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportageAuthTokenSchema reportageAuthTokenSchema = (ReportageAuthTokenSchema) o;
    return Objects.equals(this.authEnabled, reportageAuthTokenSchema.authEnabled) &&
        Objects.equals(this.queryString, reportageAuthTokenSchema.queryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authEnabled, queryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportageAuthTokenSchema {\n");
    
    sb.append("    authEnabled: ").append(toIndentedString(authEnabled)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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

