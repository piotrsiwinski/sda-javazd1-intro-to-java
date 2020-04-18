package petle;

public class Zadanie1 {
  public static void main(String[] args) {

    // zadanie 1 - liczby od 0 -100
    System.out.println("LICZBY 0 - 100 ");
    // petla for - liczby od 0 - 100
    for (int i = 0; i <= 100; i++) {
      System.out.print(i + ", ");
    }

    System.out.println();
    System.out.println();

    // petla while - liczby od 0 - 100

    System.out.println("Petla while");
    int licznik = 0;
    while (licznik <= 100) {
      System.out.print(licznik + ", ");
      licznik++;
    }

    System.out.println("KONIEC PETLI WHILE");

    // petla do-while - liczby od 0 - 100
    System.out.println();


    // while - BLĘDY
    int cnt = 0;
    while (cnt < 100) {
      System.out.print(cnt);
      cnt++;
    }

    // liczby nieparzyste od 0 - 100
    // 5 % 3 = 2 , bo 3 * 1 + 2 = 5;
    // 9 % 2 = 1, bo 4 * 2 + 1 = 9
    // 25 % 5 = 0, 5 * 5 + 0 = 25
    // jak stwierdzic, czy liczba jest parzysta?
    // 10 % 2 = 0 // 2 * 5
    // 11 % 2 = 1

    System.out.println("LICZBY NIEPARZYSTE");
    for (int i = 0; i < 101; i++) {
      if (i % 2 == 0) {
        System.out.print(i + ", ");
      }
    }

  }
}
