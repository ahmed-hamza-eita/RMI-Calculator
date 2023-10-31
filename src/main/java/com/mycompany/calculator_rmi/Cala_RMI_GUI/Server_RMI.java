/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator_rmi.Cala_RMI_GUI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author hamza
 */
public class Server_RMI {

    public static void main(String[] args) {
        try {
            Registry reg= LocateRegistry.createRegistry(1098);
            Calculator_Interface_Imp cl=new Calculator_Interface_Imp();
            reg.rebind("CalSurvices", cl);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
