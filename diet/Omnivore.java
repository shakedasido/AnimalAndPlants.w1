package diet;
import animals.*;
import food.EFoodType;
import food.IEdible;

/**
 * A class that defines everything eater, implements the IDiet interface.
 * Animals that eats everything, will be called Omnivores.
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     IDiet
 */
public class Omnivore implements IDiet {
    private final Carnivore c;
    private final Herbivore h;

    /**
     * Constructor for the Omnivore kinds, meat and vegetables.
     * It creates a carnivore and herbivore, and combine them together.
     */
    public Omnivore()
    {
        this.c=new Carnivore();
        this.h=new Herbivore();
    }

    /**
     * Gets element named food. checks if its actually food
     * @param food
     *        element from EFoodType enum to compare.
     * @return boolean result.
     */
    public boolean canEat(EFoodType food)
    {
        return !food.equals(EFoodType.NOTFOOD);
    }

    /**
     * Gets animal and food type.
     * Check if it's the correct type of food that the animal eats.
     * If yes, The animal eats, and it gains wight.
     * else, it doesn't gain any weight.
     * @param animal
     *        represent the type of meat eater animal.
     * @param food
     *        represent the food type of herbivore.
     *
     * @return The gain that the animal added to its weight as double.
     */
    public double eat(Animal animal, IEdible food)
    {
        if(food.getFoodType().equals(EFoodType.MEAT))
            return c.eat(animal, food);
        else if (food.getFoodType().equals(EFoodType.VEGETABLE))
                return h.eat(animal, food);
        return 0;
    }


}
