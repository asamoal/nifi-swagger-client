# ConnectionDiagnosticsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalFlowFileCount** | **Integer** | Total number of FlowFiles owned by the Connection |  [optional]
**totalByteCount** | **Long** | Total number of bytes that make up the content for the FlowFiles owned by this Connection |  [optional]
**nodeIdentifier** | **String** | The Node Identifier that this information pertains to |  [optional]
**localQueuePartition** | [**LocalQueuePartitionDTO**](LocalQueuePartitionDTO.md) |  |  [optional]
**remoteQueuePartitions** | [**List&lt;RemoteQueuePartitionDTO&gt;**](RemoteQueuePartitionDTO.md) |  |  [optional]
