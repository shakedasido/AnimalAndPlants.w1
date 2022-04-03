package animals;

import mobility.Point;

public abstract class ChewAnimals extends Animal {
    public ChewAnimals(String name, Point point) {
        super(name, point);
    }

    public void makeSound(){
        Chew();
    }
    public abstract void Chew();
}
