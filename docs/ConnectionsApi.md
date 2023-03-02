# ConnectionsApi

All URIs are relative to */nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConnection**](ConnectionsApi.md#deleteConnection) | **DELETE** /connections/{id} | Deletes a connection
[**getConnection**](ConnectionsApi.md#getConnection) | **GET** /connections/{id} | Gets a connection
[**updateConnection**](ConnectionsApi.md#updateConnection) | **PUT** /connections/{id} | Updates a connection

<a name="deleteConnection"></a>
# **deleteConnection**
> ConnectionEntity deleteConnection(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a connection

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.ConnectionsApi;


ConnectionsApi apiInstance = new ConnectionsApi();
String id = "id_example"; // String | The connection id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ConnectionEntity result = apiInstance.deleteConnection(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#deleteConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnection"></a>
# **getConnection**
> ConnectionEntity getConnection(id)

Gets a connection

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiClient;
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.Configuration;
//import com.github.asamoal.nifi.swagger.auth.*;
//import com.github.asamoal.nifi.swagger.client.ConnectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth
OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
auth.setAccessToken("YOUR ACCESS TOKEN");

ConnectionsApi apiInstance = new ConnectionsApi();
String id = "id_example"; // String | The connection id.
try {
    ConnectionEntity result = apiInstance.getConnection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#getConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConnection"></a>
# **updateConnection**
> ConnectionEntity updateConnection(body, id)

Updates a connection

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.ConnectionsApi;


ConnectionsApi apiInstance = new ConnectionsApi();
ConnectionEntity body = new ConnectionEntity(); // ConnectionEntity | The connection configuration details.
String id = "id_example"; // String | The connection id.
try {
    ConnectionEntity result = apiInstance.updateConnection(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionsApi#updateConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectionEntity**](ConnectionEntity.md)| The connection configuration details. |
 **id** | **String**| The connection id. |

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

