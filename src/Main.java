import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0;


        System.out.print("Give a distance in meters: ");
        meters = in.nextDouble();

        double inches = meters * 39.37;
        double feet = meters * 3.28;
        double miles = meters * 0.00062137;

        System.out.println(meters + "meters converted to inches is " + inches + " inches.");
        System.out.println(meters + "meters converted to feet is " + feet + " feet.");
        System.out.println(meters + "meters converted to miles is " + miles + " miles.");

    }
}
