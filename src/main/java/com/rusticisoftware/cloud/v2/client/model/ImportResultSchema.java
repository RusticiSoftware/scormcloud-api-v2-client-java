/**
 * SCORM Cloud Rest API
 * REST API used for SCORM Cloud integrations.
 *
 * OpenAPI spec version: 2.0 beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.rusticisoftware.cloud.v2.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rusticisoftware.cloud.v2.client.model.CourseSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ImportResultSchema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T14:21:57.917-05:00")
public class ImportResultSchema   {
  @JsonProperty("webPathToCourse")
  private String webPathToCourse = null;

  @JsonProperty("parserWarnings")
  private List<String> parserWarnings = new ArrayList<String>();

  @JsonProperty("courseLanguages")
  private List<String> courseLanguages = new ArrayList<String>();

  @JsonProperty("course")
  private CourseSchema course = null;

  public ImportResultSchema webPathToCourse(String webPathToCourse) {
    this.webPathToCourse = webPathToCourse;
    return this;
  }

   /**
   * web path to this course
   * @return webPathToCourse
  **/
  @ApiModelProperty(example = "null", value = "web path to this course")
  public String getWebPathToCourse() {
    return webPathToCourse;
  }

  public void setWebPathToCourse(String webPathToCourse) {
    this.webPathToCourse = webPathToCourse;
  }

  public ImportResultSchema parserWarnings(List<String> parserWarnings) {
    this.parserWarnings = parserWarnings;
    return this;
  }

  public ImportResultSchema addParserWarningsItem(String parserWarningsItem) {
    this.parserWarnings.add(parserWarningsItem);
    return this;
  }

   /**
   * Get parserWarnings
   * @return parserWarnings
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getParserWarnings() {
    return parserWarnings;
  }

  public void setParserWarnings(List<String> parserWarnings) {
    this.parserWarnings = parserWarnings;
  }

  public ImportResultSchema courseLanguages(List<String> courseLanguages) {
    this.courseLanguages = courseLanguages;
    return this;
  }

  public ImportResultSchema addCourseLanguagesItem(String courseLanguagesItem) {
    this.courseLanguages.add(courseLanguagesItem);
    return this;
  }

   /**
   * Get courseLanguages
   * @return courseLanguages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCourseLanguages() {
    return courseLanguages;
  }

  public void setCourseLanguages(List<String> courseLanguages) {
    this.courseLanguages = courseLanguages;
  }

  public ImportResultSchema course(CourseSchema course) {
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @ApiModelProperty(example = "null", value = "")
  public CourseSchema getCourse() {
    return course;
  }

  public void setCourse(CourseSchema course) {
    this.course = course;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportResultSchema importResultSchema = (ImportResultSchema) o;
    return Objects.equals(this.webPathToCourse, importResultSchema.webPathToCourse) &&
        Objects.equals(this.parserWarnings, importResultSchema.parserWarnings) &&
        Objects.equals(this.courseLanguages, importResultSchema.courseLanguages) &&
        Objects.equals(this.course, importResultSchema.course);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webPathToCourse, parserWarnings, courseLanguages, course);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportResultSchema {\n");
    
    sb.append("    webPathToCourse: ").append(toIndentedString(webPathToCourse)).append("\n");
    sb.append("    parserWarnings: ").append(toIndentedString(parserWarnings)).append("\n");
    sb.append("    courseLanguages: ").append(toIndentedString(courseLanguages)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
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

