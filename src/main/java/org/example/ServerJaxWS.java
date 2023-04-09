package org.example;

import javax.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9191/", new BankService());
        System.out.println("Server is running...");
    }
}
