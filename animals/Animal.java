package animals;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import mobility.Mobile;
import mobility.Point;
import utilities.MessageUtility;

public abstract class Animal extends Mobile implements IEdible {
    private String name;
    private double weight;
    private IDiet diet;

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
        return this.name;
    }
    public EFoodType getFoodtype()
    {
        MessageUtility.logGetter(GetName(), "getFoodtype", EFoodType.MEAT);
        return EFoodType.MEAT;
    }
    public boolean SetDiet(IDiet diet)
    {
        MessageUtility.logSetter(name, "SetDiet", diet, true);
        return true;
    }
    public double getWeight() {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "getWeight", this.weight);
        return weight;
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
