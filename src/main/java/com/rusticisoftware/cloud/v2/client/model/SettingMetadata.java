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
import com.rusticisoftware.cloud.v2.client.model.SettingValidValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SettingMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-05T13:19:45.469-05:00")
public class SettingMetadata {
  @JsonProperty("default")
  private String _default = null;

  @JsonProperty("dataType")
  private String dataType = null;

  @JsonProperty("settingDescription")
  private String settingDescription = null;

  @JsonProperty("level")
  private String level = null;

  @JsonProperty("learningStandards")
  private List<String> learningStandards = null;

  /**
   * Does this setting apply to only single-SCO packages, only multi-SCO, or either?
   */
  public enum LearningStandardVariantEnum {
    SINGLESCOONLY("singleScoOnly"),
    
    MULTISCOONLY("multiScoOnly"),
    
    EITHER("either");

    private String value;

    LearningStandardVariantEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LearningStandardVariantEnum fromValue(String value) {
      for (LearningStandardVariantEnum b : LearningStandardVariantEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("learningStandardVariant")
  private LearningStandardVariantEnum learningStandardVariant = LearningStandardVariantEnum.EITHER;

  @JsonProperty("fallback")
  private String fallback = null;

  @JsonProperty("validValues")
  private List<SettingValidValue> validValues = null;

  public SettingMetadata _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Default value of this setting
   * @return _default
  **/
  @ApiModelProperty(value = "Default value of this setting")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public SettingMetadata dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The data type of this setting
   * @return dataType
  **/
  @ApiModelProperty(value = "The data type of this setting")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public SettingMetadata settingDescription(String settingDescription) {
    this.settingDescription = settingDescription;
    return this;
  }

  /**
   * description of this setting
   * @return settingDescription
  **/
  @ApiModelProperty(value = "description of this setting")
  public String getSettingDescription() {
    return settingDescription;
  }

  public void setSettingDescription(String settingDescription) {
    this.settingDescription = settingDescription;
  }

  public SettingMetadata level(String level) {
    this.level = level;
    return this;
  }

  /**
   * The level this setting will be applied at, which limits where it can be set. For example, WebPathToContentRoot is applied at the application level, so it&#39;s not valid to set it for a registration.
   * @return level
  **/
  @ApiModelProperty(value = "The level this setting will be applied at, which limits where it can be set. For example, WebPathToContentRoot is applied at the application level, so it's not valid to set it for a registration.")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public SettingMetadata learningStandards(List<String> learningStandards) {
    this.learningStandards = learningStandards;
    return this;
  }

  public SettingMetadata addLearningStandardsItem(String learningStandardsItem) {
    if (this.learningStandards == null) {
      this.learningStandards = new ArrayList<>();
    }
    this.learningStandards.add(learningStandardsItem);
    return this;
  }

  /**
   * The list of learning standards this setting applies to. If not present, this setting is not limited to certain learning standards.
   * @return learningStandards
  **/
  @ApiModelProperty(value = "The list of learning standards this setting applies to. If not present, this setting is not limited to certain learning standards.")
  public List<String> getLearningStandards() {
    return learningStandards;
  }

  public void setLearningStandards(List<String> learningStandards) {
    this.learningStandards = learningStandards;
  }

  public SettingMetadata learningStandardVariant(LearningStandardVariantEnum learningStandardVariant) {
    this.learningStandardVariant = learningStandardVariant;
    return this;
  }

  /**
   * Does this setting apply to only single-SCO packages, only multi-SCO, or either?
   * @return learningStandardVariant
  **/
  @ApiModelProperty(value = "Does this setting apply to only single-SCO packages, only multi-SCO, or either?")
  public LearningStandardVariantEnum getLearningStandardVariant() {
    return learningStandardVariant;
  }

  public void setLearningStandardVariant(LearningStandardVariantEnum learningStandardVariant) {
    this.learningStandardVariant = learningStandardVariant;
  }

  public SettingMetadata fallback(String fallback) {
    this.fallback = fallback;
    return this;
  }

  /**
   * A setting that will be used instead of this setting if no value is provided for this setting (This is similar to a default, except that the the value of another setting is being used instead of a fixed default value).
   * @return fallback
  **/
  @ApiModelProperty(value = "A setting that will be used instead of this setting if no value is provided for this setting (This is similar to a default, except that the the value of another setting is being used instead of a fixed default value).")
  public String getFallback() {
    return fallback;
  }

  public void setFallback(String fallback) {
    this.fallback = fallback;
  }

  public SettingMetadata validValues(List<SettingValidValue> validValues) {
    this.validValues = validValues;
    return this;
  }

  public SettingMetadata addValidValuesItem(SettingValidValue validValuesItem) {
    if (this.validValues == null) {
      this.validValues = new ArrayList<>();
    }
    this.validValues.add(validValuesItem);
    return this;
  }

  /**
   * For settings with a fixed list of valid values, the list of those values
   * @return validValues
  **/
  @ApiModelProperty(value = "For settings with a fixed list of valid values, the list of those values")
  public List<SettingValidValue> getValidValues() {
    return validValues;
  }

  public void setValidValues(List<SettingValidValue> validValues) {
    this.validValues = validValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingMetadata settingMetadata = (SettingMetadata) o;
    return Objects.equals(this._default, settingMetadata._default) &&
        Objects.equals(this.dataType, settingMetadata.dataType) &&
        Objects.equals(this.settingDescription, settingMetadata.settingDescription) &&
        Objects.equals(this.level, settingMetadata.level) &&
        Objects.equals(this.learningStandards, settingMetadata.learningStandards) &&
        Objects.equals(this.learningStandardVariant, settingMetadata.learningStandardVariant) &&
        Objects.equals(this.fallback, settingMetadata.fallback) &&
        Objects.equals(this.validValues, settingMetadata.validValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, dataType, settingDescription, level, learningStandards, learningStandardVariant, fallback, validValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingMetadata {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    settingDescription: ").append(toIndentedString(settingDescription)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    learningStandards: ").append(toIndentedString(learningStandards)).append("\n");
    sb.append("    learningStandardVariant: ").append(toIndentedString(learningStandardVariant)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
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

