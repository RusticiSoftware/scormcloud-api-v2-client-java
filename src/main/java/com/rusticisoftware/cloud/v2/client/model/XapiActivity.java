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
import com.rusticisoftware.cloud.v2.client.model.XapiActivityDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#4141-when-the-objecttype-is-activity
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#4141-when-the-objecttype-is-activity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class XapiActivity {
  @JsonProperty("objectType")
  private String objectType = "Activity";

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("definition")
  private XapiActivityDefinition definition = null;

  public XapiActivity objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public XapiActivity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public XapiActivity definition(XapiActivityDefinition definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(example = "null", value = "")
  public XapiActivityDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(XapiActivityDefinition definition) {
    this.definition = definition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiActivity xapiActivity = (XapiActivity) o;
    return Objects.equals(this.objectType, xapiActivity.objectType) &&
        Objects.equals(this.id, xapiActivity.id) &&
        Objects.equals(this.definition, xapiActivity.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, id, definition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiActivity {\n");
    
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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

