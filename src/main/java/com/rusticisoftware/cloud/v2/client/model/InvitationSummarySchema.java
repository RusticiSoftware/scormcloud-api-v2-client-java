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
 * InvitationSummarySchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
public class InvitationSummarySchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("isPublic")
  private Boolean isPublic = null;

  @JsonProperty("createDate")
  private OffsetDateTime createDate = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  public InvitationSummarySchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The invitationId for this invitation.
   * @return id
  **/
  @ApiModelProperty(value = "The invitationId for this invitation.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InvitationSummarySchema courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Course Id for this Invitation.
   * @return courseId
  **/
  @ApiModelProperty(value = "Course Id for this Invitation.")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public InvitationSummarySchema isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Is the invitation Public or Private
   * @return isPublic
  **/
  @ApiModelProperty(value = "Is the invitation Public or Private")
  public Boolean isIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public InvitationSummarySchema createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * The create date for the invitation
   * @return createDate
  **/
  @ApiModelProperty(value = "The create date for the invitation")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public InvitationSummarySchema updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationSummarySchema invitationSummarySchema = (InvitationSummarySchema) o;
    return Objects.equals(this.id, invitationSummarySchema.id) &&
        Objects.equals(this.courseId, invitationSummarySchema.courseId) &&
        Objects.equals(this.isPublic, invitationSummarySchema.isPublic) &&
        Objects.equals(this.createDate, invitationSummarySchema.createDate) &&
        Objects.equals(this.updated, invitationSummarySchema.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, courseId, isPublic, createDate, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationSummarySchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

