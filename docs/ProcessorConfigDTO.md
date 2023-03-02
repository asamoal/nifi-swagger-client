# ProcessorConfigDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | **Map&lt;String, String&gt;** | The properties for the processor. Properties whose value is not set will only contain the property name. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | Descriptors for the processor&#x27;s properties. |  [optional]
**sensitiveDynamicPropertyNames** | **List&lt;String&gt;** | Set of sensitive dynamic property names |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | Indcates whether the prcessor should be scheduled to run in event or timer driven mode. |  [optional]
**executionNode** | **String** | Indicates the node where the process will execute. |  [optional]
**penaltyDuration** | **String** | The amount of time that is used when the process penalizes a flowfile. |  [optional]
**yieldDuration** | **String** | The amount of time that must elapse before this processor is scheduled again after yielding. |  [optional]
**bulletinLevel** | **String** | The level at which the processor will report bulletins. |  [optional]
**runDurationMillis** | **Long** | The run duration for the processor in milliseconds. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#x27;t allow parallol processing then any positive input will be ignored. |  [optional]
**autoTerminatedRelationships** | **List&lt;String&gt;** | The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#x27;isAutoTerminate&#x27; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. |  [optional]
**comments** | **String** | The comments for the processor. |  [optional]
**customUiUrl** | **String** | The URL for the processor&#x27;s custom configuration UI if applicable. |  [optional]
**lossTolerant** | **Boolean** | Whether the processor is loss tolerant. |  [optional]
**annotationData** | **String** | The annotation data for the processor used to relay configuration between a custom UI and the procesosr. |  [optional]
**defaultConcurrentTasks** | **Map&lt;String, String&gt;** | Maps default values for concurrent tasks for each applicable scheduling strategy. |  [optional]
**defaultSchedulingPeriod** | **Map&lt;String, String&gt;** | Maps default values for scheduling period for each applicable scheduling strategy. |  [optional]
**retryCount** | **Integer** | Overall number of retries. |  [optional]
**retriedRelationships** | **List&lt;String&gt;** | All the relationships should be retried. |  [optional]
**backoffMechanism** | [**BackoffMechanismEnum**](#BackoffMechanismEnum) | Determines whether the FlowFile should be penalized or the processor should be yielded between retries. |  [optional]
**maxBackoffPeriod** | **String** | Maximum amount of time to be waited during a retry period. |  [optional]

<a name="BackoffMechanismEnum"></a>
## Enum: BackoffMechanismEnum
Name | Value
---- | -----
PENALIZE_FLOWFILE | &quot;PENALIZE_FLOWFILE&quot;
YIELD_PROCESSOR | &quot;YIELD_PROCESSOR&quot;
