package src;

import java.awt.Graphics;
import java.util.Timer;
/**
 * Plant is an abstract class that provides getters and setters for plants attributes and abstract methods for tick and render.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public abstract class Plant 
{    
    /**
     * The current x location of a plant. 
     */
    protected float x;
    /**
     * The current y location of a plant.
     */
    protected float y; 
    /**
     * The amount of sun to be collected to buy a plant.
     */
    protected int sunCost;
    /**
     * The duration (in seconds) before a plant can be planted again.
     */
    protected int regenerateRate;
    /**
     * The amount of damage a plant has when attacking an opponent.
     */
    protected int damage;
    /**
     * The amount of damage a plant can sustain from an opponents attack.
     */
    protected int health;
    /**
     * The distance (per tile) as to how far a plant attack is.
     */
    protected int range;
    /**
     * The amount of damage a plant has when attacking an opponent at a closer range.
     */
    protected int directDamage;
    /**
     * The duration (in seconds) before a plant executes its next attack.
     */
    protected int speed;
    
    Timer Timer = new Timer ();

    /**
     * Constructor for Plant. When a plant is added to the garden, the player identifies where the exact location should be. 
     * This is needed by zombies to recognize where they should attack and for the shovel tool to know the plant that it 
     * should remove from the garden.
     *
     * @param x The current x location of a plant.
     * @param y The current y location of a plant.
     */
    public Plant(float x, float y)
    {
        this.x = x; 
        this.y = y; 
    }
    /**
     * @param x The current x location of a plant.
     */
    public void setX(float x)
    {
        this.x = x; 
    }
    /**
     * @param y The current y location of a plant
     */
    public void setY(float y)
    {
        this.y = y;
    }
    /**
     * @param sunCost The amount of sun to be collected to buy a plant.
     */
    public void setSunCost(int sunCost)
    {
        this.sunCost = sunCost; 
    }
    /**
     * @param regenerateRate The duration (in seconds) before a plant can be planted again.
     */
    public void setRegenerateRate(int regenerateRate)
    {
        this.regenerateRate = regenerateRate;
    }
    /**
     * @param damage The amount of damage a plant has when attacking an opponent.
     */
    public void setDamage(int damage)
    {
        this.damage = damage; 
    }
    /**
     * @param health The amount of damage a plant can sustain from an opponents attack.
     */
    public void setHealth(int health)
    {
        this.health = health;
    }
    /**
     * @param range The distance (per tile) as to how far a plant attack is.
     */
    public void setRange(int range)
    {
        this.range = range; 
    }
    /**
     * @param directDamage The amount of damage a plant has when attacking an opponent at a closer range.
     */
    public void setDirectDamage(int directDamage)
    {
        this.directDamage = directDamage; 
    }
    /**
     * @param speed The duration (in seconds) before a plant executes its next attack.
     */
    public void setSpeed(int speed)
    {
        this.speed = speed; 
    }
    /**
     * @return x The current x location of a plant.
     */
    public float getX()
    {
        return x; 
    }
    /**
     * @return y The current y location of a plant.
     */
    public float getY()
    {
        return y; 
    }
    /**
     * @return sunCost The amount of sun to be collected to buy a plant.
     */
    public int getSunCost()
    {
        return sunCost; 
    }
    /**
     * @return regerateRate The duration (in seconds) before a plant can be planted again.
     */
    public int getRegenerateRate()
    {
        return regenerateRate;
    }
    /**
     * @return damage The amount of damage a plant has when attacking an opponent.
     */
    public int getDamage()
    {
        return damage; 
    }
    /**
     * @return health The amount of damage a plant can sustain from an opponents attack.
     */
    public int getHealth()
    {
        return health;
    }
    /**
     * @return range The distance (per tile) as to how far a plant attack is.
     */
    public int setRange()
    {
        return range; 
    }
    /**
     * @return directDamage The amount of damage a plant has when attacking an opponent at a closer range.
     */
    public int setDirectDamage()
    {
        return directDamage; 
    }
    /**
     * @return speed The duration (in seconds) before a plant executes its next attack.
     */
    public int setSpeed()
    {
        return speed; 
    }
    
    /**
     * This method checks if a plant is still alive. It is called before a plant is removed from an array 
     * and removed entirely from the garden.
     *
     * @return true if plant health is greater than 0 and false if health is less than 0
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

