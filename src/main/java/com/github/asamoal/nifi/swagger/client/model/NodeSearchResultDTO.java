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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NodeSearchResultDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class NodeSearchResultDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("address")
  private String address = null;

  public NodeSearchResultDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the node that matched the search.
   * @return id
  **/
  @Schema(description = "The id of the node that matched the search.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NodeSearchResultDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address of the node that matched the search.
   * @return address
  **/
  @Schema(description = "The address of the node that matched the search.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeSearchResultDTO nodeSearchResultDTO = (NodeSearchResultDTO) o;
    return Objects.equals(this.id, nodeSearchResultDTO.id) &&
        Objects.equals(this.address, nodeSearchResultDTO.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSearchResultDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
