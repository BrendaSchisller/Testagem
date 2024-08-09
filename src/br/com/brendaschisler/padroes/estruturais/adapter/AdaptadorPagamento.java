/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.adapter;

/**
 *
 * @author brend
 */
public class AdaptadorPagamento implements SistemaPagamentoNovo{
    
    private SistemaPagamentoAntigo sistemaPagamentoAntigo;
    
    public AdaptadorPagamento(SistemaPagamentoAntigo sistemaPagamentoAntigo) {
   this.sistemaPagamentoAntigo = sistemaPagamentoAntigo;
    
   }

    @Override
    public void processarPagamento(String clienteId, double valor) {
       sistemaPagamentoAntigo.realizarPagamento(clienteId, valor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
