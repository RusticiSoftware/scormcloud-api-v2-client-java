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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateDispatchSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class CreateDispatchSchema {
  @JsonProperty("destinationId")
  private String destinationId = null;

  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("allowNewRegistrations")
  private Boolean allowNewRegistrations = true;

  @JsonProperty("instanced")
  private Boolean instanced = true;

  @JsonProperty("registrationCap")
  private Integer registrationCap = 0;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("enabled")
  private Boolean enabled = true;

  @JsonProperty("tags")
  private List<String> tags = new ArrayList<String>();

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("postBack")
  private PostBackSchema postBack = null;

  public CreateDispatchSchema destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

   /**
   * Id of the destination this dispatch will belong to.
   * @return destinationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Id of the destination this dispatch will belong to.")
  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  public CreateDispatchSchema courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

   /**
   * Id of the course to be dispatched.
   * @return courseId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Id of the course to be dispatched.")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public CreateDispatchSchema allowNewRegistrations(Boolean allowNewRegistrations) {
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

  public CreateDispatchSchema instanced(Boolean instanced) {
    this.instanced = instanced;
    return this;
  }

   /**
   * If true, then a new registration instance will be created if the client LMS doesn't provide launch data for an existing one. Otherwise, the same instance will always be used for the given cmi.learner_id. 
   * @return instanced
  **/
  @ApiModelProperty(example = "null", value = "If true, then a new registration instance will be created if the client LMS doesn't provide launch data for an existing one. Otherwise, the same instance will always be used for the given cmi.learner_id. ")
  public Boolean getInstanced() {
    return instanced;
  }

  public void setInstanced(Boolean instanced) {
    this.instanced = instanced;
  }

  public CreateDispatchSchema registrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
    return this;
  }

   /**
   * The maximum number of registrations that can be created for this dispatch, where '0' means 'unlimited registrations'. 
   * @return registrationCap
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of registrations that can be created for this dispatch, where '0' means 'unlimited registrations'. ")
  public Integer getRegistrationCap() {
    return registrationCap;
  }

  public void setRegistrationCap(Integer registrationCap) {
    this.registrationCap = registrationCap;
  }

  public CreateDispatchSchema expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The date after which this dispatch will be disabled as an ISO 8601 string, or not present for no expiration date. 
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "The date after which this dispatch will be disabled as an ISO 8601 string, or not present for no expiration date. ")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CreateDispatchSchema enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If true, then this dispatch can be launched.
   * @return enabled
  **/
  @ApiModelProperty(example = "null", value = "If true, then this dispatch can be launched.")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CreateDispatchSchema tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateDispatchSchema addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to associate with this Dispatch.
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "The tags to associate with this Dispatch.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CreateDispatchSchema email(String email) {
    this.email = email;
    return this;
  }

   /**
   * SCORM Cloud user e-mail associated with this dispatch. If this is not provided, it will default to the owner of the Realm. 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "SCORM Cloud user e-mail associated with this dispatch. If this is not provided, it will default to the owner of the Realm. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateDispatchSchema notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Any provided notes about this dispatch.
   * @return notes
  **/
  @ApiModelProperty(example = "null", value = "Any provided notes about this dispatch.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CreateDispatchSchema postBack(PostBackSchema postBack) {
    this.postBack = postBack;
    return this;
  }

   /**
   * The postback information for this Dispatch.
   * @return postBack
  **/
  @ApiModelProperty(example = "null", value = "The postback information for this Dispatch.")
  public PostBackSchema getPostBack() {
    return postBack;
  }

  public void setPostBack(PostBackSchema postBack) {
    this.postBack = postBack;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDispatchSchema createDispatchSchema = (CreateDispatchSchema) o;
    return Objects.equals(this.destinationId, createDispatchSchema.destinationId) &&
        Objects.equals(this.courseId, createDispatchSchema.courseId) &&
        Objects.equals(this.allowNewRegistrations, createDispatchSchema.allowNewRegistrations) &&
        Objects.equals(this.instanced, createDispatchSchema.instanced) &&
        Objects.equals(this.registrationCap, createDispatchSchema.registrationCap) &&
        Objects.equals(this.expirationDate, createDispatchSchema.expirationDate) &&
        Objects.equals(this.enabled, createDispatchSchema.enabled) &&
        Objects.equals(this.tags, createDispatchSchema.tags) &&
        Objects.equals(this.email, createDispatchSchema.email) &&
        Objects.equals(this.notes, createDispatchSchema.notes) &&
        Objects.equals(this.postBack, createDispatchSchema.postBack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, courseId, allowNewRegistrations, instanced, registrationCap, expirationDate, enabled, tags, email, notes, postBack);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDispatchSchema {\n");
    
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    allowNewRegistrations: ").append(toIndentedString(allowNewRegistrations)).append("\n");
    sb.append("    instanced: ").append(toIndentedString(instanced)).append("\n");
    sb.append("    registrationCap: ").append(toIndentedString(registrationCap)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    postBack: ").append(toIndentedString(postBack)).append("\n");
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

