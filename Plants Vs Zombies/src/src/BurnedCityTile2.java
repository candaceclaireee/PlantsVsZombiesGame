package src;
/**
 * BurnedCityTile2 is a subclass of Tile.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class BurnedCityTile2 extends Tile
{
    /**
     * Constructor for BurnedCityTile2. This calls the constructor of superclass Tile and passes the buffered image and 
     * id as its parameters.
     *
     * @param id A value set as a unique identifier for a specific tile object
     */
    public BurnedCityTile2(int id)
    {
        super(Assets.burning2, id);
    }
}
