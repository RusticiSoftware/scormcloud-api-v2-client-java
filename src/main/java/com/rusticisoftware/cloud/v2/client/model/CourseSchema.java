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
import com.rusticisoftware.cloud.v2.client.model.CourseActivitySchema;
import com.rusticisoftware.cloud.v2.client.model.MetadataSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * CourseSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T23:53:56.635-05:00")
public class CourseSchema   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("xapiActivityId")
  private String xapiActivityId = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("registrationCount")
  private Integer registrationCount = null;

  @JsonProperty("activityId")
  private String activityId = null;

  /**
   * Gets or Sets courseLearningStandard
   */
  public enum CourseLearningStandardEnum {
    UNKNOWN("UNKNOWN"),
    
    SCORM11("SCORM11"),
    
    SCORM12("SCORM12"),
    
    SCORM20042NDEDITION("SCORM20042NDEDITION"),
    
    SCORM20043RDEDITION("SCORM20043RDEDITION"),
    
    SCORM20044THEDITION("SCORM20044THEDITION"),
    
    AICC("AICC"),
    
    XAPI("XAPI"),
    
    CMI5("CMI5");

    private String value;

    CourseLearningStandardEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CourseLearningStandardEnum fromValue(String text) {
      for (CourseLearningStandardEnum b : CourseLearningStandardEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("courseLearningStandard")
  private CourseLearningStandardEnum courseLearningStandard = null;

  @JsonProperty("tags")
  private List<String> tags = new ArrayList<String>();

  @JsonProperty("dispatched")
  private Boolean dispatched = null;

  @JsonProperty("metadata")
  private MetadataSchema metadata = null;

  @JsonProperty("rootActivity")
  private CourseActivitySchema rootActivity = null;

  public CourseSchema id(String id) {
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

  public CourseSchema title(String title) {
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

  public CourseSchema xapiActivityId(String xapiActivityId) {
    this.xapiActivityId = xapiActivityId;
    return this;
  }

   /**
   * xAPI activity id associated with this course
   * @return xapiActivityId
  **/
  @ApiModelProperty(example = "null", value = "xAPI activity id associated with this course")
  public String getXapiActivityId() {
    return xapiActivityId;
  }

  public void setXapiActivityId(String xapiActivityId) {
    this.xapiActivityId = xapiActivityId;
  }

  public CourseSchema created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public CourseSchema updated(OffsetDateTime updated) {
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

  public CourseSchema version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CourseSchema registrationCount(Integer registrationCount) {
    this.registrationCount = registrationCount;
    return this;
  }

   /**
   * Get registrationCount
   * @return registrationCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRegistrationCount() {
    return registrationCount;
  }

  public void setRegistrationCount(Integer registrationCount) {
    this.registrationCount = registrationCount;
  }

  public CourseSchema activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public CourseSchema courseLearningStandard(CourseLearningStandardEnum courseLearningStandard) {
    this.courseLearningStandard = courseLearningStandard;
    return this;
  }

   /**
   * Get courseLearningStandard
   * @return courseLearningStandard
  **/
  @ApiModelProperty(example = "null", value = "")
  public CourseLearningStandardEnum getCourseLearningStandard() {
    return courseLearningStandard;
  }

  public void setCourseLearningStandard(CourseLearningStandardEnum courseLearningStandard) {
    this.courseLearningStandard = courseLearningStandard;
  }

  public CourseSchema tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CourseSchema addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CourseSchema dispatched(Boolean dispatched) {
    this.dispatched = dispatched;
    return this;
  }

   /**
   * Get dispatched
   * @return dispatched
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDispatched() {
    return dispatched;
  }

  public void setDispatched(Boolean dispatched) {
    this.dispatched = dispatched;
  }

  public CourseSchema metadata(MetadataSchema metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public MetadataSchema getMetadata() {
    return metadata;
  }

  public void setMetadata(MetadataSchema metadata) {
    this.metadata = metadata;
  }

  public CourseSchema rootActivity(CourseActivitySchema rootActivity) {
    this.rootActivity = rootActivity;
    return this;
  }

   /**
   * Get rootActivity
   * @return rootActivity
  **/
  @ApiModelProperty(example = "null", value = "")
  public CourseActivitySchema getRootActivity() {
    return rootActivity;
  }

  public void setRootActivity(CourseActivitySchema rootActivity) {
    this.rootActivity = rootActivity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseSchema courseSchema = (CourseSchema) o;
    return Objects.equals(this.id, courseSchema.id) &&
        Objects.equals(this.title, courseSchema.title) &&
        Objects.equals(this.xapiActivityId, courseSchema.xapiActivityId) &&
        Objects.equals(this.created, courseSchema.created) &&
        Objects.equals(this.updated, courseSchema.updated) &&
        Objects.equals(this.version, courseSchema.version) &&
        Objects.equals(this.registrationCount, courseSchema.registrationCount) &&
        Objects.equals(this.activityId, courseSchema.activityId) &&
        Objects.equals(this.courseLearningStandard, courseSchema.courseLearningStandard) &&
        Objects.equals(this.tags, courseSchema.tags) &&
        Objects.equals(this.dispatched, courseSchema.dispatched) &&
        Objects.equals(this.metadata, courseSchema.metadata) &&
        Objects.equals(this.rootActivity, courseSchema.rootActivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, xapiActivityId, created, updated, version, registrationCount, activityId, courseLearningStandard, tags, dispatched, metadata, rootActivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    xapiActivityId: ").append(toIndentedString(xapiActivityId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    registrationCount: ").append(toIndentedString(registrationCount)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    courseLearningStandard: ").append(toIndentedString(courseLearningStandard)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dispatched: ").append(toIndentedString(dispatched)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    rootActivity: ").append(toIndentedString(rootActivity)).append("\n");
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

