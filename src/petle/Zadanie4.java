package petle;

public class Zadanie4 {
  public static void main(String[] args) {

    // "Tomek";
    // 0 -> T
    // 1 -> o
    // 2 -> m
    // 3 -> e
    // 4 -> k
    // 0 - pierwsza  litera; ostani znak:  length() -1
    String napis = "Ala ma kota, a kot ma Ale";
    // tworzymy zmienna licznikowa do liczenia liter
    int licznik = 0;
    for (int i = 0; i < napis.length(); i++) {
      char znak = napis.charAt(i);
      System.out.println(znak);
      // w kazdym obiegu petli zwieksz licznik
      licznik++;
    }

    System.out.println("KONIEC PETLI FOR....");
    System.out.println("dlugosc podanego napisu to: " + licznik);

    // policzyc dlugosc napisu bez spacji

    // implement task here
    // zwiekszamy licznik, jezeli znak jest rozny od spacji

    System.out.println("Dlugosc napisu bez spacji to: ");

    // 1. Sposob
    int counter = 0;
    for (int i = 0; i < napis.length(); i++) {
      char znak = napis.charAt(i);
      if (znak == ' ') {
        continue;
      }
      counter++;
    }

    // 2. sposob
    int licz = 0;
    for (int i = 0; i < napis.length(); i++) {
      char znak = napis.charAt(i);
      if (znak != ' ') {
        licz++;
      }
    }

    System.out.println("Napis bez spacji: " + counter);
    System.out.println("Napis bez spacji: " + licz);
  }
}
