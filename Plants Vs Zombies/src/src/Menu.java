package src; 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Menu is a class that extends from JFrame and called from {@link src.Launcher}
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Menu extends JFrame 
{
    private JPanel panel1; 
    private JPanel panel2; 
    
    private JButton exitbutton;
    private JButton startbutton;
    private JComboBox<String> levelchoice;
    
    private JLabel label;
    private JProgressBar loadingbar;
    
    private Timer timer; 
    /**
     * Constructor for Menu. It initializes the JFrame and calls an initializer to the components inside it.
     */
    public Menu() 
    {
        new JFrame("PLANTS VS ZOMBIES");
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(700, 530);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initComponents();
        
        setVisible(true);
    }
    /**
     * This method adds all essential components and images to the JPanel. This JPanel will be later added to the JFrame.
     */                  
    private void initComponents() 
    {
        panel1 = new JPanel();
        panel1.setBackground(Color.YELLOW);
        panel1.setLayout(new BorderLayout());
        
        label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("/res/textures/menupicture.jpg")));
        panel1.add(label, BorderLayout.CENTER);
        
        panel2 = new JPanel(); 
        panel2.setBackground(Color.YELLOW);
        panel2.setLayout(new GridLayout());
        
        startbutton = new JButton(); 
        startbutton.setText("START");
        startbutton.setSize(50,50);
        startbutton.setFont(new Font("Arial Narrow", 1, 36));
        startbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
                    
        exitbutton = new JButton(); 
        exitbutton.setText("EXIT");
        exitbutton.setSize(50, 50);
        exitbutton.setFont(new Font("Arial Narrow", 1, 36));
        exitbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        
        levelchoice = new JComboBox<>();
        levelchoice.setModel(new DefaultComboBoxModel<>(new String[] { "(LEVEL)", "BEGINNER", "INTERMEDIATE", "ADVANCED" }));
        levelchoice.setFont(new Font("Arial Narrow", 1, 24)); 
        levelchoice.setSize(50,50);

        loadingbar = new JProgressBar();
        loadingbar.setSize(20, 50);
        loadingbar.setForeground(Color.RED);
        
        panel2.add(levelchoice);
        panel2.add(startbutton);
        panel2.add(exitbutton);
        
        panel1.add(panel2, BorderLayout.CENTER);
        panel1.add(label, BorderLayout.NORTH);
        panel1.add(loadingbar, BorderLayout.SOUTH);

        this.add(panel1);
    }                    

    private void startButtonActionPerformed(ActionEvent evt) {                                            

        timer = new Timer(10, new Progress());
        timer.start();
    }                                           

    private void exitButtonActionPerformed(ActionEvent evt) {                                           
        System.exit(0);
    }                                          

    /**
     * This class is called after the start button has been clicked by the player. It starts the progress bar and calls the
     * game level according to the player's choice.
     */
    public class Progress implements ActionListener
   {
       public void actionPerformed(ActionEvent evt)
       {
        int n = loadingbar.getValue(); 
         
          if (n<100)
          {
             n++; 
             loadingbar.setValue(n);
          }
          else
          { 
           timer.stop();
            
           String choice = levelchoice.getSelectedItem().toString(); 
        
             if (choice == "BEGINNER") {
                 GameState game = new GameState("PLANTS VS ZOMBIES - BEGINNER LEVEL");
                 game.start();
             }
             else if (choice == "INTERMEDIATE")
              {
                  GameState game = new GameState("PLANTS VS ZOMBIES - INTERMEDIATE LEVEL");
                  game.start();
              }
             else if (choice == "ADVANCED")
             {  
                 GameState game = new GameState("PLANTS VS ZOMBIES - ADVANCED LEVEL");
                 game.start();
             }
           dispose();  
          }
        }
   }    
              
}
