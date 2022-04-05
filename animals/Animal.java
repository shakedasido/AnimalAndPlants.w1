package animals;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import mobility.Mobile;
import mobility.Point;
import utilities.MessageUtility;

import java.util.Random;


/**
 * Abstract class that defines the common features for all animals The class expands Mobile and implements IEdible.
 *
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levy.
 * @see Lion
 */
public abstract class Animal extends Mobile implements IEdible {
    private String name;
    private double weight;
    private IDiet diet;
    //object from type interface refers to the classes that implement it.
    /**
     * Constructor for name, point attributes of an animal.
     * @param name
     *        represent the attribute name of an animal.
     * @param point
     *        represent the attribute point- the location of an animal.
     */
    public Animal(String name, Point point)
    {
        super(point);
        this.name = name;
    }

    /**
     * Getter.
     * Print a massage with the function logGetter, from MassageUtilities class.
     * @return the value of the attribute diet, as an IDiet attribute.
     */
    public IDiet GetDiet() {
        MessageUtility.logGetter(this.getClass().getSimpleName() , "GetDiet", diet.getClass().getSimpleName());
        return this.diet;
    }

    /**
     * Getter.
     * Print a massage with the function logGetter, from MassageUtilities class.
     * @return the value of the attribute name, as string.
     */
    public String GetName()
    {
        MessageUtility.logGetter(this.name , "GetName", this.name);
        return this.name;
    }

    /**
     * Getter.
     * return the attribute kind of the food that the animal eats from EFoodType Enum.
     * All the animals eats meat except lion. so the function will be rewritten in Lion class (Polymorphism).
     * @return the value of the attribute food - MEAT of EFoodType Enum.
     */
    public EFoodType getFoodType()
    {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.MEAT);
        return EFoodType.MEAT;
    }

    /**
     * Getter.
     * return the attribute weight, and print a massage with the function logGetter, from MassageUtilities class.
     * @return the value of the attribute weight, as double.
     */
    public double getWeight() {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "getWeight", this.weight);
        return weight;
    }

    /**
     * Setter.
     * sets the attribute name, and print a massage with the function logSetter, from MassageUtilities class
     */
    public void SetName(String name)
    {
        this.name=name;
        MessageUtility.logSetter(name, "SetName", name, true);
    }

    /**
     * Setter.
     * sets the attribute diet, and print a massage with the function logSetter, from MassageUtilities class
     * @return boolean result.
     */
    public boolean SetDiet(IDiet diet)
    {
        this.diet=diet;
        MessageUtility.logSetter(GetName(), "SetDiet", diet.getClass().getSimpleName(), true);
        return true;
    }

    /**
     * Setter.
     * sets the attribute weight with the new weight, if the weight is bigger than zero. else, make it 0.
     * Print a massage with the function logSetter, from MassageUtilities class.
     * @return boolean result.
     */
    public boolean SetWeight(double weight)
    {
        boolean isSuccess = (weight >= 0);
        if (isSuccess)
        {
            this.weight = weight;
        }
        else
        {
            this.weight = 0;
        }
        MessageUtility.logSetter(this.getClass().getSimpleName(), "SetWeight", this.weight, isSuccess);
        return isSuccess;
    }

    /**
     * Activate the voice that each animal makes. implements in chewAnimals and RoarAnimals.
     */
    public abstract void makeSound();

    /**
     * Gets food.
     * Check if it's the correct type of food that the animal eats.
     * if yes, The animal eats, and it gains weight, and make noise.
     * @param food
     *        represent the food of an animal type (carnivore, herbivore, omnivore).
     *
     * @return Boolean result.
     */
    public boolean eat(IEdible food)
    {

        boolean isSuccess = (this.GetDiet().canEat(food.getFoodType()));
        MessageUtility.logBooleanFunction(GetName(),"eat",food, isSuccess);
        if (isSuccess)
        {
            this.SetWeight(this.getWeight() + this.GetDiet().eat(this, food));
            this.makeSound(); //after eating, each animal needs makes her own voice.
        }

        return isSuccess;
    }

    /**
     * function for printing the animal in format [class]: name.
     * @return the animal in format [class]: name, as string.
     */
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "]: "+this.name;
    }

}
