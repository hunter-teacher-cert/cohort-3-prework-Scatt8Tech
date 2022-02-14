class Time {

  public static void main(String[] args){
    

int hour = 8;
int minute = 33;
int seconds = 30; 

System.out.print("The current time is ");
System.out.print(hour);
System.out.print(":");
System.out.print(minute);
System.out.print(":");
System.out.print(seconds);
System.out.println(".");


System.out.print("Number of seconds since midnight: ");
System.out.println(hour* 120 + minute*60 + seconds);

double clock;
clock = 8.1030;
// ^ percentage of day passed based on start time of code

System.out.print("Percentage of the day that has passed: ");
System.out.println(clock/24 * 100);

int startminutes= 10;
int endminutes= 33;

System.out.print("Elapsed time since started exercise: ");
System.out.print(endminutes-startminutes);
System.out.print(" minutes.");


  }
}