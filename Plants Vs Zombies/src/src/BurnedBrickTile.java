package src;
/**
 * BurnedBrickTiles is a subclass of Tile.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class BurnedBrickTile extends Tile
{
    /**
     * Constructor for BurnedBrickTile. This calls the constructor of superclass Tile and passes the buffered image and 
     * id as its parameters.
     *
     * @param id A value set as a unique identifier for a specific tile object
     */
    public BurnedBrickTile(int id)
    {
        super(Assets.burnttile, id);
    }
}
