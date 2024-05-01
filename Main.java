
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int age;
    System.out.println("Enter Your age");
    try (Scanner scanner = new Scanner(System.in)) {
      age = scanner.nextInt();
    }
    if (age>52){
      System.out.println("You are Experienced ");
    }
    else if (age>41){
      System.out.println("You are Semi Experienced");
    }
    else if (age>34){
      System.out.println("You are in Progression");
    }
    else{
      System.out.println("You are Not Experienced");
    }
    if (age>2){
      System.out.println("You are not a Baby");
    }
  }
}


