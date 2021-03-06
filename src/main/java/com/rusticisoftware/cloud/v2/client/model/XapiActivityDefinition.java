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
import com.rusticisoftware.cloud.v2.client.model.XapiInteractionComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#activity-definition
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#activity-definition")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-06T09:44:40.358-06:00")
public class XapiActivityDefinition {
  @JsonProperty("name")
  private Map<String, String> name = new HashMap<String, String>();

  @JsonProperty("description")
  private Map<String, String> description = new HashMap<String, String>();

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("moreInfo")
  private String moreInfo = null;

  @JsonProperty("interactionType")
  private String interactionType = null;

  @JsonProperty("correctResponsesPattern")
  private List<String> correctResponsesPattern = new ArrayList<String>();

  @JsonProperty("choices")
  private List<XapiInteractionComponent> choices = new ArrayList<XapiInteractionComponent>();

  @JsonProperty("scale")
  private List<XapiInteractionComponent> scale = new ArrayList<XapiInteractionComponent>();

  @JsonProperty("source")
  private List<XapiInteractionComponent> source = new ArrayList<XapiInteractionComponent>();

  @JsonProperty("target")
  private List<XapiInteractionComponent> target = new ArrayList<XapiInteractionComponent>();

  @JsonProperty("steps")
  private List<XapiInteractionComponent> steps = new ArrayList<XapiInteractionComponent>();

  @JsonProperty("extensions")
  private Map<String, Object> extensions = new HashMap<String, Object>();

  public XapiActivityDefinition name(Map<String, String> name) {
    this.name = name;
    return this;
  }

  public XapiActivityDefinition putNameItem(String key, String nameItem) {
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getName() {
    return name;
  }

  public void setName(Map<String, String> name) {
    this.name = name;
  }

  public XapiActivityDefinition description(Map<String, String> description) {
    this.description = description;
    return this;
  }

  public XapiActivityDefinition putDescriptionItem(String key, String descriptionItem) {
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getDescription() {
    return description;
  }

  public void setDescription(Map<String, String> description) {
    this.description = description;
  }

  public XapiActivityDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public XapiActivityDefinition moreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

   /**
   * Get moreInfo
   * @return moreInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }

  public XapiActivityDefinition interactionType(String interactionType) {
    this.interactionType = interactionType;
    return this;
  }

   /**
   * Get interactionType
   * @return interactionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInteractionType() {
    return interactionType;
  }

  public void setInteractionType(String interactionType) {
    this.interactionType = interactionType;
  }

  public XapiActivityDefinition correctResponsesPattern(List<String> correctResponsesPattern) {
    this.correctResponsesPattern = correctResponsesPattern;
    return this;
  }

  public XapiActivityDefinition addCorrectResponsesPatternItem(String correctResponsesPatternItem) {
    this.correctResponsesPattern.add(correctResponsesPatternItem);
    return this;
  }

   /**
   * Get correctResponsesPattern
   * @return correctResponsesPattern
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCorrectResponsesPattern() {
    return correctResponsesPattern;
  }

  public void setCorrectResponsesPattern(List<String> correctResponsesPattern) {
    this.correctResponsesPattern = correctResponsesPattern;
  }

  public XapiActivityDefinition choices(List<XapiInteractionComponent> choices) {
    this.choices = choices;
    return this;
  }

  public XapiActivityDefinition addChoicesItem(XapiInteractionComponent choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * Get choices
   * @return choices
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<XapiInteractionComponent> getChoices() {
    return choices;
  }

  public void setChoices(List<XapiInteractionComponent> choices) {
    this.choices = choices;
  }

  public XapiActivityDefinition scale(List<XapiInteractionComponent> scale) {
    this.scale = scale;
    return this;
  }

  public XapiActivityDefinition addScaleItem(XapiInteractionComponent scaleItem) {
    this.scale.add(scaleItem);
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<XapiInteractionComponent> getScale() {
    return scale;
  }

  public void setScale(List<XapiInteractionComponent> scale) {
    this.scale = scale;
  }

  public XapiActivityDefinition source(List<XapiInteractionComponent> source) {
    this.source = source;
    return this;
  }

  public XapiActivityDefinition addSourceItem(XapiInteractionComponent sourceItem) {
    this.source.add(sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<XapiInteractionComponent> getSource() {
    return source;
  }

  public void setSource(List<XapiInteractionComponent> source) {
    this.source = source;
  }

  public XapiActivityDefinition target(List<XapiInteractionComponent> target) {
    this.target = target;
    return this;
  }

  public XapiActivityDefinition addTargetItem(XapiInteractionComponent targetItem) {
    this.target.add(targetItem);
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<XapiInteractionComponent> getTarget() {
    return target;
  }

  public void setTarget(List<XapiInteractionComponent> target) {
    this.target = target;
  }

  public XapiActivityDefinition steps(List<XapiInteractionComponent> steps) {
    this.steps = steps;
    return this;
  }

  public XapiActivityDefinition addStepsItem(XapiInteractionComponent stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<XapiInteractionComponent> getSteps() {
    return steps;
  }

  public void setSteps(List<XapiInteractionComponent> steps) {
    this.steps = steps;
  }

  public XapiActivityDefinition extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }

  public XapiActivityDefinition putExtensionsItem(String key, Object extensionsItem) {
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
    XapiActivityDefinition xapiActivityDefinition = (XapiActivityDefinition) o;
    return Objects.equals(this.name, xapiActivityDefinition.name) &&
        Objects.equals(this.description, xapiActivityDefinition.description) &&
        Objects.equals(this.type, xapiActivityDefinition.type) &&
        Objects.equals(this.moreInfo, xapiActivityDefinition.moreInfo) &&
        Objects.equals(this.interactionType, xapiActivityDefinition.interactionType) &&
        Objects.equals(this.correctResponsesPattern, xapiActivityDefinition.correctResponsesPattern) &&
        Objects.equals(this.choices, xapiActivityDefinition.choices) &&
        Objects.equals(this.scale, xapiActivityDefinition.scale) &&
        Objects.equals(this.source, xapiActivityDefinition.source) &&
        Objects.equals(this.target, xapiActivityDefinition.target) &&
        Objects.equals(this.steps, xapiActivityDefinition.steps) &&
        Objects.equals(this.extensions, xapiActivityDefinition.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, moreInfo, interactionType, correctResponsesPattern, choices, scale, source, target, steps, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiActivityDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    correctResponsesPattern: ").append(toIndentedString(correctResponsesPattern)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

