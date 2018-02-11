package src;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
/**
 * Tile is a class that handles all tile initializations and tile drawing on the canvas.
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Tile 
{
    /**
     *  An array of Tiles. This will be used to contain all tiles to be drawn on the canvas.
     */
    public static Tile[] tiles = new Tile [150];
    
    public static Tile lightTile = new LightTile(0);
    public static Tile darkTile = new DarkTile(1);
    public static Tile fenceTile1 = new FenceTile1(2);
    public static Tile fenceTile2 = new FenceTile2 (3);
    public static Tile brickTile = new BrickTile (4);
    
    public static Tile blackTile = new BlackTile(5);
    public static Tile whiteTile = new WhiteTile(6);
    public static Tile cityTile1 = new CityTile1(7);
    public static Tile cityTile2 = new CityTile2(8);
    public static Tile plantTile = new PlantTile(9);
    
    public static Tile burningcityTile1 = new BurnedCityTile1(10);
    public static Tile burningcityTile2 = new BurnedCityTile2(11);
    public static Tile burnedBrickTile = new BurnedBrickTile(12);
    /**
     * The width of the tile to be rendered
     */
    public static final int TILEWIDTH = 100;
    /**
     * The height of the tile to be rendered
     */
    public static final int TILEHEIGHT = 100;
    /**
     * The buffered image of the tile
     */
    protected BufferedImage texture;
    /**
     * A value set as a unique identifier for a specific tile object
     */
    protected final int id;
    /**
     * Constructor for Tile. It assigns all values passed in the subclasses so it can all be drawn in the canvas.
     *
     * @param texture The buffered image of the tile
     * @param id A value set as a unique identifier for a specific tile object
     */
    public Tile(BufferedImage texture, int id)
    {
        this.texture = texture;
        this.id = id;
        
        tiles[id] = this; 
    }
    /**
     * No updating (no movement) is done.
     */
    public void tick()
    {
        
    }
    /**
     * This method allows drawing of the tile to the garden (canvas).
     *
     * @param g A graphics image
     * @param x The x location where the tile should be drawn
     * @param y The y location where the tile should be drawn
     */
    public void render(Graphics g, int x, int y)
    {
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }     
    /**
     * @return A value set as a unique identifier for a specific tile object
     */
    public int getID()
    {
        return id;
    }
}
