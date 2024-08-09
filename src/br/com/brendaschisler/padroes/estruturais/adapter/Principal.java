/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.adapter;

/**
 *
 * @author brend
 */
public class Principal {
    
    public static void main(String[] args) {
        
        SistemaPagamentoAntigo sistemaPagamentoAntigo = new SistemaPagamentoAntigo();
        SistemaPagamentoNovo sistemaPagamentoNovo = new AdaptadorPagamento(sistemaPagamentoAntigo);
        
        sistemaPagamentoNovo.processarPagamento("666", 666.99);

        
        
    }
    
    
    
}
