/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.composite;

/**
 *
 * @author brend
 */
public class Funcionario implements Empregado{
    
    private String nome;
    private String cargo;
    
    public Funcionario(String nome, String cargo){
        
        this.nome = nome;
        this.cargo = cargo;
            
    }
     
    @Override
    public void mostrarDetalhes(){
        System.out.println(nome + " - " + cargo);
    }
    
}
