import java.util.Scanner;

public class BmiCalculator {
  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);

    System.out.println("Podaj swoja wage w kg");
    double waga = czytnik.nextDouble();

    System.out.println("Podaj wzrost w metrach");
    double wzrost = czytnik.nextDouble();

    System.out.println("Obliczam BMI... ");

    double bmi = waga / (wzrost * wzrost);

    System.out.println("Twoje bmi to: " + bmi);

    if (bmi < 18.5) {
      System.out.println("Masz niedowage");
      System.out.println("To tez sie wykona... ");
    } else if (bmi >= 18.5 && bmi < 25) {
      System.out.println("Waga OK");
    } else if (bmi >= 25 && bmi < 30) {
      System.out.println("masz nadwage");
    } else {
      System.out.println("Masz otyłość");
    }


  }


}
