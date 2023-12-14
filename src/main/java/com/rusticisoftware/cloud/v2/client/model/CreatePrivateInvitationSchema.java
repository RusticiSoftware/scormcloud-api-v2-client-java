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
import com.rusticisoftware.cloud.v2.client.model.InvitationEmailSchema;
import com.rusticisoftware.cloud.v2.client.model.PostBackSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CreatePrivateInvitationSchema
 */
public class CreatePrivateInvitationSchema {
  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("creatingUserEmail")
  private String creatingUserEmail = null;

  @JsonProperty("invitationEmail")
  private InvitationEmailSchema invitationEmail = null;

  @JsonProperty("postBack")
  private PostBackSchema postBack = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  /**
   * Represents the possible values that determine how existing registrations will be handled when an invitation is sent to an email address that has already received an invitation:   - &#x60;FAIL&#x60;: Do not create a new invitation, do not send an email, and do nothing with registrations   - &#x60;INSTANCE_EXISTING&#x60;: Create a new instance of the existing registration and send it with the invitation   - &#x60;SEND_EXISTING&#x60;: Re-send the existing registration with the new invitation   - &#x60;CREATE_NEW&#x60;: Create a new registration for the invitation 
   */
  public enum DuplicateRegistrationOptionEnum {
    FAIL("FAIL"),
    
    INSTANCE_EXISTING("INSTANCE_EXISTING"),
    
    SEND_EXISTING("SEND_EXISTING"),
    
    CREATE_NEW("CREATE_NEW");

    private String value;

    DuplicateRegistrationOptionEnum(String value) {
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
    public static DuplicateRegistrationOptionEnum fromValue(String value) {
      for (DuplicateRegistrationOptionEnum b : DuplicateRegistrationOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("duplicateRegistrationOption")
  private DuplicateRegistrationOptionEnum duplicateRegistrationOption = DuplicateRegistrationOptionEnum.SEND_EXISTING;

  public CreatePrivateInvitationSchema courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * The id of the course for which to create an invitation.
   * @return courseId
  **/
  @ApiModelProperty(required = true, value = "The id of the course for which to create an invitation.")
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public CreatePrivateInvitationSchema creatingUserEmail(String creatingUserEmail) {
    this.creatingUserEmail = creatingUserEmail;
    return this;
  }

  /**
   * The email of the user who is creating the invitation.
   * @return creatingUserEmail
  **/
  @ApiModelProperty(required = true, value = "The email of the user who is creating the invitation.")
  public String getCreatingUserEmail() {
    return creatingUserEmail;
  }

  public void setCreatingUserEmail(String creatingUserEmail) {
    this.creatingUserEmail = creatingUserEmail;
  }

  public CreatePrivateInvitationSchema invitationEmail(InvitationEmailSchema invitationEmail) {
    this.invitationEmail = invitationEmail;
    return this;
  }

  /**
   * Get invitationEmail
   * @return invitationEmail
  **/
  @ApiModelProperty(required = true, value = "")
  public InvitationEmailSchema getInvitationEmail() {
    return invitationEmail;
  }

  public void setInvitationEmail(InvitationEmailSchema invitationEmail) {
    this.invitationEmail = invitationEmail;
  }

  public CreatePrivateInvitationSchema postBack(PostBackSchema postBack) {
    this.postBack = postBack;
    return this;
  }

  /**
   * Specifies a URL for which to post activity and status data in real time as the course is completed
   * @return postBack
  **/
  @ApiModelProperty(value = "Specifies a URL for which to post activity and status data in real time as the course is completed")
  public PostBackSchema getPostBack() {
    return postBack;
  }

  public void setPostBack(PostBackSchema postBack) {
    this.postBack = postBack;
  }

  public CreatePrivateInvitationSchema expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The ISO 8601 TimeStamp (defaults to UTC) after which this invitation will expire and can no longer be launched. An empty value will represent no expiration date. 
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The ISO 8601 TimeStamp (defaults to UTC) after which this invitation will expire and can no longer be launched. An empty value will represent no expiration date. ")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CreatePrivateInvitationSchema tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreatePrivateInvitationSchema addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Optional tags to be applied to this invitation.
   * @return tags
  **/
  @ApiModelProperty(value = "Optional tags to be applied to this invitation.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CreatePrivateInvitationSchema duplicateRegistrationOption(DuplicateRegistrationOptionEnum duplicateRegistrationOption) {
    this.duplicateRegistrationOption = duplicateRegistrationOption;
    return this;
  }

  /**
   * Represents the possible values that determine how existing registrations will be handled when an invitation is sent to an email address that has already received an invitation:   - &#x60;FAIL&#x60;: Do not create a new invitation, do not send an email, and do nothing with registrations   - &#x60;INSTANCE_EXISTING&#x60;: Create a new instance of the existing registration and send it with the invitation   - &#x60;SEND_EXISTING&#x60;: Re-send the existing registration with the new invitation   - &#x60;CREATE_NEW&#x60;: Create a new registration for the invitation 
   * @return duplicateRegistrationOption
  **/
  @ApiModelProperty(value = "Represents the possible values that determine how existing registrations will be handled when an invitation is sent to an email address that has already received an invitation:   - `FAIL`: Do not create a new invitation, do not send an email, and do nothing with registrations   - `INSTANCE_EXISTING`: Create a new instance of the existing registration and send it with the invitation   - `SEND_EXISTING`: Re-send the existing registration with the new invitation   - `CREATE_NEW`: Create a new registration for the invitation ")
  public DuplicateRegistrationOptionEnum getDuplicateRegistrationOption() {
    return duplicateRegistrationOption;
  }

  public void setDuplicateRegistrationOption(DuplicateRegistrationOptionEnum duplicateRegistrationOption) {
    this.duplicateRegistrationOption = duplicateRegistrationOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePrivateInvitationSchema createPrivateInvitationSchema = (CreatePrivateInvitationSchema) o;
    return Objects.equals(this.courseId, createPrivateInvitationSchema.courseId) &&
        Objects.equals(this.creatingUserEmail, createPrivateInvitationSchema.creatingUserEmail) &&
        Objects.equals(this.invitationEmail, createPrivateInvitationSchema.invitationEmail) &&
        Objects.equals(this.postBack, createPrivateInvitationSchema.postBack) &&
        Objects.equals(this.expirationDate, createPrivateInvitationSchema.expirationDate) &&
        Objects.equals(this.tags, createPrivateInvitationSchema.tags) &&
        Objects.equals(this.duplicateRegistrationOption, createPrivateInvitationSchema.duplicateRegistrationOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, creatingUserEmail, invitationEmail, postBack, expirationDate, tags, duplicateRegistrationOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateInvitationSchema {\n");
    
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    creatingUserEmail: ").append(toIndentedString(creatingUserEmail)).append("\n");
    sb.append("    invitationEmail: ").append(toIndentedString(invitationEmail)).append("\n");
    sb.append("    postBack: ").append(toIndentedString(postBack)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    duplicateRegistrationOption: ").append(toIndentedString(duplicateRegistrationOption)).append("\n");
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

