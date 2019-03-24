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
import com.rusticisoftware.cloud.v2.client.model.LearnerSchema;
import com.rusticisoftware.cloud.v2.client.model.PostBackSchema;
import com.rusticisoftware.cloud.v2.client.model.RegistrationSchema;
import com.rusticisoftware.cloud.v2.client.model.SettingsPostSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CreateRegistrationSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T23:53:56.635-05:00")
public class CreateRegistrationSchema   {
  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("learner")
  private LearnerSchema learner = null;

  @JsonProperty("registrationId")
  private String registrationId = null;

  @JsonProperty("xapiRegistrationId")
  private String xapiRegistrationId = null;

  @JsonProperty("learnerTags")
  private List<String> learnerTags = new ArrayList<String>();

  @JsonProperty("courseTags")
  private List<String> courseTags = new ArrayList<String>();

  @JsonProperty("registrationTags")
  private List<String> registrationTags = new ArrayList<String>();

  @JsonProperty("postBack")
  private PostBackSchema postBack = null;

  @JsonProperty("initialRegistrationState")
  private RegistrationSchema initialRegistrationState = null;

  @JsonProperty("initialSettings")
  private SettingsPostSchema initialSettings = null;

  public CreateRegistrationSchema courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

   /**
   * Get courseId
   * @return courseId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public CreateRegistrationSchema learner(LearnerSchema learner) {
    this.learner = learner;
    return this;
  }

   /**
   * Get learner
   * @return learner
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LearnerSchema getLearner() {
    return learner;
  }

  public void setLearner(LearnerSchema learner) {
    this.learner = learner;
  }

  public CreateRegistrationSchema registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

   /**
   * Get registrationId
   * @return registrationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public CreateRegistrationSchema xapiRegistrationId(String xapiRegistrationId) {
    this.xapiRegistrationId = xapiRegistrationId;
    return this;
  }

   /**
   * The xapiRegistrationId to be associated with this registration. If not specified, the system will assign an xapiRegistrationId. As per the xApi specification, this must be a UUID.
   * @return xapiRegistrationId
  **/
  @ApiModelProperty(example = "null", value = "The xapiRegistrationId to be associated with this registration. If not specified, the system will assign an xapiRegistrationId. As per the xApi specification, this must be a UUID.")
  public String getXapiRegistrationId() {
    return xapiRegistrationId;
  }

  public void setXapiRegistrationId(String xapiRegistrationId) {
    this.xapiRegistrationId = xapiRegistrationId;
  }

  public CreateRegistrationSchema learnerTags(List<String> learnerTags) {
    this.learnerTags = learnerTags;
    return this;
  }

  public CreateRegistrationSchema addLearnerTagsItem(String learnerTagsItem) {
    this.learnerTags.add(learnerTagsItem);
    return this;
  }

   /**
   * Get learnerTags
   * @return learnerTags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLearnerTags() {
    return learnerTags;
  }

  public void setLearnerTags(List<String> learnerTags) {
    this.learnerTags = learnerTags;
  }

  public CreateRegistrationSchema courseTags(List<String> courseTags) {
    this.courseTags = courseTags;
    return this;
  }

  public CreateRegistrationSchema addCourseTagsItem(String courseTagsItem) {
    this.courseTags.add(courseTagsItem);
    return this;
  }

   /**
   * Get courseTags
   * @return courseTags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCourseTags() {
    return courseTags;
  }

  public void setCourseTags(List<String> courseTags) {
    this.courseTags = courseTags;
  }

  public CreateRegistrationSchema registrationTags(List<String> registrationTags) {
    this.registrationTags = registrationTags;
    return this;
  }

  public CreateRegistrationSchema addRegistrationTagsItem(String registrationTagsItem) {
    this.registrationTags.add(registrationTagsItem);
    return this;
  }

   /**
   * Get registrationTags
   * @return registrationTags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRegistrationTags() {
    return registrationTags;
  }

  public void setRegistrationTags(List<String> registrationTags) {
    this.registrationTags = registrationTags;
  }

  public CreateRegistrationSchema postBack(PostBackSchema postBack) {
    this.postBack = postBack;
    return this;
  }

   /**
   * Specifies an optional override URL for which to post activity and status data in real time as the course is completed. By default all of these settings are read from your configuration.
   * @return postBack
  **/
  @ApiModelProperty(example = "null", value = "Specifies an optional override URL for which to post activity and status data in real time as the course is completed. By default all of these settings are read from your configuration.")
  public PostBackSchema getPostBack() {
    return postBack;
  }

  public void setPostBack(PostBackSchema postBack) {
    this.postBack = postBack;
  }

  public CreateRegistrationSchema initialRegistrationState(RegistrationSchema initialRegistrationState) {
    this.initialRegistrationState = initialRegistrationState;
    return this;
  }

   /**
   * Get initialRegistrationState
   * @return initialRegistrationState
  **/
  @ApiModelProperty(example = "null", value = "")
  public RegistrationSchema getInitialRegistrationState() {
    return initialRegistrationState;
  }

  public void setInitialRegistrationState(RegistrationSchema initialRegistrationState) {
    this.initialRegistrationState = initialRegistrationState;
  }

  public CreateRegistrationSchema initialSettings(SettingsPostSchema initialSettings) {
    this.initialSettings = initialSettings;
    return this;
  }

   /**
   * Get initialSettings
   * @return initialSettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsPostSchema getInitialSettings() {
    return initialSettings;
  }

  public void setInitialSettings(SettingsPostSchema initialSettings) {
    this.initialSettings = initialSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRegistrationSchema createRegistrationSchema = (CreateRegistrationSchema) o;
    return Objects.equals(this.courseId, createRegistrationSchema.courseId) &&
        Objects.equals(this.learner, createRegistrationSchema.learner) &&
        Objects.equals(this.registrationId, createRegistrationSchema.registrationId) &&
        Objects.equals(this.xapiRegistrationId, createRegistrationSchema.xapiRegistrationId) &&
        Objects.equals(this.learnerTags, createRegistrationSchema.learnerTags) &&
        Objects.equals(this.courseTags, createRegistrationSchema.courseTags) &&
        Objects.equals(this.registrationTags, createRegistrationSchema.registrationTags) &&
        Objects.equals(this.postBack, createRegistrationSchema.postBack) &&
        Objects.equals(this.initialRegistrationState, createRegistrationSchema.initialRegistrationState) &&
        Objects.equals(this.initialSettings, createRegistrationSchema.initialSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, learner, registrationId, xapiRegistrationId, learnerTags, courseTags, registrationTags, postBack, initialRegistrationState, initialSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRegistrationSchema {\n");
    
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    learner: ").append(toIndentedString(learner)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    xapiRegistrationId: ").append(toIndentedString(xapiRegistrationId)).append("\n");
    sb.append("    learnerTags: ").append(toIndentedString(learnerTags)).append("\n");
    sb.append("    courseTags: ").append(toIndentedString(courseTags)).append("\n");
    sb.append("    registrationTags: ").append(toIndentedString(registrationTags)).append("\n");
    sb.append("    postBack: ").append(toIndentedString(postBack)).append("\n");
    sb.append("    initialRegistrationState: ").append(toIndentedString(initialRegistrationState)).append("\n");
    sb.append("    initialSettings: ").append(toIndentedString(initialSettings)).append("\n");
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

