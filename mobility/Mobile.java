package mobility;

import utilities.MessageUtility;

/**
 * An abstract class that defines motion in space,
 * and implements the ILocatable interface
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     ILocatable
 */
public class Mobile implements ILocatable
{
    private Point location;// Current location
    private double totalDistance;// Distance the object traveled, [>0]

    /**
     * Constructor that gets a point. initialize location and totalDistance fields.
     * @param point
     *        represent the location.
     * @return None
     */
    public Mobile(Point point)
    {
        this.location = point;
        this.totalDistance=0;
    }

    /**
     * Getter.
     * Gets the attribute totalDistance
     * @return the value of the attribute totalDistance.
     */
    public double getTotalDistance()
    {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "getTotalDistance", this.totalDistance);
        return this.totalDistance;
    }

    /**
     * Getter.
     * Gets the attribute location.
     * @return the value of the attribute location.
     */
    public Point getLocation()
    {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "getLocation", this.location);
        return this.location;
    }

    /**
     * Setter.
     * sets the attribute location, if the point is in the range.
     * @return Boolean result
     */
    public boolean setLocation(Point newLocation)
    {
        boolean isSuccess = Point.CheckBoundaries(newLocation);
        if (isSuccess) {
            this.location = newLocation;
        }
        return isSuccess;
    }

    /**
     * Gets distance and add it to the total distance.
     * @param distance
     *        represent a distance as string.
     *
     */
    public void addTotalDistance(double distance)
    {
        this.totalDistance += distance;
    }

    /**
     * Gets p (point), And calculate the distance of the point- the current location from the last location.
     * @param p
     *        represent a point from class Point.
     *
     * @return the distance from the last location to the current location as double.
     */
    public double calcDistance(Point p)
    {
        return Math.sqrt((Math.pow((location.GetX()-p.GetX()),2)+(Math.pow((location.GetY()-p.GetY()),2))));
    }

    /**
     * Gets a location (point). if the location is in the allowed range,it updates the totalDistance with
     * the new distance that where added. and set the new location.
     * @param point
     *        represent a point from class Point.
     *
     * @return the distance from the last location to the current location as double.
     */
    public double move(Point point)
    {
        if(Point.CheckBoundaries(point))
        {

            addTotalDistance(calcDistance(point));
            double distance=calcDistance(point);
            setLocation(point);
            return distance;
        }
        return 0;
    }

}

