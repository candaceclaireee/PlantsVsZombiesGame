package src;

import java.util.ArrayList;
/**
 * ZombiesArray is a class that holds an arraylist of zombies for easier accessing of zombies throughout the project.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class ZombiesArray 
{
    /**
     * The arraylist containing all {@link src.Zombie} subclasses.
     */
    public static ArrayList<Zombie> zombies; 
    /**
     * Constructor for ZombiesArray. Initializes the arraylist.
    */
    public ZombiesArray()
    {
        zombies = new ArrayList<Zombie>(); 
    }
    /**
     * Adds a zombie to the arraylist. This is called whenever a zombie is generated and appears in the garden.
     *
     * @param o The {@link src.Zombie} object to be added
     */
    public static void addZombie(Zombie o)
    {
        zombies.add(o);
    }
    /**
     * Removes a zombie from the arraylist. This is called when a zombie dies and is removed completely in the garden.
     *
     * @param o The {@link src.Zombie} object to be removed
     */
    public static void removeZombie(Zombie o)
    {
        zombies.remove(o);
    }
    /**
     * @return The arraylist containing all {@link src.Zombie} subclasses.
     */
    public static ArrayList<Zombie> getZombiesArray()
    {
        return zombies;
    }
    /**
     * @return The number of {@link src.Zombie} elements currently in the arraylist.
     */
    public static int countZombies()
    {
        return zombies.size();
    }
}
