package petle;

import java.util.Scanner;

public class ZmienWielkoscLiter {
  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);
    System.out.println("Podaj napis:");
    String text = czytnik.nextLine();

    System.out.println("Wybierz operację: ");
    System.out.println("1. Zamien duze na male");
    System.out.println("2. Zamien male na duze");
    System.out.println("3. Zamien male na duze, duze na male");

    // A -> 65
    // Z -> 90
    // a -> 97
    // z -> 122

    int wybor = czytnik.nextInt();
    String wynik = "";
    switch (wybor) {
      case 1:
        System.out.println("wybrano 1 - zamieniam duze na male");
        for (int i = 0; i < text.length(); i++) {
          char litera = text.charAt(i);
          if (litera >= 'A' && litera <= 'Z') {
            litera += 32;
          }
          wynik += litera;
        }
        break;
      case 2:
        System.out.println("wybrano 2 - zamieniem male na duze");
        for (int i = 0; i < text.length(); i++) {
          char litera = text.charAt(i);
          if (litera >= 'a' && litera <= 'z') {
            litera -= 32;
          }
          wynik += litera;
        }
        break;
      case 3:
        System.out.println("wybrano 3");
        break;
      default:
        System.out.println("Zly wybor - nie ma takiej opcji");
        break;
    }

    // koniec switch'a
    System.out.println("Napis to: " + wynik);


  }
}
