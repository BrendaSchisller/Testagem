/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.abstractfactory;

/**
 *
 * @author brend
 */
public class Principal {
    
    public static void main(String[] args){
        
        FabricaDeBrinquedos fabricaPelucia = new FabricaDePelucia();
        Coelho coelhoPelucia = fabricaPelucia.criarCoelho();
        Ursinho ursoPelucia = fabricaPelucia.criarUrsinho();
        Galinha galinhaPelucia = fabricaPelucia.criarGalinha();
        Raposa raposaPelucia = fabricaPelucia.criarRaposa();
        galinhaPelucia.exibir();
        raposaPelucia.exibir();
        coelhoPelucia.exibir();
        ursoPelucia.exibir();
        
        FabricaDeBrinquedos fabricaPlastico = new FabricaDePlastico();
        Coelho coelhoPlastico = fabricaPlastico.criarCoelho();
        Ursinho ursoPlastico = fabricaPlastico.criarUrsinho();
        Galinha galinhaPlastico = fabricaPlastico.criarGalinha();
        Raposa raposaPlastico = fabricaPlastico.criarRaposa();
        galinhaPlastico.exibir();
        raposaPlastico.exibir();
        coelhoPlastico.exibir();
        ursoPlastico.exibir();
       
        
}
        
    
}


      
