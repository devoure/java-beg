import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    // get input n
    // should be between 5 - 50
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    while (!((n >= 6) && (n <= 100))){
      System.out.print("Enter value of n : ");
      n = scanner.nextInt();
      if (!((n >= 6) && (n <= 100))){
        System.out.println("Enter a value of n between 6 and 100");
      }
    }

    // calculate 1/fac(0) to 1/fac(n) save in array
    double[] eArray = new double[n+2];
    for (int i = 0; i <= n; i++){
      // calculate result and save in array
      eArray[i] = 1.0 / fac(i);
    }
    // calculate total
    double total = 0.0;
    for (int i = 0; i < (eArray.length - 1); i++){
      total = total + eArray[i];
    }
    eArray[eArray.length - 1] = total;
    // Print array
    System.out.println(Arrays.toString(eArray));

  }
  public static int fac(int num){
    int result = 1;
    for (int i = 1; i <= num; i++){
      result = result * i;
    }
    return result;
  }
}
