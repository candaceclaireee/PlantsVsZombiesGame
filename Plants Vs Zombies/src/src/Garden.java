package src;

import java.awt.Graphics;
/**
 * Garden is a class controls the rendering of tiles and allocating each tile to the tiles array (from the tile id)
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class Garden 
{
    private int width, height; 
    private int spawnX, spawnY;
    private int[][] tiles; 
    /**
     * Constructor for Garden. Calls the method to load the integer from the text file and create a 2D array from it.
     * 
     * @param path The filename of the text file
     */
    public Garden(String path)
    {
        loadGarden(path);
    }
    /**
     * No updating (no movement) is done.
     */
    public void tick()
    {  
        
    }
    /**
     * This method allows drawing of all the tiles to the garden (canvas).
     *
     * @param g A graphics image
     */
    public void render (Graphics g)
    {
        for (int y=0; y<height; y++)
        {
            for (int x=0; x<width; x++)
                getTile(x,y).render(g, x*Tile.TILEWIDTH, y*Tile.TILEHEIGHT);
        }   
    }
    /**
     * Returns a tile from the 2D array of tiles.
     *
     * @param x The current x location where the tile is
     * @param y The current y location where the tile is
     * @return A tile from the 2D array of tiles
     */
    public Tile getTile(int x, int y)
    {
        Tile t = Tile.tiles[tiles[x][y]];
        if (t == null)
            return Tile.lightTile;
        return t;
    }
    /**
     * Loads the 2D array by building from the integers extracted from the text file.
     *
     * @param path The filename of the text file
     */
    private void loadGarden(String path)
    {
        String file = FileLoader.loadFileAsString(path);
        
        String[] tokens = file.split("\\s+");
        width = FileLoader.parseInt(tokens[0]);
        height = FileLoader.parseInt(tokens[1]);
        
        spawnX = FileLoader.parseInt(tokens[2]);
        spawnY = FileLoader.parseInt(tokens[3]);
        
        tiles = new int[width][height];
        
        for (int y=0; y<height; y++)
        {
            for (int x=0; x<width; x++)
                tiles[x][y] = FileLoader.parseInt(tokens[(x+y*width) + 4]);
        }
    }
    
}
