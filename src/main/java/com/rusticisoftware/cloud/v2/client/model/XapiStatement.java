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
import com.rusticisoftware.cloud.v2.client.model.XapiActivity;
import com.rusticisoftware.cloud.v2.client.model.XapiAgentGroup;
import com.rusticisoftware.cloud.v2.client.model.XapiAttachment;
import com.rusticisoftware.cloud.v2.client.model.XapiContext;
import com.rusticisoftware.cloud.v2.client.model.XapiResult;
import com.rusticisoftware.cloud.v2.client.model.XapiStatement;
import com.rusticisoftware.cloud.v2.client.model.XapiStatementReference;
import com.rusticisoftware.cloud.v2.client.model.XapiVerb;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#41-statement-properties
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#41-statement-properties")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class XapiStatement {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("actor")
  private XapiAgentGroup actor = null;

  @JsonProperty("verb")
  private XapiVerb verb = null;

  @JsonProperty("objectActivity")
  private XapiActivity objectActivity = null;

  @JsonProperty("objectAgentGroup")
  private XapiAgentGroup objectAgentGroup = null;

  @JsonProperty("objectStatementReference")
  private XapiStatementReference objectStatementReference = null;

  @JsonProperty("objectSubStatement")
  private XapiStatement objectSubStatement = null;

  @JsonProperty("result")
  private XapiResult result = null;

  @JsonProperty("context")
  private XapiContext context = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("stored")
  private OffsetDateTime stored = null;

  @JsonProperty("authority")
  private XapiAgentGroup authority = null;

  @JsonProperty("attachments")
  private List<XapiAttachment> attachments = null;

  public XapiStatement id(String id) {
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

  public XapiStatement actor(XapiAgentGroup actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  **/
  @ApiModelProperty(value = "")
  public XapiAgentGroup getActor() {
    return actor;
  }

  public void setActor(XapiAgentGroup actor) {
    this.actor = actor;
  }

  public XapiStatement verb(XapiVerb verb) {
    this.verb = verb;
    return this;
  }

  /**
   * Get verb
   * @return verb
  **/
  @ApiModelProperty(value = "")
  public XapiVerb getVerb() {
    return verb;
  }

  public void setVerb(XapiVerb verb) {
    this.verb = verb;
  }

  public XapiStatement objectActivity(XapiActivity objectActivity) {
    this.objectActivity = objectActivity;
    return this;
  }

  /**
   * Get objectActivity
   * @return objectActivity
  **/
  @ApiModelProperty(value = "")
  public XapiActivity getObjectActivity() {
    return objectActivity;
  }

  public void setObjectActivity(XapiActivity objectActivity) {
    this.objectActivity = objectActivity;
  }

  public XapiStatement objectAgentGroup(XapiAgentGroup objectAgentGroup) {
    this.objectAgentGroup = objectAgentGroup;
    return this;
  }

  /**
   * Get objectAgentGroup
   * @return objectAgentGroup
  **/
  @ApiModelProperty(value = "")
  public XapiAgentGroup getObjectAgentGroup() {
    return objectAgentGroup;
  }

  public void setObjectAgentGroup(XapiAgentGroup objectAgentGroup) {
    this.objectAgentGroup = objectAgentGroup;
  }

  public XapiStatement objectStatementReference(XapiStatementReference objectStatementReference) {
    this.objectStatementReference = objectStatementReference;
    return this;
  }

  /**
   * Get objectStatementReference
   * @return objectStatementReference
  **/
  @ApiModelProperty(value = "")
  public XapiStatementReference getObjectStatementReference() {
    return objectStatementReference;
  }

  public void setObjectStatementReference(XapiStatementReference objectStatementReference) {
    this.objectStatementReference = objectStatementReference;
  }

  public XapiStatement objectSubStatement(XapiStatement objectSubStatement) {
    this.objectSubStatement = objectSubStatement;
    return this;
  }

  /**
   * Get objectSubStatement
   * @return objectSubStatement
  **/
  @ApiModelProperty(value = "")
  public XapiStatement getObjectSubStatement() {
    return objectSubStatement;
  }

  public void setObjectSubStatement(XapiStatement objectSubStatement) {
    this.objectSubStatement = objectSubStatement;
  }

  public XapiStatement result(XapiResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public XapiResult getResult() {
    return result;
  }

  public void setResult(XapiResult result) {
    this.result = result;
  }

  public XapiStatement context(XapiContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public XapiContext getContext() {
    return context;
  }

  public void setContext(XapiContext context) {
    this.context = context;
  }

  public XapiStatement timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public XapiStatement stored(OffsetDateTime stored) {
    this.stored = stored;
    return this;
  }

  /**
   * Get stored
   * @return stored
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStored() {
    return stored;
  }

  public void setStored(OffsetDateTime stored) {
    this.stored = stored;
  }

  public XapiStatement authority(XapiAgentGroup authority) {
    this.authority = authority;
    return this;
  }

  /**
   * Get authority
   * @return authority
  **/
  @ApiModelProperty(value = "")
  public XapiAgentGroup getAuthority() {
    return authority;
  }

  public void setAuthority(XapiAgentGroup authority) {
    this.authority = authority;
  }

  public XapiStatement attachments(List<XapiAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public XapiStatement addAttachmentsItem(XapiAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public List<XapiAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<XapiAttachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiStatement xapiStatement = (XapiStatement) o;
    return Objects.equals(this.id, xapiStatement.id) &&
        Objects.equals(this.actor, xapiStatement.actor) &&
        Objects.equals(this.verb, xapiStatement.verb) &&
        Objects.equals(this.objectActivity, xapiStatement.objectActivity) &&
        Objects.equals(this.objectAgentGroup, xapiStatement.objectAgentGroup) &&
        Objects.equals(this.objectStatementReference, xapiStatement.objectStatementReference) &&
        Objects.equals(this.objectSubStatement, xapiStatement.objectSubStatement) &&
        Objects.equals(this.result, xapiStatement.result) &&
        Objects.equals(this.context, xapiStatement.context) &&
        Objects.equals(this.timestamp, xapiStatement.timestamp) &&
        Objects.equals(this.stored, xapiStatement.stored) &&
        Objects.equals(this.authority, xapiStatement.authority) &&
        Objects.equals(this.attachments, xapiStatement.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actor, verb, objectActivity, objectAgentGroup, objectStatementReference, objectSubStatement, result, context, timestamp, stored, authority, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiStatement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    objectActivity: ").append(toIndentedString(objectActivity)).append("\n");
    sb.append("    objectAgentGroup: ").append(toIndentedString(objectAgentGroup)).append("\n");
    sb.append("    objectStatementReference: ").append(toIndentedString(objectStatementReference)).append("\n");
    sb.append("    objectSubStatement: ").append(toIndentedString(objectSubStatement)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    stored: ").append(toIndentedString(stored)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

