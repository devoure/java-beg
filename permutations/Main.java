import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    // get input n
    // should be between 5 - 50
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    while (!((n >= 5) && (n <= 50))){
      System.out.print("Enter value for n: ");
      n = scanner.nextInt();
      if (!((n >= 5) && (n <= 50))){
        System.out.println("Enter a value for n between 5-50");
      }
    }

    // get input r
    // should be above 2
    int r = 0;
    while (!(r > 2)){
      System.out.print("Enter value for r: ");
      r = scanner.nextInt();
      if (!(r > 2)){
        System.out.println("Enter a value r greater than 2");
      }
    }

    // create array with size r-1
    int[] rArray = new int[r-1];

    // Calculate permutations for each r value in the range 2 to r
    // store result of permutation in array
    int permutation;
    for (int i = 2; i <= r; i++){
      permutation = (fac(n)/fac(n - i));
      rArray[i - 2] = permutation;
    }
    System.out.println(Arrays.toString(rArray));
  }
  public static int fac(int num){
    int result = 1;
    for (int i = 1; i <= num; i++){
      result = result * i;
    }
    return result;
  }
}
