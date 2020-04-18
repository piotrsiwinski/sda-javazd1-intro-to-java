package petle;

import java.util.Scanner;

// Tom  // napis.length() -> 3
// m -> 2
// 0 -> 1 -> 2
// 2 -> 1 -> 0

public class Zadanie_reverseString {
  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);
    System.out.println("Podaj dowolny napis, a zostanie on wyswietlony od tylu");
    String napis = czytnik.nextLine();

    String wynik = "";
    for (int i = napis.length() - 1; i >= 0; i--) {
      char znak = napis.charAt(i);
      wynik += znak;
    }
    System.out.println();
    System.out.println("Napis: " + napis + " od tyłu to: " + wynik);

  }
}
