/*
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0 beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rusticisoftware.cloud.v2.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rusticisoftware.cloud.v2.client.model.ImportResultSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ImportJobResultSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-16T16:01:27.387-05:00")
public class ImportJobResultSchema {
  @JsonProperty("jobId")
  private String jobId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RUNNING("RUNNING"),
    
    COMPLETE("COMPLETE"),
    
    ERROR("ERROR");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("importResult")
  private ImportResultSchema importResult = null;

  public ImportJobResultSchema jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public ImportJobResultSchema status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ImportJobResultSchema message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ImportJobResultSchema importResult(ImportResultSchema importResult) {
    this.importResult = importResult;
    return this;
  }

   /**
   * Get importResult
   * @return importResult
  **/
  @ApiModelProperty(example = "null", value = "")
  public ImportResultSchema getImportResult() {
    return importResult;
  }

  public void setImportResult(ImportResultSchema importResult) {
    this.importResult = importResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportJobResultSchema importJobResultSchema = (ImportJobResultSchema) o;
    return Objects.equals(this.jobId, importJobResultSchema.jobId) &&
        Objects.equals(this.status, importJobResultSchema.status) &&
        Objects.equals(this.message, importJobResultSchema.message) &&
        Objects.equals(this.importResult, importJobResultSchema.importResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, status, message, importResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJobResultSchema {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    importResult: ").append(toIndentedString(importResult)).append("\n");
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

