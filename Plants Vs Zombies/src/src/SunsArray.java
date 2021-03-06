
package src;

import java.util.ArrayList;
/**
 * SunsArray is a class that holds an arraylist of suns for easier accessing of suns throughout the project.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class SunsArray 
{
    /**
     * The arraylist containing all {@link src.Sun} generated by the Sunflower.
     */
    public static ArrayList<Sun> suns; 
    /**
     * Constructor for SunsArray. Initializes the arraylist.
    */
    public SunsArray()
    {
        suns = new ArrayList<Sun>(); 
    }
    /**
     * Adds a sun to the arraylist. This is called at time intervals after a Sunflower is placed by the player in the garden.
     *
     * @param o The {@link src.Sun} object to be added
     */
    public static void addSun(Sun o)
    {
        suns.add(o);
    }
    /**
     * Removes a sun from the arraylist. 
     *
     * @param o The {@link src.Sun} object to be removed
     */
    public static void removeSun(Sun o)
    {
        suns.remove(o);
    }
     /**
     * @return The arraylist containing all {@link src.Sun} generated.
     */
    public static ArrayList<Sun> getSunsArray()
    {
        return suns;
    }
     /**
     * @return The number of {@link src.Sun} elements currently in the arraylist.
     */
    public static int countSuns()
    {
        return suns.size();
    }
    /**
     * This is needed by a JButton inside when collecting suns.
     * This allows the player to always collect the first sun to fall in the garden.
     * 
     * @return The first {@link src.Sun} element in the arraylist. 
     */
    public static Sun firstSun()
    {
        return suns.get(0); 
    }
}
