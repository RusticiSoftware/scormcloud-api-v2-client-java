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
import com.rusticisoftware.cloud.v2.client.model.ScoreSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * LaunchHistorySchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class LaunchHistorySchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instance")
  private Integer instance = null;

  @JsonProperty("score")
  private ScoreSchema score = null;

  /**
   * Gets or Sets completionStatus
   */
  public enum CompletionStatusEnum {
    UNKNOWN("UNKNOWN"),
    
    COMPLETED("COMPLETED"),
    
    INCOMPLETE("INCOMPLETE");

    private String value;

    CompletionStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CompletionStatusEnum fromValue(String value) {
      for (CompletionStatusEnum b : CompletionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("completionStatus")
  private CompletionStatusEnum completionStatus = CompletionStatusEnum.UNKNOWN;

  /**
   * Gets or Sets successStatus
   */
  public enum SuccessStatusEnum {
    UNKNOWN("UNKNOWN"),
    
    PASSED("PASSED"),
    
    FAILED("FAILED");

    private String value;

    SuccessStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SuccessStatusEnum fromValue(String value) {
      for (SuccessStatusEnum b : SuccessStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("successStatus")
  private SuccessStatusEnum successStatus = SuccessStatusEnum.UNKNOWN;

  @JsonProperty("historyLog")
  private String historyLog = null;

  @JsonProperty("totalSecondsTracked")
  private Double totalSecondsTracked = null;

  @JsonProperty("launchTime")
  private OffsetDateTime launchTime = null;

  @JsonProperty("exitTime")
  private OffsetDateTime exitTime = null;

  @JsonProperty("lastRuntimeUpdate")
  private OffsetDateTime lastRuntimeUpdate = null;

  public LaunchHistorySchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LaunchHistorySchema instance(Integer instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   * @return instance
  **/
  @ApiModelProperty(value = "")
  public Integer getInstance() {
    return instance;
  }

  public void setInstance(Integer instance) {
    this.instance = instance;
  }

  public LaunchHistorySchema score(ScoreSchema score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public ScoreSchema getScore() {
    return score;
  }

  public void setScore(ScoreSchema score) {
    this.score = score;
  }

  public LaunchHistorySchema completionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
    return this;
  }

  /**
   * Get completionStatus
   * @return completionStatus
  **/
  @ApiModelProperty(value = "")
  public CompletionStatusEnum getCompletionStatus() {
    return completionStatus;
  }

  public void setCompletionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
  }

  public LaunchHistorySchema successStatus(SuccessStatusEnum successStatus) {
    this.successStatus = successStatus;
    return this;
  }

  /**
   * Get successStatus
   * @return successStatus
  **/
  @ApiModelProperty(value = "")
  public SuccessStatusEnum getSuccessStatus() {
    return successStatus;
  }

  public void setSuccessStatus(SuccessStatusEnum successStatus) {
    this.successStatus = successStatus;
  }

  public LaunchHistorySchema historyLog(String historyLog) {
    this.historyLog = historyLog;
    return this;
  }

  /**
   * Get historyLog
   * @return historyLog
  **/
  @ApiModelProperty(value = "")
  public String getHistoryLog() {
    return historyLog;
  }

  public void setHistoryLog(String historyLog) {
    this.historyLog = historyLog;
  }

  public LaunchHistorySchema totalSecondsTracked(Double totalSecondsTracked) {
    this.totalSecondsTracked = totalSecondsTracked;
    return this;
  }

  /**
   * Get totalSecondsTracked
   * @return totalSecondsTracked
  **/
  @ApiModelProperty(value = "")
  public Double getTotalSecondsTracked() {
    return totalSecondsTracked;
  }

  public void setTotalSecondsTracked(Double totalSecondsTracked) {
    this.totalSecondsTracked = totalSecondsTracked;
  }

  public LaunchHistorySchema launchTime(OffsetDateTime launchTime) {
    this.launchTime = launchTime;
    return this;
  }

  /**
   * The time of the launch in UTC
   * @return launchTime
  **/
  @ApiModelProperty(value = "The time of the launch in UTC")
  public OffsetDateTime getLaunchTime() {
    return launchTime;
  }

  public void setLaunchTime(OffsetDateTime launchTime) {
    this.launchTime = launchTime;
  }

  public LaunchHistorySchema exitTime(OffsetDateTime exitTime) {
    this.exitTime = exitTime;
    return this;
  }

  /**
   * The time of the exit in UTC
   * @return exitTime
  **/
  @ApiModelProperty(value = "The time of the exit in UTC")
  public OffsetDateTime getExitTime() {
    return exitTime;
  }

  public void setExitTime(OffsetDateTime exitTime) {
    this.exitTime = exitTime;
  }

  public LaunchHistorySchema lastRuntimeUpdate(OffsetDateTime lastRuntimeUpdate) {
    this.lastRuntimeUpdate = lastRuntimeUpdate;
    return this;
  }

  /**
   * The time of the last runtime update in UTC
   * @return lastRuntimeUpdate
  **/
  @ApiModelProperty(value = "The time of the last runtime update in UTC")
  public OffsetDateTime getLastRuntimeUpdate() {
    return lastRuntimeUpdate;
  }

  public void setLastRuntimeUpdate(OffsetDateTime lastRuntimeUpdate) {
    this.lastRuntimeUpdate = lastRuntimeUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchHistorySchema launchHistorySchema = (LaunchHistorySchema) o;
    return Objects.equals(this.id, launchHistorySchema.id) &&
        Objects.equals(this.instance, launchHistorySchema.instance) &&
        Objects.equals(this.score, launchHistorySchema.score) &&
        Objects.equals(this.completionStatus, launchHistorySchema.completionStatus) &&
        Objects.equals(this.successStatus, launchHistorySchema.successStatus) &&
        Objects.equals(this.historyLog, launchHistorySchema.historyLog) &&
        Objects.equals(this.totalSecondsTracked, launchHistorySchema.totalSecondsTracked) &&
        Objects.equals(this.launchTime, launchHistorySchema.launchTime) &&
        Objects.equals(this.exitTime, launchHistorySchema.exitTime) &&
        Objects.equals(this.lastRuntimeUpdate, launchHistorySchema.lastRuntimeUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instance, score, completionStatus, successStatus, historyLog, totalSecondsTracked, launchTime, exitTime, lastRuntimeUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchHistorySchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    successStatus: ").append(toIndentedString(successStatus)).append("\n");
    sb.append("    historyLog: ").append(toIndentedString(historyLog)).append("\n");
    sb.append("    totalSecondsTracked: ").append(toIndentedString(totalSecondsTracked)).append("\n");
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    exitTime: ").append(toIndentedString(exitTime)).append("\n");
    sb.append("    lastRuntimeUpdate: ").append(toIndentedString(lastRuntimeUpdate)).append("\n");
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

