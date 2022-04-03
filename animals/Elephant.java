package animals;

import diet.Herbivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Elephant extends ChewAnimals
{
    private double trunkLength;
    public Elephant(String name) {
        super(name, new Point(100,5));
        this.SetDiet(new Herbivore());
        this.SetWeight(500);
        this.trunkLength= 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }
    public Elephant(String name, Point point) {
        super(name, point);
        this.SetDiet(new Herbivore());
        this.SetWeight(500);
        this.trunkLength= 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    public EFoodType getFoodType() {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.MEAT );
        return EFoodType.MEAT;
    }


    public void Chew() {
        MessageUtility.logSound(GetName(), "Trumpets with joy while flapping its ears, then chews");
    }
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
    public double getTrunkLength() {
        return trunkLength;
    }

}
