package mobility;
import utilities.MessageUtility;

/**
 * Defines a position on a two-dimensional axis.
 * the class will contain the X, Y fields.
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     ILocatable
 */
public class Point
{
    final static int minRange=0;
    final static int maxRangeX=600;
    final static int maxRangeY=800;
    private int x;
    private int y;

    /**
     * Constructor for X, Y fields. It creates a point.
     * @param x
     *        represent the X field
     * @param y
     *        represent the Y field
     *
     */
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    /**
     * Getter.
     * gets the attribute x.
     * @return the value of the attribute x.
     */
    public int GetX()
    {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "GetX", this.x );
        return this.x;
    }

    /**
     * Getter.
     * gets the attribute y.
     * @return the value of the attribute y.
     */
    public int GetY()
    {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "GetY", this.y );
        return this.y;
    }

    /**
     * Gets animal and food type.
     * Check if it's the correct type of food that the animal eats.
     * if yes, The animal eats, and it gains wight.
     * else, it doesn't gain any weight.
     * @param pointToCheck
     *        represent a point from class Point.
     *
     * @return Boolean result. True- if the point is in the range, False- if not.
     */
    public static boolean CheckBoundaries(Point pointToCheck)
    {
        return (pointToCheck.x <= maxRangeX && pointToCheck.y <= maxRangeY && pointToCheck.x >= minRange && pointToCheck.y >= minRange);
    }

    /**
     * Setter.
     * sets the attribute x.
     */
    public void SetX(int x)
    {
        this.x=x;
        MessageUtility.logSetter(this.getClass().getSimpleName(),"SetX",this.x ,true) ;
    }

    /**
     * Setter.
     * sets the attribute y.
     */
    public void SetY(int y)
    {
        this.y=y;
        MessageUtility.logSetter(this.getClass().getSimpleName(),"SetY",this.y ,true) ;
    }

    /**
     * function for printing the point in format (x, y).
     *
     * @return the point in format (x, y).
     */
    public String toString() {
        return "(" + this.x+", "+this.y + ")";
    }


}
