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
import com.github.asamoal.nifi.swagger.client.model.GCDiagnosticsSnapshotDTO;
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
 * GarbageCollectionDiagnosticsDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class GarbageCollectionDiagnosticsDTO {
  @SerializedName("memoryManagerName")
  private String memoryManagerName = null;

  @SerializedName("snapshots")
  private List<GCDiagnosticsSnapshotDTO> snapshots = null;

  public GarbageCollectionDiagnosticsDTO memoryManagerName(String memoryManagerName) {
    this.memoryManagerName = memoryManagerName;
    return this;
  }

   /**
   * The name of the Memory Manager that this Garbage Collection information pertains to
   * @return memoryManagerName
  **/
  @Schema(description = "The name of the Memory Manager that this Garbage Collection information pertains to")
  public String getMemoryManagerName() {
    return memoryManagerName;
  }

  public void setMemoryManagerName(String memoryManagerName) {
    this.memoryManagerName = memoryManagerName;
  }

  public GarbageCollectionDiagnosticsDTO snapshots(List<GCDiagnosticsSnapshotDTO> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public GarbageCollectionDiagnosticsDTO addSnapshotsItem(GCDiagnosticsSnapshotDTO snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<GCDiagnosticsSnapshotDTO>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * A list of snapshots that have been taken to determine the health of the JVM&#x27;s heap
   * @return snapshots
  **/
  @Schema(description = "A list of snapshots that have been taken to determine the health of the JVM's heap")
  public List<GCDiagnosticsSnapshotDTO> getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(List<GCDiagnosticsSnapshotDTO> snapshots) {
    this.snapshots = snapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GarbageCollectionDiagnosticsDTO garbageCollectionDiagnosticsDTO = (GarbageCollectionDiagnosticsDTO) o;
    return Objects.equals(this.memoryManagerName, garbageCollectionDiagnosticsDTO.memoryManagerName) &&
        Objects.equals(this.snapshots, garbageCollectionDiagnosticsDTO.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoryManagerName, snapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GarbageCollectionDiagnosticsDTO {\n");
    
    sb.append("    memoryManagerName: ").append(toIndentedString(memoryManagerName)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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
