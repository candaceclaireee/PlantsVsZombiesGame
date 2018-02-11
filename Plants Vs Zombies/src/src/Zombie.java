
package src;

import java.awt.Graphics;
/**
 * Zombie is an abstract class that provides getters and setters for plants attributes and abstract methods for tick and render.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public abstract class Zombie 
{
    /**
     * The current x location of a zombie. 
     */
    protected float x;
    /**
     * The current y location of a zombie. 
     */
    protected float y; 
    /**
     * How fast a zombie move from the end of the garden towards the player's home.
     */
    protected int speed; 
    /**
     * The amount of damage a zombie has when attacking a plant.
     */
    protected int damage; 
    /**
     * The amount of damage a zombie can sustain from a plant attack.
     */
    protected int health; 
    /**
     * Holds a boolean value which serves as a flag to {@link src.GameState}. It signals that the game is over (player loses)
     * and cancels the thread.
     */
    public static boolean lose = false; 
    /**
     * Constructor for Zombie. When a zombie is walks into the garden, the first x location is always 1100 and the y location
     * is generated randomly. This is needed by plants to recognize if there is a zombie in their row that they should attack.
     *
     * @param x The current x location of a zombie.
     * @param y The current y location of a zombie.
     */
    public Zombie(float x, float y)
    {
        this.x = x; 
        this.y = y; 
    }
    /**
     * @param x The current x location of a zombie.
     */
    public void setX(float x)
    {
        this.x = x; 
    }
    /**
     * @param y The current y location of a zombie.
     */
    public void setY(float y)
    {
        this.y = y;
    }
    /**
     * @param speed How fast a zombie move from the end of the garden towards the player's home.
     */
    public void setSpeed(int speed)
    {
        this.speed = speed; 
    }
    /**
     * @param damage The amount of damage a zombie has when attacking a plant.
     */
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    /**
     * @param health The amount of damage a zombie can sustain from a plant attack.
     */
    public void setHealth(int health)
    {
        this.health = health;
    }
    /**
     * @return x The current x location of a zombie. 
     */
    public float getX()
    {
        return x; 
    }
    /**
     * @return y The current y location of a zombie.
     */
    public float getY()
    {
        return y; 
    }
    /**
     * @return speed How fast a zombie move from the end of the garden towards the player's home.
     */
    public int getSpeed()
    {
        return speed;
    }
    /**
     * @return damage The amount of damage a zombie has when attacking a plant.
     */
    public int getDamage()
    {
        return damage; 
    }
    /**
     * @return health The amount of damage a zombie can sustain from a plant attack.
     */
    public int getHealth()
    {
        return health; 
    }
    /**
     * This method checks if a zombie is still alive. It is called before a zombie is removed from an array 
     * and removed entirely from the garden.
     *
     * @return true if zombie health is greater than 0 and false if health is less than 0
     */
    public boolean isStillAlive()
    {
        if (health < 0)
            return false; 
        else 
            return true; 
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    
}
