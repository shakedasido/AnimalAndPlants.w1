package diet;
import animals.Animal;
import animals.Lion;
import food.EFoodType;
import food.IEdible;

import java.util.Random;


/**
 * A class that defines meat eater, implements the IDiet interface.
 * Animals that are only meat eaters, will be called Carnivores.
 * @version 04/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     IDiet
 */
public class Carnivore implements IDiet
{
    /**
     * Gets food. Check if the animal that use carnivore class is eat the same food.
     * @param food
     *        element from EFoodType enum to compare.
     * @return boolean result.
     */
    public boolean canEat(EFoodType food)
    {
        return food.equals(EFoodType.MEAT);
    }

    /**
     * Gets animal and food type.
     * Check if it's the correct type of food that the animal eats.
     * if yes, The animal eats, and it gains wight.
     * else, it doesn't gain any weight.
     * Lions also have a 50% chance of getting scar after eating.
     * @param animal
     *        represent the type of meat eater animal.
     * @param food
     *        represent the food type of carnivore.
     *
     * @return The gain that the animal added to its weight as double.
     */
    public double eat(Animal animal, IEdible food)
    {
        if(canEat(food.getFoodType())) {
            if (animal instanceof Lion) {
                Random random = new Random();
                //random starts from 1. gets only two options. 1 or 2, 50% for each one
                if ((random.nextInt(2)+1) == 1)
                    ((Lion) animal).SetScarCount(1);
            }
            return animal.getWeight() * 0.1;
        }
        return 0;
    }

}

