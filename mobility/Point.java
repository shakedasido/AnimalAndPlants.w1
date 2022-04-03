package mobility;

public class Point
{
    final static int minRange=0;
    final static int maxRangeX=600;
    final static int maxRangeY=800;
    private int x;
    private int y;
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public int GetX()
    {
        return this.x;
    }
    public int GetY()
    {
        return this.y;
    }
    public static boolean CheckBoundaries(Point pointToCheck)
    {
        if(pointToCheck.x>maxRangeX || pointToCheck.y>maxRangeY || pointToCheck.x<minRange || pointToCheck.y>minRange)
            return false;
        return true;
    }
    public void SetX(int x)
    {
        this.x=x;
    }
    public void SetY(int y)
    {
        this.y=y;
    }


}
