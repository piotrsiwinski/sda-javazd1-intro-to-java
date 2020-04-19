package petle;

import java.util.Scanner;

public class Palindrom {

  // ka     j    ak -> kajak   -> palindrom nieparzysty

  // kazbak -> kabzak
  // anZVx xVZna -> an    na     -> palindrom parzysty


  public static void main(String[] args) {
    // anna -> 2
    // ka    j    ak ->   length() / 2 -> 2

    // 5 / 2 = 2
    // ile obiegow petli? length() / 2
    // Sposob I -> dodatkowy licznik
    // int j = ???

    // kajak
    // i   j
    // for (inicjalizacja zmiennych; warunek_zatrzymania; krok - co robic po skonczeniu petli)


    Scanner czytnik = new Scanner(System.in);
    System.out.println("Podaj napis, a ja sprawdze czy palindrom");
    String napis = czytnik.nextLine();
    boolean czyPalindrom = true;
    for (int i = 0, j = napis.length() - 1; i < napis.length() / 2; i++, j--) {
      if (napis.charAt(i) != napis.charAt(j)) {
        czyPalindrom = false;
        break;
      }
    }
    // 0 1 2 3 4
    // k a j a k
    // i = 0    j = napis.length() - 1 - i   ->5 -1 - 0 -> 4
    // i = 1    j = 5 - 1 - 1 -> 3
    // i = 2    j = 5 -1 -2 -> 2

    // 2. opcja, bez zmiennej j
    /*
    for (int i = 0; i < napis.length() / 2; i++) {
      if (napis.charAt(i) != napis.charAt(napis.length() - 1 - i)) {
        czyPalindrom = false;
        break;
      }
    }*/

    if (czyPalindrom) {
      System.out.println("Napis: " + napis + " jest palindromem");
    } else {
      System.out.println("Napis: " + napis + " NIE jest palindromem");
    }

  }
}
