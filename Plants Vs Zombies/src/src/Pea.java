package src;

import java.awt.Graphics;
/**
 * Pea is a class that provides getters and setters for pea's location and methods for tick and render.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Pea 
{
    /**
     * The current x location of a pea. 
     */
     private float x;
     /**
     * The current y location of a pea. 
     */
     private float y; 
    /**
     * Constructor for Pea. When a {@link src.Peashooter} is added to the garden, the player identifies where the exact location should be. 
     * The pea begin to move from that exact location and forward the x location.
     * 
     * @param x The current x location of a pea.
     * @param y The current y location of a pea.
     */
     public Pea(float x, float y)
     {
         this.x = x; 
         this.y = y;
     }
    /**
     * @return x The current x location of a pea
     */
    public float getX()
    {
        return x;
    }
    /**
     * @return y The current y location of a pea
     */
    public float getY()
    {
        return y; 
    }
     /**
     *  This method updates the pea location. If the y location of the pea exceeds the canvas, it removes it 
     *  entirely from the arraylist of peas.
     */
     public void tick()
     {
         x = x + 10;
         
         if (x > 1100.00) //if pea location exceeds the jframe
            PeasArray.removePea(this);
     }
     /**
     * This method allows drawing pea image to the garden (canvas).
     *
     * @param g A graphics object
     */
     public void render(Graphics g)
     {
         int tempMinX = 0;
        
        for (int j=0; j<ZombiesArray.countZombies(); j++)
        {
            if(ZombiesArray.getZombiesArray().get(j).getY() == y)
                tempMinX = j; 
        }
         
         for (int j=0; j<ZombiesArray.countZombies(); j++)
        {
            if(ZombiesArray.getZombiesArray().get(j).getY() == y &&
                ZombiesArray.getZombiesArray().get(j).getX() <= 
                ZombiesArray.getZombiesArray().get(tempMinX).getX())
                tempMinX = j; 
         }
         
        if (ZombiesArray.getZombiesArray().get(tempMinX).getY() == y && 
           ZombiesArray.getZombiesArray().get(tempMinX).getX() >= x) //damages if same row  
            g.drawImage(Assets.peabullet, (int)x, (int)y, null);
     }

}