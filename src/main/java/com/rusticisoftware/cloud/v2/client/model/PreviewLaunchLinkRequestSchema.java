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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PreviewLaunchLinkRequestSchema
 */
public class PreviewLaunchLinkRequestSchema {
  @JsonProperty("expiry")
  private Integer expiry = 120;

  @JsonProperty("redirectOnExitUrl")
  private String redirectOnExitUrl = null;

  @JsonProperty("startSco")
  private String startSco = null;

  @JsonProperty("culture")
  private String culture = null;

  @JsonProperty("cssUrl")
  private String cssUrl = null;

  @JsonProperty("additionalvalues")
  private List<ItemValuePairSchema> additionalvalues = null;

  public PreviewLaunchLinkRequestSchema expiry(Integer expiry) {
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

  public PreviewLaunchLinkRequestSchema redirectOnExitUrl(String redirectOnExitUrl) {
    this.redirectOnExitUrl = redirectOnExitUrl;
    return this;
  }

  /**
   * The URL the application should redirect to when the learner exits a course.  Alternatively one of the following keywords can be used to redirect to: - &#x60;closer&#x60; - A page that automatically tries to close the browser tab/window - &#x60;blank&#x60; - A blank page - &#x60;message&#x60; - A page with a message about the course being complete  If an empty string is specified, the configured setting will be used (default www.scorm.com). If an invalid url is specified, the Message.html page will be loaded. 
   * @return redirectOnExitUrl
  **/
  @ApiModelProperty(value = "The URL the application should redirect to when the learner exits a course.  Alternatively one of the following keywords can be used to redirect to: - `closer` - A page that automatically tries to close the browser tab/window - `blank` - A blank page - `message` - A page with a message about the course being complete  If an empty string is specified, the configured setting will be used (default www.scorm.com). If an invalid url is specified, the Message.html page will be loaded. ")
  public String getRedirectOnExitUrl() {
    return redirectOnExitUrl;
  }

  public void setRedirectOnExitUrl(String redirectOnExitUrl) {
    this.redirectOnExitUrl = redirectOnExitUrl;
  }

  public PreviewLaunchLinkRequestSchema startSco(String startSco) {
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

  public PreviewLaunchLinkRequestSchema culture(String culture) {
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

  public PreviewLaunchLinkRequestSchema cssUrl(String cssUrl) {
    this.cssUrl = cssUrl;
    return this;
  }

  /**
   * A url pointing to custom CSS for the player to use.
   * @return cssUrl
  **/
  @ApiModelProperty(value = "A url pointing to custom CSS for the player to use.")
  public String getCssUrl() {
    return cssUrl;
  }

  public void setCssUrl(String cssUrl) {
    this.cssUrl = cssUrl;
  }

  public PreviewLaunchLinkRequestSchema additionalvalues(List<ItemValuePairSchema> additionalvalues) {
    this.additionalvalues = additionalvalues;
    return this;
  }

  public PreviewLaunchLinkRequestSchema addAdditionalvaluesItem(ItemValuePairSchema additionalvaluesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewLaunchLinkRequestSchema previewLaunchLinkRequestSchema = (PreviewLaunchLinkRequestSchema) o;
    return Objects.equals(this.expiry, previewLaunchLinkRequestSchema.expiry) &&
        Objects.equals(this.redirectOnExitUrl, previewLaunchLinkRequestSchema.redirectOnExitUrl) &&
        Objects.equals(this.startSco, previewLaunchLinkRequestSchema.startSco) &&
        Objects.equals(this.culture, previewLaunchLinkRequestSchema.culture) &&
        Objects.equals(this.cssUrl, previewLaunchLinkRequestSchema.cssUrl) &&
        Objects.equals(this.additionalvalues, previewLaunchLinkRequestSchema.additionalvalues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, redirectOnExitUrl, startSco, culture, cssUrl, additionalvalues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewLaunchLinkRequestSchema {\n");
    
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    redirectOnExitUrl: ").append(toIndentedString(redirectOnExitUrl)).append("\n");
    sb.append("    startSco: ").append(toIndentedString(startSco)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    cssUrl: ").append(toIndentedString(cssUrl)).append("\n");
    sb.append("    additionalvalues: ").append(toIndentedString(additionalvalues)).append("\n");
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
