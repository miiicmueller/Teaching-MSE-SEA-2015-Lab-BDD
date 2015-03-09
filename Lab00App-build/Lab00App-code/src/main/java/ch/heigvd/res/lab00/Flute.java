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
public class Flute implements IInstrument{

    /**
     * Private static final attributes
     */
    
    private static final int FLUTE_VOLUME = 10 ;
    private static final String FLUTE_SOUND = "tuuu" ;
    private static final String FLUTE_COLOR = "brown" ;

    /**
     * Public functions
     */
    
    public Flute()
    {
        
    }
    
  
    /**
     * Interfaces public functions  
     */

    
    /**
     * Plays the sound of the flute
     * @return String : sound
     */
    @Override
    public String play() {
        return FLUTE_SOUND ;
    }

    
    /**
     * Get the volume of the flute
     * @return int : flute volume
     */
    @Override
    public int getSoundVolume() {
        return FLUTE_VOLUME ;
    }

    /**
     * Get the color of a flute
     * @return String : color
     */
    @Override
    public String getColor() {
        return FLUTE_COLOR;
    }
    
}
