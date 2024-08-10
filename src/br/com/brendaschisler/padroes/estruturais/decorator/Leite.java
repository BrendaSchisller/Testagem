/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.decorator;

/**
 *
 * @author brend
 */
public class Leite extends CafeDecorator{
    
    public Leite(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double getCusto(){
        return cafe.getCusto() + 1.99;
        
    }
    
    @Override
    public String getDescricao(){
        return cafe.getDescricao() + ", leite";
        
    }
    
}
