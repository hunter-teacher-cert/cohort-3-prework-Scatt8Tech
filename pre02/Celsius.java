
import java.util.Scanner;

class Celsius {
 
  public static void main (String[]args){

Scanner in = new Scanner(System.in);


System.out.print("Please enter a temperature for conversion.");
double C = in.nextInt();

double F = C *(9.0/5.0) + 32;

System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");

  
  
  
  }
}

// 1. prompt user for input
// 2. read a double value from keyboard
// 3. calculate result
// 4. format output to one decimal place 24/0 c = 75.2 f