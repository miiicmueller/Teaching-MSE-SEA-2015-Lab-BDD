/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author DarkOne
 */
public interface IInstrument {
    
    
    /**
     * Public function to play the instrument
     * @return String : Sound of the instrument
     */
    public String play();
    
    
    /**
     * Public function to get the volume of the 
     * instrument
     * @return int : Volume [0 - 100] dB
     */
    public int getSoundVolume();
    
    
    /**
     * Public function to get the instrument color
     * @return 
     */
    public String getColor();
    
            
}
