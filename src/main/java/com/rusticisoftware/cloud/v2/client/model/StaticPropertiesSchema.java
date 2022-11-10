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
 * StaticPropertiesSchema
 */
public class StaticPropertiesSchema {
  @JsonProperty("completionThreshold")
  private String completionThreshold = null;

  @JsonProperty("launchData")
  private String launchData = null;

  @JsonProperty("maxTimeAllowed")
  private String maxTimeAllowed = null;

  @JsonProperty("scaledPassingScore")
  private Double scaledPassingScore = null;

  @JsonProperty("scaledPassingScoreUsed")
  private Boolean scaledPassingScoreUsed = null;

  @JsonProperty("timeLimitAction")
  private String timeLimitAction = null;

  public StaticPropertiesSchema completionThreshold(String completionThreshold) {
    this.completionThreshold = completionThreshold;
    return this;
  }

  /**
   * Get completionThreshold
   * @return completionThreshold
  **/
  @ApiModelProperty(value = "")
  public String getCompletionThreshold() {
    return completionThreshold;
  }

  public void setCompletionThreshold(String completionThreshold) {
    this.completionThreshold = completionThreshold;
  }

  public StaticPropertiesSchema launchData(String launchData) {
    this.launchData = launchData;
    return this;
  }

  /**
   * Get launchData
   * @return launchData
  **/
  @ApiModelProperty(value = "")
  public String getLaunchData() {
    return launchData;
  }

  public void setLaunchData(String launchData) {
    this.launchData = launchData;
  }

  public StaticPropertiesSchema maxTimeAllowed(String maxTimeAllowed) {
    this.maxTimeAllowed = maxTimeAllowed;
    return this;
  }

  /**
   * Get maxTimeAllowed
   * @return maxTimeAllowed
  **/
  @ApiModelProperty(value = "")
  public String getMaxTimeAllowed() {
    return maxTimeAllowed;
  }

  public void setMaxTimeAllowed(String maxTimeAllowed) {
    this.maxTimeAllowed = maxTimeAllowed;
  }

  public StaticPropertiesSchema scaledPassingScore(Double scaledPassingScore) {
    this.scaledPassingScore = scaledPassingScore;
    return this;
  }

  /**
   * Get scaledPassingScore
   * @return scaledPassingScore
  **/
  @ApiModelProperty(value = "")
  public Double getScaledPassingScore() {
    return scaledPassingScore;
  }

  public void setScaledPassingScore(Double scaledPassingScore) {
    this.scaledPassingScore = scaledPassingScore;
  }

  public StaticPropertiesSchema scaledPassingScoreUsed(Boolean scaledPassingScoreUsed) {
    this.scaledPassingScoreUsed = scaledPassingScoreUsed;
    return this;
  }

  /**
   * Get scaledPassingScoreUsed
   * @return scaledPassingScoreUsed
  **/
  @ApiModelProperty(value = "")
  public Boolean isScaledPassingScoreUsed() {
    return scaledPassingScoreUsed;
  }

  public void setScaledPassingScoreUsed(Boolean scaledPassingScoreUsed) {
    this.scaledPassingScoreUsed = scaledPassingScoreUsed;
  }

  public StaticPropertiesSchema timeLimitAction(String timeLimitAction) {
    this.timeLimitAction = timeLimitAction;
    return this;
  }

  /**
   * Get timeLimitAction
   * @return timeLimitAction
  **/
  @ApiModelProperty(value = "")
  public String getTimeLimitAction() {
    return timeLimitAction;
  }

  public void setTimeLimitAction(String timeLimitAction) {
    this.timeLimitAction = timeLimitAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticPropertiesSchema staticPropertiesSchema = (StaticPropertiesSchema) o;
    return Objects.equals(this.completionThreshold, staticPropertiesSchema.completionThreshold) &&
        Objects.equals(this.launchData, staticPropertiesSchema.launchData) &&
        Objects.equals(this.maxTimeAllowed, staticPropertiesSchema.maxTimeAllowed) &&
        Objects.equals(this.scaledPassingScore, staticPropertiesSchema.scaledPassingScore) &&
        Objects.equals(this.scaledPassingScoreUsed, staticPropertiesSchema.scaledPassingScoreUsed) &&
        Objects.equals(this.timeLimitAction, staticPropertiesSchema.timeLimitAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionThreshold, launchData, maxTimeAllowed, scaledPassingScore, scaledPassingScoreUsed, timeLimitAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticPropertiesSchema {\n");
    
    sb.append("    completionThreshold: ").append(toIndentedString(completionThreshold)).append("\n");
    sb.append("    launchData: ").append(toIndentedString(launchData)).append("\n");
    sb.append("    maxTimeAllowed: ").append(toIndentedString(maxTimeAllowed)).append("\n");
    sb.append("    scaledPassingScore: ").append(toIndentedString(scaledPassingScore)).append("\n");
    sb.append("    scaledPassingScoreUsed: ").append(toIndentedString(scaledPassingScoreUsed)).append("\n");
    sb.append("    timeLimitAction: ").append(toIndentedString(timeLimitAction)).append("\n");
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

