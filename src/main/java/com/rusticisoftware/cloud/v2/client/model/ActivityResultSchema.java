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
import com.rusticisoftware.cloud.v2.client.model.ActivityResultSchema;
import com.rusticisoftware.cloud.v2.client.model.CompletionAmountSchema;
import com.rusticisoftware.cloud.v2.client.model.ObjectiveSchema;
import com.rusticisoftware.cloud.v2.client.model.RuntimeSchema;
import com.rusticisoftware.cloud.v2.client.model.ScoreSchema;
import com.rusticisoftware.cloud.v2.client.model.StaticPropertiesSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ActivityResultSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T23:53:56.635-05:00")
public class ActivityResultSchema   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("attempts")
  private Integer attempts = null;

  /**
   * Gets or Sets activityCompletion
   */
  public enum ActivityCompletionEnum {
    UNKNOWN("UNKNOWN"),
    
    COMPLETED("COMPLETED"),
    
    INCOMPLETE("INCOMPLETE");

    private String value;

    ActivityCompletionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActivityCompletionEnum fromValue(String text) {
      for (ActivityCompletionEnum b : ActivityCompletionEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("activityCompletion")
  private ActivityCompletionEnum activityCompletion = null;

  /**
   * Gets or Sets activitySuccess
   */
  public enum ActivitySuccessEnum {
    UNKNOWN("UNKNOWN"),
    
    PASSED("PASSED"),
    
    FAILED("FAILED");

    private String value;

    ActivitySuccessEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActivitySuccessEnum fromValue(String text) {
      for (ActivitySuccessEnum b : ActivitySuccessEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("activitySuccess")
  private ActivitySuccessEnum activitySuccess = null;

  @JsonProperty("score")
  private ScoreSchema score = null;

  @JsonProperty("timeTracked")
  private String timeTracked = null;

  @JsonProperty("completionAmount")
  private CompletionAmountSchema completionAmount = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("children")
  private List<ActivityResultSchema> children = new ArrayList<ActivityResultSchema>();

  @JsonProperty("objectives")
  private List<ObjectiveSchema> objectives = new ArrayList<ObjectiveSchema>();

  @JsonProperty("staticProperties")
  private StaticPropertiesSchema staticProperties = null;

  @JsonProperty("runtime")
  private RuntimeSchema runtime = null;

  public ActivityResultSchema id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActivityResultSchema title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ActivityResultSchema attempts(Integer attempts) {
    this.attempts = attempts;
    return this;
  }

   /**
   * Get attempts
   * @return attempts
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAttempts() {
    return attempts;
  }

  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }

  public ActivityResultSchema activityCompletion(ActivityCompletionEnum activityCompletion) {
    this.activityCompletion = activityCompletion;
    return this;
  }

   /**
   * Get activityCompletion
   * @return activityCompletion
  **/
  @ApiModelProperty(example = "null", value = "")
  public ActivityCompletionEnum getActivityCompletion() {
    return activityCompletion;
  }

  public void setActivityCompletion(ActivityCompletionEnum activityCompletion) {
    this.activityCompletion = activityCompletion;
  }

  public ActivityResultSchema activitySuccess(ActivitySuccessEnum activitySuccess) {
    this.activitySuccess = activitySuccess;
    return this;
  }

   /**
   * Get activitySuccess
   * @return activitySuccess
  **/
  @ApiModelProperty(example = "null", value = "")
  public ActivitySuccessEnum getActivitySuccess() {
    return activitySuccess;
  }

  public void setActivitySuccess(ActivitySuccessEnum activitySuccess) {
    this.activitySuccess = activitySuccess;
  }

  public ActivityResultSchema score(ScoreSchema score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public ScoreSchema getScore() {
    return score;
  }

  public void setScore(ScoreSchema score) {
    this.score = score;
  }

  public ActivityResultSchema timeTracked(String timeTracked) {
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

  public ActivityResultSchema completionAmount(CompletionAmountSchema completionAmount) {
    this.completionAmount = completionAmount;
    return this;
  }

   /**
   * Get completionAmount
   * @return completionAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public CompletionAmountSchema getCompletionAmount() {
    return completionAmount;
  }

  public void setCompletionAmount(CompletionAmountSchema completionAmount) {
    this.completionAmount = completionAmount;
  }

  public ActivityResultSchema suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Get suspended
   * @return suspended
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ActivityResultSchema children(List<ActivityResultSchema> children) {
    this.children = children;
    return this;
  }

  public ActivityResultSchema addChildrenItem(ActivityResultSchema childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ActivityResultSchema> getChildren() {
    return children;
  }

  public void setChildren(List<ActivityResultSchema> children) {
    this.children = children;
  }

  public ActivityResultSchema objectives(List<ObjectiveSchema> objectives) {
    this.objectives = objectives;
    return this;
  }

  public ActivityResultSchema addObjectivesItem(ObjectiveSchema objectivesItem) {
    this.objectives.add(objectivesItem);
    return this;
  }

   /**
   * Get objectives
   * @return objectives
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ObjectiveSchema> getObjectives() {
    return objectives;
  }

  public void setObjectives(List<ObjectiveSchema> objectives) {
    this.objectives = objectives;
  }

  public ActivityResultSchema staticProperties(StaticPropertiesSchema staticProperties) {
    this.staticProperties = staticProperties;
    return this;
  }

   /**
   * Get staticProperties
   * @return staticProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public StaticPropertiesSchema getStaticProperties() {
    return staticProperties;
  }

  public void setStaticProperties(StaticPropertiesSchema staticProperties) {
    this.staticProperties = staticProperties;
  }

  public ActivityResultSchema runtime(RuntimeSchema runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuntimeSchema getRuntime() {
    return runtime;
  }

  public void setRuntime(RuntimeSchema runtime) {
    this.runtime = runtime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityResultSchema activityResultSchema = (ActivityResultSchema) o;
    return Objects.equals(this.id, activityResultSchema.id) &&
        Objects.equals(this.title, activityResultSchema.title) &&
        Objects.equals(this.attempts, activityResultSchema.attempts) &&
        Objects.equals(this.activityCompletion, activityResultSchema.activityCompletion) &&
        Objects.equals(this.activitySuccess, activityResultSchema.activitySuccess) &&
        Objects.equals(this.score, activityResultSchema.score) &&
        Objects.equals(this.timeTracked, activityResultSchema.timeTracked) &&
        Objects.equals(this.completionAmount, activityResultSchema.completionAmount) &&
        Objects.equals(this.suspended, activityResultSchema.suspended) &&
        Objects.equals(this.children, activityResultSchema.children) &&
        Objects.equals(this.objectives, activityResultSchema.objectives) &&
        Objects.equals(this.staticProperties, activityResultSchema.staticProperties) &&
        Objects.equals(this.runtime, activityResultSchema.runtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, attempts, activityCompletion, activitySuccess, score, timeTracked, completionAmount, suspended, children, objectives, staticProperties, runtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityResultSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    activityCompletion: ").append(toIndentedString(activityCompletion)).append("\n");
    sb.append("    activitySuccess: ").append(toIndentedString(activitySuccess)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    timeTracked: ").append(toIndentedString(timeTracked)).append("\n");
    sb.append("    completionAmount: ").append(toIndentedString(completionAmount)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    objectives: ").append(toIndentedString(objectives)).append("\n");
    sb.append("    staticProperties: ").append(toIndentedString(staticProperties)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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

