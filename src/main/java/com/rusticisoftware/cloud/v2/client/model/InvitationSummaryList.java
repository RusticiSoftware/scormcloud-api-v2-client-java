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
import com.rusticisoftware.cloud.v2.client.model.InvitationSummarySchema;
import com.rusticisoftware.cloud.v2.client.model.PaginatedList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * InvitationSummaryList
 */
public class InvitationSummaryList extends PaginatedList {
  @JsonProperty("invitations")
  private List<InvitationSummarySchema> invitations = null;

  public InvitationSummaryList invitations(List<InvitationSummarySchema> invitations) {
    this.invitations = invitations;
    return this;
  }

  public InvitationSummaryList addInvitationsItem(InvitationSummarySchema invitationsItem) {
    if (this.invitations == null) {
      this.invitations = new ArrayList<>();
    }
    this.invitations.add(invitationsItem);
    return this;
  }

  /**
   * A list of invitation overview objects.
   * @return invitations
  **/
  @ApiModelProperty(value = "A list of invitation overview objects.")
  public List<InvitationSummarySchema> getInvitations() {
    return invitations;
  }

  public void setInvitations(List<InvitationSummarySchema> invitations) {
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
    InvitationSummaryList invitationSummaryList = (InvitationSummaryList) o;
    return Objects.equals(this.invitations, invitationSummaryList.invitations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitations, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationSummaryList {\n");
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

