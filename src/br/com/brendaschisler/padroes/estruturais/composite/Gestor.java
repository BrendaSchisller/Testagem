/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.estruturais.composite;

import br.com.brendaschisler.padroes.estruturais.Composite.Empregado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brend
 */
public class Gestor implements Empregado {

    private String nome;
    private String cargo;
    private List<Empregado> subordinado;

    public Gestor(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.subordinado = new ArrayList();
    }

    public void adicionarSubordinado(Empregado empregado) {
        this.subordinado.add(empregado);

    }

    public void removerSubordinado(Empregado empregado) {
        this.subordinado.remove(empregado);

    }

    @Override
    public void mostrarDetalhes() {

        System.out.println(nome + " - " + cargo);
        for (Empregado sub : subordinado) {
            sub.mostrarDetalhes();

        }
    }

}
