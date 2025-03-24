package com.ictec.cal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyCalcInter extends Remote {
    public int addTwoIntegers(int a, int b) throws RemoteException;
    public int subTwoIntegers(int a, int b) throws RemoteException;
    public int mulTwoIntegers(int a, int b) throws RemoteException;
    public int divTwoIntegers(int a, int b) throws RemoteException, ArithmeticException;
}
