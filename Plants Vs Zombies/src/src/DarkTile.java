package src;
/**
 * DarkTile is a subclass of Tile.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class DarkTile extends Tile
{
    /**
     * Constructor for DarkTile. This calls the constructor of superclass Tile and passes the buffered image and 
     * id as its parameters.
     *
     * @param id A value set as a unique identifier for a specific tile object
     */
    public DarkTile(int id)
    {
        super(Assets.darkgrass, id);
    }
}
