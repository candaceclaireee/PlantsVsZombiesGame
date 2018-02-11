package src;

import java.awt.Graphics;
/**
 * CherryBomb is a subclass of Plant, when it is planted in the garden, it removes zombies near it.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class CherryBomb extends Plant
{
    private Animation animation;
    /**
     * Constructor for CherryBomb. This calls the constructor of superclass and initializes all Plant attributes according to
     * its characteristics. Additionally, it initializes a cherry bomb animation which will be executed in tick and painted in render.
     *
     * @param x The current x location of the cherry bomb
     * @param y The current y location of the cherry bomb
     */
    public CherryBomb(float x, float y)
    {
        super(x, y);
        
        sunCost = 150; 
        regenerateRate = 6; 
        damage = 10; 
        health = 70; 
        range = 1; 
        directDamage = 50; 
        speed = 0; 
                
        animation = new Animation (300, Assets.cherrybomb);
    }
    /**
     *  This method updates the cherry bomb animation (physical properties) and is called repeatedly when added to the garden.
     *  In addition, it also checks if there are any zombies near its range, those
     *  zombies are then removed from the array of zombies as well as the cherry bomb from the plants array.
     */
    public void tick()
    {
        animation.tick();
        
        for (int i=0; i<ZombiesArray.countZombies(); i++){ 
            
            if (ZombiesArray.getZombiesArray().get(i).getY() == y &&
                ZombiesArray.getZombiesArray().get(i).getX() >= x-200 &&
                ZombiesArray.getZombiesArray().get(i).getX() <= x+200)
              ZombiesArray.getZombiesArray().remove(ZombiesArray.getZombiesArray().get(i));
              
            if (i+1 == ZombiesArray.countZombies())
                PlantsArray.removePlants(this);
        }
                
    }
    
    /**
     * This method allows drawing of a set of cherry bomb buffered images to the garden (canvas).
     *
     * @param g A graphics object
     */
    public void render (Graphics g)
    {
        g.drawImage(animation.getCurrentFrame(), (int)x, (int)y, null);    
    }
   
}

