package src;
/**
 * CityTile1 is a subclass of Tile.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class CityTile1 extends Tile
{
     /**
     * Constructor for CityTile1. This calls the constructor of superclass Tile and passes the buffered image and 
     * id as its parameters.
     *
     * @param id A value set as a unique identifier for a specific tile object
     */
    public CityTile1(int id)
    {
        super(Assets.citytile1, id);
    }
}
