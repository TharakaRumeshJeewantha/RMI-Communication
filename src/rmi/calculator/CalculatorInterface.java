
package rmi.calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote{
    public double add(double a, double b) throws RemoteException;
    public double sub(double a, double b) throws RemoteException;
    public double devide(double a, double b) throws RemoteException;
    public double multiply(double a, double b) throws RemoteException;
}
 