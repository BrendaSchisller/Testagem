/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author brend
 */
public class ControleRemotoBasico extends ControleRemoto {
    
        public ControleRemotoBasico(Dispositivo dispositivo){
        super(dispositivo);
        }

    @Override
    public void ligarDesligar() {
     if(dispositivo.estaLigado()){
         dispositivo.desligar();
     }else{
         dispositivo.ligar();
     }
    }

    @Override
    public void aumentarVolume() {
             dispositivo.aumentarVolume();
    }

    @Override
    public void diminuirVolume() {
          dispositivo.diminuirVolume();
    }

    @Override
    public void silenciar() {
               System.out.println("Dispositivo silenciado");
        while(dispositivo.estaLigado()){
            dispositivo.diminuirVolume();
    }
    

    }
    
}