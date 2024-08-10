/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.decorator;

/**
 *
 * @author brend
 */
public abstract class CafeDecorator implements Cafe{
    
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public double getCusto() {
       return cafe.getCusto();
    }
    
    
    
}
