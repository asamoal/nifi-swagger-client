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
import com.github.asamoal.nifi.swagger.client.model.PermissionsDTO;
import com.github.asamoal.nifi.swagger.client.model.ProcessGroupFlowDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProcessGroupFlowEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class ProcessGroupFlowEntity {
  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  @SerializedName("processGroupFlow")
  private ProcessGroupFlowDTO processGroupFlow = null;

  public ProcessGroupFlowEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public ProcessGroupFlowEntity processGroupFlow(ProcessGroupFlowDTO processGroupFlow) {
    this.processGroupFlow = processGroupFlow;
    return this;
  }

   /**
   * Get processGroupFlow
   * @return processGroupFlow
  **/
  @Schema(description = "")
  public ProcessGroupFlowDTO getProcessGroupFlow() {
    return processGroupFlow;
  }

  public void setProcessGroupFlow(ProcessGroupFlowDTO processGroupFlow) {
    this.processGroupFlow = processGroupFlow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupFlowEntity processGroupFlowEntity = (ProcessGroupFlowEntity) o;
    return Objects.equals(this.permissions, processGroupFlowEntity.permissions) &&
        Objects.equals(this.processGroupFlow, processGroupFlowEntity.processGroupFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, processGroupFlow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupFlowEntity {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    processGroupFlow: ").append(toIndentedString(processGroupFlow)).append("\n");
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
