/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.abstractfactory;

/**
 *
 * @author brend
 */
public interface FabricaDeBrinquedos {
    Ursinho criarUrsinho();
    
    Coelho criarCoelho();

    public Galinha criarGalinha();

    public Raposa criarRaposa();
    
}
