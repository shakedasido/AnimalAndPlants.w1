package mobility;

/**
 * An interface that describes the functionality of a place.
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see Mobile
 */
public interface ILocatable
{
    /**
     * Getter.
     * Gets the attribute location.
     * @return the value of the attribute location.
     */
    Point getLocation();

    /**
     * Setter.
     * sets the attribute location, if the point is in the range.
     * @return Boolean result.
     */
    boolean setLocation(Point point);
}