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
 * Metadata used to set various properties of a media file course 
 */
@ApiModel(description = "Metadata used to set various properties of a media file course ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T15:24:36.536-05:00")
public class MediaFileMetadataSchema {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("contentLanguage")
  private String contentLanguage = null;

  @JsonProperty("estimatedDuration")
  private Integer estimatedDuration = null;

  public MediaFileMetadataSchema title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MediaFileMetadataSchema description(String description) {
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

  public MediaFileMetadataSchema contentLanguage(String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * Get contentLanguage
   * @return contentLanguage
  **/
  @ApiModelProperty(value = "")
  public String getContentLanguage() {
    return contentLanguage;
  }

  public void setContentLanguage(String contentLanguage) {
    this.contentLanguage = contentLanguage;
  }

  public MediaFileMetadataSchema estimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

  /**
   * Get estimatedDuration
   * @return estimatedDuration
  **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedDuration() {
    return estimatedDuration;
  }

  public void setEstimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaFileMetadataSchema mediaFileMetadataSchema = (MediaFileMetadataSchema) o;
    return Objects.equals(this.title, mediaFileMetadataSchema.title) &&
        Objects.equals(this.description, mediaFileMetadataSchema.description) &&
        Objects.equals(this.contentLanguage, mediaFileMetadataSchema.contentLanguage) &&
        Objects.equals(this.estimatedDuration, mediaFileMetadataSchema.estimatedDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, contentLanguage, estimatedDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaFileMetadataSchema {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contentLanguage: ").append(toIndentedString(contentLanguage)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
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

