import java.util.Scanner;



public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextByte();
    String result;
    

    if ((number % 5 == 0) && (number % 3 == 0)){
      result = "FizzBuzz";
    }else if (number % 3 == 0){
      result = "Buzz";
    }else if (number % 5 == 0){
      result = "Fizz";
    }else{
      result = Integer.toString(number);
    }

    System.out.println(result);
  }
}
