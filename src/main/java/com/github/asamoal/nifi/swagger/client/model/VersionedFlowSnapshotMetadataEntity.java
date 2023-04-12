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
import com.github.asamoal.nifi.swagger.client.model.RegisteredFlowSnapshotMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VersionedFlowSnapshotMetadataEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class VersionedFlowSnapshotMetadataEntity {
  @SerializedName("versionedFlowSnapshotMetadata")
  private RegisteredFlowSnapshotMetadata versionedFlowSnapshotMetadata = null;

  @SerializedName("registryId")
  private String registryId = null;

  public VersionedFlowSnapshotMetadataEntity versionedFlowSnapshotMetadata(RegisteredFlowSnapshotMetadata versionedFlowSnapshotMetadata) {
    this.versionedFlowSnapshotMetadata = versionedFlowSnapshotMetadata;
    return this;
  }

   /**
   * Get versionedFlowSnapshotMetadata
   * @return versionedFlowSnapshotMetadata
  **/
  @Schema(description = "")
  public RegisteredFlowSnapshotMetadata getVersionedFlowSnapshotMetadata() {
    return versionedFlowSnapshotMetadata;
  }

  public void setVersionedFlowSnapshotMetadata(RegisteredFlowSnapshotMetadata versionedFlowSnapshotMetadata) {
    this.versionedFlowSnapshotMetadata = versionedFlowSnapshotMetadata;
  }

  public VersionedFlowSnapshotMetadataEntity registryId(String registryId) {
    this.registryId = registryId;
    return this;
  }

   /**
   * The ID of the Registry that this flow belongs to
   * @return registryId
  **/
  @Schema(description = "The ID of the Registry that this flow belongs to")
  public String getRegistryId() {
    return registryId;
  }

  public void setRegistryId(String registryId) {
    this.registryId = registryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowSnapshotMetadataEntity versionedFlowSnapshotMetadataEntity = (VersionedFlowSnapshotMetadataEntity) o;
    return Objects.equals(this.versionedFlowSnapshotMetadata, versionedFlowSnapshotMetadataEntity.versionedFlowSnapshotMetadata) &&
        Objects.equals(this.registryId, versionedFlowSnapshotMetadataEntity.registryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedFlowSnapshotMetadata, registryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowSnapshotMetadataEntity {\n");
    
    sb.append("    versionedFlowSnapshotMetadata: ").append(toIndentedString(versionedFlowSnapshotMetadata)).append("\n");
    sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
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
