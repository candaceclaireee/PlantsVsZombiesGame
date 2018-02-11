package src;

import javax.swing.*;
import java.awt.*;
/**
 * DisplayB is a subclass of SuperDisplay and is a JFrame where the canvas is placed. (therefore it contains all physical 
 * components in the game) This JFrame is called if the player chooses an intermediate game or an advanced game because the
 * JPanel added here is {@link src.DropCardsPanelB} which is specifically formatted to have no Wallnut plant option and 
 * brown background.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class DisplayB extends SuperDisplay
{
    private JPanel panel;
    private String title; 
    private int width, height; 
    /**
     * Constructor for DisplayB. It initializes the JFrame and calls an initializer to the components inside it.
     * 
     * @param title The string of the game level
     */
    public DisplayB(String title)
    {
        this.title = title;
        width = 1100;
        height = 600;
        
        createGame(); 
    }
    /**
     * This method creates the JFrame, canvas and adds the {@link src.DropCardsPanelB} to the frame.
     */
    private void createGame()
    {
        frame = new JFrame(title);
        frame.setSize(width, 650);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        canvas = new Canvas(); 
        canvas.setSize(width,height);
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));

        frame.add(canvas);
        frame.add(new DropCardsPanelB());
        frame.pack();
    }
}




