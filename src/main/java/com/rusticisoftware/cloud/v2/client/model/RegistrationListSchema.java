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
import com.rusticisoftware.cloud.v2.client.model.RegistrationSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * RegistrationListSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T23:53:56.635-05:00")
public class RegistrationListSchema   {
  @JsonProperty("registrations")
  private List<RegistrationSchema> registrations = new ArrayList<RegistrationSchema>();

  @JsonProperty("more")
  private String more = null;

  public RegistrationListSchema registrations(List<RegistrationSchema> registrations) {
    this.registrations = registrations;
    return this;
  }

  public RegistrationListSchema addRegistrationsItem(RegistrationSchema registrationsItem) {
    this.registrations.add(registrationsItem);
    return this;
  }

   /**
   * Get registrations
   * @return registrations
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<RegistrationSchema> getRegistrations() {
    return registrations;
  }

  public void setRegistrations(List<RegistrationSchema> registrations) {
    this.registrations = registrations;
  }

  public RegistrationListSchema more(String more) {
    this.more = more;
    return this;
  }

   /**
   * Get more
   * @return more
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMore() {
    return more;
  }

  public void setMore(String more) {
    this.more = more;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationListSchema registrationListSchema = (RegistrationListSchema) o;
    return Objects.equals(this.registrations, registrationListSchema.registrations) &&
        Objects.equals(this.more, registrationListSchema.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrations, more);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationListSchema {\n");
    
    sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
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

