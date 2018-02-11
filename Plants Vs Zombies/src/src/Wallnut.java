package src;

import java.awt.Graphics;
import java.util.TimerTask;
/**
 * Wallnut is a subclass of Plant, when it is planted in the garden, blocks zombies and gives time for plants to attack.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Wallnut extends Plant
{
    private Animation animation;
    /**
     * Constructor for Wallnut. This calls the constructor of superclass and initializes all Plant attributes according to
     * its characteristics. Additionally, it initializes a wallnut animation which will be executed in tick and painted in render.
     * When this constructor is called, a timer initiates which decreases the current health of this wallnut only if there is a zombie
     * nearby. 
     * 
     * @param x The current x location of the sunflower
     * @param y The current y location of the sunflower
     */
    public Wallnut(float x, float y)
    {
        super(x, y);
        
        sunCost = 50; 
        regenerateRate = 6; 
        damage = 10; 
        health = 100; 
        range = 1; 
        directDamage = 0; 
        speed = 2; 
                
        animation = new Animation (300, Assets.wallnut);
        
	Timer.scheduleAtFixedRate(task, 0000, speed * 1000); // WALLNUT IS DAMAGED EVERY 2 SECONDS
    }
    /**
     *  This method updates the wallnut animation (physical properties) and is called repeatedly when added to the garden.
     *  In addition, it also checks if there are any zombies near its range, those
     *  zombies' speed are set to 0. 
     */
    public void tick()
    {
        animation.tick();
        
        for (int i=0; i<ZombiesArray.countZombies(); i++){
         if (ZombiesArray.getZombiesArray().get(i).getX() >= x && 
             ZombiesArray.getZombiesArray().get(i).getX() < x + 20 && 
             ZombiesArray.getZombiesArray().get(i).getY() == y)
          
            ZombiesArray.getZombiesArray().get(i).setSpeed(0);
        }
             
    }
    /**
     * This method allows drawing of a set of wallnut buffered images to the garden (canvas).
     *
     * @param g A graphics object
     */
    public void render (Graphics g)
    {
        g.drawImage(animation.getCurrentFrame(), (int)x, (int)y, null);
    }
    /**
     * This method is called inside the timer at specific time intervals. If there is a zombie attacking this wallnut, the wallnut's
     * health decreases. If health reaches 0, it will be removed from the array of plants and the zombies will go back to their 
     * original speeds.
     */   
    public void decreaseHealth()
    {
        for (int i=0; i<ZombiesArray.countZombies(); i++){ 
         if (ZombiesArray.getZombiesArray().get(i).getX() >= x && 
             ZombiesArray.getZombiesArray().get(i).getX() < x + 50 && 
             ZombiesArray.getZombiesArray().get(i).getY() == y)
             health = health - ZombiesArray.getZombiesArray().get(i).getDamage();
          
          if (health <= 0 ){
              PlantsArray.removePlants(this);
              ZombiesArray.getZombiesArray().get(i).setSpeed(4);
          }
        }
    }
      
    TimerTask task =  new TimerTask() 
     { 
            public void run()
            {
               decreaseHealth();
            }
     };
   
}
