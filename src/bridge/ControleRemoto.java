/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author brend
 */
public abstract class ControleRemoto {
    
    protected Dispositivo dispositivo;
    
    public ControleRemoto(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
        
    }
    
    public abstract void ligarDesligar();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void silenciar();
    
    
    
}
