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
import com.rusticisoftware.cloud.v2.client.model.XapiScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#415-result
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#415-result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T22:54:47.497-06:00")
public class XapiResult {
  @JsonProperty("score")
  private XapiScore score = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("completion")
  private Boolean completion = null;

  @JsonProperty("response")
  private String response = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("extensions")
  private Map<String, Object> extensions = new HashMap<String, Object>();

  public XapiResult score(XapiScore score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public XapiScore getScore() {
    return score;
  }

  public void setScore(XapiScore score) {
    this.score = score;
  }

  public XapiResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public XapiResult completion(Boolean completion) {
    this.completion = completion;
    return this;
  }

   /**
   * Get completion
   * @return completion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCompletion() {
    return completion;
  }

  public void setCompletion(Boolean completion) {
    this.completion = completion;
  }

  public XapiResult response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public XapiResult duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public XapiResult extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }

  public XapiResult putExtensionsItem(String key, Object extensionsItem) {
    this.extensions.put(key, extensionsItem);
    return this;
  }

   /**
   * Get extensions
   * @return extensions
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getExtensions() {
    return extensions;
  }

  public void setExtensions(Map<String, Object> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiResult xapiResult = (XapiResult) o;
    return Objects.equals(this.score, xapiResult.score) &&
        Objects.equals(this.success, xapiResult.success) &&
        Objects.equals(this.completion, xapiResult.completion) &&
        Objects.equals(this.response, xapiResult.response) &&
        Objects.equals(this.duration, xapiResult.duration) &&
        Objects.equals(this.extensions, xapiResult.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, success, completion, response, duration, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiResult {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

