# VersionedParameterContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | The component&#x27;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The component&#x27;s name |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**position** | [**Position**](Position.md) |  |  [optional]
**parameters** | [**List&lt;VersionedParameter&gt;**](VersionedParameter.md) | The parameters in the context |  [optional]
**inheritedParameterContexts** | **List&lt;String&gt;** | The names of additional parameter contexts from which to inherit parameters |  [optional]
**description** | **String** | The description of the parameter context |  [optional]
**parameterProvider** | **String** | The identifier of an optional parameter provider |  [optional]
**parameterGroupName** | **String** | The corresponding parameter group name fetched from the parameter provider, if applicable |  [optional]
**_synchronized** | **Boolean** | True if the parameter provider is set and the context should receive updates when its parameters are next fetched |  [optional]
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
