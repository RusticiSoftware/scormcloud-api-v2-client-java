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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SettingsIndividualSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class SettingsIndividualSchema {
  @JsonProperty("settingId")
  private String settingId = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("explicit")
  private Boolean explicit = false;

  public SettingsIndividualSchema settingId(String settingId) {
    this.settingId = settingId;
    return this;
  }

  /**
   * Get settingId
   * @return settingId
  **/
  @ApiModelProperty(value = "")
  public String getSettingId() {
    return settingId;
  }

  public void setSettingId(String settingId) {
    this.settingId = settingId;
  }

  public SettingsIndividualSchema value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SettingsIndividualSchema explicit(Boolean explicit) {
    this.explicit = explicit;
    return this;
  }

  /**
   * Get explicit
   * @return explicit
  **/
  @ApiModelProperty(value = "")
  public Boolean isExplicit() {
    return explicit;
  }

  public void setExplicit(Boolean explicit) {
    this.explicit = explicit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsIndividualSchema settingsIndividualSchema = (SettingsIndividualSchema) o;
    return Objects.equals(this.settingId, settingsIndividualSchema.settingId) &&
        Objects.equals(this.value, settingsIndividualSchema.value) &&
        Objects.equals(this.explicit, settingsIndividualSchema.explicit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingId, value, explicit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsIndividualSchema {\n");
    
    sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
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

