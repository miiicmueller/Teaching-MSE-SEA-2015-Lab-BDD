/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.res.lab00;

/**
 *
 * @author DarkOne
 */
public class Trumpet implements IInstrument {

        /**
     * Private static final attributes
     */
    
    private static final int TRUMPET_VOLUME = 50 ;
    private static final String TRUMPET_SOUND = "pouet" ;
    private static final String TRUMPET_COLOR = "golden" ;

    /**
     * Public functions
     */
    
    public Trumpet()
    {
        
    }
    
    /**
     * Interfaces public functions  
     */

    
    /**
     * Plays the sound of the trumpet
     * @return String : sound
     */
    @Override
    public String play() {
        return TRUMPET_SOUND;
    }
    
    /**
     * Get the volume of the trumpet
     * @return int : flute volume
     */
    @Override
    public int getSoundVolume() {
         return TRUMPET_VOLUME;
    }

    /**
     * Get the color of a trumpet
     * @return String : color
     */
    @Override
    public String getColor() {
        return TRUMPET_COLOR;
    }
 
}
