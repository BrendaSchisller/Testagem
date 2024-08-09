/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author brend
 */
public class Principal {
    
    public static void main(String[]args){
      
        Dispositivo tv = new Televisao();
        ControleRemoto controleBasico = new ControleRemotoBasico(tv);
        
        System.out.println("Usando controle de remoton basico");
        controleBasico.ligarDesligar();
        controleBasico.aumentarVolume();
        controleBasico.diminuirVolume();
        controleBasico.ligarDesligar();
        
        Dispositivo radio = new Radio();
        ControleRemoto controleAvancado = new ControleRemotoAvancado(radio);
        System.out.println("Usando controle de remoton avancado");
        controleAvancado.ligarDesligar();
        controleAvancado.aumentarVolume();
        controleAvancado.silenciar();
        controleAvancado.ligarDesligar();
    }
    
    
}
