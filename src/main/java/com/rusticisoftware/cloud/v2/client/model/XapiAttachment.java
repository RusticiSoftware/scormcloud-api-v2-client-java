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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#4111-attachments
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#4111-attachments")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class XapiAttachment {
  @JsonProperty("usageType")
  private String usageType = null;

  @JsonProperty("display")
  private Map<String, String> display = new HashMap<>();

  @JsonProperty("description")
  private Map<String, String> description = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("sha2")
  private String sha2 = null;

  @JsonProperty("fileUrl")
  private String fileUrl = null;

  public XapiAttachment usageType(String usageType) {
    this.usageType = usageType;
    return this;
  }

  /**
   * Get usageType
   * @return usageType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public XapiAttachment display(Map<String, String> display) {
    this.display = display;
    return this;
  }

  public XapiAttachment putDisplayItem(String key, String displayItem) {
    this.display.put(key, displayItem);
    return this;
  }

  /**
   * Get display
   * @return display
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getDisplay() {
    return display;
  }

  public void setDisplay(Map<String, String> display) {
    this.display = display;
  }

  public XapiAttachment description(Map<String, String> description) {
    this.description = description;
    return this;
  }

  public XapiAttachment putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDescription() {
    return description;
  }

  public void setDescription(Map<String, String> description) {
    this.description = description;
  }

  public XapiAttachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public XapiAttachment length(Long length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public XapiAttachment sha2(String sha2) {
    this.sha2 = sha2;
    return this;
  }

  /**
   * Get sha2
   * @return sha2
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSha2() {
    return sha2;
  }

  public void setSha2(String sha2) {
    this.sha2 = sha2;
  }

  public XapiAttachment fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

  /**
   * Get fileUrl
   * @return fileUrl
  **/
  @ApiModelProperty(value = "")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiAttachment xapiAttachment = (XapiAttachment) o;
    return Objects.equals(this.usageType, xapiAttachment.usageType) &&
        Objects.equals(this.display, xapiAttachment.display) &&
        Objects.equals(this.description, xapiAttachment.description) &&
        Objects.equals(this.contentType, xapiAttachment.contentType) &&
        Objects.equals(this.length, xapiAttachment.length) &&
        Objects.equals(this.sha2, xapiAttachment.sha2) &&
        Objects.equals(this.fileUrl, xapiAttachment.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageType, display, description, contentType, length, sha2, fileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiAttachment {\n");
    
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    sha2: ").append(toIndentedString(sha2)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
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

