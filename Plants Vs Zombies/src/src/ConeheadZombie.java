
package src;

import java.awt.Graphics;
/**
 * ConeheadZombie is a subclass of Zombie, it damages plants and is fairly resistant to damage.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class ConeheadZombie extends Zombie
{
    private Animation animation;
     /**
     * Constructor for ConeheadZombie. This calls the constructor of superclass and initializes all Zombie attributes according to
     * its characteristics. Additionally, it initializes a Zombie animation which will be executed in tick and painted in render.
     *  
     * @param x The current x location of the conehead zombie
     * @param y The current y location of the conehead zombie
     */
    public ConeheadZombie(float x, float y)
    {
        super(x,y);
        
        speed = 3; 
        damage = 8; 
        health = 100; 
       
        animation = new Animation (300, Assets.coneheadzombiewalking);
    }
    /**
     *  This method updates the zombie animation (physical properties) and moves the zombie across the garden.
     *  In addition, it also checks if there are any plants nearby (except cherry bombs) and removes them 
     *  from the plants array. It checks the current location of the zombie. If it reaches 
     *  the player's home, a JFrame {@link src.YouLose} will replace the game JFrame and signals to 
     * {@link src.GameState} to cancel the thread.
     */
    public void tick()
    {
        animation.tick();
        
        x = x - ((float)speed)/ 20;
                  
        for (int i=0; i<PlantsArray.countPlants(); i++)
        {
            if (PlantsArray.getPlantsArray().get(i).getX() < x + 5 && 
                PlantsArray.getPlantsArray().get(i).getX() >= x - 1 && 
                PlantsArray.getPlantsArray().get(i).getY() == y && 
                PlantsArray.getPlantsArray().get(i) instanceof CherryBomb == false)
                   
              PlantsArray.removePlants(PlantsArray.getPlantsArray().get(i));    
        }
             
        if ( 100.00 <= x + 1 && x + 1 < 105.00)
        {
             new YouLose(); 
             DisplayB.getFrame().dispose();
             lose = true;  
        }
    }
    /**
     * This method allows drawing of a set of conehead zombie buffered images to the garden (canvas).
     *
     * @param g A graphics object
     */
    public void render (Graphics g)
    {
        g.drawImage(animation.getCurrentFrame(), (int)x, (int)y, null);
    }
  
}
