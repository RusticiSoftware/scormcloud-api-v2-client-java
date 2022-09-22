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
import com.rusticisoftware.cloud.v2.client.model.XapiEndpointSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * XapiStatementPipeSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class XapiStatementPipeSchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lastForwardedStatementDate")
  private String lastForwardedStatementDate = null;

  @JsonProperty("moreUrl")
  private String moreUrl = null;

  @JsonProperty("attempts")
  private Integer attempts = null;

  @JsonProperty("visibleAfter")
  private String visibleAfter = null;

  @JsonProperty("source")
  private XapiEndpointSchema source = null;

  @JsonProperty("target")
  private XapiEndpointSchema target = null;

  public XapiStatementPipeSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public XapiStatementPipeSchema lastForwardedStatementDate(String lastForwardedStatementDate) {
    this.lastForwardedStatementDate = lastForwardedStatementDate;
    return this;
  }

  /**
   * Get lastForwardedStatementDate
   * @return lastForwardedStatementDate
  **/
  @ApiModelProperty(value = "")
  public String getLastForwardedStatementDate() {
    return lastForwardedStatementDate;
  }

  public void setLastForwardedStatementDate(String lastForwardedStatementDate) {
    this.lastForwardedStatementDate = lastForwardedStatementDate;
  }

  public XapiStatementPipeSchema moreUrl(String moreUrl) {
    this.moreUrl = moreUrl;
    return this;
  }

  /**
   * Get moreUrl
   * @return moreUrl
  **/
  @ApiModelProperty(value = "")
  public String getMoreUrl() {
    return moreUrl;
  }

  public void setMoreUrl(String moreUrl) {
    this.moreUrl = moreUrl;
  }

  public XapiStatementPipeSchema attempts(Integer attempts) {
    this.attempts = attempts;
    return this;
  }

  /**
   * Get attempts
   * @return attempts
  **/
  @ApiModelProperty(value = "")
  public Integer getAttempts() {
    return attempts;
  }

  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }

  public XapiStatementPipeSchema visibleAfter(String visibleAfter) {
    this.visibleAfter = visibleAfter;
    return this;
  }

  /**
   * Get visibleAfter
   * @return visibleAfter
  **/
  @ApiModelProperty(value = "")
  public String getVisibleAfter() {
    return visibleAfter;
  }

  public void setVisibleAfter(String visibleAfter) {
    this.visibleAfter = visibleAfter;
  }

  public XapiStatementPipeSchema source(XapiEndpointSchema source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public XapiEndpointSchema getSource() {
    return source;
  }

  public void setSource(XapiEndpointSchema source) {
    this.source = source;
  }

  public XapiStatementPipeSchema target(XapiEndpointSchema target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public XapiEndpointSchema getTarget() {
    return target;
  }

  public void setTarget(XapiEndpointSchema target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiStatementPipeSchema xapiStatementPipeSchema = (XapiStatementPipeSchema) o;
    return Objects.equals(this.id, xapiStatementPipeSchema.id) &&
        Objects.equals(this.lastForwardedStatementDate, xapiStatementPipeSchema.lastForwardedStatementDate) &&
        Objects.equals(this.moreUrl, xapiStatementPipeSchema.moreUrl) &&
        Objects.equals(this.attempts, xapiStatementPipeSchema.attempts) &&
        Objects.equals(this.visibleAfter, xapiStatementPipeSchema.visibleAfter) &&
        Objects.equals(this.source, xapiStatementPipeSchema.source) &&
        Objects.equals(this.target, xapiStatementPipeSchema.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastForwardedStatementDate, moreUrl, attempts, visibleAfter, source, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiStatementPipeSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastForwardedStatementDate: ").append(toIndentedString(lastForwardedStatementDate)).append("\n");
    sb.append("    moreUrl: ").append(toIndentedString(moreUrl)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    visibleAfter: ").append(toIndentedString(visibleAfter)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

