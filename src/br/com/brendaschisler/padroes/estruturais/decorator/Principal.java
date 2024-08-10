/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.decorator;

/**
 *
 * @author brend
 */
public class Principal {
  
    public static void main(String[] args) {
        Cafe meuCafe = new CafeSimples();
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
        
        // Adicionando leite no cafe
        
        meuCafe = new Leite(meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
        
          // Adicionando acucar no cafe
        
        meuCafe = new Acucar (meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
        
        
    }
}
