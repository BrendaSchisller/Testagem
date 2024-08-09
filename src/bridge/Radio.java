/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author brend
 */
public class Radio implements Dispositivo {

    private boolean ligado = false;
    private int volume = 10;
    
    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Radio ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Radio desligado");
    }

    @Override
    public void aumentarVolume() {
    if(ligado && volume < 100){
        volume++;
        System.out.println("Volume do radio:" + volume);
    }
    }

    @Override
    public void diminuirVolume() {
      if(ligado && volume > 0){
          volume--;
          System.out.println("Volume do radio:" + volume);
      }
    }

    @Override
    public boolean estaLigado() {
     return ligado;
    }
    
}
