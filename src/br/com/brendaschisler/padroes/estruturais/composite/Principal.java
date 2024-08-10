/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.composite;

/**
 *
 * @author brend
 */
public class Principal {
    
   public static void main(String[] args){
       Empregado funcionario1 = new Funcionario("Luna", "Estagiario");
       Empregado funcionario2 = new Funcionario("Brenda", "Desenvolvedor");
       
       Gestor gestor1 = new Gestor("Luize", "Coordenador");
       gestor1.adicionarSubordinado(funcionario1);
       gestor1.adicionarSubordinado(funcionario2);
       
       Empregado funcionario3 = new Funcionario("Guilherme", "Projetista");
       
       Gestor diretor = new Gestor("Eduardo", "CEO de Tecnologia");
       diretor.adicionarSubordinado(funcionario3);
       diretor.adicionarSubordinado(gestor1);
       
       System.out.println("Detalhes da estrutura da empresa:");
       diretor.mostrarDetalhes();
   }
}
