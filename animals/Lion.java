package animals;

import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Lion extends RoarAnimals
{
    private int scarCount;
    public Lion(String name)
    {
        super(name, new Point(20,0));
        this.SetDiet(new Carnivore());
        this.SetWeight(408.2);
        scarCount = 0;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }
    public Lion(String name, Point point) {
        super(name, point);
        this.SetDiet(new Carnivore());
        this.SetWeight(408.2);
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());
        scarCount = 0;
    }
    public int GetScarCount()
    {
        return this.scarCount;
    }
    @Override
    public EFoodType getFoodType()
    {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.NOTFOOD );
        return EFoodType.NOTFOOD;
    }

    public void SetScarCount(int scar)
    {
        this.scarCount+=scar;
    }

    public void Roar()
    {
        MessageUtility.logSound(GetName(), "Roars, then stretches and shakes its mane");
    }

}
