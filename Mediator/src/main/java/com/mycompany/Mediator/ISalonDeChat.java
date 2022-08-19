/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mediator;

/**
 *
 * @author Dell Latitude 3190
 */
public interface ISalonDeChat {
    
    public abstract void registra(Usuario participante);
    public abstract void envia(String de, String a, String msg);
    
}
