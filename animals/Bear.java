package animals;
import diet.Omnivore;
import mobility.Point;
import utilities.MessageUtility;


/**
 * A class representing a bear, all eater, which is kind of animal.
 * Extends class RoarAnimals.
 * @version 05/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     RoarAnimals
 */
public class Bear extends RoarAnimals {

    private String furColor;

    /**
     * Constructor for the bear's name. It creates a specific bear, with a default location.
     * @param name
     *        represent the bear's name.
     */
    public Bear(String name)
    {
        //here we create a new point, so we use new, in order to create a new default value.
        super(name, new Point(100, 5));
        this.SetDiet(new Omnivore());
        this.SetWeight(308.2);
        furColor = "GREY";
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());
    }

    /**
     * Constructor for the bear's name. It creates a specific bear. and defines his location.
     * @param name
     *        represent the bear's name.
     * @param point
     *        represent a point from Point class.
     */
    public Bear(String name, Point point)
    {
        super(name, point); //here we send the value of the point to the father's constructor.
        this.SetDiet(new Omnivore());
        this.SetWeight(308.2);
        furColor = "GREY";
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    /**
     * Constructor for the bear's name. It creates a specific bear, his location, and his color.
     * @param  name
     *        represent the bear's name, as string.
     * @param point
     *        represent a point from Point class.
     * @param furColor
     *        represent the bear's color.
     */
    public Bear(String name, Point point, String furColor)
    {
        super(name, point);
        this.SetDiet(new Omnivore());
        this.SetWeight(308.2);
        setFurColor(furColor);
    }

    /**
     * Announces the voice that the bear makes after it eats.
     */
    public void Roar()
    {
        MessageUtility.logSound(this.GetName(), "Stands on its hind legs, roars and scratches its belly");
    }

    /**
     * Getter.
     * returns the attribute furColor, and print a massage with the function logGetter, from MassageUtilities class.
     * @return the value of the attribute furColor as string .
     */
    public String GetFurColor() {
        MessageUtility.logGetter(this.getClass().getSimpleName() , "GetFurColor", this.furColor);
        return this.furColor;
    }

    /**
     * Setter.
     * sets the attribute furColor, and print a massage with the function logSetter, from MassageUtilities class
     * @return boolean result.
     */
    public boolean setFurColor(String furColor) {
        for(FurColor color : FurColor.values()){
            if(color.toString().equals(furColor.toUpperCase()))
            {
                this.furColor = furColor;
                MessageUtility.logSetter(this.GetName(), "setFurColor", furColor, true);
                return true;
            }
        }
        this.furColor = "GREY";
        MessageUtility.logSetter(this.GetName(), "setFurColor", furColor, false);
        return false;
    }


}
