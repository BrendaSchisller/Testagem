/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.factorymethod;

import br.com.brendaschisler.padroes.criacionais.factorymethod.Logistica;

/**
 *
 * @author brend
 */
public class LogisticaFerroviaria extends Logistica {

    @Override
    public Transporte criarTransporte() {
     return new TransporteFerroviario();
    }
    
}
