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


import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RegistrationSuccess
 */
public enum RegistrationSuccess {
  
  UNKNOWN("UNKNOWN"),
  
  PASSED("PASSED"),
  
  FAILED("FAILED");

  private String value;

  RegistrationSuccess(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RegistrationSuccess fromValue(String text) {
    for (RegistrationSuccess b : RegistrationSuccess.values()) {
        if (String.valueOf(b.value).equals(text)) {
            return b;
        }
    }
    return null;
  }
}

