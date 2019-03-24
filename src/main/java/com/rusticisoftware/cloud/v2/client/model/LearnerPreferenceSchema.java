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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * LearnerPreferenceSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T23:53:56.635-05:00")
public class LearnerPreferenceSchema   {
  @JsonProperty("audioLevel")
  private Double audioLevel = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("deliverySpeed")
  private Double deliverySpeed = null;

  @JsonProperty("audioCaptioning")
  private Integer audioCaptioning = null;

  public LearnerPreferenceSchema audioLevel(Double audioLevel) {
    this.audioLevel = audioLevel;
    return this;
  }

   /**
   * Get audioLevel
   * @return audioLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getAudioLevel() {
    return audioLevel;
  }

  public void setAudioLevel(Double audioLevel) {
    this.audioLevel = audioLevel;
  }

  public LearnerPreferenceSchema language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public LearnerPreferenceSchema deliverySpeed(Double deliverySpeed) {
    this.deliverySpeed = deliverySpeed;
    return this;
  }

   /**
   * Get deliverySpeed
   * @return deliverySpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDeliverySpeed() {
    return deliverySpeed;
  }

  public void setDeliverySpeed(Double deliverySpeed) {
    this.deliverySpeed = deliverySpeed;
  }

  public LearnerPreferenceSchema audioCaptioning(Integer audioCaptioning) {
    this.audioCaptioning = audioCaptioning;
    return this;
  }

   /**
   * Get audioCaptioning
   * @return audioCaptioning
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAudioCaptioning() {
    return audioCaptioning;
  }

  public void setAudioCaptioning(Integer audioCaptioning) {
    this.audioCaptioning = audioCaptioning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearnerPreferenceSchema learnerPreferenceSchema = (LearnerPreferenceSchema) o;
    return Objects.equals(this.audioLevel, learnerPreferenceSchema.audioLevel) &&
        Objects.equals(this.language, learnerPreferenceSchema.language) &&
        Objects.equals(this.deliverySpeed, learnerPreferenceSchema.deliverySpeed) &&
        Objects.equals(this.audioCaptioning, learnerPreferenceSchema.audioCaptioning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioLevel, language, deliverySpeed, audioCaptioning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearnerPreferenceSchema {\n");
    
    sb.append("    audioLevel: ").append(toIndentedString(audioLevel)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    deliverySpeed: ").append(toIndentedString(deliverySpeed)).append("\n");
    sb.append("    audioCaptioning: ").append(toIndentedString(audioCaptioning)).append("\n");
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

