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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ZoomiCompanyId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-20T12:48:59.622-05:00")
public class ZoomiCompanyId {
  @JsonProperty("zoomi_company_id")
  private String zoomiCompanyId = null;

  public ZoomiCompanyId zoomiCompanyId(String zoomiCompanyId) {
    this.zoomiCompanyId = zoomiCompanyId;
    return this;
  }

   /**
   * Get zoomiCompanyId
   * @return zoomiCompanyId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getZoomiCompanyId() {
    return zoomiCompanyId;
  }

  public void setZoomiCompanyId(String zoomiCompanyId) {
    this.zoomiCompanyId = zoomiCompanyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoomiCompanyId zoomiCompanyId = (ZoomiCompanyId) o;
    return Objects.equals(this.zoomiCompanyId, zoomiCompanyId.zoomiCompanyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoomiCompanyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoomiCompanyId {\n");
    
    sb.append("    zoomiCompanyId: ").append(toIndentedString(zoomiCompanyId)).append("\n");
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

