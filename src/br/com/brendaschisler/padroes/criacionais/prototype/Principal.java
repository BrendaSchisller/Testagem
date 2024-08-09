/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.prototype;

/**
 *
 * @author brend
 */
public class Principal {
    
    public static void main(String[] args){
        
       // Objeto original
       
       Documento documentoOriginal =
               new Documento("Titulo Original", "Conteúdo Original");
        System.out.println("Documento Original: " + documentoOriginal);
       
       // Criação do clone
       
       Documento documentoClone =
               documentoOriginal.clone();
        System.out.println("Documento Clone: " + documentoClone);
       
       // Alterar o clone
        
       documentoClone.setTitulo("Titulo Clone");
       documentoClone.setConteudo("Conteudo Clone");
       
        System.out.println("----------------------");
        System.out.println("Após modificar o clone");
        System.out.println("Documento Original: " + documentoOriginal);
        System.out.println("Documento Clone: " +documentoClone);
        
        
    }
    
}
