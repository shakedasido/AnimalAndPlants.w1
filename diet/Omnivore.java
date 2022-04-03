package diet;
import animals.Animal;
import food.EFoodType;
import food.IEdible;


public class Omnivore implements IDiet {
    private Carnivore c;
    private Herbivore h;
    public Omnivore()
    {
        this.c=new Carnivore();
        this.h=new Herbivore();
    }
    public boolean canEat(EFoodType food)
    {
        if(food.equals(EFoodType.NOTFOOD))
            return false;
        return true;
    }
    public double eat(Animal animal, IEdible food)
    {
        return c.eat(animal, food)+h.eat(animal, food);//nopt sum only if MEAT
    }


}
