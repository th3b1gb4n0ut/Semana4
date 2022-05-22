/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RunSemana4 {
    
        public static void main(String[] args){
           
            Scanner objCalM = new Scanner(System.in);
            Calculadora[] calcs = new Calculadora[5];
            Television[] tvs = new Television[5];
            
            for (int i = 0; i < 5; i++) {
                
                calcs[i] = new Calculadora();
                System.out.println("Introduce las marcas de las calculadoras:");
                String  marCal = objCalM.next();
                calcs[i].setMarca(marCal);
            }
            for (Calculadora cal : calcs){
               
                System.out.println("Calculadora Marca: " + cal.getMarca());
                System.out.println(cal.encender());
                System.out.println(cal.suma(2, 2));
                cal.apagar();
            }
            
        }
                
}
