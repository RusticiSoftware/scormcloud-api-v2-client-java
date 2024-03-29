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
import com.rusticisoftware.cloud.v2.client.model.PaginatedList;
import com.rusticisoftware.cloud.v2.client.model.PrivateInvitationSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PrivateInvitationList
 */
public class PrivateInvitationList extends PaginatedList {
  @JsonProperty("invitations")
  private List<PrivateInvitationSchema> invitations = null;

  public PrivateInvitationList invitations(List<PrivateInvitationSchema> invitations) {
    this.invitations = invitations;
    return this;
  }

  public PrivateInvitationList addInvitationsItem(PrivateInvitationSchema invitationsItem) {
    if (this.invitations == null) {
      this.invitations = new ArrayList<>();
    }
    this.invitations.add(invitationsItem);
    return this;
  }

  /**
   * A list of private invitation objects.
   * @return invitations
  **/
  @ApiModelProperty(value = "A list of private invitation objects.")
  public List<PrivateInvitationSchema> getInvitations() {
    return invitations;
  }

  public void setInvitations(List<PrivateInvitationSchema> invitations) {
    this.invitations = invitations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateInvitationList privateInvitationList = (PrivateInvitationList) o;
    return Objects.equals(this.invitations, privateInvitationList.invitations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitations, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateInvitationList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
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

