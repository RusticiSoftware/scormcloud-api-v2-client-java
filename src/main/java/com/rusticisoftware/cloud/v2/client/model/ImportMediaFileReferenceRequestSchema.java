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
import com.rusticisoftware.cloud.v2.client.model.MediaFileMetadataSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Used to create a course that references a media file. Upon import, the actual file is not downloaded and stored on SCORM Cloud&#39;s servers. Instead, the media file wrapper will load the content from the provided URL. 
 */
@ApiModel(description = "Used to create a course that references a media file. Upon import, the actual file is not downloaded and stored on SCORM Cloud's servers. Instead, the media file wrapper will load the content from the provided URL. ")
public class ImportMediaFileReferenceRequestSchema {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("mediaFileMetadata")
  private MediaFileMetadataSchema mediaFileMetadata = null;

  public ImportMediaFileReferenceRequestSchema url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL path to the media file to use when launching this course
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL path to the media file to use when launching this course")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ImportMediaFileReferenceRequestSchema contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * MIME type of the media file
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "MIME type of the media file")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ImportMediaFileReferenceRequestSchema mediaFileMetadata(MediaFileMetadataSchema mediaFileMetadata) {
    this.mediaFileMetadata = mediaFileMetadata;
    return this;
  }

  /**
   * Get mediaFileMetadata
   * @return mediaFileMetadata
  **/
  @ApiModelProperty(value = "")
  public MediaFileMetadataSchema getMediaFileMetadata() {
    return mediaFileMetadata;
  }

  public void setMediaFileMetadata(MediaFileMetadataSchema mediaFileMetadata) {
    this.mediaFileMetadata = mediaFileMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportMediaFileReferenceRequestSchema importMediaFileReferenceRequestSchema = (ImportMediaFileReferenceRequestSchema) o;
    return Objects.equals(this.url, importMediaFileReferenceRequestSchema.url) &&
        Objects.equals(this.contentType, importMediaFileReferenceRequestSchema.contentType) &&
        Objects.equals(this.mediaFileMetadata, importMediaFileReferenceRequestSchema.mediaFileMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, contentType, mediaFileMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportMediaFileReferenceRequestSchema {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    mediaFileMetadata: ").append(toIndentedString(mediaFileMetadata)).append("\n");
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

