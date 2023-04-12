# AccessoidcApi

All URIs are relative to */nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oidcCallback**](AccessoidcApi.md#oidcCallback) | **GET** /access/oidc/callback | Redirect/callback URI for processing the result of the OpenId Connect login sequence.
[**oidcExchange**](AccessoidcApi.md#oidcExchange) | **POST** /access/oidc/exchange | Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
[**oidcLogout**](AccessoidcApi.md#oidcLogout) | **GET** /access/oidc/logout | Performs a logout in the OpenId Provider.
[**oidcLogoutCallback**](AccessoidcApi.md#oidcLogoutCallback) | **GET** /access/oidc/logoutCallback | Redirect/callback URI for processing the result of the OpenId Connect logout sequence.
[**oidcRequest**](AccessoidcApi.md#oidcRequest) | **GET** /access/oidc/request | Initiates a request to authenticate through the configured OpenId Connect provider.

<a name="oidcCallback"></a>
# **oidcCallback**
> oidcCallback()

Redirect/callback URI for processing the result of the OpenId Connect login sequence.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.AccessoidcApi;


AccessoidcApi apiInstance = new AccessoidcApi();
try {
    apiInstance.oidcCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessoidcApi#oidcCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="oidcExchange"></a>
# **oidcExchange**
> String oidcExchange()

Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.AccessoidcApi;


AccessoidcApi apiInstance = new AccessoidcApi();
try {
    String result = apiInstance.oidcExchange();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessoidcApi#oidcExchange");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="oidcLogout"></a>
# **oidcLogout**
> oidcLogout()

Performs a logout in the OpenId Provider.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.AccessoidcApi;


AccessoidcApi apiInstance = new AccessoidcApi();
try {
    apiInstance.oidcLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessoidcApi#oidcLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="oidcLogoutCallback"></a>
# **oidcLogoutCallback**
> oidcLogoutCallback()

Redirect/callback URI for processing the result of the OpenId Connect logout sequence.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.AccessoidcApi;


AccessoidcApi apiInstance = new AccessoidcApi();
try {
    apiInstance.oidcLogoutCallback();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessoidcApi#oidcLogoutCallback");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="oidcRequest"></a>
# **oidcRequest**
> oidcRequest()

Initiates a request to authenticate through the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import com.github.asamoal.nifi.swagger.ApiException;
//import com.github.asamoal.nifi.swagger.client.AccessoidcApi;


AccessoidcApi apiInstance = new AccessoidcApi();
try {
    apiInstance.oidcRequest();
} catch (ApiException e) {
    System.err.println("Exception when calling AccessoidcApi#oidcRequest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

