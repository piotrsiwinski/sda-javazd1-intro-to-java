package petle;

import java.util.Random;
import java.util.Scanner;

public class GraZaDuzoZaMalo {
  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Wylosowalem liczbe z zakresu 0 - 100. Sprobuj zgadnac");

    int losowaLiczba = rand.nextInt(101);
    System.out.println(losowaLiczba);

    int liczbaUzytkownika = -1;
    int licznik = 0;
    while (true) {
      liczbaUzytkownika = czytnik.nextInt();
      licznik++;
      if (liczbaUzytkownika == losowaLiczba) {
        System.out.println("Gratulacje! Dobry strzal - udało się za " + licznik + " razem :D");
        break;
      }

      if (liczbaUzytkownika < losowaLiczba) {
        System.out.println("Podales za mala liczbe");
      } else {
        System.out.println("Podales za duza liczbe");
      }
    }
    System.out.println("KONIEC GRY!");
  }
}
