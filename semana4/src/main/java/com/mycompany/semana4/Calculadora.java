/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

/**
 *
 * @author user
 */
public class Calculadora extends DispositivoElectronico{

    @Override
    public String encender(){
    
        return "Calculadora Encendida";
        
        
    }
        
    public double suma(double a, double b){
            return a+b;
        }
    
    public double resta(double a, double b){
        return a-b;
    }
   
    
    
}
