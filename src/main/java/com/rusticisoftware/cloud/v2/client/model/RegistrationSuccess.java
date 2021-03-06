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

