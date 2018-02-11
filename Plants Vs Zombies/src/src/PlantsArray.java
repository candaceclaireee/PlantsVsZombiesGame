package src;

import java.util.ArrayList;
/**
 * PlantsArray is a class that holds an arraylist of plants for easier accessing of plants throughout the project.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class PlantsArray 
{
    /**
     * The arraylist containing all {@link src.Plant} subclasses.
     */
    public static ArrayList<Plant> plants; 
    /**
     * Constructor for PlantsArray. Initializes the arraylist.
    */
    public PlantsArray()
    {
        plants = new ArrayList<Plant>(); 
    }
     /**
     * Adds a plant to the arraylist. This is called whenever a plant is placed by the player in the garden.
     *
     * @param o The {@link src.Plant} object to be added
     */
    public static void addPlant(Plant o)
    {
        plants.add(o);
    }
    /**
     * Removes a plant from the arraylist. This is called when a plant dies and is removed completely in the garden.
     * It also cancels the timer (if there is any) in a plant subclass. 
     *
     * @param o The {@link src.Plant} object to be removed
     */
    public static void removePlants(Plant o)
    {
        o.Timer.cancel();
        
        plants.remove(o);
    }
    /**
     * @return The arraylist containing all {@link src.Plant} subclasses.
     */
    public static ArrayList<Plant> getPlantsArray()
    {
        return plants;
    }
    /**
     * @return The number of {@link src.Plant} elements currently in the arraylist.
     */
    public static int countPlants()
    {
        return plants.size();
    }
}
