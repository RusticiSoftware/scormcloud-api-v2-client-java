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
import java.time.OffsetDateTime;

/**
 * ApplicationInfoSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class ApplicationInfoSchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("createDate")
  private OffsetDateTime createDate = null;

  @JsonProperty("allowDelete")
  private Boolean allowDelete = null;

  @JsonProperty("courseCount")
  private Integer courseCount = null;

  @JsonProperty("registrationCount")
  private Integer registrationCount = null;

  public ApplicationInfoSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The application id for this application.
   * @return id
  **/
  @ApiModelProperty(value = "The application id for this application.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationInfoSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this application.
   * @return name
  **/
  @ApiModelProperty(value = "The name of this application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationInfoSchema createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * The time the application was created in UTC
   * @return createDate
  **/
  @ApiModelProperty(value = "The time the application was created in UTC")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public ApplicationInfoSchema allowDelete(Boolean allowDelete) {
    this.allowDelete = allowDelete;
    return this;
  }

  /**
   * Whether the application is allowed to perform delete operations
   * @return allowDelete
  **/
  @ApiModelProperty(value = "Whether the application is allowed to perform delete operations")
  public Boolean isAllowDelete() {
    return allowDelete;
  }

  public void setAllowDelete(Boolean allowDelete) {
    this.allowDelete = allowDelete;
  }

  public ApplicationInfoSchema courseCount(Integer courseCount) {
    this.courseCount = courseCount;
    return this;
  }

  /**
   * Get courseCount
   * @return courseCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCourseCount() {
    return courseCount;
  }

  public void setCourseCount(Integer courseCount) {
    this.courseCount = courseCount;
  }

  public ApplicationInfoSchema registrationCount(Integer registrationCount) {
    this.registrationCount = registrationCount;
    return this;
  }

  /**
   * Get registrationCount
   * @return registrationCount
  **/
  @ApiModelProperty(value = "")
  public Integer getRegistrationCount() {
    return registrationCount;
  }

  public void setRegistrationCount(Integer registrationCount) {
    this.registrationCount = registrationCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInfoSchema applicationInfoSchema = (ApplicationInfoSchema) o;
    return Objects.equals(this.id, applicationInfoSchema.id) &&
        Objects.equals(this.name, applicationInfoSchema.name) &&
        Objects.equals(this.createDate, applicationInfoSchema.createDate) &&
        Objects.equals(this.allowDelete, applicationInfoSchema.allowDelete) &&
        Objects.equals(this.courseCount, applicationInfoSchema.courseCount) &&
        Objects.equals(this.registrationCount, applicationInfoSchema.registrationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createDate, allowDelete, courseCount, registrationCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInfoSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    allowDelete: ").append(toIndentedString(allowDelete)).append("\n");
    sb.append("    courseCount: ").append(toIndentedString(courseCount)).append("\n");
    sb.append("    registrationCount: ").append(toIndentedString(registrationCount)).append("\n");
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

