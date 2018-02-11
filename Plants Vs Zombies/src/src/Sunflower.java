package src;

import java.awt.Graphics;
import java.util.Random;
import java.util.TimerTask;
/**
 * Sunflower is a subclass of Plant, when it is planted in the garden, it produces suns.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Sunflower extends Plant
{
    private Animation animation;
    /**
     * Constructor for Sunflower. This calls the constructor of superclass and initializes all Plant attributes according to
     * its characteristics. Additionally, it initializes a sunflower animation which will be executed in tick and painted in render.
     * When this constructor is called, a timer initiates which generate suns at specific time intervals (and adds it to an arraylist 
     * of suns).
     * 
     * @param x The current x location of the sunflower
     * @param y The current y location of the sunflower
     */
    public Sunflower(float x, float y)
    {
        super(x, y);
        
        sunCost = 50; 
	regenerateRate = 3; 
	damage = 0; 
	health = 50; 
	range = 0;
	directDamage = 0;
	speed = 0;
                
        animation = new Animation (300, Assets.sunflower);
        
        Timer.scheduleAtFixedRate(task, 0000, 15000); // GENERATES SUN EVERY 15S
    }
    /**
     *  This method updates the sunflower animation (physical properties) and is called repeatedly when added to the garden.
     */
    public void tick()
    {
        animation.tick();
    }
    /**
     * This method allows drawing of a set of sunflower buffered images to the garden (canvas).
     *
     * @param g A graphics object
     */
    public void render (Graphics g)
    {
        g.drawImage(animation.getCurrentFrame(), (int)x, (int)y, null);
    }
    
    TimerTask task =  new TimerTask() 
     { 
        public void run()
        {
            Sun sun = new Sun(x, y);
            SunsArray.addSun(sun);
        }
     };
    
}
