package tablice;

public class ProsteOperacjeNaTablicach {
  public static void main(String[] args) {
    int[] oceny = new int[]{12, 15, 18, 22, 25}; // jakies oceny od 1 - 30
    //pobieranie dlugosci
    int iloscOcen = oceny.length;
    System.out.println("Tablica oceny ma rozmiar: " + iloscOcen);
    System.out.println("Tablica oceny ma rozmiar: " + oceny.length);
    System.out.println();

    // wyswietlenie tablicy - petla for po wszystkich elementach
    for (int i = 0; i < oceny.length; i++) {
      int ocena = oceny[i]; // pobieranie wartosci z tablicy na pozycji i
      System.out.println("tablica[" + i + "] = " + ocena);
    }


    // pobieranie pierwszego elementu
    System.out.println();
    int pierwszy = oceny[0];
    System.out.println("pierwszy element to: " + pierwszy);


    // pobranie 3 elementu z tablicy
    System.out.println();
    int trzeci = oceny[2];
    System.out.println("Trzeci element to: " + trzeci);


    // pobranie ostatniego elementu tablicy:
    System.out.println();
    int ostatni = oceny[oceny.length - 1];
    System.out.println("Ostatni element tablicy to: " + ostatni);

    // obliczenie średniej
    System.out.println();
    double suma = 0;
    for (int i = 0; i < oceny.length; i++) {
      suma += oceny[i];
    }
    double srednia = suma / iloscOcen;
    System.out.println("Srednia ocen to: " + srednia);
  }
}
