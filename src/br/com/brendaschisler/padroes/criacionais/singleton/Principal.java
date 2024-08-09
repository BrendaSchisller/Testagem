/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.singleton;

/**
 *
 * @author brend
 */
public class Principal {
    
    public static void main(String[] args) {
        
        //Obter a unica instancia
        
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();
        
        System.out.println("instancia 1");
        singleton1.mostrarMensagem();
        
        System.out.println("instancia 2");
        singleton2.mostrarMensagem();
        
        System.out.println("--------------------");
        if(singleton1 == singleton2){
            System.out.println("As instancias sao iguais");
        }else{
            System.out.println("As instancias sao diferentes");
            
        }
        
    }
    
}
