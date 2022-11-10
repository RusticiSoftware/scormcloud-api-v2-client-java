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
import com.rusticisoftware.cloud.v2.client.model.ItemValuePairSchema;
import com.rusticisoftware.cloud.v2.client.model.LaunchAuthSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * LaunchLinkRequestSchema
 */
public class LaunchLinkRequestSchema {
  @JsonProperty("expiry")
  private Integer expiry = 120;

  @JsonProperty("redirectOnExitUrl")
  private String redirectOnExitUrl = null;

  @JsonProperty("tracking")
  private Boolean tracking = true;

  @JsonProperty("startSco")
  private String startSco = null;

  @JsonProperty("culture")
  private String culture = null;

  @JsonProperty("cssUrl")
  private String cssUrl = null;

  @JsonProperty("learnerTags")
  private List<String> learnerTags = null;

  @JsonProperty("courseTags")
  private List<String> courseTags = null;

  @JsonProperty("registrationTags")
  private List<String> registrationTags = null;

  @JsonProperty("additionalvalues")
  private List<ItemValuePairSchema> additionalvalues = null;

  @JsonProperty("launchAuth")
  private LaunchAuthSchema launchAuth = null;

  public LaunchLinkRequestSchema expiry(Integer expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Number of seconds from now this link will expire in. Defaults to 120s. Range 10s:300s
   * @return expiry
  **/
  @ApiModelProperty(value = "Number of seconds from now this link will expire in. Defaults to 120s. Range 10s:300s")
  public Integer getExpiry() {
    return expiry;
  }

  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }

  public LaunchLinkRequestSchema redirectOnExitUrl(String redirectOnExitUrl) {
    this.redirectOnExitUrl = redirectOnExitUrl;
    return this;
  }

  /**
   * The URL the application should redirect to when the learner exits a course.  Alternatively one of the following keywords can be used to redirect to: - &#x60;closer&#x60; - A page that automatically tries to close the browser tab/window - &#x60;blank&#x60; - A blank page - &#x60;message&#x60; - A page with a message about the course being complete  If an empty string is specified, the configured setting will be used (default www.scorm.com). If an invalid url is specified, the Message.html page will be loaded. 
   * @return redirectOnExitUrl
  **/
  @ApiModelProperty(required = true, value = "The URL the application should redirect to when the learner exits a course.  Alternatively one of the following keywords can be used to redirect to: - `closer` - A page that automatically tries to close the browser tab/window - `blank` - A blank page - `message` - A page with a message about the course being complete  If an empty string is specified, the configured setting will be used (default www.scorm.com). If an invalid url is specified, the Message.html page will be loaded. ")
  public String getRedirectOnExitUrl() {
    return redirectOnExitUrl;
  }

  public void setRedirectOnExitUrl(String redirectOnExitUrl) {
    this.redirectOnExitUrl = redirectOnExitUrl;
  }

  public LaunchLinkRequestSchema tracking(Boolean tracking) {
    this.tracking = tracking;
    return this;
  }

  /**
   * Should this launch be tracked? If false, SCORM Cloud will avoid tracking to the extent possible for the standard being used.
   * @return tracking
  **/
  @ApiModelProperty(value = "Should this launch be tracked? If false, SCORM Cloud will avoid tracking to the extent possible for the standard being used.")
  public Boolean isTracking() {
    return tracking;
  }

  public void setTracking(Boolean tracking) {
    this.tracking = tracking;
  }

  public LaunchLinkRequestSchema startSco(String startSco) {
    this.startSco = startSco;
    return this;
  }

  /**
   * For SCORM, SCO identifier to override launch, overriding the normal sequencing.
   * @return startSco
  **/
  @ApiModelProperty(value = "For SCORM, SCO identifier to override launch, overriding the normal sequencing.")
  public String getStartSco() {
    return startSco;
  }

  public void setStartSco(String startSco) {
    this.startSco = startSco;
  }

  public LaunchLinkRequestSchema culture(String culture) {
    this.culture = culture;
    return this;
  }

  /**
   * This parameter should specify a culture code. If specified, and supported, the navigation and alerts in the player will be displayed in the associated language. If not specified, the locale of the user’s browser will be used.
   * @return culture
  **/
  @ApiModelProperty(value = "This parameter should specify a culture code. If specified, and supported, the navigation and alerts in the player will be displayed in the associated language. If not specified, the locale of the user’s browser will be used.")
  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }

  public LaunchLinkRequestSchema cssUrl(String cssUrl) {
    this.cssUrl = cssUrl;
    return this;
  }

  /**
   * A Url pointing to custom css for the player to use.
   * @return cssUrl
  **/
  @ApiModelProperty(value = "A Url pointing to custom css for the player to use.")
  public String getCssUrl() {
    return cssUrl;
  }

  public void setCssUrl(String cssUrl) {
    this.cssUrl = cssUrl;
  }

  public LaunchLinkRequestSchema learnerTags(List<String> learnerTags) {
    this.learnerTags = learnerTags;
    return this;
  }

  public LaunchLinkRequestSchema addLearnerTagsItem(String learnerTagsItem) {
    if (this.learnerTags == null) {
      this.learnerTags = new ArrayList<>();
    }
    this.learnerTags.add(learnerTagsItem);
    return this;
  }

  /**
   * Get learnerTags
   * @return learnerTags
  **/
  @ApiModelProperty(value = "")
  public List<String> getLearnerTags() {
    return learnerTags;
  }

  public void setLearnerTags(List<String> learnerTags) {
    this.learnerTags = learnerTags;
  }

  public LaunchLinkRequestSchema courseTags(List<String> courseTags) {
    this.courseTags = courseTags;
    return this;
  }

  public LaunchLinkRequestSchema addCourseTagsItem(String courseTagsItem) {
    if (this.courseTags == null) {
      this.courseTags = new ArrayList<>();
    }
    this.courseTags.add(courseTagsItem);
    return this;
  }

  /**
   * Get courseTags
   * @return courseTags
  **/
  @ApiModelProperty(value = "")
  public List<String> getCourseTags() {
    return courseTags;
  }

  public void setCourseTags(List<String> courseTags) {
    this.courseTags = courseTags;
  }

  public LaunchLinkRequestSchema registrationTags(List<String> registrationTags) {
    this.registrationTags = registrationTags;
    return this;
  }

  public LaunchLinkRequestSchema addRegistrationTagsItem(String registrationTagsItem) {
    if (this.registrationTags == null) {
      this.registrationTags = new ArrayList<>();
    }
    this.registrationTags.add(registrationTagsItem);
    return this;
  }

  /**
   * Get registrationTags
   * @return registrationTags
  **/
  @ApiModelProperty(value = "")
  public List<String> getRegistrationTags() {
    return registrationTags;
  }

  public void setRegistrationTags(List<String> registrationTags) {
    this.registrationTags = registrationTags;
  }

  public LaunchLinkRequestSchema additionalvalues(List<ItemValuePairSchema> additionalvalues) {
    this.additionalvalues = additionalvalues;
    return this;
  }

  public LaunchLinkRequestSchema addAdditionalvaluesItem(ItemValuePairSchema additionalvaluesItem) {
    if (this.additionalvalues == null) {
      this.additionalvalues = new ArrayList<>();
    }
    this.additionalvalues.add(additionalvaluesItem);
    return this;
  }

  /**
   * Get additionalvalues
   * @return additionalvalues
  **/
  @ApiModelProperty(value = "")
  public List<ItemValuePairSchema> getAdditionalvalues() {
    return additionalvalues;
  }

  public void setAdditionalvalues(List<ItemValuePairSchema> additionalvalues) {
    this.additionalvalues = additionalvalues;
  }

  public LaunchLinkRequestSchema launchAuth(LaunchAuthSchema launchAuth) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchLinkRequestSchema launchLinkRequestSchema = (LaunchLinkRequestSchema) o;
    return Objects.equals(this.expiry, launchLinkRequestSchema.expiry) &&
        Objects.equals(this.redirectOnExitUrl, launchLinkRequestSchema.redirectOnExitUrl) &&
        Objects.equals(this.tracking, launchLinkRequestSchema.tracking) &&
        Objects.equals(this.startSco, launchLinkRequestSchema.startSco) &&
        Objects.equals(this.culture, launchLinkRequestSchema.culture) &&
        Objects.equals(this.cssUrl, launchLinkRequestSchema.cssUrl) &&
        Objects.equals(this.learnerTags, launchLinkRequestSchema.learnerTags) &&
        Objects.equals(this.courseTags, launchLinkRequestSchema.courseTags) &&
        Objects.equals(this.registrationTags, launchLinkRequestSchema.registrationTags) &&
        Objects.equals(this.additionalvalues, launchLinkRequestSchema.additionalvalues) &&
        Objects.equals(this.launchAuth, launchLinkRequestSchema.launchAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, redirectOnExitUrl, tracking, startSco, culture, cssUrl, learnerTags, courseTags, registrationTags, additionalvalues, launchAuth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchLinkRequestSchema {\n");
    
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    redirectOnExitUrl: ").append(toIndentedString(redirectOnExitUrl)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    startSco: ").append(toIndentedString(startSco)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    cssUrl: ").append(toIndentedString(cssUrl)).append("\n");
    sb.append("    learnerTags: ").append(toIndentedString(learnerTags)).append("\n");
    sb.append("    courseTags: ").append(toIndentedString(courseTags)).append("\n");
    sb.append("    registrationTags: ").append(toIndentedString(registrationTags)).append("\n");
    sb.append("    additionalvalues: ").append(toIndentedString(additionalvalues)).append("\n");
    sb.append("    launchAuth: ").append(toIndentedString(launchAuth)).append("\n");
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

