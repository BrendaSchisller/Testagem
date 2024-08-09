/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.builder;

/**
 *
 * @author brend
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Casa simples
        
        Casa casaSimples = new Builder()
                .comParedes("Paredes de Tijolos")
                .comTelhado("Telhado de Telha")
                .build();
        
        System.out.println("Casa simples");
        System.out.println("Paredes: "  + casaSimples.getParedes());
        System.out.println("Telhado: "  + casaSimples.getTelhado());
        
        System.out.println("---------------------------------------");
        
       // Casa completa
       
       Casa casaCompleta = new Builder()
               .comParedes("Paredes de Vidro")
               .comTelhado("Telhado de Vidro")
               .comJanelas("Janelas de Vidro")
               .comPortas("Portas de Vidro")
               .build();
       
        System.out.println("Casa completa");
        System.out.println("Paredes: " + casaCompleta.getParedes());
        System.out.println("Telhado: " + casaCompleta.getTelhado());
        System.out.println("Janelas: " + casaCompleta.getJanelas());
        System.out.println("Portas: " + casaCompleta.getPortas());
        
        
    }  
}
