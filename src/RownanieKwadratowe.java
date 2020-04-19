import java.util.Scanner;

public class RownanieKwadratowe {
  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);
    System.out.println("Podaj parametr zmiennej A- która jest liczba całkowitą");
    double A = czytnik.nextDouble();
    System.out.println("Podaj parametr zmiennej B- który jest liczba całkowitą");
    double B = czytnik.nextDouble();
    System.out.println("Podaj parametr zmiennej C- gdzie zmienna C jest liczba calkowita");
    double C = czytnik.nextDouble();
    System.out.println("Wybrałes parametry zmiennej A: " + A);
    System.out.println("zmiennej B:" + B);
    System.out.println("Zmiennej C: " + C);
    System.out.println("Teraz przechodzę do obliczeń ...");
    // sprawdzenie czy jest kwadratowe
    if (A == 0) {
      System.out.println("To nie jest równannie kwadratowe A=0! Żegnam.");
      return;
    }
    System.out.println("A rozne od 0 -> to jest rownanie kwadratowe");
    double delta = B * B - 4 * A * C;
    if (delta < 0) {
      System.out.println("To równanie nie ma rozwiazania w zbiorze liczb rzeczywistych");
      return;
    }
    // dane sa poprawne - obliczam rownanie
    double wynik;
    if (delta == 0) {
      wynik = -B / (2 * A);
      System.out.println("Rozwiązanie: x=" + wynik);
    } else {
      wynik = (-B * Math.sqrt(delta)) / (2 * A);
      System.out.println("Rozwiązanie: x1=" + wynik);
      wynik = (-B - Math.sqrt(delta)) / (2 * A);
      System.out.println(" , x2= " + wynik);
    }
  }
}
