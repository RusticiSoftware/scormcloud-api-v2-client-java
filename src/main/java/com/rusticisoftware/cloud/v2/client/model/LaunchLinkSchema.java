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
 * LaunchLinkSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class LaunchLinkSchema {
  @JsonProperty("launchLink")
  private String launchLink = null;

  public LaunchLinkSchema launchLink(String launchLink) {
    this.launchLink = launchLink;
    return this;
  }

  /**
   * Get launchLink
   * @return launchLink
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLaunchLink() {
    return launchLink;
  }

  public void setLaunchLink(String launchLink) {
    this.launchLink = launchLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchLinkSchema launchLinkSchema = (LaunchLinkSchema) o;
    return Objects.equals(this.launchLink, launchLinkSchema.launchLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchLinkSchema {\n");
    
    sb.append("    launchLink: ").append(toIndentedString(launchLink)).append("\n");
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

