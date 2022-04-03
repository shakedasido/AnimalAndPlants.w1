package mobility;

import utilities.MessageUtility;

public class Mobile implements ILocatable
{
    private Point location;// Current location
    private double totalDistance;// Distance the object traveled, [>0]
    public Mobile(Point point)
    {
        this.location = point;
        this.totalDistance=0;
    }
    public double getTotalDistance()
    {
        return this.totalDistance;
    }
    public Point getLocation()
    {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "getLocation", this.location);
        return this.location;
    }

    public boolean setLocation(Point newLocation)
    {
        boolean isSuccess = Point.CheckBoundaries(newLocation);
        if (isSuccess) {
            this.location = newLocation;
        }
        return isSuccess;
    }
    public void addTotalDistance(double distance)
    {
        this.totalDistance+=distance;
    }
    public double calcDistance(Point p)
    {
        return Math.sqrt((Math.pow((location.GetX()-p.GetX()),2)+(Math.pow((location.GetY()-p.GetY()),2))));
    }
    public double move(Point point)
    {

        if(Point.CheckBoundaries(point)) {
            addTotalDistance(calcDistance(point));
            setLocation(point);
            return calcDistance(point);
        }
        return 0;
    }

}

