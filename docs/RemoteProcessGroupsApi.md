# RemoteProcessGroupsApi

All URIs are relative to */nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRemoteProcessGroup**](RemoteProcessGroupsApi.md#getRemoteProcessGroup) | **GET** /remote-process-groups/{id} | Gets a remote process group
[**getState**](RemoteProcessGroupsApi.md#getState) | **GET** /remote-process-groups/{id}/state | Gets the state for a RemoteProcessGroup
[**removeRemoteProcessGroup**](RemoteProcessGroupsApi.md#removeRemoteProcessGroup) | **DELETE** /remote-process-groups/{id} | Deletes a remote process group
[**updateRemoteProcessGroup**](RemoteProcessGroupsApi.md#updateRemoteProcessGroup) | **PUT** /remote-process-groups/{id} | Updates a remote process group
[**updateRemoteProcessGroupInputPort**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPort) | **PUT** /remote-process-groups/{id}/input-ports/{port-id} | Updates a remote port
[**updateRemoteProcessGroupInputPortRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPortRunStatus) | **PUT** /remote-process-groups/{id}/input-ports/{port-id}/run-status | Updates run status of a remote port
[**updateRemoteProcessGroupOutputPort**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPort) | **PUT** /remote-process-groups/{id}/output-ports/{port-id} | Updates a remote port
[**updateRemoteProcessGroupOutputPortRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPortRunStatus) | **PUT** /remote-process-groups/{id}/output-ports/{port-id}/run-status | Updates run status of a remote port
[**updateRemoteProcessGroupRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupRunStatus) | **PUT** /remote-process-groups/{id}/run-status | Updates run status of a remote process group
[**updateRemoteProcessGroupRunStatuses**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupRunStatuses) | **PUT** /remote-process-groups/process-group/{id}/run-status | Updates run status of all remote process groups in a process group (recursively)

<a name="getRemoteProcessGroup"></a>
# **getRemoteProcessGroup**
> RemoteProcessGroupEntity getRemoteProcessGroup(id)

Gets a remote process group

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
try {
    RemoteProcessGroupEntity result = apiInstance.getRemoteProcessGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#getRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateEntity getState(id)

Gets the state for a RemoteProcessGroup

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeRemoteProcessGroup"></a>
# **removeRemoteProcessGroup**
> RemoteProcessGroupEntity removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a remote process group

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
String id = "id_example"; // String | The remote process group id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    RemoteProcessGroupEntity result = apiInstance.removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#removeRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRemoteProcessGroup"></a>
# **updateRemoteProcessGroup**
> RemoteProcessGroupEntity updateRemoteProcessGroup(body, id)

Updates a remote process group

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
RemoteProcessGroupEntity body = new RemoteProcessGroupEntity(); // RemoteProcessGroupEntity | The remote process group.
String id = "id_example"; // String | The remote process group id.
try {
    RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)| The remote process group. |
 **id** | **String**| The remote process group id. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupInputPort"></a>
# **updateRemoteProcessGroupInputPort**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPort(body, id, portId)

Updates a remote port

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
RemoteProcessGroupPortEntity body = new RemoteProcessGroupPortEntity(); // RemoteProcessGroupPortEntity | The remote process group port.
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupInputPort(body, id, portId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)| The remote process group port. |
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupInputPortRunStatus"></a>
# **updateRemoteProcessGroupInputPortRunStatus**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPortRunStatus(body, id, portId)

Updates run status of a remote port

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group port.
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupInputPortRunStatus(body, id, portId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupInputPortRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group port. |
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupOutputPort"></a>
# **updateRemoteProcessGroupOutputPort**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPort(body, id, portId)

Updates a remote port

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
RemoteProcessGroupPortEntity body = new RemoteProcessGroupPortEntity(); // RemoteProcessGroupPortEntity | The remote process group port.
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupOutputPort(body, id, portId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)| The remote process group port. |
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupOutputPortRunStatus"></a>
# **updateRemoteProcessGroupOutputPortRunStatus**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPortRunStatus(body, id, portId)

Updates run status of a remote port

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group port.
String id = "id_example"; // String | The remote process group id.
String portId = "portId_example"; // String | The remote process group port id.
try {
    RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupOutputPortRunStatus(body, id, portId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupOutputPortRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group port. |
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupRunStatus"></a>
# **updateRemoteProcessGroupRunStatus**
> RemoteProcessGroupEntity updateRemoteProcessGroupRunStatus(body, id)

Updates run status of a remote process group

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group run status.
String id = "id_example"; // String | The remote process group id.
try {
    RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroupRunStatus(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group run status. |
 **id** | **String**| The remote process group id. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemoteProcessGroupRunStatuses"></a>
# **updateRemoteProcessGroupRunStatuses**
> RemoteProcessGroupEntity updateRemoteProcessGroupRunStatuses(body, id)

Updates run status of all remote process groups in a process group (recursively)

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.RemoteProcessGroupsApi;


RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi();
RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process groups run status.
String id = "id_example"; // String | The process group id.
try {
    RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroupRunStatuses(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupRunStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process groups run status. |
 **id** | **String**| The process group id. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

