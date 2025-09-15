import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dzień dobry");

        //typy calkowite
        byte osiem = 8;
        short trzysta = 300;
        int tysiac = 1000;
        long dziesiecTysiecy = 10000;
        System.out.println("Twoja liczba " + osiem);

        //typy zmiennoprzecinkowe
        float liczbaPi = 3.14f; //koniecznie f na koncu
        double pierwiastekZ2 = 1.41;
        System.out.println("Liczba pi to " + liczbaPi);

        //typ logiczny
        boolean prawda = true;

        //typ znakowy
        char znak = 'a';

        //Zadanie 1
        //Napisz program który losuje liczbe od 1 do 100, następnie zapytaj o nią użytkownika
        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println(randomNumber);
        //wczytywanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe ");
        int zgadywanaLiczba = scanner.nextInt();
        System.out.println("Podano " + zgadywanaLiczba);
    }
}