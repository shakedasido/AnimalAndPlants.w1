package animals;

import mobility.Point;

/**
 * Abstract class that defines few methods of all the animals that chew. The class extends the abstract class Animal.
 *
 * @version 05/04/2021
 * @author  Shaked Asido, Hadar Levy.
 * @see Animal
 */
public abstract class ChewAnimals extends Animal {

    /**
     * Constructor for name, point attributes of an animal.
     * @param name
     *        represent the attribute name of an animal.
     * @param point
     *        represent the attribute point- the location of an animal.
     */
    public ChewAnimals(String name, Point point) {
        super(name, point);
    }

    /**
     * Activate the chewing voice of the animals that chew. Implements in the animals that chew.
     */
    public abstract void Chew();

    /**
     * Activate the voice that each animal makes by activating the chew() method.
     */
    public void makeSound(){
        Chew();
    }


}
