# PortEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**id** | **String** | The id of the component. |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**component** | [**PortDTO**](PortDTO.md) |  |  [optional]
**status** | [**PortStatusDTO**](PortStatusDTO.md) |  |  [optional]
**portType** | **String** |  |  [optional]
**operatePermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**allowRemoteAccess** | **Boolean** | Whether this port can be accessed remotely via Site-to-Site protocol. |  [optional]
