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
import com.github.asamoal.nifi.swagger.client.model.NodeRemoteProcessGroupStatusSnapshotDTO;
import com.github.asamoal.nifi.swagger.client.model.RemoteProcessGroupStatusSnapshotDTO;
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
 * RemoteProcessGroupStatusDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class RemoteProcessGroupStatusDTO {
  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("targetUri")
  private String targetUri = null;

  @SerializedName("transmissionStatus")
  private String transmissionStatus = null;

  @SerializedName("statsLastRefreshed")
  private String statsLastRefreshed = null;

  /**
   * Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)
   */
  @JsonAdapter(ValidationStatusEnum.Adapter.class)
  public enum ValidationStatusEnum {
    VALID("VALID"),
    INVALID("INVALID"),
    VALIDATING("VALIDATING");

    private String value;

    ValidationStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ValidationStatusEnum fromValue(String input) {
      for (ValidationStatusEnum b : ValidationStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ValidationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ValidationStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ValidationStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("validationStatus")
  private ValidationStatusEnum validationStatus = null;

  @SerializedName("aggregateSnapshot")
  private RemoteProcessGroupStatusSnapshotDTO aggregateSnapshot = null;

  @SerializedName("nodeSnapshots")
  private List<NodeRemoteProcessGroupStatusSnapshotDTO> nodeSnapshots = null;

  public RemoteProcessGroupStatusDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The unique ID of the process group that the Processor belongs to
   * @return groupId
  **/
  @Schema(description = "The unique ID of the process group that the Processor belongs to")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public RemoteProcessGroupStatusDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the Processor
   * @return id
  **/
  @Schema(description = "The unique ID of the Processor")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RemoteProcessGroupStatusDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the remote process group.
   * @return name
  **/
  @Schema(description = "The name of the remote process group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RemoteProcessGroupStatusDTO targetUri(String targetUri) {
    this.targetUri = targetUri;
    return this;
  }

   /**
   * The URI of the target system.
   * @return targetUri
  **/
  @Schema(description = "The URI of the target system.")
  public String getTargetUri() {
    return targetUri;
  }

  public void setTargetUri(String targetUri) {
    this.targetUri = targetUri;
  }

  public RemoteProcessGroupStatusDTO transmissionStatus(String transmissionStatus) {
    this.transmissionStatus = transmissionStatus;
    return this;
  }

   /**
   * The transmission status of the remote process group.
   * @return transmissionStatus
  **/
  @Schema(description = "The transmission status of the remote process group.")
  public String getTransmissionStatus() {
    return transmissionStatus;
  }

  public void setTransmissionStatus(String transmissionStatus) {
    this.transmissionStatus = transmissionStatus;
  }

  public RemoteProcessGroupStatusDTO statsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
    return this;
  }

   /**
   * The time the status for the process group was last refreshed.
   * @return statsLastRefreshed
  **/
  @Schema(description = "The time the status for the process group was last refreshed.")
  public String getStatsLastRefreshed() {
    return statsLastRefreshed;
  }

  public void setStatsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
  }

  public RemoteProcessGroupStatusDTO validationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)
   * @return validationStatus
  **/
  @Schema(description = "Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid)")
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
  }

  public RemoteProcessGroupStatusDTO aggregateSnapshot(RemoteProcessGroupStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * Get aggregateSnapshot
   * @return aggregateSnapshot
  **/
  @Schema(description = "")
  public RemoteProcessGroupStatusSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(RemoteProcessGroupStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public RemoteProcessGroupStatusDTO nodeSnapshots(List<NodeRemoteProcessGroupStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public RemoteProcessGroupStatusDTO addNodeSnapshotsItem(NodeRemoteProcessGroupStatusSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodeRemoteProcessGroupStatusSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.
   * @return nodeSnapshots
  **/
  @Schema(description = "A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.")
  public List<NodeRemoteProcessGroupStatusSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodeRemoteProcessGroupStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteProcessGroupStatusDTO remoteProcessGroupStatusDTO = (RemoteProcessGroupStatusDTO) o;
    return Objects.equals(this.groupId, remoteProcessGroupStatusDTO.groupId) &&
        Objects.equals(this.id, remoteProcessGroupStatusDTO.id) &&
        Objects.equals(this.name, remoteProcessGroupStatusDTO.name) &&
        Objects.equals(this.targetUri, remoteProcessGroupStatusDTO.targetUri) &&
        Objects.equals(this.transmissionStatus, remoteProcessGroupStatusDTO.transmissionStatus) &&
        Objects.equals(this.statsLastRefreshed, remoteProcessGroupStatusDTO.statsLastRefreshed) &&
        Objects.equals(this.validationStatus, remoteProcessGroupStatusDTO.validationStatus) &&
        Objects.equals(this.aggregateSnapshot, remoteProcessGroupStatusDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, remoteProcessGroupStatusDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, id, name, targetUri, transmissionStatus, statsLastRefreshed, validationStatus, aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteProcessGroupStatusDTO {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetUri: ").append(toIndentedString(targetUri)).append("\n");
    sb.append("    transmissionStatus: ").append(toIndentedString(transmissionStatus)).append("\n");
    sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    aggregateSnapshot: ").append(toIndentedString(aggregateSnapshot)).append("\n");
    sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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
