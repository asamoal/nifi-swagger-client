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

import com.github.asamoal.nifi.swagger.client.model.ComponentStateEntity;
import com.github.asamoal.nifi.swagger.client.model.RemotePortRunStatusEntity;
import com.github.asamoal.nifi.swagger.client.model.RemoteProcessGroupEntity;
import com.github.asamoal.nifi.swagger.client.model.RemoteProcessGroupPortEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RemoteProcessGroupsApi
 */
@Ignore
public class RemoteProcessGroupsApiTest {

    private final RemoteProcessGroupsApi api = new RemoteProcessGroupsApi();

    /**
     * Gets a remote process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupTest() throws Exception {
        String id = null;
        RemoteProcessGroupEntity response = api.getRemoteProcessGroup(id);

        // TODO: test validations
    }
    /**
     * Gets the state for a RemoteProcessGroup
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStateTest() throws Exception {
        String id = null;
        ComponentStateEntity response = api.getState(id);

        // TODO: test validations
    }
    /**
     * Deletes a remote process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeRemoteProcessGroupTest() throws Exception {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        RemoteProcessGroupEntity response = api.removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    /**
     * Updates a remote process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupTest() throws Exception {
        RemoteProcessGroupEntity body = null;
        String id = null;
        RemoteProcessGroupEntity response = api.updateRemoteProcessGroup(body, id);

        // TODO: test validations
    }
    /**
     * Updates a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupInputPortTest() throws Exception {
        RemoteProcessGroupPortEntity body = null;
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupInputPort(body, id, portId);

        // TODO: test validations
    }
    /**
     * Updates run status of a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupInputPortRunStatusTest() throws Exception {
        RemotePortRunStatusEntity body = null;
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupInputPortRunStatus(body, id, portId);

        // TODO: test validations
    }
    /**
     * Updates a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupOutputPortTest() throws Exception {
        RemoteProcessGroupPortEntity body = null;
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupOutputPort(body, id, portId);

        // TODO: test validations
    }
    /**
     * Updates run status of a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupOutputPortRunStatusTest() throws Exception {
        RemotePortRunStatusEntity body = null;
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupOutputPortRunStatus(body, id, portId);

        // TODO: test validations
    }
    /**
     * Updates run status of a remote process group
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupRunStatusTest() throws Exception {
        RemotePortRunStatusEntity body = null;
        String id = null;
        RemoteProcessGroupEntity response = api.updateRemoteProcessGroupRunStatus(body, id);

        // TODO: test validations
    }
    /**
     * Updates run status of all remote process groups in a process group (recursively)
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupRunStatusesTest() throws Exception {
        RemotePortRunStatusEntity body = null;
        String id = null;
        RemoteProcessGroupEntity response = api.updateRemoteProcessGroupRunStatuses(body, id);

        // TODO: test validations
    }
}
