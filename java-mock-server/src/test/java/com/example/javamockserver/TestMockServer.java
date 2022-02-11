package com.example.javamockserver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;

import java.util.concurrent.TimeUnit;

public class TestMockServer {

    private ClientAndServer mockServer;
    @BeforeClass
    public void startServer() {
        mockServer = mockServer.startClientAndServer(1080);
    }

    @AfterClass
    public void stopServer() {
        mockServer.stop();
    }


}
