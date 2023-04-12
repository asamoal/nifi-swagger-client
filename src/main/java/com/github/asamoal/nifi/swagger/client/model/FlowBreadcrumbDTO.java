/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.20.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.asamoal.nifi.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.asamoal.nifi.swagger.client.model.VersionControlInformationDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FlowBreadcrumbDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class FlowBreadcrumbDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("versionControlInformation")
  private VersionControlInformationDTO versionControlInformation = null;

  public FlowBreadcrumbDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the group.
   * @return id
  **/
  @Schema(description = "The id of the group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FlowBreadcrumbDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The id of the group.
   * @return name
  **/
  @Schema(description = "The id of the group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlowBreadcrumbDTO versionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
    return this;
  }

   /**
   * Get versionControlInformation
   * @return versionControlInformation
  **/
  @Schema(description = "")
  public VersionControlInformationDTO getVersionControlInformation() {
    return versionControlInformation;
  }

  public void setVersionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowBreadcrumbDTO flowBreadcrumbDTO = (FlowBreadcrumbDTO) o;
    return Objects.equals(this.id, flowBreadcrumbDTO.id) &&
        Objects.equals(this.name, flowBreadcrumbDTO.name) &&
        Objects.equals(this.versionControlInformation, flowBreadcrumbDTO.versionControlInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, versionControlInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowBreadcrumbDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionControlInformation: ").append(toIndentedString(versionControlInformation)).append("\n");
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
