import java.util.Scanner;

public class PoleProstokata {

  public static void main(String[] args) {
    // tworzymy obiekt skanera, do odczytywania danych od użytkownika
    Scanner czytnik = new Scanner(System.in);

    System.out.println("Podaj bok a prostokata: ");
    double bokA = czytnik.nextDouble();

    System.out.println("Podaj bok b prostokata: ");
    double bokB = czytnik.nextDouble();


    double pole = bokA * bokB;
    double obwod = 2 * bokA + 2 * bokB;

    System.out.println("Pole prostokata to: " + pole);
    System.out.println("Obwod prostokata to: " + obwod);

  }
}
