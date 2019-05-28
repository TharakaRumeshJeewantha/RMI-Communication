
package rmi.calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMIClient {

    public static void main(String[] args) throws NotBoundException,MalformedURLException,RemoteException {
        Scanner sc = new Scanner(System.in);
        
        try {
            CalculatorInterface ci = (CalculatorInterface)Naming.lookup("rmi://localhost:1099/RMICalculator");
            System.out.println("RMI Client is connected to the RMI Server");
            System.out.println("Please Select Operator : \n"
                    +"1 Add \n"
                    +"2 Substract \n"
                    +"3 Devide \n"
                    +"4 Multiply \n");
            
            int choice = sc.nextInt();
            double a,b;
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter a and b");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(ci.add(a, b));
                    break;
                }
                case 2:
                {
                     System.out.println("Enter a and b");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(ci.sub(a, b));
                    break;
                }
                 case 3:
                {
                     System.out.println("Enter a and b");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(ci.devide(a, b));
                    break;
                }
                 case 4:
                {
                     System.out.println("Enter a and b");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(ci.multiply(a, b));
                    break;
                }
            }           
        } catch (Exception e) {
            
        }
    }
    
}
