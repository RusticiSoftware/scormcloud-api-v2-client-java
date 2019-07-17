/*
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0 beta
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
import com.rusticisoftware.cloud.v2.client.model.SettingItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SettingListSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-16T16:01:27.387-05:00")
public class SettingListSchema {
  @JsonProperty("settingItems")
  private List<SettingItem> settingItems = new ArrayList<SettingItem>();

  public SettingListSchema settingItems(List<SettingItem> settingItems) {
    this.settingItems = settingItems;
    return this;
  }

  public SettingListSchema addSettingItemsItem(SettingItem settingItemsItem) {
    this.settingItems.add(settingItemsItem);
    return this;
  }

   /**
   * Get settingItems
   * @return settingItems
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<SettingItem> getSettingItems() {
    return settingItems;
  }

  public void setSettingItems(List<SettingItem> settingItems) {
    this.settingItems = settingItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingListSchema settingListSchema = (SettingListSchema) o;
    return Objects.equals(this.settingItems, settingListSchema.settingItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingListSchema {\n");
    
    sb.append("    settingItems: ").append(toIndentedString(settingItems)).append("\n");
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

