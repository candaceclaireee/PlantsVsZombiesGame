package src;

import java.awt.Graphics;
/**
 * State is an abstract class that proves a getter and setter for the current state of the game.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public abstract class State 
{
    private static State currentState = null;
    /**
     * @param state The new current state of the game
     */
    public static void setState(State state)
    {
        currentState = state; 
    }
    /**
     * @return The new current state of the game
     */
    public static State getState()
   {
       return currentState; 
   }
   
    public abstract void tick();
    public abstract void render (Graphics g);
}
