package src;
/**
 * CityTile2 is a subclass of Tile.
 * 
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class CityTile2 extends Tile
{
    /**
     * Constructor for CityTile2. This calls the constructor of superclass Tile and passes the buffered image and 
     * id as its parameters.
     *
     * @param id A value set as a unique identifier for a specific tile object
     */
    public CityTile2(int id)
    {
        super(Assets.citytile2, id);
    }
}
