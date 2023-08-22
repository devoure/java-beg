import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
  public static void main(String[] args){
    final byte MONTHS_IN_YEARS = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);
    long principal = 0;
    while (!(principal >= 1_000 && principal <= 1_000_000)){
      System.out.print("Principal ($1k - $1M): ");
      principal = scanner.nextInt();
      if (!(principal >= 1_000 && principal <= 1_000_000)){
        System.out.println("Enter a number between 1,000 and 1,000,000.");
      }
    }

    float annualInterest = 0;
    while (!(annualInterest > 0 && annualInterest <= 30)){
      System.out.print("Annual Interest Rate:");
      annualInterest = scanner.nextFloat();
      if (!(annualInterest > 0 && annualInterest <= 30)){
        System.out.println("Enter a number between 1 and 30.");
      }
    }
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

    byte period = 0;
    while (!(period > 0 && period <= 30)){
      System.out.print("Period (Years): ");
      period = scanner.nextByte();
      if (!(period > 0 && period <= 30)){
        System.out.println("Enter a number between 1 and 30.");
      }
    }
    int numberOfPayments = period * MONTHS_IN_YEARS;

    double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                                  (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    String result = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortage: " + result);
  }
}
