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
 * LineageRequestDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-04-12T17:38:07.775342+02:00[Europe/Berlin]")
public class LineageRequestDTO {
  @SerializedName("eventId")
  private Long eventId = null;

  /**
   * The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile.
   */
  @JsonAdapter(LineageRequestTypeEnum.Adapter.class)
  public enum LineageRequestTypeEnum {
    PARENTS("PARENTS"),
    CHILDREN("CHILDREN"),
    AND_FLOWFILE("and FLOWFILE");

    private String value;

    LineageRequestTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LineageRequestTypeEnum fromValue(String input) {
      for (LineageRequestTypeEnum b : LineageRequestTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LineageRequestTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LineageRequestTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LineageRequestTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LineageRequestTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("lineageRequestType")
  private LineageRequestTypeEnum lineageRequestType = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("clusterNodeId")
  private String clusterNodeId = null;

  public LineageRequestDTO eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The event id that was used to generate this lineage, if applicable. The event id is allowed for any type of lineageRequestType. If the lineageRequestType is FLOWFILE and the flowfile uuid is also included in the request, the event id will be ignored.
   * @return eventId
  **/
  @Schema(description = "The event id that was used to generate this lineage, if applicable. The event id is allowed for any type of lineageRequestType. If the lineageRequestType is FLOWFILE and the flowfile uuid is also included in the request, the event id will be ignored.")
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  public LineageRequestDTO lineageRequestType(LineageRequestTypeEnum lineageRequestType) {
    this.lineageRequestType = lineageRequestType;
    return this;
  }

   /**
   * The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile.
   * @return lineageRequestType
  **/
  @Schema(description = "The type of lineage request. PARENTS will return the lineage for the flowfiles that are parents of the specified event. CHILDREN will return the lineage for the flowfiles that are children of the specified event. FLOWFILE will return the lineage for the specified flowfile.")
  public LineageRequestTypeEnum getLineageRequestType() {
    return lineageRequestType;
  }

  public void setLineageRequestType(LineageRequestTypeEnum lineageRequestType) {
    this.lineageRequestType = lineageRequestType;
  }

  public LineageRequestDTO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The flowfile uuid that was used to generate the lineage. The flowfile uuid is only allowed when the lineageRequestType is FLOWFILE and will take precedence over event id.
   * @return uuid
  **/
  @Schema(description = "The flowfile uuid that was used to generate the lineage. The flowfile uuid is only allowed when the lineageRequestType is FLOWFILE and will take precedence over event id.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public LineageRequestDTO clusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
    return this;
  }

   /**
   * The id of the node where this lineage originated if clustered.
   * @return clusterNodeId
  **/
  @Schema(description = "The id of the node where this lineage originated if clustered.")
  public String getClusterNodeId() {
    return clusterNodeId;
  }

  public void setClusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineageRequestDTO lineageRequestDTO = (LineageRequestDTO) o;
    return Objects.equals(this.eventId, lineageRequestDTO.eventId) &&
        Objects.equals(this.lineageRequestType, lineageRequestDTO.lineageRequestType) &&
        Objects.equals(this.uuid, lineageRequestDTO.uuid) &&
        Objects.equals(this.clusterNodeId, lineageRequestDTO.clusterNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, lineageRequestType, uuid, clusterNodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineageRequestDTO {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    lineageRequestType: ").append(toIndentedString(lineageRequestType)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
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
