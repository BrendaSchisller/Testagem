/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.factorymethod;

import br.com.brendaschisler.padroes.criacionais.factorymethod.Transporte;

/**
 *
 * @author brend
 */
public class TransporteFerroviario implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Transporte ferroviario");
    }
}
