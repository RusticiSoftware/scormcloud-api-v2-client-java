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
 * UpdateApplicationSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class UpdateApplicationSchema {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("allowDelete")
  private Boolean allowDelete = null;

  public UpdateApplicationSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The new name of the application.
   * @return name
  **/
  @ApiModelProperty(value = "The new name of the application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateApplicationSchema allowDelete(Boolean allowDelete) {
    this.allowDelete = allowDelete;
    return this;
  }

  /**
   * Whether or not the application is allowed to perform deletion operations.
   * @return allowDelete
  **/
  @ApiModelProperty(value = "Whether or not the application is allowed to perform deletion operations.")
  public Boolean isAllowDelete() {
    return allowDelete;
  }

  public void setAllowDelete(Boolean allowDelete) {
    this.allowDelete = allowDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateApplicationSchema updateApplicationSchema = (UpdateApplicationSchema) o;
    return Objects.equals(this.name, updateApplicationSchema.name) &&
        Objects.equals(this.allowDelete, updateApplicationSchema.allowDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, allowDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApplicationSchema {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    allowDelete: ").append(toIndentedString(allowDelete)).append("\n");
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

