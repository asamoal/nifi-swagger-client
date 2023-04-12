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
 * RemoteQueuePartitionDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class RemoteQueuePartitionDTO {
  @SerializedName("totalFlowFileCount")
  private Integer totalFlowFileCount = null;

  @SerializedName("totalByteCount")
  private Long totalByteCount = null;

  @SerializedName("activeQueueFlowFileCount")
  private Integer activeQueueFlowFileCount = null;

  @SerializedName("activeQueueByteCount")
  private Long activeQueueByteCount = null;

  @SerializedName("swapFlowFileCount")
  private Integer swapFlowFileCount = null;

  @SerializedName("swapByteCount")
  private Long swapByteCount = null;

  @SerializedName("swapFiles")
  private Integer swapFiles = null;

  @SerializedName("inFlightFlowFileCount")
  private Integer inFlightFlowFileCount = null;

  @SerializedName("inFlightByteCount")
  private Long inFlightByteCount = null;

  @SerializedName("nodeIdentifier")
  private String nodeIdentifier = null;

  public RemoteQueuePartitionDTO totalFlowFileCount(Integer totalFlowFileCount) {
    this.totalFlowFileCount = totalFlowFileCount;
    return this;
  }

   /**
   * Total number of FlowFiles owned by the Connection
   * @return totalFlowFileCount
  **/
  @Schema(description = "Total number of FlowFiles owned by the Connection")
  public Integer getTotalFlowFileCount() {
    return totalFlowFileCount;
  }

  public void setTotalFlowFileCount(Integer totalFlowFileCount) {
    this.totalFlowFileCount = totalFlowFileCount;
  }

  public RemoteQueuePartitionDTO totalByteCount(Long totalByteCount) {
    this.totalByteCount = totalByteCount;
    return this;
  }

   /**
   * Total number of bytes that make up the content for the FlowFiles owned by this Connection
   * @return totalByteCount
  **/
  @Schema(description = "Total number of bytes that make up the content for the FlowFiles owned by this Connection")
  public Long getTotalByteCount() {
    return totalByteCount;
  }

  public void setTotalByteCount(Long totalByteCount) {
    this.totalByteCount = totalByteCount;
  }

  public RemoteQueuePartitionDTO activeQueueFlowFileCount(Integer activeQueueFlowFileCount) {
    this.activeQueueFlowFileCount = activeQueueFlowFileCount;
    return this;
  }

   /**
   * Total number of FlowFiles that exist in the Connection&#x27;s Active Queue, immediately available to be offered up to a component
   * @return activeQueueFlowFileCount
  **/
  @Schema(description = "Total number of FlowFiles that exist in the Connection's Active Queue, immediately available to be offered up to a component")
  public Integer getActiveQueueFlowFileCount() {
    return activeQueueFlowFileCount;
  }

  public void setActiveQueueFlowFileCount(Integer activeQueueFlowFileCount) {
    this.activeQueueFlowFileCount = activeQueueFlowFileCount;
  }

  public RemoteQueuePartitionDTO activeQueueByteCount(Long activeQueueByteCount) {
    this.activeQueueByteCount = activeQueueByteCount;
    return this;
  }

   /**
   * Total number of bytes that make up the content for the FlowFiles that are present in the Connection&#x27;s Active Queue
   * @return activeQueueByteCount
  **/
  @Schema(description = "Total number of bytes that make up the content for the FlowFiles that are present in the Connection's Active Queue")
  public Long getActiveQueueByteCount() {
    return activeQueueByteCount;
  }

  public void setActiveQueueByteCount(Long activeQueueByteCount) {
    this.activeQueueByteCount = activeQueueByteCount;
  }

  public RemoteQueuePartitionDTO swapFlowFileCount(Integer swapFlowFileCount) {
    this.swapFlowFileCount = swapFlowFileCount;
    return this;
  }

   /**
   * The total number of FlowFiles that are swapped out for this Connection
   * @return swapFlowFileCount
  **/
  @Schema(description = "The total number of FlowFiles that are swapped out for this Connection")
  public Integer getSwapFlowFileCount() {
    return swapFlowFileCount;
  }

  public void setSwapFlowFileCount(Integer swapFlowFileCount) {
    this.swapFlowFileCount = swapFlowFileCount;
  }

  public RemoteQueuePartitionDTO swapByteCount(Long swapByteCount) {
    this.swapByteCount = swapByteCount;
    return this;
  }

   /**
   * Total number of bytes that make up the content for the FlowFiles that are swapped out to disk for the Connection
   * @return swapByteCount
  **/
  @Schema(description = "Total number of bytes that make up the content for the FlowFiles that are swapped out to disk for the Connection")
  public Long getSwapByteCount() {
    return swapByteCount;
  }

  public void setSwapByteCount(Long swapByteCount) {
    this.swapByteCount = swapByteCount;
  }

  public RemoteQueuePartitionDTO swapFiles(Integer swapFiles) {
    this.swapFiles = swapFiles;
    return this;
  }

   /**
   * The number of Swap Files that exist for this Connection
   * @return swapFiles
  **/
  @Schema(description = "The number of Swap Files that exist for this Connection")
  public Integer getSwapFiles() {
    return swapFiles;
  }

  public void setSwapFiles(Integer swapFiles) {
    this.swapFiles = swapFiles;
  }

  public RemoteQueuePartitionDTO inFlightFlowFileCount(Integer inFlightFlowFileCount) {
    this.inFlightFlowFileCount = inFlightFlowFileCount;
    return this;
  }

   /**
   * The number of In-Flight FlowFiles for this Connection. These are FlowFiles that belong to the connection but are currently being operated on by a Processor, Port, etc.
   * @return inFlightFlowFileCount
  **/
  @Schema(description = "The number of In-Flight FlowFiles for this Connection. These are FlowFiles that belong to the connection but are currently being operated on by a Processor, Port, etc.")
  public Integer getInFlightFlowFileCount() {
    return inFlightFlowFileCount;
  }

  public void setInFlightFlowFileCount(Integer inFlightFlowFileCount) {
    this.inFlightFlowFileCount = inFlightFlowFileCount;
  }

  public RemoteQueuePartitionDTO inFlightByteCount(Long inFlightByteCount) {
    this.inFlightByteCount = inFlightByteCount;
    return this;
  }

   /**
   * The number bytes that make up the content of the FlowFiles that are In-Flight
   * @return inFlightByteCount
  **/
  @Schema(description = "The number bytes that make up the content of the FlowFiles that are In-Flight")
  public Long getInFlightByteCount() {
    return inFlightByteCount;
  }

  public void setInFlightByteCount(Long inFlightByteCount) {
    this.inFlightByteCount = inFlightByteCount;
  }

  public RemoteQueuePartitionDTO nodeIdentifier(String nodeIdentifier) {
    this.nodeIdentifier = nodeIdentifier;
    return this;
  }

   /**
   * The Node Identifier that this queue partition is sending to
   * @return nodeIdentifier
  **/
  @Schema(description = "The Node Identifier that this queue partition is sending to")
  public String getNodeIdentifier() {
    return nodeIdentifier;
  }

  public void setNodeIdentifier(String nodeIdentifier) {
    this.nodeIdentifier = nodeIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteQueuePartitionDTO remoteQueuePartitionDTO = (RemoteQueuePartitionDTO) o;
    return Objects.equals(this.totalFlowFileCount, remoteQueuePartitionDTO.totalFlowFileCount) &&
        Objects.equals(this.totalByteCount, remoteQueuePartitionDTO.totalByteCount) &&
        Objects.equals(this.activeQueueFlowFileCount, remoteQueuePartitionDTO.activeQueueFlowFileCount) &&
        Objects.equals(this.activeQueueByteCount, remoteQueuePartitionDTO.activeQueueByteCount) &&
        Objects.equals(this.swapFlowFileCount, remoteQueuePartitionDTO.swapFlowFileCount) &&
        Objects.equals(this.swapByteCount, remoteQueuePartitionDTO.swapByteCount) &&
        Objects.equals(this.swapFiles, remoteQueuePartitionDTO.swapFiles) &&
        Objects.equals(this.inFlightFlowFileCount, remoteQueuePartitionDTO.inFlightFlowFileCount) &&
        Objects.equals(this.inFlightByteCount, remoteQueuePartitionDTO.inFlightByteCount) &&
        Objects.equals(this.nodeIdentifier, remoteQueuePartitionDTO.nodeIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFlowFileCount, totalByteCount, activeQueueFlowFileCount, activeQueueByteCount, swapFlowFileCount, swapByteCount, swapFiles, inFlightFlowFileCount, inFlightByteCount, nodeIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteQueuePartitionDTO {\n");
    
    sb.append("    totalFlowFileCount: ").append(toIndentedString(totalFlowFileCount)).append("\n");
    sb.append("    totalByteCount: ").append(toIndentedString(totalByteCount)).append("\n");
    sb.append("    activeQueueFlowFileCount: ").append(toIndentedString(activeQueueFlowFileCount)).append("\n");
    sb.append("    activeQueueByteCount: ").append(toIndentedString(activeQueueByteCount)).append("\n");
    sb.append("    swapFlowFileCount: ").append(toIndentedString(swapFlowFileCount)).append("\n");
    sb.append("    swapByteCount: ").append(toIndentedString(swapByteCount)).append("\n");
    sb.append("    swapFiles: ").append(toIndentedString(swapFiles)).append("\n");
    sb.append("    inFlightFlowFileCount: ").append(toIndentedString(inFlightFlowFileCount)).append("\n");
    sb.append("    inFlightByteCount: ").append(toIndentedString(inFlightByteCount)).append("\n");
    sb.append("    nodeIdentifier: ").append(toIndentedString(nodeIdentifier)).append("\n");
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
