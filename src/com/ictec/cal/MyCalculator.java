package com.ictec.cal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements MyCalcInter {
    public MyCalculator() throws RemoteException {
        super();
    }

    @Override
    public int addTwoIntegers(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subTwoIntegers(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int mulTwoIntegers(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int divTwoIntegers(int a, int b) throws RemoteException, ArithmeticException {
        return a / b;
    }
}
