package animals;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import mobility.Mobile;
import mobility.Point;
import utilities.MessageUtility;

import java.lang.reflect.Type;

/**
 * An abstract class that represent an animal, and have types of behaviors of animal in it.
 *
 * @version 03/04/2021
 * @author  Shaked Asido, Hadar Levy.
 * @see Lion
 */
public abstract class Animal extends Mobile implements IEdible {
    private String name;
    private double weight;
    private IDiet diet;
    //object from type interface refers to the classes that implement it.

    public Animal(String name, Point point)
    {
        super(point);
        this.name = name;
    }
    public void SetName(String name)
    {
        this.name=name;
    }

    public String GetName()
    {
        MessageUtility.logGetter(this.name , "GetName", this.name);
        return this.name;
    }

    public EFoodType getFoodType()
    {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.MEAT);
        return EFoodType.MEAT;
    }

    public double getWeight() {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "getWeight", this.weight);
        return weight;
    }

    public boolean SetDiet(IDiet diet)
    {
        this.diet=diet;
        MessageUtility.logSetter(name, "SetDiet", diet, true);
        return true;
    }

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
        MessageUtility.logSetter(this.getClass().getSimpleName(), "setWeight", weight, isSuccess);
        return isSuccess;
    }
    public abstract void makeSound();

    public boolean eat(IEdible food)
    {
        double new_weight = this.getWeight() + this.GetDiet().eat(this, food);
        boolean isSuccess = (this.GetDiet().canEat(food.getFoodType()));
        if ((new_weight > this.getWeight()) && isSuccess)
        {
            this.SetWeight(new_weight);
            this.makeSound(); //after eating, each animal needs makes her own voice.
        }
        MessageUtility.logBooleanFunction(GetName(),"eat",food, isSuccess);
        return isSuccess;
    }
    public IDiet GetDiet() {
        return diet;
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + "]: "+this.name;
    }

}
