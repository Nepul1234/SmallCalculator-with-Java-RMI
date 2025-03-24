package com.ictec.server;

import com.ictec.cal.MyCalcInter;
import com.ictec.cal.MyCalculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        //1. Create a registry
        try {
            Registry registry = LocateRegistry.createRegistry(55321);

            //2. Binding the remote object
            MyCalcInter mycal = new MyCalculator();
            registry.rebind("MyCalServer", mycal);

            System.out.println("MyCalServer is ready...");

        } catch (RemoteException e) {
            System.out.println("Error in registry creation" + e.getMessage());
        }
    }
}
