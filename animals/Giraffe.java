package animals;

import diet.Herbivore;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;


/**
 * A class representing a Giraffe, which it is kind of animal, vegetable eater.
 * Extends class ChewAnimals.
 * @version 05/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     ChewAnimals
 */
public class Giraffe extends ChewAnimals{
    private double neckLength;

    /**
     * Constructor for the Giraffe's name. It creates a specific Giraffe, with a default location.
     * @param name
     *        represent the Giraffe's name.
     */
    public Giraffe(String name)
    {
        super(name, new Point(50, 0)); //here we actually create a point so we need to do new, create a new default value
        this.SetDiet(new Herbivore());
        this.SetWeight(450);
        neckLength = 1.5;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    /**
     * Constructor for the Giraffe's name. It creates a specific Giraffe. and defines his location.
     * @param name
     *        represent the Giraffe's name.
     * @param point
     *        represent a point from Point class.
     */
    public Giraffe(String name, Point point)
    {
        super(name, point); //here we actually create a point, so we need to do new, create a new default value
        this.SetDiet(new Herbivore());
        this.SetWeight(450);
        neckLength = 1.5;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    /**
     * Setter.
     * sets the attribute length, which is the length of the giraffe's neck,
     * and print a massage with the function logSetter, from MassageUtilities class
     * @return boolean result.
     */
    public boolean setNeckLength(double length)
    {

        boolean isSuccess = (length >= 1&&length <= 2.5);
        if (isSuccess)
        {
            this.neckLength = length;
        }
        else
        {
            this.neckLength = 1.5;
        }
        MessageUtility.logSetter(this.GetName(),"setNeckLength",length,isSuccess);
        return isSuccess;

    }

    /**
     * Announces the voice that the giraffe makes after it eats.
     */
    public void Chew() {
        MessageUtility.logSound(GetName(), "Bleats and Stomps its legs, then chews");
    }

    /**
     * Getter.
     * returns the attribute neckLength, and print a massage with the function logGetter, from MassageUtilities class.
     * @return the value of the attribute neckLength, as double.
     */
    public double getNeckLength() {
        MessageUtility.logGetter(this.getClass().getSimpleName() , "getNeckLength", this.neckLength);
        return this.neckLength;
    }


}
