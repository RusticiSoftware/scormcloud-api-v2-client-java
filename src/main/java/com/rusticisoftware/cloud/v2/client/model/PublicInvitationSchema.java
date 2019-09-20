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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rusticisoftware.cloud.v2.client.model.PostBackSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * PublicInvitationSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class PublicInvitationSchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("allowLaunch")
  private Boolean allowLaunch = null;

  @JsonProperty("allowNewRegistrations")
  private Boolean allowNewRegistrations = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("createDate")
  private OffsetDateTime createDate = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("postBack")
  private PostBackSchema postBack = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("registrationCap")
  private Integer registrationCap = 0;

  @JsonProperty("registrationCount")
  private Integer registrationCount = null;

  public PublicInvitationSchema id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The invitationId for this invitation.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The invitationId for this invitation.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublicInvitationSchema courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

   /**
   * Course Id for this Invitation.
   * @return courseId
  **/
  @ApiModelProperty(example = "null", value = "Course Id for this Invitation.")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public PublicInvitationSchema allowLaunch(Boolean allowLaunch) {
    this.allowLaunch = allowLaunch;
    return this;
  }

   /**
   * If true, then new registrations can be created for this dispatch.
   * @return allowLaunch
  **/
  @ApiModelProperty(example = "null", value = "If true, then new registrations can be created for this dispatch.")
  public Boolean getAllowLaunch() {
    return allowLaunch;
  }

  public void setAllowLaunch(Boolean allowLaunch) {
    this.allowLaunch = allowLaunch;
  }

  public PublicInvitationSchema allowNewRegistrations(Boolean allowNewRegistrations) {
    this.allowNewRegistrations = allowNewRegistrations;
    return this;
  }

   /**
   * If true, then new registrations can be created for this dispatch.
   * @return allowNewRegistrations
  **/
  @ApiModelProperty(example = "null", value = "If true, then new registrations can be created for this dispatch.")
  public Boolean getAllowNewRegistrations() {
    return allowNewRegistrations;
  }

  public void setAllowNewRegistrations(Boolean allowNewRegistrations) {
    this.allowNewRegistrations = allowNewRegistrations;
  }

  public PublicInvitationSchema url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The launch URL for the invitation
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The launch URL for the invitation")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PublicInvitationSchema createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * The create date for the invitation
   * @return createDate
  **/
  @ApiModelProperty(example = "null", value = "The create date for the invitation")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public PublicInvitationSchema updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public PublicInvitationSchema postBack(PostBackSchema postBack) {
    this.postBack = postBack;
    return this;
  }

   /**
   * Specifies a URL for which to post activity and status data in real time as the course is completed
   * @return postBack
  **/
  @ApiModelProperty(example = "null", value = "Specifies a URL for which to post activity and status data in real time as the course is completed")
  public PostBackSchema getPostBack() {
    return postBack;
  }

  public void setPostBack(PostBackSchema postBack) {
    this.postBack = postBack;
  }

  public PublicInvitationSchema expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The date this invitation will expire and can not be launched (formatted yyyyMMddHHmmss in UTC time).
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "The date this invitation will expire and can not be launched (formatted yyyyMMddHHmmss in UTC time).")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PublicInvitationSchema registrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
    return this;
  }

   /**
   * Integer value that limits the amount of registrations a public invitation can generate.
   * @return registrationCap
  **/
  @ApiModelProperty(example = "null", value = "Integer value that limits the amount of registrations a public invitation can generate.")
  public Integer getRegistrationCap() {
    return registrationCap;
  }

  public void setRegistrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
  }

  public PublicInvitationSchema registrationCount(Integer registrationCount) {
    this.registrationCount = registrationCount;
    return this;
  }

   /**
   * The count of registrations for this invitation
   * @return registrationCount
  **/
  @ApiModelProperty(example = "null", value = "The count of registrations for this invitation")
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
    PublicInvitationSchema publicInvitationSchema = (PublicInvitationSchema) o;
    return Objects.equals(this.id, publicInvitationSchema.id) &&
        Objects.equals(this.courseId, publicInvitationSchema.courseId) &&
        Objects.equals(this.allowLaunch, publicInvitationSchema.allowLaunch) &&
        Objects.equals(this.allowNewRegistrations, publicInvitationSchema.allowNewRegistrations) &&
        Objects.equals(this.url, publicInvitationSchema.url) &&
        Objects.equals(this.createDate, publicInvitationSchema.createDate) &&
        Objects.equals(this.updated, publicInvitationSchema.updated) &&
        Objects.equals(this.postBack, publicInvitationSchema.postBack) &&
        Objects.equals(this.expirationDate, publicInvitationSchema.expirationDate) &&
        Objects.equals(this.registrationCap, publicInvitationSchema.registrationCap) &&
        Objects.equals(this.registrationCount, publicInvitationSchema.registrationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, courseId, allowLaunch, allowNewRegistrations, url, createDate, updated, postBack, expirationDate, registrationCap, registrationCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicInvitationSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    allowLaunch: ").append(toIndentedString(allowLaunch)).append("\n");
    sb.append("    allowNewRegistrations: ").append(toIndentedString(allowNewRegistrations)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    postBack: ").append(toIndentedString(postBack)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    registrationCap: ").append(toIndentedString(registrationCap)).append("\n");
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

