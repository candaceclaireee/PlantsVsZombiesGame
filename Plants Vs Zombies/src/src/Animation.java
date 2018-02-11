package src;

import java.awt.image.BufferedImage;
/**
 * Animation handles the switching of each buffered image frames from the array.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Animation 
{
    private int speed, index; 
    private BufferedImage[] frames; 
    long lasttime, timer = 0; 
    /**
     * Constructor for Animation. It sets the speed and images to be drawn.
     *
     * @param speed The duration (in milliseconds) before another buffered image is called
     * @param frames The array of buffered images
     */
    public Animation(int speed, BufferedImage[] frames)
    {
        this.speed = speed; 
        this.frames = frames; 
        
        index = 0;
        timer = 0; 
        lasttime = System.currentTimeMillis();
    }
    /**
     * This method handles the timer for the animations and ensures that each buffered image is changed at the correct speed.
     */
    public void tick()
    {
        timer = timer + System.currentTimeMillis() - lasttime;
        lasttime = System.currentTimeMillis();
      
        if (timer > speed)
        {
           index++; 
           timer = 0;
          
           if (index >= frames.length)
              index = 0;
        }
    }   
    /**
     * @return The next buffered image in the array
     */
    public BufferedImage getCurrentFrame()
    {
        return frames[index];
    }
}
