public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello World");

    int Age = 1;
    if (Age>18) {
      System.out.println("You can drive a car.");
    } else{
      System.out.println("You can't drive a car.");
    }

    int time = 20;
    String result;
    result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
  }
}