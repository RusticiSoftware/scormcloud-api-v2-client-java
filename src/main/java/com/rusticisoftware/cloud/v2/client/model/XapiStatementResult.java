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
import com.rusticisoftware.cloud.v2.client.model.XapiStatement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#42-retrieval-of-statements
 */
@ApiModel(description = "https://github.com/adlnet/xAPI-Spec/blob/1.0.2/xAPI.md#42-retrieval-of-statements")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T15:00:21.693-05:00")
public class XapiStatementResult {
  @JsonProperty("statements")
  private List<XapiStatement> statements = new ArrayList<>();

  @JsonProperty("more")
  private String more = null;

  public XapiStatementResult statements(List<XapiStatement> statements) {
    this.statements = statements;
    return this;
  }

  public XapiStatementResult addStatementsItem(XapiStatement statementsItem) {
    this.statements.add(statementsItem);
    return this;
  }

  /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(required = true, value = "")
  public List<XapiStatement> getStatements() {
    return statements;
  }

  public void setStatements(List<XapiStatement> statements) {
    this.statements = statements;
  }

  public XapiStatementResult more(String more) {
    this.more = more;
    return this;
  }

  /**
   * Get more
   * @return more
  **/
  @ApiModelProperty(value = "")
  public String getMore() {
    return more;
  }

  public void setMore(String more) {
    this.more = more;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XapiStatementResult xapiStatementResult = (XapiStatementResult) o;
    return Objects.equals(this.statements, xapiStatementResult.statements) &&
        Objects.equals(this.more, xapiStatementResult.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statements, more);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XapiStatementResult {\n");
    
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
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

