package src;

import java.awt.Graphics;
/**
 * Sun is a class that provides getters and setters for sun's location and methods for tick and render.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Sun 
{
    /**
     * The current x location of a sun. 
     */
    private float x; 
     /**
     * The current y location of a sun. 
     */
    private float y; 
    /**
     * Constructor for Sun. When a {@link src.Sunflower} is added to the garden, the player identifies where the exact location should be. 
     * The suns begin to fall from that exact location and downward the y location.
     * 
     * @param x The current x location of a sun.
     * @param y The current y location of a sun.
     */
    public Sun(float x, float y)
    {
        this.x = x; 
        this.y = y;       
    }
    /**
     * @return x The current x location of a sun
     */
    public float getX()
    {
        return x;
    }
    /**
     * @return y The current y location of a sun
     */
    public float getY()
    {
        return y; 
    }
    /**
     *  This method updates the sun location. If the y location of the sun exceeds the canvas, it removes it 
     *  entirely from the arraylist of suns.
     */
    public void tick()
    {
        y = y + 1;
        
        if (y > 600.00) //if sun location exceeds the jframe
            SunsArray.removeSun(this);
    }
    /**
     * This method allows drawing sun image to the garden (canvas).
     *
     * @param g A graphics object
     */
    public void render (Graphics g)
    {
        g.drawImage(Assets.sun, (int)x, (int)y, null);
    }
    
    
}
