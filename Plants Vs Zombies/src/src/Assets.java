package src;

import java.awt.image.BufferedImage;
/**
 * Assets initializes, loads and crops all buffered images used in this project.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Assets 
{
    public static BufferedImage lightgrass, darkgrass, fence1, fence2, bricktile, blacktile, whitetile, 
         citytile1, citytile2, planttile, burning1, burning2, burnttile, gamelogo, sun, peabullet;
    public static BufferedImage[] zombiewalking, coneheadzombiewalking, flagzombiewalking, bucketheadzombiewalking;
    public static BufferedImage[] sunflower, peashooter, cherrybomb, wallnut;
    /**
    * This method is called in {@link src.GameState} , which loads and crops all buffered images so they can be readily 
    * used in this project.
    */
    public static void init()
    {
        SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/res/textures/tilessprite.png"));
        
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/res/textures/walkingzombiesprite.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/res/textures/coneheadzombie.png"));
        SpriteSheet sheet4 = new SpriteSheet(ImageLoader.loadImage("/res/textures/flagzombie.png"));
        SpriteSheet sheet5 = new SpriteSheet(ImageLoader.loadImage("/res/textures/bucketheadzombiesprite.png"));
        
        SpriteSheet sheet6 = new SpriteSheet(ImageLoader.loadImage("/res/textures/sunflowersprite.png"));
        SpriteSheet sheet7 = new SpriteSheet(ImageLoader.loadImage("/res/textures/peashootersprite.png"));
        SpriteSheet sheet8 = new SpriteSheet(ImageLoader.loadImage("/res/textures/cherrybombsprite.png"));
        SpriteSheet sheet9 = new SpriteSheet(ImageLoader.loadImage("/res/textures/wallnutsprite.png"));
                
        blacktile = ImageLoader.loadImage("/res/textures/blacktile.png");
        whitetile = ImageLoader.loadImage("/res/textures/whitetile.png");
        citytile1 = ImageLoader.loadImage("/res/textures/citytile1.png");
        citytile2 = ImageLoader.loadImage("/res/textures/citytile2.png");
        planttile = ImageLoader.loadImage("/res/textures/plant.png");
        
        burning1 = ImageLoader.loadImage("/res/textures/burningcity1.png");
        burning2 = ImageLoader.loadImage("/res/textures/burningcity2.png");
        burnttile = ImageLoader.loadImage("/res/textures/burnedtile.png");
        
        gamelogo = ImageLoader.loadImage("/res/textures/gamelogo.png");
        bricktile = ImageLoader.loadImage("/res/textures/bricktile.jpg");
        sun = ImageLoader.loadImage("/res/textures/sun.png");
        peabullet = ImageLoader.loadImage("/res/textures/peabullet.png");
        
        lightgrass = sheet1.crop(0,0,230,230);
        darkgrass = sheet1.crop(320,0,230,230);
        fence1 = sheet1.crop (2,283,230,230);
        fence2 = sheet1.crop (300,283, 230,230);
        
        zombiewalking = new BufferedImage[4];
        zombiewalking[0] = sheet2.crop(70,5,89,107);
        zombiewalking[1] = sheet2.crop(221,2,71,111);
        zombiewalking[2] = sheet2.crop(65,114,79,108);
        zombiewalking[3] = sheet2.crop(206,119,90,102);
        
        coneheadzombiewalking = new BufferedImage[4];
        coneheadzombiewalking[0] = sheet3.crop(9,4,64,110);
        coneheadzombiewalking[1] = sheet3.crop(141,1,62,110);
        coneheadzombiewalking[2] = sheet3.crop(8,116,64,110);
        coneheadzombiewalking[3] = sheet3.crop(138,113,61,113);
        
        flagzombiewalking = new BufferedImage[2];
        flagzombiewalking[0] = sheet4.crop(1, 11, 79, 118);
        flagzombiewalking[1] = sheet4.crop(81,12, 78, 118);
        
        bucketheadzombiewalking = new BufferedImage[4];
        bucketheadzombiewalking[0] = sheet5.crop(6, 7, 74, 114);
        bucketheadzombiewalking[1] = sheet5.crop(167, 5, 71, 118);
        bucketheadzombiewalking[2] = sheet5.crop(17, 158, 67, 114);
        bucketheadzombiewalking[3] = sheet5.crop(168, 158, 70, 112);
        
        sunflower = new BufferedImage[4];
        sunflower[0] = sheet6.crop(3,5,84,96);
        sunflower[1] = sheet6.crop(95,6,84,96);
        sunflower[2] = sheet6.crop(5,107,87,92);
        sunflower[3] = sheet6.crop(99,107,87,92);
        
        peashooter = new BufferedImage[4]; 
        peashooter[0] = sheet7.crop(4, 2, 81, 80);
        peashooter[1] = sheet7.crop(101, 1, 80, 80);
        peashooter[2] = sheet7.crop(4, 85, 85, 77);
        peashooter[3] = sheet7.crop(99, 83, 90, 78);
        
        cherrybomb = new BufferedImage[2];
        cherrybomb[0] = sheet8.crop(15, 1, 94, 82);
        cherrybomb[1] = sheet8.crop(6, 88, 93, 76);
        
        wallnut = new BufferedImage[3];
        wallnut[0] = sheet9.crop(2, 5, 95, 99);
        wallnut[1] = sheet9.crop(101, 8, 89, 101);
        wallnut[2] = sheet9.crop(196, 8, 86, 101);
        
    }
}
