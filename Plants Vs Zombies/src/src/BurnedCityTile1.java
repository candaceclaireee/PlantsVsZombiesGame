package src;
/**
 * BurnedCityTile1 is a subclass of Tile.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class BurnedCityTile1 extends Tile
{
    /**
     * Constructor for BurnedCityTile1. This calls the constructor of superclass Tile and passes the buffered image and 
     * id as its parameters.
     *
     * @param id A value set as a unique identifier for a specific tile object
     */
    public BurnedCityTile1(int id)
    {
        super(Assets.burning1, id);
    }
}
