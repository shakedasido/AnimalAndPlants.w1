package animals;
import diet.Herbivore;
import mobility.Point;
import utilities.MessageUtility;

/**
 * A class representing a Turtle, which it is kind of animal, vegetable eater.
 * Extends class ChewAnimals.
 * @version 05/04/2021
 * @author  Shaked Asido, Hadar Levi.
 * @see     ChewAnimals
 */
public class Turtle extends ChewAnimals {
    private int age;

    /**
     * Constructor for the Turtle's name. It creates a specific Turtle, with a default location.
     * @param name
     *        represent the Turtle's name.
     */
    public Turtle(String name)
    {
        super(name, new Point(80, 0));
        this.SetDiet(new Herbivore());
        this.SetWeight(1);
        age = 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    /**
     * Constructor for the Turtle's name. It creates a specific Turtle. and defines his location.
     * @param name
     *        represent the Turtle's name.
     * @param point
     *        represent a point from Point class.
     */
    public Turtle(String name, Point point)
    {
        super(name, point);
        this.SetDiet(new Herbivore());
        this.SetWeight(1);
        age = 1;
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    /**
     * Announces the voice that the turtle makes after it eats.
     */
    public void Chew() {
        MessageUtility.logSound(GetName(), "Retracts its head in then eats quietly");
    }

    /**
     * Setter.
     * sets the attribute age, which is the age in a range of lifetime that a turtle can live.
     * And print a massage with the function logSetter, from MassageUtilities class
     * @return boolean result.
     */
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

    /**
     * Getter.
     * returns the attribute age, which is the age in a range of lifetime that a turtle can live.
     * And print a massage with the function logGetter, from MassageUtilities class.
     * @return the value of the attribute age as int.
     */
    public int getAge() {
        MessageUtility.logGetter(this.getClass().getSimpleName() , "getAge", this.age);
        return this.age;
    }

}

