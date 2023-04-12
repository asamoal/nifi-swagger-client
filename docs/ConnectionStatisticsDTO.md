# ConnectionStatisticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the connection |  [optional]
**statsLastRefreshed** | **String** | The timestamp of when the stats were last refreshed |  [optional]
**aggregateSnapshot** | [**ConnectionStatisticsSnapshotDTO**](ConnectionStatisticsSnapshotDTO.md) |  |  [optional]
**nodeSnapshots** | [**List&lt;NodeConnectionStatisticsSnapshotDTO&gt;**](NodeConnectionStatisticsSnapshotDTO.md) | A list of status snapshots for each node |  [optional]
