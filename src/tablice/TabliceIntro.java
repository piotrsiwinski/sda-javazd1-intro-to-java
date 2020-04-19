package tablice;

public class TabliceIntro {

  public static void main(String[] args) {
    // 1. czym jest null
    // typy liczbowe: byte, short, int, long, float, double -> domyślna wartość 0;
    // typ znakowy: char -> 0
    // typ "prawda/falsz" boolean -> wartosc domyslna: false
    int wiek = 0;

    // typ obiektowy: String, Scanner, Random, wszystkie inne typy
    // a także typ tablicowy: nawet tablica typu prostego jest obiektem

    String str = null; // str -> to jest referencja
    // dla tej referencja str -> nie ma zarezerwowanej pamieci
    // str ma wartosc null

    if (str != null) {
      System.out.println(str);
      String duzeLitery = str.toUpperCase();
      System.out.println(duzeLitery);
    } else {
      System.out.println("str jest nullem - nie mozna wykonac operacji");
    }


    // 2. Tworzenie tablicy int, String itd
    System.out.println("Tablica integerow");
    int[] liczby = new int[10];


    for (int i = 0; i < liczby.length; i++) {
      int wartosc = liczby[i];
      System.out.println(wartosc);
    }

    System.out.println("Tablica stringow: ");
    String[] napisy = new String[10];
    for (int i = 0; i < napisy.length; i++) {
      String napis = napisy[i];
      System.out.println(napis);
    }


  }
}
