package src;

import java.awt.Canvas;
import javax.swing.JFrame;
/**
 * SuperDisplay is an abstract class that provides a getter for canvas and JFrame.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public abstract class SuperDisplay 
{
    protected static JFrame frame; 
    protected Canvas canvas; 
    
    /**
     * @return The canvas where all components are rendered.
     */
    public Canvas getCanvas()
    {
        return canvas;
    }
    /**
     * @return The JFrame where the canvas is placed.
     */
    public static JFrame getFrame()
    {
        return frame; 
    }
}
