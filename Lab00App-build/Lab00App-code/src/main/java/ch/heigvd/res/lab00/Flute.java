/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author damien
 */
public class Flute implements IInstrument {
    
    Flute(){
        soundVolume = 100;
    }
    
   public String play(){
        return "piu";
    }
    
    public int getSoundVolume(){
        return soundVolume;
    }
    
    public String getColor(){
        return color;
    }
    
    private int soundVolume;
    private String color;
  
}
