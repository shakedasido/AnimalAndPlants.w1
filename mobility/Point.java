package mobility;

import diet.IDiet;

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
     * @return None
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
        return this.x;
    }
    /**
     * Getter.
     * gets the attribute y.
     * @return the value of the attribute y.
     */
    public int GetY()
    {
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
        if(pointToCheck.x>maxRangeX || pointToCheck.y>maxRangeY || pointToCheck.x<minRange || pointToCheck.y>minRange)
            return false;
        return true;
    }

    /**
     * Setter.
     * sets the attribute x.
     * @return None
     */
    public void SetX(int x)
    {
        this.x=x;
    }

    /**
     * Setter.
     * sets the attribute y.
     * @return None.
     */
    public void SetY(int y)
    {
        this.y=y;
    }


}
