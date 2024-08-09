/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author brend
 */
public class Televisao implements Dispositivo {

    private boolean ligado = false;
    private int volume = 30;
    
    
    
    @Override
    public void ligar() {
    ligado = true;
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
    ligado = false;
        System.out.println("TV desligada");
    }

    @Override
    public void aumentarVolume() {
      if(ligado && volume < 100){
         volume++;
          System.out.println("Volume da televisao:" + volume);
      }
    }

    @Override
    public void diminuirVolume() {
     if(ligado && volume > 0){
      volume--;
         System.out.println("Volume da televisao:" + volume);
     }
    }

    @Override
    public boolean estaLigado() {
     return ligado;
    }
    
}
