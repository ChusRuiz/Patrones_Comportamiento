/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mediator;

/**
 *
 * @author Dell Latitude 3190
 */
public class ChatDemo {
    public static void main( String[] args){
        SalonDeChat s = new SalonDeChat();
        
        Usuario u = new Usuario (s);
        u.setNombre("Juan");
        s.registra(u);
        
        Usuario u1 = new Usuario(s);
        u1.setNombre("Pepe");
        s.registra(u1);
        
        Usuario u2 = new Usuario(s);
        u2.setNombre("Pedro");
        s.registra(u2);
        
        u.envia("Pepe", "Hola como andas");
        u1.envia("Juan", "Todo ok, vos");
        u2.envia("Martin", "Martin estas");
              
    }
    
}
