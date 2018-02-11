
package src;

import java.awt.image.BufferedImage;
/**
 * SpriteSheet allows cropping of images (for animation and tile images) 
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class SpriteSheet 
{
    private BufferedImage sheet; 
    /**
     * Constructor for Spritesheet. It initializes the image.
     * 
     * @param sheet The buffered image of the spritesheet.
     */
    public SpriteSheet(BufferedImage sheet)
    {
        this.sheet = sheet;
    }
    /**
     * This method crops the spritesheet to the provided dimensions
     *
     * @param x The x location where the desired image begins
     * @param y The y location where the desired image begins
     * @param width The width of the image to be cropped
     * @param height The height of the image to be cropped
     * @return The cropped buffered image
     */
    public BufferedImage crop(int x, int y, int width, int height)
    {
        return sheet.getSubimage(x,y,width,height);
    }
}
