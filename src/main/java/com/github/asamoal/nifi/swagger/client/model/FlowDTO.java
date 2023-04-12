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
import com.github.asamoal.nifi.swagger.client.model.ConnectionEntity;
import com.github.asamoal.nifi.swagger.client.model.FunnelEntity;
import com.github.asamoal.nifi.swagger.client.model.LabelEntity;
import com.github.asamoal.nifi.swagger.client.model.PortEntity;
import com.github.asamoal.nifi.swagger.client.model.ProcessGroupEntity;
import com.github.asamoal.nifi.swagger.client.model.ProcessorEntity;
import com.github.asamoal.nifi.swagger.client.model.RemoteProcessGroupEntity;
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
 * FlowDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class FlowDTO {
  @SerializedName("processGroups")
  private List<ProcessGroupEntity> processGroups = null;

  @SerializedName("remoteProcessGroups")
  private List<RemoteProcessGroupEntity> remoteProcessGroups = null;

  @SerializedName("processors")
  private List<ProcessorEntity> processors = null;

  @SerializedName("inputPorts")
  private List<PortEntity> inputPorts = null;

  @SerializedName("outputPorts")
  private List<PortEntity> outputPorts = null;

  @SerializedName("connections")
  private List<ConnectionEntity> connections = null;

  @SerializedName("labels")
  private List<LabelEntity> labels = null;

  @SerializedName("funnels")
  private List<FunnelEntity> funnels = null;

  public FlowDTO processGroups(List<ProcessGroupEntity> processGroups) {
    this.processGroups = processGroups;
    return this;
  }

  public FlowDTO addProcessGroupsItem(ProcessGroupEntity processGroupsItem) {
    if (this.processGroups == null) {
      this.processGroups = new ArrayList<ProcessGroupEntity>();
    }
    this.processGroups.add(processGroupsItem);
    return this;
  }

   /**
   * The process groups in this flow.
   * @return processGroups
  **/
  @Schema(description = "The process groups in this flow.")
  public List<ProcessGroupEntity> getProcessGroups() {
    return processGroups;
  }

  public void setProcessGroups(List<ProcessGroupEntity> processGroups) {
    this.processGroups = processGroups;
  }

  public FlowDTO remoteProcessGroups(List<RemoteProcessGroupEntity> remoteProcessGroups) {
    this.remoteProcessGroups = remoteProcessGroups;
    return this;
  }

  public FlowDTO addRemoteProcessGroupsItem(RemoteProcessGroupEntity remoteProcessGroupsItem) {
    if (this.remoteProcessGroups == null) {
      this.remoteProcessGroups = new ArrayList<RemoteProcessGroupEntity>();
    }
    this.remoteProcessGroups.add(remoteProcessGroupsItem);
    return this;
  }

   /**
   * The remote process groups in this flow.
   * @return remoteProcessGroups
  **/
  @Schema(description = "The remote process groups in this flow.")
  public List<RemoteProcessGroupEntity> getRemoteProcessGroups() {
    return remoteProcessGroups;
  }

  public void setRemoteProcessGroups(List<RemoteProcessGroupEntity> remoteProcessGroups) {
    this.remoteProcessGroups = remoteProcessGroups;
  }

  public FlowDTO processors(List<ProcessorEntity> processors) {
    this.processors = processors;
    return this;
  }

  public FlowDTO addProcessorsItem(ProcessorEntity processorsItem) {
    if (this.processors == null) {
      this.processors = new ArrayList<ProcessorEntity>();
    }
    this.processors.add(processorsItem);
    return this;
  }

   /**
   * The processors in this flow.
   * @return processors
  **/
  @Schema(description = "The processors in this flow.")
  public List<ProcessorEntity> getProcessors() {
    return processors;
  }

  public void setProcessors(List<ProcessorEntity> processors) {
    this.processors = processors;
  }

  public FlowDTO inputPorts(List<PortEntity> inputPorts) {
    this.inputPorts = inputPorts;
    return this;
  }

  public FlowDTO addInputPortsItem(PortEntity inputPortsItem) {
    if (this.inputPorts == null) {
      this.inputPorts = new ArrayList<PortEntity>();
    }
    this.inputPorts.add(inputPortsItem);
    return this;
  }

   /**
   * The input ports in this flow.
   * @return inputPorts
  **/
  @Schema(description = "The input ports in this flow.")
  public List<PortEntity> getInputPorts() {
    return inputPorts;
  }

  public void setInputPorts(List<PortEntity> inputPorts) {
    this.inputPorts = inputPorts;
  }

  public FlowDTO outputPorts(List<PortEntity> outputPorts) {
    this.outputPorts = outputPorts;
    return this;
  }

  public FlowDTO addOutputPortsItem(PortEntity outputPortsItem) {
    if (this.outputPorts == null) {
      this.outputPorts = new ArrayList<PortEntity>();
    }
    this.outputPorts.add(outputPortsItem);
    return this;
  }

   /**
   * The output ports in this flow.
   * @return outputPorts
  **/
  @Schema(description = "The output ports in this flow.")
  public List<PortEntity> getOutputPorts() {
    return outputPorts;
  }

  public void setOutputPorts(List<PortEntity> outputPorts) {
    this.outputPorts = outputPorts;
  }

  public FlowDTO connections(List<ConnectionEntity> connections) {
    this.connections = connections;
    return this;
  }

  public FlowDTO addConnectionsItem(ConnectionEntity connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<ConnectionEntity>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * The connections in this flow.
   * @return connections
  **/
  @Schema(description = "The connections in this flow.")
  public List<ConnectionEntity> getConnections() {
    return connections;
  }

  public void setConnections(List<ConnectionEntity> connections) {
    this.connections = connections;
  }

  public FlowDTO labels(List<LabelEntity> labels) {
    this.labels = labels;
    return this;
  }

  public FlowDTO addLabelsItem(LabelEntity labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<LabelEntity>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * The labels in this flow.
   * @return labels
  **/
  @Schema(description = "The labels in this flow.")
  public List<LabelEntity> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelEntity> labels) {
    this.labels = labels;
  }

  public FlowDTO funnels(List<FunnelEntity> funnels) {
    this.funnels = funnels;
    return this;
  }

  public FlowDTO addFunnelsItem(FunnelEntity funnelsItem) {
    if (this.funnels == null) {
      this.funnels = new ArrayList<FunnelEntity>();
    }
    this.funnels.add(funnelsItem);
    return this;
  }

   /**
   * The funnels in this flow.
   * @return funnels
  **/
  @Schema(description = "The funnels in this flow.")
  public List<FunnelEntity> getFunnels() {
    return funnels;
  }

  public void setFunnels(List<FunnelEntity> funnels) {
    this.funnels = funnels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowDTO flowDTO = (FlowDTO) o;
    return Objects.equals(this.processGroups, flowDTO.processGroups) &&
        Objects.equals(this.remoteProcessGroups, flowDTO.remoteProcessGroups) &&
        Objects.equals(this.processors, flowDTO.processors) &&
        Objects.equals(this.inputPorts, flowDTO.inputPorts) &&
        Objects.equals(this.outputPorts, flowDTO.outputPorts) &&
        Objects.equals(this.connections, flowDTO.connections) &&
        Objects.equals(this.labels, flowDTO.labels) &&
        Objects.equals(this.funnels, flowDTO.funnels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processGroups, remoteProcessGroups, processors, inputPorts, outputPorts, connections, labels, funnels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowDTO {\n");
    
    sb.append("    processGroups: ").append(toIndentedString(processGroups)).append("\n");
    sb.append("    remoteProcessGroups: ").append(toIndentedString(remoteProcessGroups)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    inputPorts: ").append(toIndentedString(inputPorts)).append("\n");
    sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    funnels: ").append(toIndentedString(funnels)).append("\n");
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
