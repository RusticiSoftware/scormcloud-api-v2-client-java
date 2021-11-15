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
 * CredentialRequestSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class CredentialRequestSchema {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("active")
  private Boolean active = null;

  public CredentialRequestSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name for this credential
   * @return name
  **/
  @ApiModelProperty(value = "name for this credential")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CredentialRequestSchema active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * A flag denoting if the key is available for use.
   * @return active
  **/
  @ApiModelProperty(value = "A flag denoting if the key is available for use.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialRequestSchema credentialRequestSchema = (CredentialRequestSchema) o;
    return Objects.equals(this.name, credentialRequestSchema.name) &&
        Objects.equals(this.active, credentialRequestSchema.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialRequestSchema {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

