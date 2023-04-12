# ProcessorDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processor** | [**ProcessorDTO**](ProcessorDTO.md) |  |  [optional]
**processorStatus** | [**ProcessorStatusDTO**](ProcessorStatusDTO.md) |  |  [optional]
**referencedControllerServices** | [**List&lt;ControllerServiceDiagnosticsDTO&gt;**](ControllerServiceDiagnosticsDTO.md) | Diagnostic Information about all Controller Services that the Processor is referencing |  [optional]
**incomingConnections** | [**List&lt;ConnectionDiagnosticsDTO&gt;**](ConnectionDiagnosticsDTO.md) | Diagnostic Information about all incoming Connections |  [optional]
**outgoingConnections** | [**List&lt;ConnectionDiagnosticsDTO&gt;**](ConnectionDiagnosticsDTO.md) | Diagnostic Information about all outgoing Connections |  [optional]
**jvmDiagnostics** | [**JVMDiagnosticsDTO**](JVMDiagnosticsDTO.md) |  |  [optional]
**threadDumps** | [**List&lt;ThreadDumpDTO&gt;**](ThreadDumpDTO.md) | Thread Dumps that were taken of the threads that are active in the Processor |  [optional]
**classLoaderDiagnostics** | [**ClassLoaderDiagnosticsDTO**](ClassLoaderDiagnosticsDTO.md) |  |  [optional]
