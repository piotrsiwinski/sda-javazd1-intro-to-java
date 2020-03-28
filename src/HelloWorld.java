import java.util.stream.Stream;

public class HelloWorld {

// to jest metoda main - punkt startowy progaramu
  public static void main(String[] args) {

    // ta linijka wypisuje podany komunikat
    System.out.println("Witaj świecie, witaj Java");

    // TYP_ZMIENNEJ     NAZWA  = wartosc;

    int wiek = 25;  // definicja zmiennej,

    float liczbaPi = 3.14f;

    double temperatura = 9.5;

    char znak = 'a';
    char innyZnak = 'B';

    boolean czyDzisLadnaPogoda = true;


    String zolc = "to jest zmienna żółć";


    String imie = "Piotr";
//    System.out.println(wiek);
//    System.out.println(liczbaPi);
//    System.out.println("Wartość zmiennej imie to: " + imie);
//    System.out.println("temperatura dzisiaj to: " + temperatura);
//    System.out.println(zolc);


    double minTemp = -10.5;
    double maxTemp = 39.8;

    // Wypisujemy wartości kilku zmiennych
    System.out.println("Minimalna odnotowana temperatura to: "
        + minTemp
        + ", a maksymalna temperatura to: "
        + maxTemp
        + "stopni C.");

    char znakTest = '\'';

    System.out.println("Adam powiedział: \"Ale java jest fajna\" ");




  }


}
