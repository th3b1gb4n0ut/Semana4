/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package com.mycompany.semana4;

/**
 *
 * @author user
 */
public abstract class DispositivoElectronico {
    
    private String marca;
    
   public abstract String encender();

   public void apagar(){
       
       System.out.println("Dispositivo apagado");
   }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
