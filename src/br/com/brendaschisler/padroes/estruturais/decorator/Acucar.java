/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.decorator;

/**
 *
 * @author brend
 */
public class Acucar extends CafeDecorator{
    
    public Acucar(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double getCusto(){
        return cafe.getCusto() + 2.99;
        
    }
    
    @Override
    public String getDescricao(){
        return cafe.getDescricao() + ", acucar";
        
    }
    
}
