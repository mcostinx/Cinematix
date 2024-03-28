package UI;

import java.util.Scanner;

public class DataTypeValidation
{
   public static int readInt()
    {
        Scanner scanner = new Scanner(System.in);
        int input;
        try
        {
            input = scanner.nextInt();
            return input;
        }
        catch (Exception e)
        {
            System.out.println("Te rog sa introduci un numar");
            return readInt();
        }
    }
    public static int readInt(int min, int max)
    {
        Scanner scanner = new Scanner(System.in);
        int input;
        try
        {
            input = scanner.nextInt();
            if(input<min)
            {
                System.out.println("Valoarea introdusa este mai mica, decat valoarea minima");
                return readInt(min, max);
            }
            if(input>max)
            {
                System.out.println("Valoarea introdusa este mai mare, decat valoarea maxima");
                return readInt(min, max);
            }

            return input;
        }
        catch (Exception e)
        {
            System.out.println("Te rog sa introduci un numar");
            return readInt();
        }
    }

    public static double readDouble(double min, double max)
    {
        double input;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        try
        {
            input = scanner.nextDouble();
            if(input<min)
            {
                System.out.println("Valoarea introdusa este mai mica, decat valoarea minima");
                return readDouble(min, max);
            }
            if(input>max)
            {
                System.out.println("Valoarea introdusa este mai mare, decat valoarea maxima");
                return readDouble(min, max);
            }

            return input;
        }
        catch (Exception e)
        {
            System.out.println("Te rog sa introduci un numar!");
            input = readDouble(min, max);
        }
        return input;
    }

    public static double readDouble()
    {
        double input;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        try
        {
            input = scanner.nextDouble();

            return input;
        }
        catch (Exception e)
        {
            System.out.println("Te rog sa introduci un numar!");
            input = readDouble();
        }
        return input;
    }

    public static String readString()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        return scanner.next();

    }

    public static double readDouble(int min, int max)
    {
        double nr;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        try
        {
            nr = scanner.nextDouble();
        }
        catch (Exception e)
        {
            System.out.println("Te rog sa introduci un numar!");
            nr = readDouble();
        }
        return nr;
    }


}
