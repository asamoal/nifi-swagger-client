/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.20.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.asamoal.nifi.swagger.client;

import com.github.asamoal.nifi.swagger.ApiCallback;
import com.github.asamoal.nifi.swagger.ApiClient;
import com.github.asamoal.nifi.swagger.ApiException;
import com.github.asamoal.nifi.swagger.ApiResponse;
import com.github.asamoal.nifi.swagger.Configuration;
import com.github.asamoal.nifi.swagger.Pair;
import com.github.asamoal.nifi.swagger.ProgressRequestBody;
import com.github.asamoal.nifi.swagger.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.asamoal.nifi.swagger.client.model.ProvenanceEventEntity;
import com.github.asamoal.nifi.swagger.client.model.ReplayLastEventRequestEntity;
import com.github.asamoal.nifi.swagger.client.model.ReplayLastEventResponseEntity;
import com.github.asamoal.nifi.swagger.client.model.StreamingOutput;
import com.github.asamoal.nifi.swagger.client.model.SubmitReplayRequestEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvenanceEventsApi {
    private ApiClient apiClient;

    public ProvenanceEventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvenanceEventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInputContent
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInputContentCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/input"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clusterNodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("clusterNodeId", clusterNodeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInputContentValidateBeforeCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getInputContent(Async)");
        }
        
        com.squareup.okhttp.Call call = getInputContentCall(id, clusterNodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the input content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return StreamingOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StreamingOutput getInputContent(String id, String clusterNodeId) throws ApiException {
        ApiResponse<StreamingOutput> resp = getInputContentWithHttpInfo(id, clusterNodeId);
        return resp.getData();
    }

    /**
     * Gets the input content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return ApiResponse&lt;StreamingOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StreamingOutput> getInputContentWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        com.squareup.okhttp.Call call = getInputContentValidateBeforeCall(id, clusterNodeId, null, null);
        Type localVarReturnType = new TypeToken<StreamingOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the input content for a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInputContentAsync(String id, String clusterNodeId, final ApiCallback<StreamingOutput> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInputContentValidateBeforeCall(id, clusterNodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StreamingOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOutputContent
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOutputContentCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/output"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clusterNodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("clusterNodeId", clusterNodeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOutputContentValidateBeforeCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOutputContent(Async)");
        }
        
        com.squareup.okhttp.Call call = getOutputContentCall(id, clusterNodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the output content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return StreamingOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StreamingOutput getOutputContent(String id, String clusterNodeId) throws ApiException {
        ApiResponse<StreamingOutput> resp = getOutputContentWithHttpInfo(id, clusterNodeId);
        return resp.getData();
    }

    /**
     * Gets the output content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return ApiResponse&lt;StreamingOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StreamingOutput> getOutputContentWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        com.squareup.okhttp.Call call = getOutputContentValidateBeforeCall(id, clusterNodeId, null, null);
        Type localVarReturnType = new TypeToken<StreamingOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the output content for a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOutputContentAsync(String id, String clusterNodeId, final ApiCallback<StreamingOutput> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOutputContentValidateBeforeCall(id, clusterNodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StreamingOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProvenanceEvent
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProvenanceEventCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/provenance-events/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clusterNodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("clusterNodeId", clusterNodeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProvenanceEventValidateBeforeCall(String id, String clusterNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProvenanceEvent(Async)");
        }
        
        com.squareup.okhttp.Call call = getProvenanceEventCall(id, clusterNodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @return ProvenanceEventEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProvenanceEventEntity getProvenanceEvent(String id, String clusterNodeId) throws ApiException {
        ApiResponse<ProvenanceEventEntity> resp = getProvenanceEventWithHttpInfo(id, clusterNodeId);
        return resp.getData();
    }

    /**
     * Gets a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @return ApiResponse&lt;ProvenanceEventEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProvenanceEventEntity> getProvenanceEventWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        com.squareup.okhttp.Call call = getProvenanceEventValidateBeforeCall(id, clusterNodeId, null, null);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProvenanceEventAsync(String id, String clusterNodeId, final ApiCallback<ProvenanceEventEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getProvenanceEventValidateBeforeCall(id, clusterNodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for submitReplay
     * @param body The replay request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitReplayCall(SubmitReplayRequestEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/provenance-events/replays";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitReplayValidateBeforeCall(SubmitReplayRequestEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitReplay(Async)");
        }
        
        com.squareup.okhttp.Call call = submitReplayCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ProvenanceEventEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProvenanceEventEntity submitReplay(SubmitReplayRequestEntity body) throws ApiException {
        ApiResponse<ProvenanceEventEntity> resp = submitReplayWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ApiResponse&lt;ProvenanceEventEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProvenanceEventEntity> submitReplayWithHttpInfo(SubmitReplayRequestEntity body) throws ApiException {
        com.squareup.okhttp.Call call = submitReplayValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replays content from a provenance event (asynchronously)
     * 
     * @param body The replay request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitReplayAsync(SubmitReplayRequestEntity body, final ApiCallback<ProvenanceEventEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitReplayValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for submitReplayLatestEvent
     * @param body The replay request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitReplayLatestEventCall(ReplayLastEventRequestEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/provenance-events/latest/replays";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitReplayLatestEventValidateBeforeCall(ReplayLastEventRequestEntity body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitReplayLatestEvent(Async)");
        }
        
        com.squareup.okhttp.Call call = submitReplayLatestEventCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ReplayLastEventResponseEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReplayLastEventResponseEntity submitReplayLatestEvent(ReplayLastEventRequestEntity body) throws ApiException {
        ApiResponse<ReplayLastEventResponseEntity> resp = submitReplayLatestEventWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ApiResponse&lt;ReplayLastEventResponseEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReplayLastEventResponseEntity> submitReplayLatestEventWithHttpInfo(ReplayLastEventRequestEntity body) throws ApiException {
        com.squareup.okhttp.Call call = submitReplayLatestEventValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ReplayLastEventResponseEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replays content from a provenance event (asynchronously)
     * 
     * @param body The replay request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitReplayLatestEventAsync(ReplayLastEventRequestEntity body, final ApiCallback<ReplayLastEventResponseEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitReplayLatestEventValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReplayLastEventResponseEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
