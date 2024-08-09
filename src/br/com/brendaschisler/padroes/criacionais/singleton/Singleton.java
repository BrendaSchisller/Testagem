/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.singleton;

/**
 *
 * @author brend
 */
public class Singleton {
    
    // A unica instância da classe
    private static Singleton instancia;
    
    //Criar um construtor privado
    //Evitar instancias externas
    private Singleton(){
    }
    
    public static Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();   
    }
    return instancia;
}

public void mostrarMensagem(){
    System.out.println("Mensagem padrao instancia Singleton");


}


}