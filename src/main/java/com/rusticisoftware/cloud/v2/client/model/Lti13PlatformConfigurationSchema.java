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
 * Lti13PlatformConfigurationSchema
 */
public class Lti13PlatformConfigurationSchema {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("platformIssuerIdentifier")
  private String platformIssuerIdentifier = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("oidcAuthorizationEndpoint")
  private String oidcAuthorizationEndpoint = null;

  @JsonProperty("jsonWebKeySetUrl")
  private String jsonWebKeySetUrl = null;

  @JsonProperty("accessTokenUrl")
  private String accessTokenUrl = null;

  public Lti13PlatformConfigurationSchema clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth2 client Id for this tool
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "OAuth2 client Id for this tool")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Lti13PlatformConfigurationSchema platformIssuerIdentifier(String platformIssuerIdentifier) {
    this.platformIssuerIdentifier = platformIssuerIdentifier;
    return this;
  }

  /**
   * Issuer identifier identifying the learning platform
   * @return platformIssuerIdentifier
  **/
  @ApiModelProperty(required = true, value = "Issuer identifier identifying the learning platform")
  public String getPlatformIssuerIdentifier() {
    return platformIssuerIdentifier;
  }

  public void setPlatformIssuerIdentifier(String platformIssuerIdentifier) {
    this.platformIssuerIdentifier = platformIssuerIdentifier;
  }

  public Lti13PlatformConfigurationSchema deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * An unchanging identifier (locally unique within the platformIssuerIdentifier) for the platform-tool integration
   * @return deploymentId
  **/
  @ApiModelProperty(required = true, value = "An unchanging identifier (locally unique within the platformIssuerIdentifier) for the platform-tool integration")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public Lti13PlatformConfigurationSchema oidcAuthorizationEndpoint(String oidcAuthorizationEndpoint) {
    this.oidcAuthorizationEndpoint = oidcAuthorizationEndpoint;
    return this;
  }

  /**
   * Endpoint that will initiate the OIDC Authentication Request
   * @return oidcAuthorizationEndpoint
  **/
  @ApiModelProperty(required = true, value = "Endpoint that will initiate the OIDC Authentication Request")
  public String getOidcAuthorizationEndpoint() {
    return oidcAuthorizationEndpoint;
  }

  public void setOidcAuthorizationEndpoint(String oidcAuthorizationEndpoint) {
    this.oidcAuthorizationEndpoint = oidcAuthorizationEndpoint;
  }

  public Lti13PlatformConfigurationSchema jsonWebKeySetUrl(String jsonWebKeySetUrl) {
    this.jsonWebKeySetUrl = jsonWebKeySetUrl;
    return this;
  }

  /**
   * Path to the platform&#39;s JSON Web Key Set
   * @return jsonWebKeySetUrl
  **/
  @ApiModelProperty(required = true, value = "Path to the platform's JSON Web Key Set")
  public String getJsonWebKeySetUrl() {
    return jsonWebKeySetUrl;
  }

  public void setJsonWebKeySetUrl(String jsonWebKeySetUrl) {
    this.jsonWebKeySetUrl = jsonWebKeySetUrl;
  }

  public Lti13PlatformConfigurationSchema accessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
    return this;
  }

  /**
   * Endpoint that will return OAuth 2 access tokens for the platform
   * @return accessTokenUrl
  **/
  @ApiModelProperty(value = "Endpoint that will return OAuth 2 access tokens for the platform")
  public String getAccessTokenUrl() {
    return accessTokenUrl;
  }

  public void setAccessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lti13PlatformConfigurationSchema lti13PlatformConfigurationSchema = (Lti13PlatformConfigurationSchema) o;
    return Objects.equals(this.clientId, lti13PlatformConfigurationSchema.clientId) &&
        Objects.equals(this.platformIssuerIdentifier, lti13PlatformConfigurationSchema.platformIssuerIdentifier) &&
        Objects.equals(this.deploymentId, lti13PlatformConfigurationSchema.deploymentId) &&
        Objects.equals(this.oidcAuthorizationEndpoint, lti13PlatformConfigurationSchema.oidcAuthorizationEndpoint) &&
        Objects.equals(this.jsonWebKeySetUrl, lti13PlatformConfigurationSchema.jsonWebKeySetUrl) &&
        Objects.equals(this.accessTokenUrl, lti13PlatformConfigurationSchema.accessTokenUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, platformIssuerIdentifier, deploymentId, oidcAuthorizationEndpoint, jsonWebKeySetUrl, accessTokenUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lti13PlatformConfigurationSchema {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    platformIssuerIdentifier: ").append(toIndentedString(platformIssuerIdentifier)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    oidcAuthorizationEndpoint: ").append(toIndentedString(oidcAuthorizationEndpoint)).append("\n");
    sb.append("    jsonWebKeySetUrl: ").append(toIndentedString(jsonWebKeySetUrl)).append("\n");
    sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
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

