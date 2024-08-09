/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brendaschisler.padroes.criacionais.prototype;

/**
 *
 * @author brend
 */
public class Documento implements Cloneable {
    
    private String titulo;
    private String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Documento clone(){
        return new Documento(this.titulo, this.conteudo);
       
    }
    
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", conteudo=" + conteudo + '}';
    }
    
    
}
