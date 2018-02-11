
package src; 

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.*;
/**
 * DropCardsPanelB extends from JPanel and contains the plant cards that will allow the player to drag a plant to their
 * desired location (for beginner level).
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class DropCardsPanelB extends JPanel {
    /**
     * Constructor for DropCardsPanelB. It calls an initializer to the components inside the panel.
     */
    public DropCardsPanelB() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sunflowercard = new javax.swing.JLabel();
        peashootercard = new javax.swing.JLabel();
        cherrybombcard = new javax.swing.JLabel();
        shovel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        totalsuns = new javax.swing.JLabel();
        sunflowerBar = new javax.swing.JProgressBar();
        peashooterBar = new javax.swing.JProgressBar();
        cherrybombBar = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(102, 51, 0));

        sunflowercard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textures/sunflowercard.png"))); // NOI18N
        sunflowercard.setText("jLabel1");
        sunflowercard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sunflowercardMouseDragged(evt);
            }
        });
        sunflowercard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sunflowercardMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sunflowercardMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sunflowercardMouseReleased(evt);
            }
        });

        peashootercard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textures/peashootercard.png"))); // NOI18N
        peashootercard.setText("jLabel1");
        peashootercard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                peashootercardMouseReleased(evt);
            }
        });

        cherrybombcard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textures/cherrybombcard.png"))); // NOI18N
        cherrybombcard.setText("jLabel1");
        cherrybombcard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cherrybombcardMouseReleased(evt);
            }
        });

        shovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textures/shovel.png"))); // NOI18N
        shovel.setText("jLabel1");
        shovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shovelMouseReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textures/sunlogo.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(75, 101));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        totalsuns.setForeground(new java.awt.Color(255, 255, 255));
        totalsuns.setText("TOTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(peashooterBar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 1091, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(totalsuns)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))
                        .addComponent(sunflowercard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(peashootercard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(sunflowerBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(shovel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cherrybombcard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(cherrybombBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(totalsuns)
                .addGap(2, 2, 2)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sunflowercard, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(sunflowerBar, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(peashootercard, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(peashooterBar, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cherrybombcard, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cherrybombBar, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(shovel))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sunflowercardMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunflowercardMouseDragged

    }//GEN-LAST:event_sunflowercardMouseDragged

    private void sunflowercardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunflowercardMouseClicked
         
    }//GEN-LAST:event_sunflowercardMouseClicked
   
    /**
     * This method is called after a sunflower has been dragged and released in the garden.
     */
    private void sunflowercardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunflowercardMouseReleased

        int x = evt.getX();
        int y = evt.getY(); 
        int tempx = (1000 + x) / 100; 
        int tempy = y / 100;
        boolean taken = false;
        
        if (x > -1000 && x < 0 && y > 0 && y <600)
        {
            x = tempx * 100 + 100; 
            y = tempy * 100 + 100;
            
            for (int i=0; i<PlantsArray.countPlants(); i++)
                if (PlantsArray.getPlantsArray().get(i).getX() == x 
                 && PlantsArray.getPlantsArray().get(i).getY() == y)
                     taken = true;
            
            if (sunsproduced >= 50 && taken != true && regeneratingSunf == false)
            {                              
              Plant sunflower = new Sunflower(x,y);
              sunsproduced = sunsproduced - sunflower.getSunCost();
              totalsuns.setText("" + sunsproduced);
              PlantsArray.addPlant(sunflower);
              
              regenerateTimerSunf = new Timer(sunflower.regenerateRate * 20 , new ProgressSunflower());
              regenerateTimerSunf.start();
            }
        }
    }//GEN-LAST:event_sunflowercardMouseReleased

    private void sunflowercardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunflowercardMousePressed
       
    }//GEN-LAST:event_sunflowercardMousePressed
    /**
     * This method is called after the button (allows sun collection) has been clicked.
     */
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (SunsArray.countSuns()!=0) 
        {
          SunsArray.removeSun(SunsArray.firstSun());
          sunsproduced = sunsproduced + 25;
          totalsuns.setText("" + sunsproduced);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * This method is called after a peashooter has been dragged and released in the garden.
     */
    private void peashootercardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peashootercardMouseReleased
    
        int x = evt.getX();
        int y = evt.getY(); 
        int tempx = (1000 + x) / 100; 
        int tempy = (100 + y) / 100;
        boolean taken = false; 
        
        if (x > -1000 && x < 0 && y > -100 && y <500)
        {
            x = tempx * 100 + 100; 
            y = tempy * 100 + 100;
                        
            for (int i=0; i<PlantsArray.countPlants(); i++)
                if (PlantsArray.getPlantsArray().get(i).getX() == x 
                 && PlantsArray.getPlantsArray().get(i).getY() == y)
                     taken = true;
            
            if (sunsproduced >= 100 && taken != true && regeneratingPeash == false)
            {
              Plant peashooter = new Peashooter(x,y);
              sunsproduced = sunsproduced - peashooter.getSunCost();
              totalsuns.setText("" + sunsproduced);
              PlantsArray.addPlant(peashooter);
              
              regenerateTimerPeash = new Timer(peashooter.regenerateRate * 20 , new ProgressPeashooter());
              regenerateTimerPeash.start();
            }
        }
    }//GEN-LAST:event_peashootercardMouseReleased
    /**
     * This method is called after a shovel has been dragged and released in the garden (to dig a plant).
     */
    private void shovelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shovelMouseReleased

        int x = evt.getX();
        int y = evt.getY(); 
        int tempx = (1000 + x) / 100; 
        int tempy = (100 + y) / 100;
        
        if (x > -1000 && x < 0 && y > -400 && y < -100)
        {
            x = tempx * 100 + 100; 
            y = tempy * 100 + 300;
            
            for (int i=0; i<PlantsArray.countPlants(); i++)
            {
                if (PlantsArray.getPlantsArray().get(i).getX() == x &&  
                                         PlantsArray.getPlantsArray().get(i).getY() == y) 
                    PlantsArray.removePlants(PlantsArray.getPlantsArray().get(i));
            }
        }
        else if (x > -1000 && x < 0 && y > -100 && y <100)
        {
            tempy = (200 + y) / 100;
            x = tempx * 100 + 100; 
            y = tempy * 100 + 300;
            
            for (int i=0; i<PlantsArray.countPlants(); i++)
            {
                if (PlantsArray.getPlantsArray().get(i).getX() == x &&  
                                         PlantsArray.getPlantsArray().get(i).getY() == y) 
                    PlantsArray.removePlants(PlantsArray.getPlantsArray().get(i));
            }
        }
        
    }//GEN-LAST:event_shovelMouseReleased
    /**
     * This method is called after a cherry bomb has been dragged and released in the garden.
     */
    private void cherrybombcardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cherrybombcardMouseReleased
          
        int x = evt.getX();
        int y = evt.getY(); 
        int tempx = (1000 + x) / 100; 
        int tempy = (100 + y) / 100;
        boolean taken = false; 
        
        if (x > -1000 && x < 0 && y > -200 && y < -100)
        {
            x = tempx * 100 + 100; 
            y = tempy * 100 + 100;
            
            for (int i=0; i<PlantsArray.countPlants(); i++)
                if (PlantsArray.getPlantsArray().get(i).getX() == x 
                 && PlantsArray.getPlantsArray().get(i).getY() == y)
                     taken = true;
            
             if (sunsproduced >= 150 && taken != true && regeneratingCherry == false)
            {
              Plant cherrybomb = new CherryBomb(x,y);
              sunsproduced = sunsproduced - cherrybomb.getSunCost();
              totalsuns.setText("" + sunsproduced);
              PlantsArray.addPlant(cherrybomb);
              
              regenerateTimerCherry = new Timer(cherrybomb.regenerateRate * 20 , new ProgressCherryBomb());
              regenerateTimerCherry.start();
            }
        }
        else if (x > -1000 && x < 0 && y > -100 && y <300)
        {
            x = tempx * 100 + 100; 
            y = tempy * 100 + 200;
            
            for (int i=0; i<PlantsArray.countPlants(); i++)
                if (PlantsArray.getPlantsArray().get(i).getX() == x 
                 && PlantsArray.getPlantsArray().get(i).getY() == y)
                     taken = true;
            
            if (sunsproduced >= 150 && taken != true && regeneratingCherry == false)
            {
              Plant cherrybomb = new CherryBomb(x,y);
              sunsproduced = sunsproduced - cherrybomb.getSunCost();
              totalsuns.setText("" + sunsproduced);
              PlantsArray.addPlant(cherrybomb);
              
              regenerateTimerCherry = new Timer(cherrybomb.regenerateRate * 20 , new ProgressCherryBomb());
              regenerateTimerCherry.start();
            }
        }
    }//GEN-LAST:event_cherrybombcardMouseReleased
  
    /**
     * This class is called after a sunflower card has been released by the player. It starts the progress bar representing 
     * the duration before it can be used again (regenerate).
     */
    public class ProgressSunflower implements ActionListener
   {
       public void actionPerformed(ActionEvent evt)
       {
          int n = sunflowerBar.getValue(); 
          regeneratingSunf = true;
          
          if (n<100)
          {
             n++; 
             sunflowerBar.setValue(n);
          }
          else
          {
           regenerateTimerSunf.stop();
           sunflowerBar.setValue(0);
           regeneratingSunf = false; 
          }
        }
   }  
     /**
     * This class is called after a peashooter card has been released by the player. It starts the progress bar representing 
     * the duration before it can be used again (regenerate).
     */
    public class ProgressPeashooter implements ActionListener
   {
       public void actionPerformed(ActionEvent evt)
       {
          int n = peashooterBar.getValue(); 
          regeneratingPeash = true;
          
          if (n<100)
          {
             n++; 
             peashooterBar.setValue(n);
          }
          else
          {
           regenerateTimerPeash.stop();
           peashooterBar.setValue(0);
           regeneratingPeash = false; 
          }
        }
   } 
     /**
     * This class is called after a cherry bomb card has been released by the player. It starts the progress bar representing 
     * the duration before it can be used again (regenerate).
     */
    public class ProgressCherryBomb implements ActionListener
   {
       public void actionPerformed(ActionEvent evt)
       {
          int n = cherrybombBar.getValue(); 
          regeneratingCherry = true;
          
          if (n<100)
          {
             n++; 
             cherrybombBar.setValue(n);
          }
          else
          {
           regenerateTimerCherry.stop();
           cherrybombBar.setValue(0);
           regeneratingCherry = false; 
          }
        }
   }  
    
    /**
     * The current number of suns collected by the player
     */
    public static int sunsproduced = 0; 
    
    private PlantsArray p = new PlantsArray();  
    private SunsArray suns = new SunsArray();
    
    private Timer regenerateTimerSunf;  
    private Timer regenerateTimerPeash;  
    private Timer regenerateTimerCherry; 
    
    private static boolean regeneratingSunf = false; 
    private static boolean regeneratingPeash = false; 
    private static boolean regeneratingCherry = false; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar cherrybombBar;
    private javax.swing.JLabel cherrybombcard;
    private javax.swing.JButton jButton1;
    private javax.swing.JProgressBar peashooterBar;
    private javax.swing.JLabel peashootercard;
    private javax.swing.JLabel shovel;
    private javax.swing.JProgressBar sunflowerBar;
    private javax.swing.JLabel sunflowercard;
    private javax.swing.JLabel totalsuns;
    // End of variables declaration//GEN-END:variables
}
