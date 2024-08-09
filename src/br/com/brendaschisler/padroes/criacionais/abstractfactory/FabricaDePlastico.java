/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.abstractfactory;

/**
 *
 * @author brend
 */
public class FabricaDePlastico implements FabricaDeBrinquedos {

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePlastico();
 
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePlastico();
    }

    @Override
    public Galinha criarGalinha() {
   return new GalinhaDePlastico();
    }

    @Override
    public Raposa criarRaposa() {
   return new RaposaDePlastico();
    }
    
}
