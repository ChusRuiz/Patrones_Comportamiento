/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.productositerator;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class ProductosIterator {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1", "Tornillos"));
        productos.add(new Producto("2", "Tuercas"));
        productos.add(new Producto("3", "Llaves"));
        
        JOptionPane.showMessageDialog(null, imprimirProductos(productos));
        
    }
    
    private static String imprimirProductos(ArrayList<Producto>productos){
        String lista ="";
        Iterator<Producto> iterator = productos.iterator();
        
        while(iterator.hasNext()){
            lista += iterator.next().toString();
        }
        return lista;
    }
}
