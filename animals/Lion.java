package animals;

import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;


/**
 * A class representing a Lion, which it is kind of animal, meat eater.
 * Extends class RoarAnimals.
 * @version 05/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     RoarAnimals
 */
public class Lion extends RoarAnimals
{
    private int scarCount;

    /**
     * Constructor for the Lion's name. It creates a specific Lion, with a default location.
     * @param name
     *        represent the Lion's name.
     */
    public Lion(String name)
    {
        super(name, new Point(20,0));
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());
        this.SetDiet(new Carnivore());
        this.SetWeight(408.2);
        scarCount = 0;
    }

    /**
     * Constructor for the Lion's name. It creates a specific Lion. and defines his location.
     * @param name
     *        represent the Lion's name.
     * @param point
     *        represent a point from Point class.
     */
    public Lion(String name, Point point) {
        super(name, point);
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());
        //when I say that this is carnivore, I implement the method eat that inside carnivore
        this.SetDiet(new Carnivore());
        this.SetWeight(408.2);
        scarCount = 0;
    }

    /**
     * Setter.
     * sets the attribute scarCount, which is the scar that a lion can get by eating,
     * and print a massage with the function logSetter, from MassageUtilities class
     * @return boolean result.
     */
    public int GetScarCount()
    {
        MessageUtility.logGetter(GetName(), "GetScarCount", this.scarCount);
        return this.scarCount;
    }

    /**
     * Getter.
     * returns one of the food options from the Enum EFoodType, that Lion is, in this case NOT-FOOD.
     * and print a massage with the function logGetter, from MassageUtilities class.
     * @return the food type that Lion is, NOT-FOOD, as EFoodType enum.
     */
    public EFoodType getFoodType()
    {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.NOTFOOD );
        return EFoodType.NOTFOOD;
    }

    /**
     * Setter.
     * sets the attribute scar, which is the scar that a lion can get by eating,
     * and print a massage with the function logSetter, from MassageUtilities class
     * note: if this set is activated, then the lion already fell on the positive 50% of its to get scar.
     */
    public void SetScarCount(int scar)
    {
        MessageUtility.logSetter(this.GetName(),"SetScarCount", this.scarCount,true) ;
        this.scarCount+=scar;
    }

    /**
     * Announces the voice that the lion makes after it eats.
     */
    public void Roar()
    {
        MessageUtility.logSound(GetName(), "Roars, then stretches and shakes its mane");
    }

}
