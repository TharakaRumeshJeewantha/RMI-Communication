
package rmi.calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorRMI extends UnicastRemoteObject implements CalculatorInterface {

    public CalculatorRMI() throws RemoteException
    {
        double a, b;
    }
    
    @Override
    public double add(double a, double b) throws RemoteException {
        return a+b;
    }

    @Override
    public double sub(double a, double b) throws RemoteException {
        return a-b;
    }

    @Override
    public double devide(double a, double b) throws RemoteException {
         return a/b;
    }

    @Override
    public double multiply(double a, double b) throws RemoteException {
        return a*b;
    }
    
    
}
