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
import com.github.asamoal.nifi.swagger.client.model.RemoteProcessGroupStatusSnapshotDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NodeRemoteProcessGroupStatusSnapshotDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class NodeRemoteProcessGroupStatusSnapshotDTO {
  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("apiPort")
  private Integer apiPort = null;

  @SerializedName("statusSnapshot")
  private RemoteProcessGroupStatusSnapshotDTO statusSnapshot = null;

  public NodeRemoteProcessGroupStatusSnapshotDTO nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * The unique ID that identifies the node
   * @return nodeId
  **/
  @Schema(description = "The unique ID that identifies the node")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeRemoteProcessGroupStatusSnapshotDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The API address of the node
   * @return address
  **/
  @Schema(description = "The API address of the node")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NodeRemoteProcessGroupStatusSnapshotDTO apiPort(Integer apiPort) {
    this.apiPort = apiPort;
    return this;
  }

   /**
   * The API port used to communicate with the node
   * @return apiPort
  **/
  @Schema(description = "The API port used to communicate with the node")
  public Integer getApiPort() {
    return apiPort;
  }

  public void setApiPort(Integer apiPort) {
    this.apiPort = apiPort;
  }

  public NodeRemoteProcessGroupStatusSnapshotDTO statusSnapshot(RemoteProcessGroupStatusSnapshotDTO statusSnapshot) {
    this.statusSnapshot = statusSnapshot;
    return this;
  }

   /**
   * Get statusSnapshot
   * @return statusSnapshot
  **/
  @Schema(description = "")
  public RemoteProcessGroupStatusSnapshotDTO getStatusSnapshot() {
    return statusSnapshot;
  }

  public void setStatusSnapshot(RemoteProcessGroupStatusSnapshotDTO statusSnapshot) {
    this.statusSnapshot = statusSnapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeRemoteProcessGroupStatusSnapshotDTO nodeRemoteProcessGroupStatusSnapshotDTO = (NodeRemoteProcessGroupStatusSnapshotDTO) o;
    return Objects.equals(this.nodeId, nodeRemoteProcessGroupStatusSnapshotDTO.nodeId) &&
        Objects.equals(this.address, nodeRemoteProcessGroupStatusSnapshotDTO.address) &&
        Objects.equals(this.apiPort, nodeRemoteProcessGroupStatusSnapshotDTO.apiPort) &&
        Objects.equals(this.statusSnapshot, nodeRemoteProcessGroupStatusSnapshotDTO.statusSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, statusSnapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeRemoteProcessGroupStatusSnapshotDTO {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    statusSnapshot: ").append(toIndentedString(statusSnapshot)).append("\n");
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
