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
import com.rusticisoftware.cloud.v2.client.model.DispatchIdSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * DispatchListSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class DispatchListSchema {
  @JsonProperty("dispatches")
  private List<DispatchIdSchema> dispatches = null;

  @JsonProperty("more")
  private String more = null;

  public DispatchListSchema dispatches(List<DispatchIdSchema> dispatches) {
    this.dispatches = dispatches;
    return this;
  }

  public DispatchListSchema addDispatchesItem(DispatchIdSchema dispatchesItem) {
    if (this.dispatches == null) {
      this.dispatches = new ArrayList<>();
    }
    this.dispatches.add(dispatchesItem);
    return this;
  }

  /**
   * Get dispatches
   * @return dispatches
  **/
  @ApiModelProperty(value = "")
  public List<DispatchIdSchema> getDispatches() {
    return dispatches;
  }

  public void setDispatches(List<DispatchIdSchema> dispatches) {
    this.dispatches = dispatches;
  }

  public DispatchListSchema more(String more) {
    this.more = more;
    return this;
  }

  /**
   * Token for getting the next set of results, from the prior set of results.
   * @return more
  **/
  @ApiModelProperty(value = "Token for getting the next set of results, from the prior set of results.")
  public String getMore() {
    return more;
  }

  public void setMore(String more) {
    this.more = more;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchListSchema dispatchListSchema = (DispatchListSchema) o;
    return Objects.equals(this.dispatches, dispatchListSchema.dispatches) &&
        Objects.equals(this.more, dispatchListSchema.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatches, more);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchListSchema {\n");
    
    sb.append("    dispatches: ").append(toIndentedString(dispatches)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
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

