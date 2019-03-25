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
 * CompletionAmountSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T14:21:57.917-05:00")
public class CompletionAmountSchema   {
  @JsonProperty("scaled")
  private Double scaled = null;

  public CompletionAmountSchema scaled(Double scaled) {
    this.scaled = scaled;
    return this;
  }

   /**
   * Scaled completion amount between 0 and 100
   * @return scaled
  **/
  @ApiModelProperty(example = "null", value = "Scaled completion amount between 0 and 100")
  public Double getScaled() {
    return scaled;
  }

  public void setScaled(Double scaled) {
    this.scaled = scaled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionAmountSchema completionAmountSchema = (CompletionAmountSchema) o;
    return Objects.equals(this.scaled, completionAmountSchema.scaled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionAmountSchema {\n");
    
    sb.append("    scaled: ").append(toIndentedString(scaled)).append("\n");
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

