package zoo;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import animals.*;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class ZooActions {


    /**
     * Gets animal and an interface object that represent kinds of food eaters.
     * Check by down-casting, if it's the correct type of animal. then operate the right type of animal's eat method.
     * if yes, The animal is correct and send to eat. else, not.
     * @param animal
     *        represent an animal type (Lion, Bear, ...).
     * @param food
     *        represent the food of an animal type (carnivore, herbivore, omnivore).
     * @return Boolean result.
     */
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

    /**
     * Gets animal and a Point object that represent a location that thw animal wants to move to.
     * Check by down-casting,
     * if it's the correct type of animal(meaning, its one of the animals that we have in the program).
     * if yes, it operates the move method of the animals, from Mobile class.
     * @param animal
     *        represent an animal type (Lion, Bear, ...).
     * @param point
     *        represent the animal's current location.
     * @return Boolean result.
     */
    public static boolean move(Object animal, Point point)
    {
        boolean isSuccess=false;
        if (animal instanceof Animal)
        {
            isSuccess = ((((Animal) animal).move(point)) != 0); //return true, if not 0.
        }
        MessageUtility.logBooleanFunction(((Animal) animal).GetName(), "move", point, isSuccess);
        return isSuccess;
    }

    /**
     * Creates array, that will contain size amount of animals, as much as the user chose.
     * the user will choose the animal, and the animal will be created by his wishes, as long as its one of the animals
     * that are in the list. then we make a lottery out of all the animals at the array and randomly pick two.
     * One of the animals will be eating the other animal.
     * The animals in the list can also move, according to the point location that the user provide to the system.
     * (as long as the point is in the correct limits).
     * @param args
     *      main method object from type String[].
     */
    public static void main(String[] args)
    {
        System.out.print("Enter size of array, Please (minimum 3):");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        while(size<3)
        {
            System.out.print("Size is too small, minimum 3, Press again:");
            size = sc.nextInt();
        }
        Animal[] AnimalArray= new Animal[size];
        String name1;
        int x, y, number;
        Point p;
        boolean done;
        for(int i=0;i<size;i++) {
            done=false;
            while(!done)
            {
                System.out.println("""

                        Enter number in order to choose the kind of animals:
                         Enter 1- For Lion
                         Enter 2- For Bear
                         Enter 3- For Elephant
                         Enter 4- For Giraffe
                         Enter 5- For Turtle
                        """);
                number = sc.nextInt();
                switch (number) {
                    case 1 -> {
                        System.out.println("Enter Lion name");
                        name1 = sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        if (Point.CheckBoundaries(p)) {
                            AnimalArray[i] = new Lion(name1, p);
                        } else {
                            AnimalArray[i] = new Lion(name1);
                        }
                        if(AnimalArray[i] instanceof Lion)
                        {
                            ((Lion)AnimalArray[i]).GetScarCount();
                        }
                        done = true;
                    }
                    case 2 -> {
                        System.out.println("Enter Bear name");
                        name1 = sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        if (Point.CheckBoundaries(p)) {
                            AnimalArray[i] = new Bear(name1, p);
                        } else {
                            AnimalArray[i] = new Bear(name1);
                        }
                        done = true;
                    }
                    case 3 -> {
                        System.out.println("Enter Elephant name");
                        name1 = sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        System.out.println("Enter the Elephant's trunk length (length >= 0.5 && length <= 3): ");
                        double length = sc.nextDouble();

                        //creates the animal
                        if (Point.CheckBoundaries(p)) {
                            AnimalArray[i] = new Elephant(name1, p);
                        } else {
                            AnimalArray[i] = new Elephant(name1);
                        }

                        //creates the trunk
                        if(AnimalArray[i] instanceof Elephant)
                        {
                            ((Elephant)AnimalArray[i]).setTrunkLength(length);
                        }
                        done = true;
                    }
                    case 4 -> {
                        System.out.println("Enter Giraffe name");
                        name1 = sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        System.out.println("Enter the Giraffe's neck length (length>=1 && length<=2.5): ");
                        double length = sc.nextDouble();

                        //creates the animal
                        if (Point.CheckBoundaries(p)) {
                            AnimalArray[i] = new Giraffe(name1, p);
                        } else {
                            AnimalArray[i] = new Giraffe(name1);
                        }
                        //creates the giraffe's neck length
                        if(AnimalArray[i] instanceof Giraffe)
                        {
                            ((Giraffe)AnimalArray[i]).setNeckLength(length);
                        }

                        done = true;
                    }
                    case 5 -> {
                        System.out.println("Enter Turtle name");
                        name1 = sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        System.out.println("Enter the Turtle's age (age>=0 && age<=500): ");
                        int age = sc.nextInt();

                        //creates the animal
                        if (Point.CheckBoundaries(p)) {
                            AnimalArray[i] = new Turtle(name1, p);
                        } else {
                            AnimalArray[i] = new Turtle(name1);
                        }

                        //creates the turtle's age
                        if(AnimalArray[i] instanceof Turtle)
                        {
                            ((Turtle)AnimalArray[i]).setAge(age);
                        }
                        done = true;
                    }
                    default -> System.out.println("wrong choice! press again\n");
                }

            }

        }
        boolean a_one_ate_a_two;
        System.out.println("************************************************************");
        System.out.println("                           FEED                             ");
        System.out.println("************************************************************");
        for(int i=0;i<size/2;i++)
        {
            Random random = new Random();
            int rnd1 = random.nextInt(size);
            int rnd2;
            do {
                rnd2 = random.nextInt(size);
            }while (rnd1 == rnd2);

            a_one_ate_a_two= eat(AnimalArray[rnd1], AnimalArray[rnd2]);
            if (a_one_ate_a_two)
            {
                //animal 1 ate animal 2
                AnimalArray[rnd2]=null;
            }
        }
        System.out.println("************************************************************");
        System.out.println("                           MOVE                             ");
        System.out.println("************************************************************");
        Point temp;
        for(int i=0;i<size;i++)
        {
            if (AnimalArray[i] != null)
            {
                System.out.println("Enter location you want "+AnimalArray[i].toString()+" to move to:(x, y)");
                System.out.println("Enter x: ");
                x = sc.nextInt();
                System.out.println("Enter y: ");
                y = sc.nextInt();
                temp=new Point(x,y);
                move(AnimalArray[i], temp);
            }
        }
        sc.close();
    }

}






