/**
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0 beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.rusticisoftware.cloud.v2.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rusticisoftware.cloud.v2.client.model.CommentSchema;
import com.rusticisoftware.cloud.v2.client.model.LearnerPreferenceSchema;
import com.rusticisoftware.cloud.v2.client.model.RuntimeInteractionSchema;
import com.rusticisoftware.cloud.v2.client.model.RuntimeObjectiveSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * RuntimeSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T23:53:56.635-05:00")
public class RuntimeSchema   {
  @JsonProperty("completionStatus")
  private String completionStatus = null;

  @JsonProperty("credit")
  private String credit = null;

  @JsonProperty("entry")
  private String entry = null;

  @JsonProperty("exit")
  private String exit = null;

  @JsonProperty("learnerPreference")
  private LearnerPreferenceSchema learnerPreference = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("progressMeasure")
  private String progressMeasure = null;

  @JsonProperty("scoreScaled")
  private String scoreScaled = null;

  @JsonProperty("scoreRaw")
  private String scoreRaw = null;

  @JsonProperty("scoreMin")
  private String scoreMin = null;

  @JsonProperty("scoreMax")
  private String scoreMax = null;

  @JsonProperty("totalTime")
  private String totalTime = null;

  @JsonProperty("timeTracked")
  private String timeTracked = null;

  /**
   * Gets or Sets runtimeSuccessStatus
   */
  public enum RuntimeSuccessStatusEnum {
    UNKNOWN("UNKNOWN"),
    
    PASSED("PASSED"),
    
    FAILED("FAILED");

    private String value;

    RuntimeSuccessStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RuntimeSuccessStatusEnum fromValue(String text) {
      for (RuntimeSuccessStatusEnum b : RuntimeSuccessStatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("runtimeSuccessStatus")
  private RuntimeSuccessStatusEnum runtimeSuccessStatus = RuntimeSuccessStatusEnum.UNKNOWN;

  @JsonProperty("suspendData")
  private String suspendData = null;

  @JsonProperty("learnerComments")
  private List<CommentSchema> learnerComments = new ArrayList<CommentSchema>();

  @JsonProperty("lmsComments")
  private List<CommentSchema> lmsComments = new ArrayList<CommentSchema>();

  @JsonProperty("runtimeInteractions")
  private List<RuntimeInteractionSchema> runtimeInteractions = new ArrayList<RuntimeInteractionSchema>();

  @JsonProperty("runtimeObjectives")
  private List<RuntimeObjectiveSchema> runtimeObjectives = new ArrayList<RuntimeObjectiveSchema>();

  public RuntimeSchema completionStatus(String completionStatus) {
    this.completionStatus = completionStatus;
    return this;
  }

   /**
   * Get completionStatus
   * @return completionStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompletionStatus() {
    return completionStatus;
  }

  public void setCompletionStatus(String completionStatus) {
    this.completionStatus = completionStatus;
  }

  public RuntimeSchema credit(String credit) {
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCredit() {
    return credit;
  }

  public void setCredit(String credit) {
    this.credit = credit;
  }

  public RuntimeSchema entry(String entry) {
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEntry() {
    return entry;
  }

  public void setEntry(String entry) {
    this.entry = entry;
  }

  public RuntimeSchema exit(String exit) {
    this.exit = exit;
    return this;
  }

   /**
   * Get exit
   * @return exit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExit() {
    return exit;
  }

  public void setExit(String exit) {
    this.exit = exit;
  }

  public RuntimeSchema learnerPreference(LearnerPreferenceSchema learnerPreference) {
    this.learnerPreference = learnerPreference;
    return this;
  }

   /**
   * Get learnerPreference
   * @return learnerPreference
  **/
  @ApiModelProperty(example = "null", value = "")
  public LearnerPreferenceSchema getLearnerPreference() {
    return learnerPreference;
  }

  public void setLearnerPreference(LearnerPreferenceSchema learnerPreference) {
    this.learnerPreference = learnerPreference;
  }

  public RuntimeSchema location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public RuntimeSchema mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public RuntimeSchema progressMeasure(String progressMeasure) {
    this.progressMeasure = progressMeasure;
    return this;
  }

   /**
   * Get progressMeasure
   * @return progressMeasure
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProgressMeasure() {
    return progressMeasure;
  }

  public void setProgressMeasure(String progressMeasure) {
    this.progressMeasure = progressMeasure;
  }

  public RuntimeSchema scoreScaled(String scoreScaled) {
    this.scoreScaled = scoreScaled;
    return this;
  }

   /**
   * Get scoreScaled
   * @return scoreScaled
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScoreScaled() {
    return scoreScaled;
  }

  public void setScoreScaled(String scoreScaled) {
    this.scoreScaled = scoreScaled;
  }

  public RuntimeSchema scoreRaw(String scoreRaw) {
    this.scoreRaw = scoreRaw;
    return this;
  }

   /**
   * Get scoreRaw
   * @return scoreRaw
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScoreRaw() {
    return scoreRaw;
  }

  public void setScoreRaw(String scoreRaw) {
    this.scoreRaw = scoreRaw;
  }

  public RuntimeSchema scoreMin(String scoreMin) {
    this.scoreMin = scoreMin;
    return this;
  }

   /**
   * Get scoreMin
   * @return scoreMin
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScoreMin() {
    return scoreMin;
  }

  public void setScoreMin(String scoreMin) {
    this.scoreMin = scoreMin;
  }

  public RuntimeSchema scoreMax(String scoreMax) {
    this.scoreMax = scoreMax;
    return this;
  }

   /**
   * Get scoreMax
   * @return scoreMax
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScoreMax() {
    return scoreMax;
  }

  public void setScoreMax(String scoreMax) {
    this.scoreMax = scoreMax;
  }

  public RuntimeSchema totalTime(String totalTime) {
    this.totalTime = totalTime;
    return this;
  }

   /**
   * Get totalTime
   * @return totalTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(String totalTime) {
    this.totalTime = totalTime;
  }

  public RuntimeSchema timeTracked(String timeTracked) {
    this.timeTracked = timeTracked;
    return this;
  }

   /**
   * Get timeTracked
   * @return timeTracked
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimeTracked() {
    return timeTracked;
  }

  public void setTimeTracked(String timeTracked) {
    this.timeTracked = timeTracked;
  }

  public RuntimeSchema runtimeSuccessStatus(RuntimeSuccessStatusEnum runtimeSuccessStatus) {
    this.runtimeSuccessStatus = runtimeSuccessStatus;
    return this;
  }

   /**
   * Get runtimeSuccessStatus
   * @return runtimeSuccessStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuntimeSuccessStatusEnum getRuntimeSuccessStatus() {
    return runtimeSuccessStatus;
  }

  public void setRuntimeSuccessStatus(RuntimeSuccessStatusEnum runtimeSuccessStatus) {
    this.runtimeSuccessStatus = runtimeSuccessStatus;
  }

  public RuntimeSchema suspendData(String suspendData) {
    this.suspendData = suspendData;
    return this;
  }

   /**
   * Get suspendData
   * @return suspendData
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuspendData() {
    return suspendData;
  }

  public void setSuspendData(String suspendData) {
    this.suspendData = suspendData;
  }

  public RuntimeSchema learnerComments(List<CommentSchema> learnerComments) {
    this.learnerComments = learnerComments;
    return this;
  }

  public RuntimeSchema addLearnerCommentsItem(CommentSchema learnerCommentsItem) {
    this.learnerComments.add(learnerCommentsItem);
    return this;
  }

   /**
   * Get learnerComments
   * @return learnerComments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CommentSchema> getLearnerComments() {
    return learnerComments;
  }

  public void setLearnerComments(List<CommentSchema> learnerComments) {
    this.learnerComments = learnerComments;
  }

  public RuntimeSchema lmsComments(List<CommentSchema> lmsComments) {
    this.lmsComments = lmsComments;
    return this;
  }

  public RuntimeSchema addLmsCommentsItem(CommentSchema lmsCommentsItem) {
    this.lmsComments.add(lmsCommentsItem);
    return this;
  }

   /**
   * Get lmsComments
   * @return lmsComments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CommentSchema> getLmsComments() {
    return lmsComments;
  }

  public void setLmsComments(List<CommentSchema> lmsComments) {
    this.lmsComments = lmsComments;
  }

  public RuntimeSchema runtimeInteractions(List<RuntimeInteractionSchema> runtimeInteractions) {
    this.runtimeInteractions = runtimeInteractions;
    return this;
  }

  public RuntimeSchema addRuntimeInteractionsItem(RuntimeInteractionSchema runtimeInteractionsItem) {
    this.runtimeInteractions.add(runtimeInteractionsItem);
    return this;
  }

   /**
   * Get runtimeInteractions
   * @return runtimeInteractions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RuntimeInteractionSchema> getRuntimeInteractions() {
    return runtimeInteractions;
  }

  public void setRuntimeInteractions(List<RuntimeInteractionSchema> runtimeInteractions) {
    this.runtimeInteractions = runtimeInteractions;
  }

  public RuntimeSchema runtimeObjectives(List<RuntimeObjectiveSchema> runtimeObjectives) {
    this.runtimeObjectives = runtimeObjectives;
    return this;
  }

  public RuntimeSchema addRuntimeObjectivesItem(RuntimeObjectiveSchema runtimeObjectivesItem) {
    this.runtimeObjectives.add(runtimeObjectivesItem);
    return this;
  }

   /**
   * Get runtimeObjectives
   * @return runtimeObjectives
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RuntimeObjectiveSchema> getRuntimeObjectives() {
    return runtimeObjectives;
  }

  public void setRuntimeObjectives(List<RuntimeObjectiveSchema> runtimeObjectives) {
    this.runtimeObjectives = runtimeObjectives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeSchema runtimeSchema = (RuntimeSchema) o;
    return Objects.equals(this.completionStatus, runtimeSchema.completionStatus) &&
        Objects.equals(this.credit, runtimeSchema.credit) &&
        Objects.equals(this.entry, runtimeSchema.entry) &&
        Objects.equals(this.exit, runtimeSchema.exit) &&
        Objects.equals(this.learnerPreference, runtimeSchema.learnerPreference) &&
        Objects.equals(this.location, runtimeSchema.location) &&
        Objects.equals(this.mode, runtimeSchema.mode) &&
        Objects.equals(this.progressMeasure, runtimeSchema.progressMeasure) &&
        Objects.equals(this.scoreScaled, runtimeSchema.scoreScaled) &&
        Objects.equals(this.scoreRaw, runtimeSchema.scoreRaw) &&
        Objects.equals(this.scoreMin, runtimeSchema.scoreMin) &&
        Objects.equals(this.scoreMax, runtimeSchema.scoreMax) &&
        Objects.equals(this.totalTime, runtimeSchema.totalTime) &&
        Objects.equals(this.timeTracked, runtimeSchema.timeTracked) &&
        Objects.equals(this.runtimeSuccessStatus, runtimeSchema.runtimeSuccessStatus) &&
        Objects.equals(this.suspendData, runtimeSchema.suspendData) &&
        Objects.equals(this.learnerComments, runtimeSchema.learnerComments) &&
        Objects.equals(this.lmsComments, runtimeSchema.lmsComments) &&
        Objects.equals(this.runtimeInteractions, runtimeSchema.runtimeInteractions) &&
        Objects.equals(this.runtimeObjectives, runtimeSchema.runtimeObjectives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionStatus, credit, entry, exit, learnerPreference, location, mode, progressMeasure, scoreScaled, scoreRaw, scoreMin, scoreMax, totalTime, timeTracked, runtimeSuccessStatus, suspendData, learnerComments, lmsComments, runtimeInteractions, runtimeObjectives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeSchema {\n");
    
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
    sb.append("    exit: ").append(toIndentedString(exit)).append("\n");
    sb.append("    learnerPreference: ").append(toIndentedString(learnerPreference)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    progressMeasure: ").append(toIndentedString(progressMeasure)).append("\n");
    sb.append("    scoreScaled: ").append(toIndentedString(scoreScaled)).append("\n");
    sb.append("    scoreRaw: ").append(toIndentedString(scoreRaw)).append("\n");
    sb.append("    scoreMin: ").append(toIndentedString(scoreMin)).append("\n");
    sb.append("    scoreMax: ").append(toIndentedString(scoreMax)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    timeTracked: ").append(toIndentedString(timeTracked)).append("\n");
    sb.append("    runtimeSuccessStatus: ").append(toIndentedString(runtimeSuccessStatus)).append("\n");
    sb.append("    suspendData: ").append(toIndentedString(suspendData)).append("\n");
    sb.append("    learnerComments: ").append(toIndentedString(learnerComments)).append("\n");
    sb.append("    lmsComments: ").append(toIndentedString(lmsComments)).append("\n");
    sb.append("    runtimeInteractions: ").append(toIndentedString(runtimeInteractions)).append("\n");
    sb.append("    runtimeObjectives: ").append(toIndentedString(runtimeObjectives)).append("\n");
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

