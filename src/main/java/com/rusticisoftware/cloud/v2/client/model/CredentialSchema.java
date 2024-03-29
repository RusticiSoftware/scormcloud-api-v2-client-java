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
import java.time.OffsetDateTime;

/**
 * CredentialSchema
 */
public class CredentialSchema {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("credential")
  private String credential = null;

  @JsonProperty("pensCredential")
  private String pensCredential = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  public CredentialSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id for this credential
   * @return id
  **/
  @ApiModelProperty(value = "id for this credential")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CredentialSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name for this credential
   * @return name
  **/
  @ApiModelProperty(value = "name for this credential")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CredentialSchema credential(String credential) {
    this.credential = credential;
    return this;
  }

  /**
   * The newly created API credential
   * @return credential
  **/
  @ApiModelProperty(value = "The newly created API credential")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public CredentialSchema pensCredential(String pensCredential) {
    this.pensCredential = pensCredential;
    return this;
  }

  /**
   * The PENS key for this credential
   * @return pensCredential
  **/
  @ApiModelProperty(value = "The PENS key for this credential")
  public String getPensCredential() {
    return pensCredential;
  }

  public void setPensCredential(String pensCredential) {
    this.pensCredential = pensCredential;
  }

  public CredentialSchema status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CredentialSchema created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The time the API credential was created in UTC
   * @return created
  **/
  @ApiModelProperty(value = "The time the API credential was created in UTC")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public CredentialSchema updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The time the API credential was last updated in UTC
   * @return updated
  **/
  @ApiModelProperty(value = "The time the API credential was last updated in UTC")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialSchema credentialSchema = (CredentialSchema) o;
    return Objects.equals(this.id, credentialSchema.id) &&
        Objects.equals(this.name, credentialSchema.name) &&
        Objects.equals(this.credential, credentialSchema.credential) &&
        Objects.equals(this.pensCredential, credentialSchema.pensCredential) &&
        Objects.equals(this.status, credentialSchema.status) &&
        Objects.equals(this.created, credentialSchema.created) &&
        Objects.equals(this.updated, credentialSchema.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, credential, pensCredential, status, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    pensCredential: ").append(toIndentedString(pensCredential)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

