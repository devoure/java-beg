import java.util.Date;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    byte age = 25;
    float height = 1.7F;
    long bankAccount = 223_000_000L;
    Date now = new Date();
    String message = "Hello there";
    String[] hobbies = {"Video Games", "Travelling"};

    System.out.println(now);
    System.out.println(message);
    System.out.println("Hobbies:");
    System.out.println(Arrays.toString(hobbies));
  }
}
