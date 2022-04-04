package zoo;
import java.util.Random;
import java.util.Scanner;

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
    public static boolean move(Object animal, Point point)
    {
        boolean isSuccess=false;
        if (animal instanceof Animal)
        {
            isSuccess = ((((Animal) animal).move(point)) != 0);
        }
        MessageUtility.logBooleanFunction(((Animal) animal).GetName(), "move", point, isSuccess);
        return isSuccess;
    }
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
        String name1="";
        int x=0;
        int y =0;
        int number=0;
        Point p;
        boolean done;
        for(int i=0;i<size;i++) {
            done=false;
            while(done==false)
            {
                System.out.println("\nEnter number in order to choose the kind of animals:" +
                        "\n Enter 1- For Lion" +
                        "\n Enter 2- For Bear" +
                        "\n Enter 3- For Elephant" +
                        "\n Enter 4- For Giraffe" +
                        "\n Enter 5- For Turtle\n");
                number = sc.nextInt();
                switch (number)
                {
                    case 1:
                        System.out.println("Enter Lion name");
                        name1= sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        if (Point.CheckBoundaries(p))
                        {
                            AnimalArray[i] = new Lion(name1, p);
                        }
                        else
                        {
                            AnimalArray[i] = new Lion(name1);
                        }
                        done=true;
                        break;
                    case 2:
                        System.out.println("Enter Bear name");
                        name1= sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        if (Point.CheckBoundaries(p))
                        {
                            AnimalArray[i] = new Bear(name1, p);
                        }
                        else
                        {
                            AnimalArray[i] = new Bear(name1);
                        }
                        done=true;
                        break;
                    case 3:
                        System.out.println("Enter Elephant name");
                        name1= sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        if (Point.CheckBoundaries(p))
                        {
                            AnimalArray[i] = new Elephant(name1, p);
                        }
                        else
                        {
                            AnimalArray[i] = new Elephant(name1);
                        }
                        done=true;
                        break;
                    case 4:
                        System.out.println("Enter Giraffe name");
                        name1= sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        if (Point.CheckBoundaries(p))
                        {
                            AnimalArray[i] = new Giraffe(name1, p);
                        }
                        else
                        {
                            AnimalArray[i] = new Giraffe(name1);
                        }
                        done=true;
                        break;
                    case 5:
                        System.out.println("Enter Turtle name");
                        name1= sc.next();
                        sc.nextLine();
                        System.out.println("Enter location:(x, y)");
                        System.out.println("Enter x: ");
                        x = sc.nextInt();
                        System.out.println("Enter y: ");
                        y = sc.nextInt();
                        p = new Point(x, y);
                        if (Point.CheckBoundaries(p))
                        {
                            AnimalArray[i] = new Turtle(name1, p);
                        }
                        else
                        {
                            AnimalArray[i] = new Turtle(name1);
                        }
                        done=true;
                        break;
                    default:
                        System.out.println("wrong choice! press again\n");

                }

            }

        }
        System.out.println("************************************************************");
        System.out.println("                           FEED                             ");
        System.out.println("************************************************************");
        for(int i=0;i<size/2;i++)
        {
            Random random = new Random();
            int rnd1 = random.nextInt(size);
            int rnd2 = random.nextInt(size);
            AnimalArray[rnd1].eat(AnimalArray[rnd2]);
            if(AnimalArray[rnd1] instanceof Lion && AnimalArray[rnd1].eat(AnimalArray[rnd2])==true )
            {
                if(random.nextInt(2) == 1)
                    ((Lion)AnimalArray[rnd1]).SetScarCount(1);

            }
        }
        System.out.println("************************************************************");
        System.out.println("                           MOVE                             ");
        System.out.println("************************************************************");
        Point temp=null;
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter location you want "+AnimalArray[i].toString()+" to move to:(x, y)");
            System.out.println("Enter x: ");
            x = sc.nextInt();
            System.out.println("Enter y: ");
            y = sc.nextInt();
            temp=new Point(x,y);
            move(AnimalArray[i],temp);
        }

    }

}






