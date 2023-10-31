/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.calculator_rmi.Cala_RMI_GUI;

import java.rmi.Remote;

/**
 *
 * @author hamza
 */
public interface Calculator_Interface extends Remote{
    public   int Calculator(int num1,int num2,int operation) throws  Exception;
    
}
