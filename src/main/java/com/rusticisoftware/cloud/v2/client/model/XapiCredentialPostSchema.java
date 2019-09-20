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
import com.rusticisoftware.cloud.v2.client.model.XapiCredentialAuthTypeSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiCredentialPermissionsLevelSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * XapiCredentialPostSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class XapiCredentialPostSchema {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("secret")
  private String secret = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("auth")
  private XapiCredentialAuthTypeSchema auth = null;

  @JsonProperty("permissionsLevel")
  private XapiCredentialPermissionsLevelSchema permissionsLevel = null;

  public XapiCredentialPostSchema name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public XapiCredentialPostSchema info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public XapiCredentialPostSchema secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public XapiCredentialPostSchema isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public XapiCredentialPostSchema auth(XapiCredentialAuthTypeSchema auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public XapiCredentialAuthTypeSchema getAuth() {
    return auth;
  }

  public void setAuth(XapiCredentialAuthTypeSchema auth) {
    this.auth = auth;
  }

  public XapiCredentialPostSchema permissionsLevel(XapiCredentialPermissionsLevelSchema permissionsLevel) {
    this.permissionsLevel = permissionsLevel;
    return this;
  }

   /**
   * Get permissionsLevel
   * @return permissionsLevel
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public XapiCredentialPermissionsLevelSchema getPermissionsLevel() {
    return permissionsLevel;
  }

  public void setPermissionsLevel(XapiCredentialPermissionsLevelSchema permissionsLevel) {
    this.permissionsLevel = permissionsLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiCredentialPostSchema xapiCredentialPostSchema = (XapiCredentialPostSchema) o;
    return Objects.equals(this.name, xapiCredentialPostSchema.name) &&
        Objects.equals(this.info, xapiCredentialPostSchema.info) &&
        Objects.equals(this.secret, xapiCredentialPostSchema.secret) &&
        Objects.equals(this.isEnabled, xapiCredentialPostSchema.isEnabled) &&
        Objects.equals(this.auth, xapiCredentialPostSchema.auth) &&
        Objects.equals(this.permissionsLevel, xapiCredentialPostSchema.permissionsLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, info, secret, isEnabled, auth, permissionsLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiCredentialPostSchema {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    permissionsLevel: ").append(toIndentedString(permissionsLevel)).append("\n");
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
