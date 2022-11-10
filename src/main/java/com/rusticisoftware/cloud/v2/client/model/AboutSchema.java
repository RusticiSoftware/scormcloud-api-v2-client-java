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
 * AboutSchema
 */
public class AboutSchema {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("distribution")
  private String distribution = null;

  public AboutSchema version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public AboutSchema distribution(String distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Get distribution
   * @return distribution
  **/
  @ApiModelProperty(value = "")
  public String getDistribution() {
    return distribution;
  }

  public void setDistribution(String distribution) {
    this.distribution = distribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AboutSchema aboutSchema = (AboutSchema) o;
    return Objects.equals(this.version, aboutSchema.version) &&
        Objects.equals(this.distribution, aboutSchema.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, distribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AboutSchema {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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

