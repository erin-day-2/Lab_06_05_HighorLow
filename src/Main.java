import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	Random generator = new Random ();
    Scanner in = new Scanner(System.in);

    String trash = "";

    int val = generator.nextInt(10) + 1;
    int guess = 0;

    System.out.print("Please insert your single guess from 1 to 10: ");

    guess = in.nextInt();

    if (val < guess)
    {
        System.out.println("The random number was: " + val + " \nYour guess was too high! \nTry again!");
    }
    else if (val > guess)
    {
        System.out.println("The random number was: " + val + " \nYour guess was too low! \nTry again!");
    }
    else
    {
        System.out.println("The random number was: " + val + " \nYour guess is right on the money! \nCongradulations!");
    }
    }
}
