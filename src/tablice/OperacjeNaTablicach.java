package tablice;

import java.util.Random;
import java.util.Scanner;

/*

Napisać program, który:
• w 1 wersji -> liczby podane od uzytkownika
• w 2 wersji -> utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z [ 0, 10] - ZROBIONE
• wypisze na ekranie zawartość tablicy, - - ZROBIONE
• wyznaczy sume elementow w tablicy
• wyznaczy średnią arytmetyczną elementów tablicy,

Trudniejsze zadania:
• wyznaczy najmniejszy oraz najwięszy element w tablicy (trudniejsze)
• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego.
 */
public class OperacjeNaTablicach {

  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);

    System.out.println("Tworze tablice 5 elementowa ");
    // chcemy, zeby uzytkownik mogl podac rozmiar tablicy, bo np ocen będzie 4, 5, 6, a moze 10 ;)
    //int rozmiar = 5;// czytnik.nextInt();
    // tworzymy tablicę o rozmiarze podanym przez uzytkownika
    // gdybysmy chcieli tablice 10 elementow to:
    // int[] oceny = new int[10];
    int[] oceny = new int[5];

    // 0 1 2 3 4  -> indeksy oceny.length -> 5, 5 elementow o indeksach 0, 1,2,3,4
    // 3 4 5 2 1  -> wartosci


    // wypelnianie tablicy...
    // domyslne wartosci to beda same zera
    // przechodzimy w petli for przez cala tablice
    // i wpisujemy zadane oceny do tablicy
    // przechodzimy przez tablice od elementu 0 az do ostatniego elementu
    // pierwszy element bedzie o indeksie 0
    // ostatni element bedzie o indeksie oceny.length - 1
    // 0, 1, 2, 3, 4     , a oceny.length wynosi 5

    // zamiast 5 -> powinnismy poslugiwac sie oceny.length;
    for (int i = 0; i < 5; i++) {
      System.out.println("Podaj " + i + " ocene: ");
      int ocena = czytnik.nextInt(); // wczytanie wartosci z konsoli od uzytkowika
      oceny[i] = ocena; // na pozycji i-tej wpisujemy ocene do tablicy

    }

    // wyswietlenia zawartosci tablicy:
    for (int i = 0; i < 5; i++) {
      System.out.println("ocena " + i + "  to:   " + oceny[i]);
    }

    // obliczanie sredniej:
    double suma = 0;
    for (int i = 0; i < 5; i++) {
      int ocena = oceny[i];
      suma += ocena;
      //to samo, 1 linia:  suma += oceny[i];
    }
    double avg = suma / oceny.length;

    System.out.println("Srednia ocen to: " + avg);
  }
}
