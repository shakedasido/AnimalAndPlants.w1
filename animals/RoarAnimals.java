package animals;

import mobility.Point;

/**
 * Abstract class that defines few methods of all the animals that can roar.
 * The class extends the abstract class Animal.
 * @version 05/04/2021
 * @author  Shaked Asido, Hadar Levy.
 * @see Animal
 */
public abstract class RoarAnimals extends Animal {

    /**
     * Constructor for the attributes name, and point-location of an animal.
     * @param name
     *        represent the attribute name of an animal.
     * @param point
     *        represent the attribute point- the location of an animal.
     */
    public RoarAnimals(String name, Point point) {
        super(name, point);
    }

    /**
     * Activate the chewing voice of the animals that roar. Implements in the animals that roar.
     */
    public abstract void Roar();

    /**
     * Activate the voice that each animal makes by activating the Roar() method.
     */
    public void makeSound(){ Roar(); }

}
