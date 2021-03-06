package src; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * YouLose is a class that extends from JFrame and it is displayed if a zombie reaches the player's house.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class YouLose extends JFrame
{
    private JPanel panel; 
    private JLabel label;
    private JButton button;
     /**
     * Constructor for YouLose. It initializes the JFrame and calls an initializer to the components inside it.
     */
    public YouLose() 
    {
        setTitle("PLANTS VS ZOMBIES");
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initComponents();
        
        setVisible(true);
    }
     /**
     * This method adds all essential components and images to the JPanel. This JPanel will be later added to the JFrame.
     */
    private void initComponents()
    {
        panel = new JPanel(); 
        panel.setBackground(Color.BLACK);
        panel.setSize(700,500);
        panel.setLayout(new BorderLayout());
        
        label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("/res/textures/youlose.jpg")));
        
        button = new JButton(); 
        button.setIcon(new ImageIcon(getClass().getResource("/res/textures/exit.jpg")));
        button.setBackground(Color.BLACK);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        
        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        this.add(panel);
        
    }
    
    private void exitButtonActionPerformed(ActionEvent evt) 
    {                                           
        System.exit(0);
    } 
}
