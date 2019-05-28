
package rmi.calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException,NotBoundException {

            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("RMICalculator",new CalculatorRMI());
            System.out.println("RMIServer is running on port 1099");

    }
}
 