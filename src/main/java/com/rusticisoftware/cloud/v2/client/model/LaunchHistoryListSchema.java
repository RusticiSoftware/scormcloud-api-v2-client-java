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
import com.rusticisoftware.cloud.v2.client.model.LaunchHistorySchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * LaunchHistoryListSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class LaunchHistoryListSchema {
  @JsonProperty("launchHistory")
  private List<LaunchHistorySchema> launchHistory = new ArrayList<LaunchHistorySchema>();

  public LaunchHistoryListSchema launchHistory(List<LaunchHistorySchema> launchHistory) {
    this.launchHistory = launchHistory;
    return this;
  }

  public LaunchHistoryListSchema addLaunchHistoryItem(LaunchHistorySchema launchHistoryItem) {
    this.launchHistory.add(launchHistoryItem);
    return this;
  }

   /**
   * Get launchHistory
   * @return launchHistory
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LaunchHistorySchema> getLaunchHistory() {
    return launchHistory;
  }

  public void setLaunchHistory(List<LaunchHistorySchema> launchHistory) {
    this.launchHistory = launchHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchHistoryListSchema launchHistoryListSchema = (LaunchHistoryListSchema) o;
    return Objects.equals(this.launchHistory, launchHistoryListSchema.launchHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchHistoryListSchema {\n");
    
    sb.append("    launchHistory: ").append(toIndentedString(launchHistory)).append("\n");
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

