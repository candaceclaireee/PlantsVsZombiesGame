package src;

import java.awt.Graphics;
import java.util.TimerTask;
/**
 * Peashooter is a subclass of Plant, when it is planted in the garden, it shoots peas to zombies.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Peashooter extends Plant
{
    private Animation animation;
    /**
     * Constructor for Peashooter. This calls the constructor of superclass and initializes all Plant attributes according to
     * its characteristics. Additionally, it initializes a peashooter animation which will be executed in tick and painted in render.
     * When this constructor is called, a timer initiates which shoots peas and damages zombies at specific time intervals. (As long
     * as there are zombies in the same row as this peashooter.
     * 
     * @param x The current x location of the peashooter
     * @param y The current y location of the peashooter
     */  
    public Peashooter(float x, float y)
    {
        super(x, y);
        
        sunCost = 100; 
        regenerateRate = 4; 
        damage = 10; 
        health = 70; 
        range = 6; 
        directDamage = 25; 
        speed = 3;
                
        animation = new Animation (300, Assets.peashooter);
       
	Timer.scheduleAtFixedRate(task, 0000, speed * 1000); // SHOOTS EVERY 3 SECONDS
    }
    /**
     *  This method updates the peashooter animation (physical properties) and is called repeatedly when added to the garden.
     */
    public void tick()
    {
        animation.tick();     
    }
    /**
     * This method allows drawing of a set of peashooter buffered images to the garden (canvas).
     *
     * @param g A graphics object
     */
    public void render (Graphics g)
    {
        g.drawImage(animation.getCurrentFrame(), (int)x, (int)y, null);
    }
    /**
     * This method is called inside the timer at specific time intervals and damages zombies in the same row as this peashooter.
     * Once the zombie reaches a distance of 1 tile from this peashooter, greater amount of damage will be done to that zombie. If 
     * a zombie is no longer alive, it will be removed from the array of zombies.
     */
    public void damageZombie()
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
         
        if (ZombiesArray.getZombiesArray().get(tempMinX).getX()- x >= 200.00) //damages if same row  
            ZombiesArray.getZombiesArray().get(tempMinX).
            setHealth(ZombiesArray.getZombiesArray().get(tempMinX).getHealth() -  damage);
        else if (ZombiesArray.getZombiesArray().get(tempMinX).getX()- x > 100.00) //damages if same row  
            ZombiesArray.getZombiesArray().get(tempMinX).
            setHealth(ZombiesArray.getZombiesArray().get(tempMinX).getHealth() -  directDamage); 
        
        if ( !ZombiesArray.getZombiesArray().get(tempMinX).isStillAlive()) //checks if still alive
              ZombiesArray.removeZombie(ZombiesArray.getZombiesArray().get(tempMinX));
    }
  
    TimerTask task =  new TimerTask() 
    { 
            public void run()
            {
                for (int i=0; i<ZombiesArray.countZombies(); i++) {
                   if (ZombiesArray.getZombiesArray().get(i).getY() == y && 
                       ZombiesArray.getZombiesArray().get(i).getX()- x >= 0 ) {
                        
                        PeasArray.addPea(new Pea(x, y));
                        damageZombie();
                    }
                }
            }
     };
    
}