package zoo;

import java.util.Random;

import animals.*;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class ZooActions {
    public static boolean eat(Object animal, IEdible food){

        if (animal instanceof Lion)
        {
            return (((Lion) animal).eat(food));
        }
        else if (animal instanceof Bear)
        {
            return (((Bear)animal).eat(food));
        }
        else if (animal instanceof Elephant)
        {
            return (((Elephant)animal).eat(food));
        }
        else if (animal instanceof Giraffe)
        {
            return (((Giraffe)animal).eat(food));
        }
        else if (animal instanceof Turtle)
        {
            return (((Turtle)animal).eat(food));
        }
        return false;

    }
    public static boolean move(Object animal, Point point) {
        boolean isSuccess=true;
        if (animal instanceof Lion) {
             isSuccess = ((((Lion) animal).move(point)) != 0);
            MessageUtility.logBooleanFunction(((Lion) animal).GetName(), "move", point, isSuccess);
        } else if (animal instanceof Bear) {
             isSuccess = ((((Bear) animal).move(point)) != 0);
            MessageUtility.logBooleanFunction(((Bear) animal).GetName(), "move", point, isSuccess);
        } else if (animal instanceof Elephant) {
             isSuccess = ((((Elephant) animal).move(point)) != 0);
            MessageUtility.logBooleanFunction(((Elephant) animal).GetName(), "move", point, isSuccess);
        } else if (animal instanceof Giraffe) {
             isSuccess = ((((Giraffe) animal).move(point)) != 0);
            MessageUtility.logBooleanFunction(((Giraffe) animal).GetName(), "move", point, isSuccess);
        } else if (animal instanceof Turtle) {
             isSuccess = ((((Turtle) animal).move(point)) != 0);
            MessageUtility.logBooleanFunction(((Turtle) animal).GetName(), "move", point, isSuccess);
        }
        return isSuccess;
    }

    public static void main(String[] args)
    {


    }
}



