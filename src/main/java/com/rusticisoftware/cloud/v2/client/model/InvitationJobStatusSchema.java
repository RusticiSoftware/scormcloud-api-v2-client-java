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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * InvitationJobStatusSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
public class InvitationJobStatusSchema {
  /**
   * The status of the job.
   */
  public enum StatusEnum {
    STARTED("STARTED"),
    
    CANCELLED("CANCELLED"),
    
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

  @JsonProperty("errors")
  private List<String> errors = new ArrayList<String>();

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("processed")
  private Integer processed = null;

  public InvitationJobStatusSchema status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the job.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the job.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InvitationJobStatusSchema errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public InvitationJobStatusSchema addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * An array containing any errors which occurred.
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "An array containing any errors which occurred.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public InvitationJobStatusSchema total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of private invitations to be sent.
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "The total number of private invitations to be sent.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public InvitationJobStatusSchema processed(Integer processed) {
    this.processed = processed;
    return this;
  }

   /**
   * The number of private invitations which have been sent.
   * @return processed
  **/
  @ApiModelProperty(example = "null", value = "The number of private invitations which have been sent.")
  public Integer getProcessed() {
    return processed;
  }

  public void setProcessed(Integer processed) {
    this.processed = processed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationJobStatusSchema invitationJobStatusSchema = (InvitationJobStatusSchema) o;
    return Objects.equals(this.status, invitationJobStatusSchema.status) &&
        Objects.equals(this.errors, invitationJobStatusSchema.errors) &&
        Objects.equals(this.total, invitationJobStatusSchema.total) &&
        Objects.equals(this.processed, invitationJobStatusSchema.processed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errors, total, processed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationJobStatusSchema {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
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

