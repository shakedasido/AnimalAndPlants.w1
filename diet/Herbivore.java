package diet;
import animals.Animal;
import food.EFoodType;
import food.IEdible;

/**
 * A class that defines plants eater, implements the IDiet interface.
 * Animals that are only plants eaters, will be called Herbivores.
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     IDiet
 */
public class Herbivore implements IDiet
{
    /**
     * Gets food. Check if the animal that use herbivore class is eat the same food.
     * @param food
     *        element from EFoodType enum to compare.
     * @return boolean result.
     */
    public boolean canEat(EFoodType food)
    {
        return food.equals(EFoodType.VEGETABLE);
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
        if(canEat(food.getFoodType()))
            return animal.getWeight()*0.07;
        return 0;
    }

}
