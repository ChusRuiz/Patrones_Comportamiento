/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mediator;

/**
 *
 * @author Dell Latitude 3190
 */
public class Usuario implements IUsuarioChat {
    private String nombre;
    private SalonDeChat Salon;
    private final SalonDeChat salon;
    
    public Usuario (SalonDeChat salonDeChat){
        salon = salonDeChat;
    }

    @Override
    public void recibe(String de, String msg) {
        String s = "el usuario" + de + " te dice: " + msg; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println(nombre + " : " + s);
        
    }

    @Override
    public void envia(String a, String msg) {
        salon.envia(nombre, a, msg); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      
}
