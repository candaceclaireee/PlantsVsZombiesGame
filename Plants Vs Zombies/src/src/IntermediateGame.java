
package src;

import java.awt.Graphics;
import java.util.*;
/**
 * IntermediateGame is a subclass of State and handles the updating and rendering of all entities, timers to generate zombies 
 * and suns and changing delay based on the current number of seconds.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class IntermediateGame extends State 
{

    private Garden gard;
    
    private PlantsArray plants = new PlantsArray();  
    private ZombiesArray zombies = new ZombiesArray();
    private SunsArray suns = new SunsArray();
    private PeasArray peas = new PeasArray();
    
    Timer gameTimer = new Timer (); 
    private static int displaySec = 0;
    private static int delay = 7000;
        
    private static float[] list= new float[5];
    private static int[] list2 = new int[2];
    private static int[] list3 = new int[10];
     /**
     * Holds a boolean value which serves as a flag to {@link src.GameState}. It signals that the game is over (player wins)
     * and cancels the thread.
     */
    public static boolean end = false; 
    /**
     * Constructor for IntermediateGame. This initializes the world (intermediate level) and starts the game timer, timer 
     * for generating zombies and generating sun.
     */
    public IntermediateGame()
    {           
        gard = new Garden("src/res/garden/gardenI.txt");
        
        gameTimer.scheduleAtFixedRate(task1, 0000, 1000); 
	gameTimer.scheduleAtFixedRate(task2, 20000, delay); // GENERATES A ZOMBIES AT INTERVALS/ STARTS AFTER 20S
	gameTimer.scheduleAtFixedRate(task3, 0000, 8000); // GENERATES A SUNS AT EVERY 8
    }
     /**
     * This method ticks the garden initialized and updates all entities in all arraylists. Once an entity is 
     * added to the arraylist, it will continuously update based on each of the entity's definition of tick.
     */   
    public void tick() 
    {
       gard.tick();
          
       for (int i=0; i<ZombiesArray.countZombies(); i++)
           ZombiesArray.getZombiesArray().get(i).tick();  
       
       for (int i=0; i<PlantsArray.countPlants(); i++)
           PlantsArray.getPlantsArray().get(i).tick();
       
       for (int i=0; i<PeasArray.countPeas(); i++)
           PeasArray.getPeasArray().get(i).tick();
       
       for (int i=0; i<SunsArray.countSuns(); i++)
           SunsArray.getSunsArray().get(i).tick();
    }

    /**
     * This method draws to the garden all entities in all arraylists. Once an entity is 
     * added to the arraylist, it will continuously draw that based on the content of its render method.
     * 
     * @param g A graphics image
     */
    public void render(Graphics g) 
    {
       gard.render(g);

       for (int i=0; i<ZombiesArray.countZombies(); i++)
           ZombiesArray.getZombiesArray().get(i).render(g); 
       
       for (int i=0; i<PlantsArray.countPlants(); i++)
           PlantsArray.getPlantsArray().get(i).render(g);
       
       for (int i=0; i<PeasArray.countPeas(); i++)
           PeasArray.getPeasArray().get(i).render(g);
       
       for (int i=0; i<SunsArray.countSuns(); i++)
           SunsArray.getSunsArray().get(i).render(g);
    }
     /**
     * This method generates a random number from the 5 float numbers in the array.
     *
     * @return A generated random number from the array which will serve as the current y location of a generated zombie.
     */
    public float getrandomrow()
    {
        list[0] =  100.0f;
        list[1] =  200.0f;
        list[2] =  300.0f;
        list[3] =  400.0f;
        list[4] =  500.0f;

         int rnd = new Random().nextInt(list.length);
         return list[rnd];
    }
     /**
     * This method generates a random number from the 10 float numbers in the array.
     *
     * @return A generated random number from the array which will serve as the current x location of a generated sun
     */
    public float getrandomcolumn()
    {
        for (int i=0; i<9; i++)
            list3[i] = (i + 1) * 100;
        
        int rnd = new Random().nextInt(list3.length);
        return list3[rnd];
    }
     /**
     * This method generates a random number from the 3 float numbers in the array.
     *
     * @return A generated random number from the array which corresponds to a type of zombie to be generated
     */
    public int getrandomzombie()
    {
        list2[0] = 1; 
        list2[1]= 2; 
        
        int rnd = new Random().nextInt(list2.length);
        return list2[rnd];
    }
    /**
     * This method is called after 3 minutes of continuous gameplay of the player. The flag zombie signals a huge wave 
     * incoming.
     */
    public static void releaseFlagZombie()
    {
        Zombie zomb = new FlagZombie(1100, 100);
        ZombiesArray.addZombie(zomb);
    }
     /**
     * This is called inside timer and updated the seconds (and displays it).
     */
     public static void addTime()
    {
	 displaySec++;
         System.out.println("SECONDS : " + displaySec);
    }
     /**
     * This method is in charge of changing the delay of zombie generation in the garden. (based on the number of seconds
     * passed in gameplay)
     */
    public void changeDelay()
    {
           if (displaySec == 30)
               delay = 7000;
           else if(displaySec == 81)
               delay = 4000;
           else if(displaySec == 141)
           {
                delay = 3000;
                releaseFlagZombie();       
           }
           else if(displaySec == 181)
               task2.cancel();
           
           if(displaySec >= 181 && ZombiesArray.countZombies() == 0)
           {
                new YouWin(); 
                DisplayB.getFrame().dispose();
                task1.cancel();
                task3.cancel();
                end = true; 
           }
            
    }
    
    TimerTask task1 =  new TimerTask() 
     { 
            public void run()
            {
	    	changeDelay();
                addTime();
            }
     };
		
    TimerTask task2 = new TimerTask() 
    { 
	    public void run()
           {
                float rnd = getrandomrow();
                
                int rnd2 = getrandomzombie(); 
                if (rnd2 == 1) 
                {
                    Zombie zomb = new NormalZombie(1100, rnd); 
		    ZombiesArray.addZombie(zomb);
                }
                else if (rnd2 == 2)
                {
                    Zombie zomb = new ConeheadZombie(1100, rnd);
		    ZombiesArray.addZombie(zomb);
                }
	   }
    };
    
     TimerTask task3 =  new TimerTask() 
     { 
            public void run()
            {
	    	float rnd = getrandomcolumn(); 
                
                Sun sun = new Sun(rnd, 0);
                SunsArray.addSun(sun);
            }
     };
      
}
    
