package src;

import java.awt.Graphics;
import java.util.ArrayList;
/**
 * PeasArray is a class that holds an arraylist of peas for easier accessing of peas throughout the project.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class PeasArray 
{
    /**
     * The arraylist containing all {@link src.Pea} generated by the Peashooter.
     */
    public static ArrayList<Pea> peas; 
    /**
     * Constructor for PeasArray. Initializes the arraylist.
    */
    public PeasArray()
    {
        peas = new ArrayList<Pea>(); 
    }
    /**
     * Adds a pea to the arraylist. This is called at time intervals after a Peashooter is placed by the player in the garden.
     *
     * @param o The {@link src.Pea} object to be added
     */
    public static void addPea(Pea o)
    {
        peas.add(o);
    }
    /**
     * Removes a pea from the arraylist. 
     *
     * @param o The {@link src.Plant} object to be removed
     */
    public static void removePea(Pea o)
    {
        peas.remove(o);
    }
     /**
     * @return The arraylist containing all {@link src.Pea} generated.
     */
    public static ArrayList<Pea> getPeasArray()
    {
        return peas;
    }
    /**
     * @return The number of {@link src.Pea} elements currently in the arraylist.
     */
    public static int countPeas()
    {
        return peas.size();
    }
     /**
     * This method updates all {@link src.Pea} in the arraylist (adjusts their x locations).
     */
    public void tick()
    {
        for (int i=0; i<peas.size(); i++)
            PeasArray.getPeasArray().get(i).tick();  
    }
     /**
     * This method draws all {@link src.Pea} in the arraylist on the canvas.
     * 
     * @param g A graphics image
     */
    public void render(Graphics g)
    {
        for (int i=0; i<peas.size(); i++)
            PeasArray.getPeasArray().get(i).render(g);
    }
}
    
