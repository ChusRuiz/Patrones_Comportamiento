/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mediator;

import java.util.HashMap;

/**
 *
 * @author Dell Latitude 3190
 */
public class SalonDeChat implements ISalonDeChat {
    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();

    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(), user); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void envia(String de, String a, String msg) {
        if (participantes.containsKey(de) && participantes.containsKey(a)){
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
        } else {
            System.out.println("Usuario inexistente");
        }
    }
    
}

