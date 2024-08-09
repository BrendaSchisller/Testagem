/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.factorymethod;

/**
 *
 * @author brend
 */
public abstract class Logistica {
  
    // Método fábrica
    public abstract Transporte criarTransporte();
    
    // Método para organizar entrega
    
    public void organizarEntrega(){
    Transporte transporte = criarTransporte();
    transporte.entregar();
    
    }
}