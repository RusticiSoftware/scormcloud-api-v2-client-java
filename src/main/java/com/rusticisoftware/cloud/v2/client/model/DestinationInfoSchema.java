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
import com.rusticisoftware.cloud.v2.client.model.LaunchAuthSchema;
import com.rusticisoftware.cloud.v2.client.model.Lti13PlatformConfigurationSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * DestinationInfoSchema
 */
public class DestinationInfoSchema {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("dispatchCount")
  private Integer dispatchCount = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("launchAuth")
  private LaunchAuthSchema launchAuth = null;

  @JsonProperty("lti13Data")
  private Lti13PlatformConfigurationSchema lti13Data = null;

  public DestinationInfoSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The destination&#39;s name.
   * @return name
  **/
  @ApiModelProperty(value = "The destination's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DestinationInfoSchema dispatchCount(Integer dispatchCount) {
    this.dispatchCount = dispatchCount;
    return this;
  }

  /**
   * Get dispatchCount
   * @return dispatchCount
  **/
  @ApiModelProperty(value = "")
  public Integer getDispatchCount() {
    return dispatchCount;
  }

  public void setDispatchCount(Integer dispatchCount) {
    this.dispatchCount = dispatchCount;
  }

  public DestinationInfoSchema updated(OffsetDateTime updated) {
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

  public DestinationInfoSchema created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public DestinationInfoSchema tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DestinationInfoSchema addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Optional array of tags.
   * @return tags
  **/
  @ApiModelProperty(value = "Optional array of tags.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public DestinationInfoSchema email(String email) {
    this.email = email;
    return this;
  }

  /**
   * SCORM Cloud user e-mail associated with this destination. If this is not provided, it will default to the owner of the Realm. 
   * @return email
  **/
  @ApiModelProperty(value = "SCORM Cloud user e-mail associated with this destination. If this is not provided, it will default to the owner of the Realm. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DestinationInfoSchema notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Any provided notes about this Destination
   * @return notes
  **/
  @ApiModelProperty(value = "Any provided notes about this Destination")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DestinationInfoSchema launchAuth(LaunchAuthSchema launchAuth) {
    this.launchAuth = launchAuth;
    return this;
  }

  /**
   * Get launchAuth
   * @return launchAuth
  **/
  @ApiModelProperty(value = "")
  public LaunchAuthSchema getLaunchAuth() {
    return launchAuth;
  }

  public void setLaunchAuth(LaunchAuthSchema launchAuth) {
    this.launchAuth = launchAuth;
  }

  public DestinationInfoSchema lti13Data(Lti13PlatformConfigurationSchema lti13Data) {
    this.lti13Data = lti13Data;
    return this;
  }

  /**
   * Get lti13Data
   * @return lti13Data
  **/
  @ApiModelProperty(value = "")
  public Lti13PlatformConfigurationSchema getLti13Data() {
    return lti13Data;
  }

  public void setLti13Data(Lti13PlatformConfigurationSchema lti13Data) {
    this.lti13Data = lti13Data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationInfoSchema destinationInfoSchema = (DestinationInfoSchema) o;
    return Objects.equals(this.name, destinationInfoSchema.name) &&
        Objects.equals(this.dispatchCount, destinationInfoSchema.dispatchCount) &&
        Objects.equals(this.updated, destinationInfoSchema.updated) &&
        Objects.equals(this.created, destinationInfoSchema.created) &&
        Objects.equals(this.tags, destinationInfoSchema.tags) &&
        Objects.equals(this.email, destinationInfoSchema.email) &&
        Objects.equals(this.notes, destinationInfoSchema.notes) &&
        Objects.equals(this.launchAuth, destinationInfoSchema.launchAuth) &&
        Objects.equals(this.lti13Data, destinationInfoSchema.lti13Data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dispatchCount, updated, created, tags, email, notes, launchAuth, lti13Data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationInfoSchema {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dispatchCount: ").append(toIndentedString(dispatchCount)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    launchAuth: ").append(toIndentedString(launchAuth)).append("\n");
    sb.append("    lti13Data: ").append(toIndentedString(lti13Data)).append("\n");
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
