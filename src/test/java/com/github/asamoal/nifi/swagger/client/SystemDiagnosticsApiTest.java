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

import com.github.asamoal.nifi.swagger.client.model.SystemDiagnosticsEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SystemDiagnosticsApi
 */
@Ignore
public class SystemDiagnosticsApiTest {

    private final SystemDiagnosticsApi api = new SystemDiagnosticsApi();

    /**
     * Gets the diagnostics for the system NiFi is running on
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemDiagnosticsTest() throws Exception {
        Boolean nodewise = null;
        String clusterNodeId = null;
        SystemDiagnosticsEntity response = api.getSystemDiagnostics(nodewise, clusterNodeId);

        // TODO: test validations
    }
}
