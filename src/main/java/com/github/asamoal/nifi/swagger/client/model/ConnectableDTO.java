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
 * ConnectableDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class ConnectableDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("versionedComponentId")
  private String versionedComponentId = null;

  /**
   * The type of component the connectable is.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PROCESSOR("PROCESSOR"),
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    INPUT_PORT("INPUT_PORT"),
    OUTPUT_PORT("OUTPUT_PORT"),
    FUNNEL("FUNNEL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("running")
  private Boolean running = null;

  @SerializedName("transmitting")
  private Boolean transmitting = null;

  @SerializedName("exists")
  private Boolean exists = null;

  @SerializedName("comments")
  private String comments = null;

  public ConnectableDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the connectable component.
   * @return id
  **/
  @Schema(required = true, description = "The id of the connectable component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectableDTO versionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @Schema(description = "The ID of the corresponding component that is under version control")
  public String getVersionedComponentId() {
    return versionedComponentId;
  }

  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }

  public ConnectableDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of component the connectable is.
   * @return type
  **/
  @Schema(required = true, description = "The type of component the connectable is.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ConnectableDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the group that the connectable component resides in
   * @return groupId
  **/
  @Schema(required = true, description = "The id of the group that the connectable component resides in")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ConnectableDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the connectable component
   * @return name
  **/
  @Schema(description = "The name of the connectable component")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectableDTO running(Boolean running) {
    this.running = running;
    return this;
  }

   /**
   * Reflects the current state of the connectable component.
   * @return running
  **/
  @Schema(description = "Reflects the current state of the connectable component.")
  public Boolean isRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }

  public ConnectableDTO transmitting(Boolean transmitting) {
    this.transmitting = transmitting;
    return this;
  }

   /**
   * If the connectable component represents a remote port, indicates if the target is configured to transmit.
   * @return transmitting
  **/
  @Schema(description = "If the connectable component represents a remote port, indicates if the target is configured to transmit.")
  public Boolean isTransmitting() {
    return transmitting;
  }

  public void setTransmitting(Boolean transmitting) {
    this.transmitting = transmitting;
  }

  public ConnectableDTO exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * If the connectable component represents a remote port, indicates if the target exists.
   * @return exists
  **/
  @Schema(description = "If the connectable component represents a remote port, indicates if the target exists.")
  public Boolean isExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  public ConnectableDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments for the connectable component.
   * @return comments
  **/
  @Schema(description = "The comments for the connectable component.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectableDTO connectableDTO = (ConnectableDTO) o;
    return Objects.equals(this.id, connectableDTO.id) &&
        Objects.equals(this.versionedComponentId, connectableDTO.versionedComponentId) &&
        Objects.equals(this.type, connectableDTO.type) &&
        Objects.equals(this.groupId, connectableDTO.groupId) &&
        Objects.equals(this.name, connectableDTO.name) &&
        Objects.equals(this.running, connectableDTO.running) &&
        Objects.equals(this.transmitting, connectableDTO.transmitting) &&
        Objects.equals(this.exists, connectableDTO.exists) &&
        Objects.equals(this.comments, connectableDTO.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, type, groupId, name, running, transmitting, exists, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectableDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    transmitting: ").append(toIndentedString(transmitting)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
