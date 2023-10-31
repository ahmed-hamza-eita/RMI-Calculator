/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator_rmi.Cala_RMI_GUI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author hamza
 */
public class Calculator_Interface_Imp extends UnicastRemoteObject implements Calculator_Interface {

    public Calculator_Interface_Imp() throws RemoteException {
        super();
    }

    @Override
    public int Calculator(int num1, int num2, int operation) {
        int result = 1;
        switch (operation) {

            case 0:
                result = num1 + num2;
                break;

            case 1:
                result = num1 - num2;
                break;

            case 2:
                result = num1 * num2;
                break;

            case 3:
                result = num1 / num2;
                break;
            default:
                System.out.println("Please enter a vaild number");
        }
        return  result;
    }
}
