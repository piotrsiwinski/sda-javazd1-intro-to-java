package petle;

import java.util.Scanner;

public class ZmienWielkoscLiter {
  public static void main(String[] args) {

    // DEMO o konkatencji Stringa
    String s1 = "this is ";
    String s2 = "my text";
    String s3 = s1 + s2;
    System.out.println(s1);

    String text1 = "This is ";
    text1 += "my text";


    String input = "ala ma kota i kot ma ale";

    String result = "";
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      char znak = input.charAt(i);
//      result += znak; -> ZLE - konkatenacja stringa w petli - duze zuzycie pamieci
      builder.append(znak); // DOBRZE -> StringBuilder nie tworzy nadmiarowych stringow
    }

    result = builder.toString();

    System.out.println(result);
    // 0 -> "", "a",
    // 1 -> "", "a", "al"
    // 2 -> "", "a", "al", "ala"
    // 3 -> "", "a", "al", "ala", "ala "
    // 4 -> "", "a", "al", "ala", "ala ", "ala m".....

    // 26 -> ........................................... "ala ma kota"
    //


    /**
     Program zamienia znaki male na duze, duze na male...
     W pierwszych dwoch case'ach uzywamy konkatenacji stringa w petli
     Jednak nie jest to optymalne rozwiazanie

     W case 3 korzystamy z StringBuilder'a -> POLECANE ROZWIAZANIE
     */

    System.out.println(text1);
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
    StringBuilder budowniczy = new StringBuilder();
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
        // iterujemy przez caly napis
        for (int i = 0; i < text.length(); i++) {
          //pobieramy znak na i-tej pozycji
          char litera = text.charAt(i);
          // sprawdzamy czy znak to mala litera
          if (litera >= 'a' && litera <= 'z') {
            litera -= 32; // jesli tak to zmieniamy litere mala na duza
          }
          // przepisujemy znak do stringa wynikowego
          wynik += litera;
        }
        break;
      case 3:
        System.out.println("wybrano 3 - zamieniam male na duze, a duze na male");
        for (int i = 0; i < text.length(); i++) {
          char litera = text.charAt(i);
          if (litera >= 'a' && litera <= 'z') {
            litera -= 32;
          } else if (litera >= 'A' && litera <= 'Z') {
            litera += 32;
          }
          // w petli dodajemy znak do naszego budowniczego
          budowniczy.append(litera);
        }
        // poza petla zwracamy koncowy wynik
        // wywolujemy metode toString, kiedy skonczymy iteracje i chcemy uzyskac "wybudowany" napis
        wynik = budowniczy.toString();
        break;
      default:
        System.out.println("Zly wybor - nie ma takiej opcji");
        break;
    }

    // koniec switch'a
    System.out.println("Napis to: " + wynik);


  }
}
