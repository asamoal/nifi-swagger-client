# ParameterProviderParameterApplicationEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the parameter provider. |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**parameterGroupConfigurations** | [**List&lt;ParameterGroupConfigurationEntity&gt;**](ParameterGroupConfigurationEntity.md) | Configuration for the fetched Parameter Groups |  [optional]
