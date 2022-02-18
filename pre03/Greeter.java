import java.io.*;
import java.util.*;

public class Greeter{

public static void generationGreet(String name, int number){
System.out.println("Good morning "+name+ "the "+number);
  
}
public static void namedGreet (String name){
System.out.println("Good morning " + name);
greet();  
}
  
public static void greet(){
System.out.println("Hey!");
  
}
  
public static void main(String[] args){
  
    greet();
    greet();
    namedGreet("Eric :)");
    generationGreet("Charles ",3);
  }


  
}