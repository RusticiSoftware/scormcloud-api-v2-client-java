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
import java.util.ArrayList;
import java.util.List;

/**
 * MetadataSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class MetadataSchema {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("titleLanguage")
  private String titleLanguage = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("descriptionLanguage")
  private String descriptionLanguage = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("typicalTime")
  private String typicalTime = null;

  @JsonProperty("keywords")
  private List<String> keywords = null;

  public MetadataSchema title(String title) {
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

  public MetadataSchema titleLanguage(String titleLanguage) {
    this.titleLanguage = titleLanguage;
    return this;
  }

  /**
   * Get titleLanguage
   * @return titleLanguage
  **/
  @ApiModelProperty(value = "")
  public String getTitleLanguage() {
    return titleLanguage;
  }

  public void setTitleLanguage(String titleLanguage) {
    this.titleLanguage = titleLanguage;
  }

  public MetadataSchema description(String description) {
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

  public MetadataSchema descriptionLanguage(String descriptionLanguage) {
    this.descriptionLanguage = descriptionLanguage;
    return this;
  }

  /**
   * Get descriptionLanguage
   * @return descriptionLanguage
  **/
  @ApiModelProperty(value = "")
  public String getDescriptionLanguage() {
    return descriptionLanguage;
  }

  public void setDescriptionLanguage(String descriptionLanguage) {
    this.descriptionLanguage = descriptionLanguage;
  }

  public MetadataSchema duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public MetadataSchema typicalTime(String typicalTime) {
    this.typicalTime = typicalTime;
    return this;
  }

  /**
   * Get typicalTime
   * @return typicalTime
  **/
  @ApiModelProperty(value = "")
  public String getTypicalTime() {
    return typicalTime;
  }

  public void setTypicalTime(String typicalTime) {
    this.typicalTime = typicalTime;
  }

  public MetadataSchema keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public MetadataSchema addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(value = "")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataSchema metadataSchema = (MetadataSchema) o;
    return Objects.equals(this.title, metadataSchema.title) &&
        Objects.equals(this.titleLanguage, metadataSchema.titleLanguage) &&
        Objects.equals(this.description, metadataSchema.description) &&
        Objects.equals(this.descriptionLanguage, metadataSchema.descriptionLanguage) &&
        Objects.equals(this.duration, metadataSchema.duration) &&
        Objects.equals(this.typicalTime, metadataSchema.typicalTime) &&
        Objects.equals(this.keywords, metadataSchema.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, titleLanguage, description, descriptionLanguage, duration, typicalTime, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataSchema {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleLanguage: ").append(toIndentedString(titleLanguage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionLanguage: ").append(toIndentedString(descriptionLanguage)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    typicalTime: ").append(toIndentedString(typicalTime)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

