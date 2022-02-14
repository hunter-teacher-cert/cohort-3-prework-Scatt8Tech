import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args) {

 Scanner in = new Scanner(System.in);

System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

    // pick a random number
    Random random = new Random();
    int number = random.nextInt(100) +1;

System.out.println("Type a number: ");
int Guess = in.nextInt();

System.out.println("Your guess is: " + Guess );

System.out.println("The number I was thinking of is: " + number);

if (Guess < number)
System.out.println("You were off by: " + (number-Guess));

else if (Guess > number)System.out.println("You were off by: " + (Guess-number));


  }
}