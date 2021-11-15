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
import com.rusticisoftware.cloud.v2.client.model.PostBackSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CreatePublicInvitationSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class CreatePublicInvitationSchema {
  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("creatingUserEmail")
  private String creatingUserEmail = null;

  @JsonProperty("registrationCap")
  private Integer registrationCap = 0;

  @JsonProperty("postBack")
  private PostBackSchema postBack = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  public CreatePublicInvitationSchema courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * The id of the course for which to create an invitation.
   * @return courseId
  **/
  @ApiModelProperty(required = true, value = "The id of the course for which to create an invitation.")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public CreatePublicInvitationSchema creatingUserEmail(String creatingUserEmail) {
    this.creatingUserEmail = creatingUserEmail;
    return this;
  }

  /**
   * The email of the user who is creating the invitation.
   * @return creatingUserEmail
  **/
  @ApiModelProperty(required = true, value = "The email of the user who is creating the invitation.")
  public String getCreatingUserEmail() {
    return creatingUserEmail;
  }

  public void setCreatingUserEmail(String creatingUserEmail) {
    this.creatingUserEmail = creatingUserEmail;
  }

  public CreatePublicInvitationSchema registrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
    return this;
  }

  /**
   * Integer value that limits the amount of registrations a public invitation can generate.
   * @return registrationCap
  **/
  @ApiModelProperty(value = "Integer value that limits the amount of registrations a public invitation can generate.")
  public Integer getRegistrationCap() {
    return registrationCap;
  }

  public void setRegistrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
  }

  public CreatePublicInvitationSchema postBack(PostBackSchema postBack) {
    this.postBack = postBack;
    return this;
  }

  /**
   * Specifies a URL for which to post activity and status data in real time as the course is completed
   * @return postBack
  **/
  @ApiModelProperty(value = "Specifies a URL for which to post activity and status data in real time as the course is completed")
  public PostBackSchema getPostBack() {
    return postBack;
  }

  public void setPostBack(PostBackSchema postBack) {
    this.postBack = postBack;
  }

  public CreatePublicInvitationSchema expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The ISO 8601 TimeStamp (defaults to UTC) after which this invitation will expire and can no longer be launched. An empty value will represent no expiration date. 
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The ISO 8601 TimeStamp (defaults to UTC) after which this invitation will expire and can no longer be launched. An empty value will represent no expiration date. ")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CreatePublicInvitationSchema tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreatePublicInvitationSchema addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Optional tags to be applied to this invitation.
   * @return tags
  **/
  @ApiModelProperty(value = "Optional tags to be applied to this invitation.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePublicInvitationSchema createPublicInvitationSchema = (CreatePublicInvitationSchema) o;
    return Objects.equals(this.courseId, createPublicInvitationSchema.courseId) &&
        Objects.equals(this.creatingUserEmail, createPublicInvitationSchema.creatingUserEmail) &&
        Objects.equals(this.registrationCap, createPublicInvitationSchema.registrationCap) &&
        Objects.equals(this.postBack, createPublicInvitationSchema.postBack) &&
        Objects.equals(this.expirationDate, createPublicInvitationSchema.expirationDate) &&
        Objects.equals(this.tags, createPublicInvitationSchema.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, creatingUserEmail, registrationCap, postBack, expirationDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePublicInvitationSchema {\n");
    
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    creatingUserEmail: ").append(toIndentedString(creatingUserEmail)).append("\n");
    sb.append("    registrationCap: ").append(toIndentedString(registrationCap)).append("\n");
    sb.append("    postBack: ").append(toIndentedString(postBack)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

