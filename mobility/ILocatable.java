package mobility;

/**
 * An interface that describes the functionality of a place.
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see Mobile
 */
public interface ILocatable
{
    public Point getLocation();
    public boolean setLocation(Point point);
}