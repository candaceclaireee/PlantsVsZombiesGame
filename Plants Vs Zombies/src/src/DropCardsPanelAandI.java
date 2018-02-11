
package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 * DropCardsPanelAandI extends from JPanel and contains the plant cards that will allow the player to drag a plant to their
 * desired location (for intermediate and advanced levels).
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class DropCardsPanelAandI extends javax.swing.JPanel 
{
     /**
     * Constructor for DropCardsPanelAandI. It calls an initializer to the components inside the panel.
     */
    public DropCardsPanelAandI() 
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
        wallnutcard = new javax.swing.JLabel();
        wallnutBar = new javax.swing.JProgressBar();
        cherrybombBar = new javax.swing.JProgressBar();
        peashooterBar = new javax.swing.JProgressBar();
        sunflowerBar = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(0, 0, 0));

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

        wallnutcard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textures/wallnutcard.png"))); // NOI18N
        wallnutcard.setText("jLabel1");
        wallnutcard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                wallnutcardMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1090, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(totalsuns)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(shovel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sunflowercard, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(wallnutcard, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(wallnutBar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cherrybombcard, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cherrybombBar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sunflowerBar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peashootercard, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peashooterBar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(totalsuns)
                .addGap(2, 2, 2)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sunflowercard, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sunflowerBar, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peashootercard, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peashooterBar, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cherrybombcard, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cherrybombBar, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(wallnutcard, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(wallnutBar, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shovel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
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
     * This method is called after a shovel has been dragged and released in the garden (for deletion).
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
     * This method is called after a wallnut has been dragged and released in the garden.
     */
    private void wallnutcardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallnutcardMouseReleased
                
        int x = evt.getX();
        int y = evt.getY(); 
        int tempx = (1000 + x) / 100; 
        int tempy = (400 + y) / 100;
        boolean taken = false; 
        
        if (x > -1000 && x < 0 && y > -300 && y <200)
        {
            x = tempx * 100 + 100; 
            y = tempy * 100;
            
            for (int i=0; i<PlantsArray.countPlants(); i++)
                if (PlantsArray.getPlantsArray().get(i).getX() == x 
                 && PlantsArray.getPlantsArray().get(i).getY() == y)
                     taken = true;
            
            if (sunsproduced >= 50 && taken != true && regeneratingWallnut == false)
            {
              Plant wallnut = new Wallnut(x, y); 
              sunsproduced = sunsproduced - wallnut.getSunCost();
              totalsuns.setText("" + sunsproduced);
              PlantsArray.addPlant(wallnut);
              
              regenerateTimerWallnut = new Timer(wallnut.regenerateRate * 20 , new ProgressWallnut());
              regenerateTimerWallnut.start();
            }
        }
    }//GEN-LAST:event_wallnutcardMouseReleased
  
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
     * This class is called after a wallnut card has been released by the player. It starts the progress bar representing 
     * the duration before it can be used again (regenerate).
     */
    public class ProgressWallnut implements ActionListener
   {
       public void actionPerformed(ActionEvent evt)
       {
          int n = wallnutBar.getValue(); 
          regeneratingWallnut = true;
          
          if (n<100)
          {
             n++; 
             wallnutBar.setValue(n);
          }
          else
          {
           regenerateTimerWallnut.stop();
           wallnutBar.setValue(0);
           regeneratingWallnut = false; 
          }
        }
   }  
    
    private PlantsArray p = new PlantsArray();  
    private SunsArray suns = new SunsArray();

    /**
     * The current number of suns collected by the player
     */
    public static int sunsproduced = 0; 
    
    private Timer regenerateTimerSunf;  
    private Timer regenerateTimerPeash;  
    private Timer regenerateTimerCherry;  
    private Timer regenerateTimerWallnut;
    
    private static boolean regeneratingSunf = false; 
    private static boolean regeneratingPeash = false; 
    private static boolean regeneratingCherry = false; 
    private static boolean regeneratingWallnut = false; 
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
    private javax.swing.JProgressBar wallnutBar;
    private javax.swing.JLabel wallnutcard;
    // End of variables declaration//GEN-END:variables
}
