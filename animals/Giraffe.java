package animals;

import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends ChewAnimals{
    private double neckLength;

    public Giraffe(String name)
    {
        super(name, new Point(50, 0)); //here we actually create a point so we need to do new, create a new default value
        this.SetDiet(new Omnivore());
        this.SetWeight(450);
        neckLength = 1.5;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    public Giraffe(String name, Point point)
    {
        super(name, point); //here we actually create a point, so we need to do new, create a new default value
        this.SetDiet(new Omnivore());
        this.SetWeight(450);
        neckLength = 1.5;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    public EFoodType getFoodType() {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.MEAT );
        return EFoodType.MEAT;
    }

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
        MessageUtility.logSetter(this.GetName(),"setNeckLength",length,isSuccess) ;
        return isSuccess;

    }

    public void Chew() {
        MessageUtility.logSound(GetName(), "Bleats and Stomps its legs, then chews");
    }

    public double getNeckLength() {
        return neckLength;
    }


}
