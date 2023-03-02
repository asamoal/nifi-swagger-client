# VersionedLabel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#x27;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The component&#x27;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**Position**](Position.md) |  |  [optional]
**label** | **String** | The text that appears in the label. |  [optional]
**zIndex** | **Long** | The z index of the connection. |  [optional]
**width** | **Double** | The width of the label in pixels when at a 1:1 scale. |  [optional]
**height** | **Double** | The height of the label in pixels when at a 1:1 scale. |  [optional]
**style** | **Map&lt;String, String&gt;** | The styles for this label (font-size : 12px, background-color : #eee, etc). |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]

<a name="ComponentTypeEnum"></a>
## Enum: ComponentTypeEnum
Name | Value
---- | -----
CONNECTION | &quot;CONNECTION&quot;
PROCESSOR | &quot;PROCESSOR&quot;
PROCESS_GROUP | &quot;PROCESS_GROUP&quot;
REMOTE_PROCESS_GROUP | &quot;REMOTE_PROCESS_GROUP&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
LABEL | &quot;LABEL&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;
PARAMETER_CONTEXT | &quot;PARAMETER_CONTEXT&quot;
PARAMETER_PROVIDER | &quot;PARAMETER_PROVIDER&quot;
TEMPLATE | &quot;TEMPLATE&quot;
FLOW_REGISTRY_CLIENT | &quot;FLOW_REGISTRY_CLIENT&quot;
