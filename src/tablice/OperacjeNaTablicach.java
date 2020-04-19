package tablice;

import java.util.Scanner;

/*

Napisać program, który:
• w 1 wersji -> liczby podane od uzytkownika
• utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z [ 0, 10]
• wypisze na ekranie zawartość tablicy,
• wyznaczy najmniejszy oraz najwięszy element w tablicy,
• wyznaczy sume elementow w tablicy
• wyznaczy średnią arytmetyczną elementów tablicy,
• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego.
 */
public class OperacjeNaTablicach {

  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);

    System.out.println("Podaj ile ocen (rozmiar tablicy): ");
    int rozmiar = czytnik.nextInt();
    int[] oceny = new int[rozmiar];

    // wypelnianie tablicy...
    for (int i = 0; i < oceny.length; i++) {
      System.out.println("Podaj " + (i + 1) + " ocene: ");
      int ocena = czytnik.nextInt(); // wczytanie wartosci z konsoli od uzytkowika
      oceny[i] = ocena;
    }

    // wyswietlenia zawartosci tablicy:
    for (int i = 0; i < oceny.length; i++) {
      System.out.println("ocena " + (i + 1) + "  to:   " + oceny[i]);
    }


  }
}
