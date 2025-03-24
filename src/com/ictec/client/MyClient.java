package com.ictec.client;

import com.ictec.cal.MyCalcInter;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {

        try {
            //1. Locate the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 55321);

            //2. Locating the remote object
            MyCalcInter mycal = (MyCalcInter) registry.lookup("MyCalServer");

            //3. Invoking the methods
            int sum = mycal.addTwoIntegers(5, 7);
            System.out.println("Summation of two integers is: " + sum);

            int sub = mycal.subTwoIntegers(7, 5);
            System.out.println("Subtraction of two integers is: " + sub);

            int mul = mycal.mulTwoIntegers(5, 7);
            System.out.println("Multiplication of two integers is: " + mul);

            int div = mycal.divTwoIntegers(10, 5);
            System.out.println("Division of two integers is: " + div);

        } catch (RemoteException e) {
            System.out.println("Locate registry exception" + e.getMessage());
        }catch (NotBoundException e){
            System.out.println("Requested binding is not there" + e.getMessage());
        }

    }
}
