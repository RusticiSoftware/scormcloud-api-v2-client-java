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
 * XapiCredentialAuthTypeSchema
 */
public class XapiCredentialAuthTypeSchema {
  /**
   * Gets or Sets xapiCredentialAuthType
   */
  public enum XapiCredentialAuthTypeEnum {
    BASICAUTH("BASICAUTH"),
    
    OAUTH("OAUTH");

    private String value;

    XapiCredentialAuthTypeEnum(String value) {
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
    public static XapiCredentialAuthTypeEnum fromValue(String value) {
      for (XapiCredentialAuthTypeEnum b : XapiCredentialAuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("xapiCredentialAuthType")
  private XapiCredentialAuthTypeEnum xapiCredentialAuthType = null;

  public XapiCredentialAuthTypeSchema xapiCredentialAuthType(XapiCredentialAuthTypeEnum xapiCredentialAuthType) {
    this.xapiCredentialAuthType = xapiCredentialAuthType;
    return this;
  }

  /**
   * Get xapiCredentialAuthType
   * @return xapiCredentialAuthType
  **/
  @ApiModelProperty(value = "")
  public XapiCredentialAuthTypeEnum getXapiCredentialAuthType() {
    return xapiCredentialAuthType;
  }

  public void setXapiCredentialAuthType(XapiCredentialAuthTypeEnum xapiCredentialAuthType) {
    this.xapiCredentialAuthType = xapiCredentialAuthType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiCredentialAuthTypeSchema xapiCredentialAuthTypeSchema = (XapiCredentialAuthTypeSchema) o;
    return Objects.equals(this.xapiCredentialAuthType, xapiCredentialAuthTypeSchema.xapiCredentialAuthType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xapiCredentialAuthType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiCredentialAuthTypeSchema {\n");
    
    sb.append("    xapiCredentialAuthType: ").append(toIndentedString(xapiCredentialAuthType)).append("\n");
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

