package animals;

import diet.Herbivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;


/**
 * A class representing an Elephant, which it is kind of animal, vegetable eater.
 * Extends class ChewAnimals.
 * @version 05/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     ChewAnimals
 */
public class Elephant extends ChewAnimals
{
    private double trunkLength;

    /**
     * Constructor for the Elephant's name. It creates a specific Elephant, with a default location.
     * @param name
     *        represent the Elephant's name.
     */
    public Elephant(String name) {
        super(name, new Point(100,5));
        this.SetDiet(new Herbivore());
        this.SetWeight(500);
        this.trunkLength= 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    /**
     * Constructor for the Elephant's name. It creates a specific Elephant. and defines his location.
     * @param name
     *        represent the Elephant's name.
     * @param point
     *        represent a point from Point class.
     */
    public Elephant(String name, Point point) {
        super(name, point);
        this.SetDiet(new Herbivore());
        this.SetWeight(500);
        this.trunkLength= 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    /**
     * Announces the voice that the elephant makes after it eats.
     */
    public void Chew() {
        MessageUtility.logSound(GetName(), "Trumpets with joy while flapping its ears, then chews");
    }

    /**
     * Setter.
     * sets the attribute furColor, and print a massage with the function logSetter, from MassageUtilities class
     * @return boolean result.
     */
    public boolean setTrunkLength(double trunkLength)
    {
        boolean isSuccess = (trunkLength >= 0.5&&trunkLength <= 3);
        if (isSuccess)
        {
            this.trunkLength = trunkLength;
        }
        else
        {
            this.trunkLength = 1;
        }
        MessageUtility.logSetter(this.getClass().getSimpleName(), "setTrunkLength", trunkLength, isSuccess);
        return isSuccess;
    }

    /**
     * Getter.
     * returns the attribute trunkLength, and print a massage with the function logGetter, from MassageUtilities class.
     * @return the value of the attribute trunkLength as double.
     */
    public double getTrunkLength()
    {
        MessageUtility.logGetter(this.getClass().getSimpleName() , "getTrunkLength", this.trunkLength);
        return this.trunkLength;
    }

}
