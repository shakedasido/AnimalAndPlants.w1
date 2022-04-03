package animals;

import mobility.Point;

public abstract class RoarAnimals extends Animal {
    public RoarAnimals(String name, Point point) {
        super(name, point);
    }

    public abstract void Roar();

    public void makeSound(){ Roar(); }

}
