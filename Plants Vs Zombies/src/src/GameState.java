package src;

import java.awt.*;
import java.awt.image.BufferStrategy;
/**
 * GameState is a class which extends from Canvas and houses buffers, thread methods and game display launchers.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class GameState extends Canvas implements Runnable
{
    private String title;
    private SuperDisplay display;
            
    private Thread thread; 
    private BufferStrategy buffers; 
    private State gamestate;
    private boolean running = false; 
    
    private Graphics graphics;
    private SpriteSheet sheet;
    
    /**
     * Constructor for GameState. This initializes the title which will be used as a parameter to the display based 
     * on the level chosen.
     *
     * @param title The title of the game level chosen in {@link src.Menu}
     */
    public GameState(String title)
    {
        this.title = title;
    }
     /**
     * This method initializes {@link src.Assets} and launches the game state and corresponding display based on the 
     * level chosen by the player.
     */
    private void init()
    {
        Assets.init();
        
        if (title == "PLANTS VS ZOMBIES - BEGINNER LEVEL")
        {
            gamestate = new BeginnerGame();
            display = new DisplayB(title);
        }
        else if (title == "PLANTS VS ZOMBIES - INTERMEDIATE LEVEL")
        {
             gamestate = new IntermediateGame();
             display = new DisplayAandI(title);
        }
        else if (title == "PLANTS VS ZOMBIES - ADVANCED LEVEL")
        {
             gamestate = new AdvancedGame();
             display = new DisplayAandI(title);
        }
        
        State.setState(gamestate);
    }
    /**
     * This method updates the {@link src.State} and continuously checks if the thread should be stopped. (if the player
     * has lost / won)
     */
    private void tick()
    {
        if (State.getState()!=null)
            State.getState().tick();
        
        for (int i=0; i<ZombiesArray.countZombies(); i++) // call stop() if player lost
            if (ZombiesArray.getZombiesArray().get(i).lose == true)
                stop();
        
        if (BeginnerGame.end == true) // call stop() if player won
            stop();
        else if (IntermediateGame.end == true)
            stop(); 
        else if (AdvancedGame.end == true)
            stop();
    }
     /**
     * This method creates a buffer strategy (prepares the drawings in the canvas) and displays the updated canvas at 
     * quick intervals
     */
    private void render()
    {
        buffers = display.getCanvas().getBufferStrategy(); 
        
        if (buffers == null)
        {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        graphics = buffers.getDrawGraphics(); 
        
        if (State.getState()!=null)
           State.getState().render(graphics);
        
        graphics.drawImage(Assets.gamelogo, -5, 515, null);
         
        buffers.show();
        graphics.dispose();
        
    }
    
    public void run()
    {
        init();
        
        int fps = 60; 
        double timepertick = 1000000000/fps; 
        double delta =0; 
        long now;
        long lasttime = System.nanoTime(); 
        long timer =0;
        int ticks =0;
       
            while(running)
            {
                now = System.nanoTime(); 
                delta = delta + (now - lasttime) / timepertick;
                timer = timer + (now - lasttime);
                lasttime = now;
                
                if (delta >= 1){
                  tick();
                  render();
                  ticks++;
                  delta--;
                 }
                if (timer >= 1000000000)
                {
                    ticks =0; 
                    timer =0;
                }
            }
        stop();
    }
    
    /**
     * This method starts the thread.
     */
    public synchronized void start() 
    {
        if (running)
            return; 
        
        running = true;
        new Thread(this).start(); 
    }
    
    /**
     * This method stops the thread.
     */
    public synchronized void stop()
    {
        if (!running)
            running = false; 
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            return;
        }
    }
    
}

