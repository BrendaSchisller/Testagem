/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.abstractfactory;

/**
 *
 * @author brend
 */
public class FabricaDePelucia implements FabricaDeBrinquedos{

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePelucia();
 
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePelucia();
    }

    @Override
    public Galinha criarGalinha() {
       return new GalinhaDePelucia();
    }

    @Override
    public Raposa criarRaposa() {
       return new RaposaDePelucia();
    }
   
}