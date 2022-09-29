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
import com.rusticisoftware.cloud.v2.client.model.XapiCredentialAuthTypeSchema;
import com.rusticisoftware.cloud.v2.client.model.XapiCredentialPermissionsLevelSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * XapiCredentialPutSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T11:33:06.485-05:00")
public class XapiCredentialPutSchema {
  @JsonProperty("id")
  private String id = null;

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

  public XapiCredentialPutSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public XapiCredentialPutSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public XapiCredentialPutSchema info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public XapiCredentialPutSchema secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(value = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public XapiCredentialPutSchema isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Get isEnabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public XapiCredentialPutSchema auth(XapiCredentialAuthTypeSchema auth) {
    this.auth = auth;
    return this;
  }

  /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(value = "")
  public XapiCredentialAuthTypeSchema getAuth() {
    return auth;
  }

  public void setAuth(XapiCredentialAuthTypeSchema auth) {
    this.auth = auth;
  }

  public XapiCredentialPutSchema permissionsLevel(XapiCredentialPermissionsLevelSchema permissionsLevel) {
    this.permissionsLevel = permissionsLevel;
    return this;
  }

  /**
   * Get permissionsLevel
   * @return permissionsLevel
  **/
  @ApiModelProperty(value = "")
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
    XapiCredentialPutSchema xapiCredentialPutSchema = (XapiCredentialPutSchema) o;
    return Objects.equals(this.id, xapiCredentialPutSchema.id) &&
        Objects.equals(this.name, xapiCredentialPutSchema.name) &&
        Objects.equals(this.info, xapiCredentialPutSchema.info) &&
        Objects.equals(this.secret, xapiCredentialPutSchema.secret) &&
        Objects.equals(this.isEnabled, xapiCredentialPutSchema.isEnabled) &&
        Objects.equals(this.auth, xapiCredentialPutSchema.auth) &&
        Objects.equals(this.permissionsLevel, xapiCredentialPutSchema.permissionsLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, info, secret, isEnabled, auth, permissionsLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiCredentialPutSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

