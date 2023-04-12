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
import com.github.asamoal.nifi.swagger.client.model.DocumentedTypeDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ParameterProviderTypesEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class ParameterProviderTypesEntity {
  @SerializedName("parameterProviderTypes")
  private List<DocumentedTypeDTO> parameterProviderTypes = null;

  public ParameterProviderTypesEntity parameterProviderTypes(List<DocumentedTypeDTO> parameterProviderTypes) {
    this.parameterProviderTypes = parameterProviderTypes;
    return this;
  }

  public ParameterProviderTypesEntity addParameterProviderTypesItem(DocumentedTypeDTO parameterProviderTypesItem) {
    if (this.parameterProviderTypes == null) {
      this.parameterProviderTypes = new ArrayList<DocumentedTypeDTO>();
    }
    this.parameterProviderTypes.add(parameterProviderTypesItem);
    return this;
  }

   /**
   * Get parameterProviderTypes
   * @return parameterProviderTypes
  **/
  @Schema(description = "")
  public List<DocumentedTypeDTO> getParameterProviderTypes() {
    return parameterProviderTypes;
  }

  public void setParameterProviderTypes(List<DocumentedTypeDTO> parameterProviderTypes) {
    this.parameterProviderTypes = parameterProviderTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterProviderTypesEntity parameterProviderTypesEntity = (ParameterProviderTypesEntity) o;
    return Objects.equals(this.parameterProviderTypes, parameterProviderTypesEntity.parameterProviderTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterProviderTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterProviderTypesEntity {\n");
    
    sb.append("    parameterProviderTypes: ").append(toIndentedString(parameterProviderTypes)).append("\n");
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
