package petle;

public class LoopIntro {


  public static void main(String[] args) {

    // 1. Prosta petla while wyswietlajaca liczby 0-9


    int wiek = 20;
    System.out.println(wiek);
    wiek = wiek + 10;
    System.out.println(wiek);
    wiek += 15;
    System.out.println(wiek);

    wiek += 1;

    wiek++; // wiek = wiek + 1; // wiek += 1;


    System.out.println("PETLA WHILE");
    int licznik = 25;
    while (licznik < 10) {
      System.out.println(licznik);
      licznik++;
    }

    System.out.println("KONIEC WHILE");

    System.out.println();
    System.out.println("PETLA DO - WHILE");

    int counter = 234;
    do {
      System.out.println(counter);
      counter++;
    } while (counter < 10);


    System.out.println("KONIEC PROGRAMU");

    // PETLA FOR
    System.out.println("PETLA FOR");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }


    System.out.println();
    System.out.println();

    for (int i = 50; i < 70; i++) {
      System.out.println(i);
    }

  }
}
