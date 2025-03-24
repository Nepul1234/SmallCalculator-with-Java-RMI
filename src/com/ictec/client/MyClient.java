package com.ictec.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        //1. Locate the registry
        Registry registry = LocateRegistry.getRegistry("localhost", 55321);
        //2. Locating the remote object
    }
}
