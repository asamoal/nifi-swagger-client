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
import com.github.asamoal.nifi.swagger.client.model.StatusSnapshotDTO;
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
 * NodeStatusSnapshotsDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class NodeStatusSnapshotsDTO {
  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("apiPort")
  private Integer apiPort = null;

  @SerializedName("statusSnapshots")
  private List<StatusSnapshotDTO> statusSnapshots = null;

  public NodeStatusSnapshotsDTO nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * The id of the node.
   * @return nodeId
  **/
  @Schema(description = "The id of the node.")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodeStatusSnapshotsDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The node&#x27;s host/ip address.
   * @return address
  **/
  @Schema(description = "The node's host/ip address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NodeStatusSnapshotsDTO apiPort(Integer apiPort) {
    this.apiPort = apiPort;
    return this;
  }

   /**
   * The port the node is listening for API requests.
   * @return apiPort
  **/
  @Schema(description = "The port the node is listening for API requests.")
  public Integer getApiPort() {
    return apiPort;
  }

  public void setApiPort(Integer apiPort) {
    this.apiPort = apiPort;
  }

  public NodeStatusSnapshotsDTO statusSnapshots(List<StatusSnapshotDTO> statusSnapshots) {
    this.statusSnapshots = statusSnapshots;
    return this;
  }

  public NodeStatusSnapshotsDTO addStatusSnapshotsItem(StatusSnapshotDTO statusSnapshotsItem) {
    if (this.statusSnapshots == null) {
      this.statusSnapshots = new ArrayList<StatusSnapshotDTO>();
    }
    this.statusSnapshots.add(statusSnapshotsItem);
    return this;
  }

   /**
   * A list of StatusSnapshotDTO objects that provide the actual metric values for the component for this node.
   * @return statusSnapshots
  **/
  @Schema(description = "A list of StatusSnapshotDTO objects that provide the actual metric values for the component for this node.")
  public List<StatusSnapshotDTO> getStatusSnapshots() {
    return statusSnapshots;
  }

  public void setStatusSnapshots(List<StatusSnapshotDTO> statusSnapshots) {
    this.statusSnapshots = statusSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatusSnapshotsDTO nodeStatusSnapshotsDTO = (NodeStatusSnapshotsDTO) o;
    return Objects.equals(this.nodeId, nodeStatusSnapshotsDTO.nodeId) &&
        Objects.equals(this.address, nodeStatusSnapshotsDTO.address) &&
        Objects.equals(this.apiPort, nodeStatusSnapshotsDTO.apiPort) &&
        Objects.equals(this.statusSnapshots, nodeStatusSnapshotsDTO.statusSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, statusSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusSnapshotsDTO {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    statusSnapshots: ").append(toIndentedString(statusSnapshots)).append("\n");
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
