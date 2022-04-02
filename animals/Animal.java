package animals;
import diet.Carnivore;
import diet.IDiet;
import diet.Omnivore;
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
        MessageUtility.logSetter(this.getClass().getSimpleName(), "setHeight", weight, isSuccess);
        return isSuccess;
    }
    public void SetDiet(IDiet diet)
    {
        this.diet=diet;
    }


    public String GetName()
    {
        return this.name;
    }
    public double getWeight() {
        MessageUtility.logGetter(this.getClass().getSimpleName(), "getWeight", this.weight);
        return weight;
    }
    public IDiet GetDiet() {
        return diet;
    }

    public abstract EFoodType getFoodtype();
    public abstract void eat(IEdible iEdible);
}
