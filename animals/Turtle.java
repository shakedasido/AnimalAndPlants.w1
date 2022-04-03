package animals;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import static food.EFoodType.MEAT;

public class Turtle extends ChewAnimals {
    private int age;
    public Turtle(String name)
    {
        super(name, new Point(80, 0)); //here we actually create a point so we need to do new, create a new default value
        this.SetDiet(new Omnivore());
        this.SetWeight(1);
        age = 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    public Turtle(String name, Point point)
    {
        super(name, point); //here we actually create a point so we need to do new, create a new default value
        this.SetDiet(new Omnivore());
        this.SetWeight(1);
        age = 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    public EFoodType getFoodType() {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.MEAT );
        return EFoodType.MEAT;
    }

    public boolean setAge(int age)
    {

        boolean isSuccess = (age >= 0&&age <= 500);
        if (isSuccess)
        {
            this.age = age;
        }
        else
        {
            this.age = 1;
        }
        MessageUtility.logSetter(this.GetName(),"setAge",age,isSuccess) ;
        return isSuccess;

    }

    public void Chew() {
        MessageUtility.logSound(GetName(), "Retracts its head in then eats quietly");
    }

    public int getAge() {
        return this.age;
    }

}

