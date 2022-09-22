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
 * RuntimeObjectiveSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class RuntimeObjectiveSchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("scoreScaled")
  private String scoreScaled = null;

  @JsonProperty("scoreMin")
  private String scoreMin = null;

  @JsonProperty("scoreMax")
  private String scoreMax = null;

  @JsonProperty("scoreRaw")
  private String scoreRaw = null;

  /**
   * Gets or Sets runtimeObjectiveSuccessStatus
   */
  public enum RuntimeObjectiveSuccessStatusEnum {
    UNKNOWN("UNKNOWN"),
    
    PASSED("PASSED"),
    
    FAILED("FAILED");

    private String value;

    RuntimeObjectiveSuccessStatusEnum(String value) {
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
    public static RuntimeObjectiveSuccessStatusEnum fromValue(String value) {
      for (RuntimeObjectiveSuccessStatusEnum b : RuntimeObjectiveSuccessStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("runtimeObjectiveSuccessStatus")
  private RuntimeObjectiveSuccessStatusEnum runtimeObjectiveSuccessStatus = RuntimeObjectiveSuccessStatusEnum.UNKNOWN;

  /**
   * Gets or Sets runtimeObjectiveCompletionStatus
   */
  public enum RuntimeObjectiveCompletionStatusEnum {
    UNKNOWN("UNKNOWN"),
    
    COMPLETED("COMPLETED"),
    
    INCOMPLETE("INCOMPLETE"),
    
    NOT_ATTEMPTED("NOT_ATTEMPTED"),
    
    BROWSED("BROWSED");

    private String value;

    RuntimeObjectiveCompletionStatusEnum(String value) {
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
    public static RuntimeObjectiveCompletionStatusEnum fromValue(String value) {
      for (RuntimeObjectiveCompletionStatusEnum b : RuntimeObjectiveCompletionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("runtimeObjectiveCompletionStatus")
  private RuntimeObjectiveCompletionStatusEnum runtimeObjectiveCompletionStatus = RuntimeObjectiveCompletionStatusEnum.UNKNOWN;

  @JsonProperty("progressMeasure")
  private String progressMeasure = null;

  @JsonProperty("description")
  private String description = null;

  public RuntimeObjectiveSchema id(String id) {
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

  public RuntimeObjectiveSchema scoreScaled(String scoreScaled) {
    this.scoreScaled = scoreScaled;
    return this;
  }

  /**
   * Get scoreScaled
   * @return scoreScaled
  **/
  @ApiModelProperty(value = "")
  public String getScoreScaled() {
    return scoreScaled;
  }

  public void setScoreScaled(String scoreScaled) {
    this.scoreScaled = scoreScaled;
  }

  public RuntimeObjectiveSchema scoreMin(String scoreMin) {
    this.scoreMin = scoreMin;
    return this;
  }

  /**
   * Get scoreMin
   * @return scoreMin
  **/
  @ApiModelProperty(value = "")
  public String getScoreMin() {
    return scoreMin;
  }

  public void setScoreMin(String scoreMin) {
    this.scoreMin = scoreMin;
  }

  public RuntimeObjectiveSchema scoreMax(String scoreMax) {
    this.scoreMax = scoreMax;
    return this;
  }

  /**
   * Get scoreMax
   * @return scoreMax
  **/
  @ApiModelProperty(value = "")
  public String getScoreMax() {
    return scoreMax;
  }

  public void setScoreMax(String scoreMax) {
    this.scoreMax = scoreMax;
  }

  public RuntimeObjectiveSchema scoreRaw(String scoreRaw) {
    this.scoreRaw = scoreRaw;
    return this;
  }

  /**
   * Get scoreRaw
   * @return scoreRaw
  **/
  @ApiModelProperty(value = "")
  public String getScoreRaw() {
    return scoreRaw;
  }

  public void setScoreRaw(String scoreRaw) {
    this.scoreRaw = scoreRaw;
  }

  public RuntimeObjectiveSchema runtimeObjectiveSuccessStatus(RuntimeObjectiveSuccessStatusEnum runtimeObjectiveSuccessStatus) {
    this.runtimeObjectiveSuccessStatus = runtimeObjectiveSuccessStatus;
    return this;
  }

  /**
   * Get runtimeObjectiveSuccessStatus
   * @return runtimeObjectiveSuccessStatus
  **/
  @ApiModelProperty(value = "")
  public RuntimeObjectiveSuccessStatusEnum getRuntimeObjectiveSuccessStatus() {
    return runtimeObjectiveSuccessStatus;
  }

  public void setRuntimeObjectiveSuccessStatus(RuntimeObjectiveSuccessStatusEnum runtimeObjectiveSuccessStatus) {
    this.runtimeObjectiveSuccessStatus = runtimeObjectiveSuccessStatus;
  }

  public RuntimeObjectiveSchema runtimeObjectiveCompletionStatus(RuntimeObjectiveCompletionStatusEnum runtimeObjectiveCompletionStatus) {
    this.runtimeObjectiveCompletionStatus = runtimeObjectiveCompletionStatus;
    return this;
  }

  /**
   * Get runtimeObjectiveCompletionStatus
   * @return runtimeObjectiveCompletionStatus
  **/
  @ApiModelProperty(value = "")
  public RuntimeObjectiveCompletionStatusEnum getRuntimeObjectiveCompletionStatus() {
    return runtimeObjectiveCompletionStatus;
  }

  public void setRuntimeObjectiveCompletionStatus(RuntimeObjectiveCompletionStatusEnum runtimeObjectiveCompletionStatus) {
    this.runtimeObjectiveCompletionStatus = runtimeObjectiveCompletionStatus;
  }

  public RuntimeObjectiveSchema progressMeasure(String progressMeasure) {
    this.progressMeasure = progressMeasure;
    return this;
  }

  /**
   * Get progressMeasure
   * @return progressMeasure
  **/
  @ApiModelProperty(value = "")
  public String getProgressMeasure() {
    return progressMeasure;
  }

  public void setProgressMeasure(String progressMeasure) {
    this.progressMeasure = progressMeasure;
  }

  public RuntimeObjectiveSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeObjectiveSchema runtimeObjectiveSchema = (RuntimeObjectiveSchema) o;
    return Objects.equals(this.id, runtimeObjectiveSchema.id) &&
        Objects.equals(this.scoreScaled, runtimeObjectiveSchema.scoreScaled) &&
        Objects.equals(this.scoreMin, runtimeObjectiveSchema.scoreMin) &&
        Objects.equals(this.scoreMax, runtimeObjectiveSchema.scoreMax) &&
        Objects.equals(this.scoreRaw, runtimeObjectiveSchema.scoreRaw) &&
        Objects.equals(this.runtimeObjectiveSuccessStatus, runtimeObjectiveSchema.runtimeObjectiveSuccessStatus) &&
        Objects.equals(this.runtimeObjectiveCompletionStatus, runtimeObjectiveSchema.runtimeObjectiveCompletionStatus) &&
        Objects.equals(this.progressMeasure, runtimeObjectiveSchema.progressMeasure) &&
        Objects.equals(this.description, runtimeObjectiveSchema.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scoreScaled, scoreMin, scoreMax, scoreRaw, runtimeObjectiveSuccessStatus, runtimeObjectiveCompletionStatus, progressMeasure, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeObjectiveSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scoreScaled: ").append(toIndentedString(scoreScaled)).append("\n");
    sb.append("    scoreMin: ").append(toIndentedString(scoreMin)).append("\n");
    sb.append("    scoreMax: ").append(toIndentedString(scoreMax)).append("\n");
    sb.append("    scoreRaw: ").append(toIndentedString(scoreRaw)).append("\n");
    sb.append("    runtimeObjectiveSuccessStatus: ").append(toIndentedString(runtimeObjectiveSuccessStatus)).append("\n");
    sb.append("    runtimeObjectiveCompletionStatus: ").append(toIndentedString(runtimeObjectiveCompletionStatus)).append("\n");
    sb.append("    progressMeasure: ").append(toIndentedString(progressMeasure)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

