/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.builder;

/**
 *
 * @author brend
 */
public class Casa {
    
    private String paredes;
    private String telhado;
    private String portas;
    private String janelas;

    public String getParedes() {
        return paredes;
    }

    public String getTelhado() {
        return telhado;
    }

    public String getPortas() {
        return portas;
    }

    public String getJanelas() {
        return janelas;
    }
    
    private Casa(){
        
    }
    
    public Casa(Builder builder){
        this.paredes = builder.paredes;
        this.telhado = builder.telhado;
        this.portas = builder.portas;
        this.janelas = builder.janelas; 

        
    }
    
}
