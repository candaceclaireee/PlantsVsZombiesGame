package src;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 * ImageLoader handles the loading/reading of images 
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class ImageLoader 
{
    /**
     * This method read the image file and throws an exception when not found.
     * 
     * @param path The filename of the image
     * @return The buffered image loaded
     */
    public static BufferedImage loadImage(String path)
    {
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException ex) {
            Logger.getLogger(ImageLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
    }
    
}
