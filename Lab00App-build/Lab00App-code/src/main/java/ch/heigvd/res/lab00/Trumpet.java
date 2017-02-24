/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

interface IInstrument{
    public String play();
    public int getSoundVolume();
    public String getColor();
}

public class Trumpet implements IInstrument{
    
    Trumpet(){
        soundVolume = 120;
        color = "golden";
    }
    
    public String play(){
        return "pouet";
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
