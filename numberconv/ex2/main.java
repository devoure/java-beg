import java.util.Scanner;
import java.util.ArrayList;

public class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    int result;
    System.out.print("Enter a decimal value: ");
    n = sc.nextInt();
    if (n == 0){
      result = 0;
    }else if (n == 1){
      result = 1;
    }else if (n > 1){
      int index = 0;
      int quotient = n / 2;
      ArrayList<Integer> remainders = new ArrayList<Integer>();
      remainders.add(n % 2);
      while (quotient != 0){
        remainders.add(n % 2);
        quotient = n / 2;
        ++index;
        System.out.println(n + "/ 2 = " + quotient + "(Remainder " + n%2 + ")");
        n = quotient;
      }
      System.out.print("Result: ");
      for (int i = index - 1; i >= 0; i--){
        System.out.print(remainders.get(i));
      }
      System.out.println("");
    }else{
      System.out.println("Enter a number greater than 0");
    }
  }
}
