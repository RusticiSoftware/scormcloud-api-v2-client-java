/**
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0 beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.rusticisoftware.cloud.v2.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SettingMetadataValidValues
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T23:53:56.635-05:00")
public class SettingMetadataValidValues   {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueDescription")
  private String valueDescription = null;

  public SettingMetadataValidValues value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SettingMetadataValidValues valueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
    return this;
  }

   /**
   * Description of what this valid value means, how it will be applied if used in a setting
   * @return valueDescription
  **/
  @ApiModelProperty(example = "null", value = "Description of what this valid value means, how it will be applied if used in a setting")
  public String getValueDescription() {
    return valueDescription;
  }

  public void setValueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingMetadataValidValues settingMetadataValidValues = (SettingMetadataValidValues) o;
    return Objects.equals(this.value, settingMetadataValidValues.value) &&
        Objects.equals(this.valueDescription, settingMetadataValidValues.valueDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingMetadataValidValues {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueDescription: ").append(toIndentedString(valueDescription)).append("\n");
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
