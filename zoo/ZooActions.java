package zoo;

import java.util.Random;
import java.util.Scanner;

import animals.*;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import static mobility.Point.CheckBoundaries;

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
        System.out.print("enter size of array, Please: ");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        Animal[] AnimalArray= new Animal[size];
        int count = 0, number=0;

        while(count < size)
        {
            System.out.println("\nEnter number in order to choose the kind of animals:" +
                    "\n Enter 1- For Lion" +
                    "\n Enter 2- For Bear" +
                    "\n Enter 3- For Elephant" +
                    "\n Enter 4- For Giraffe" +
                    "\n Enter 4- For Turtle\n");
            number = sc.nextInt();
            switch (number)
            {
                case 1:
                    System.out.println("\nEnter Lion name\n");
                    String name= sc.nextLine();
                    System.out.println("Enter location:(x, y)\n");
                    System.out.println("Enter x: ");
                    int x = sc.nextInt();
                    System.out.println("\nEnter y: ");
                    int y = sc.nextInt();
                    Point p = new Point(x, y);
                    if (Point.CheckBoundaries(p))
                    {
                        AnimalArray[count] = new Lion(name, p);
                    }
                    else
                    {
                        AnimalArray[count] = new Lion(name);
                    }
                    count++;

            }

        }

        return array;


    }
}



