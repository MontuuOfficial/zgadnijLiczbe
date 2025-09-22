import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dzień dobry");
        /*
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
        int guessedNumber = scanner.nextInt();
        System.out.println("Podano " + guessedNumber);
        if (guessedNumber == randomNumber){
            System.out.println("Ok");
        }
        else {
            System.out.println("Nie ok");
        }
        int difference;
        if (randomNumber > guessedNumber) {
            difference = randomNumber - guessedNumber;
        }
        else {
            difference = guessedNumber - randomNumber;
        }
        //wyrazenie warunkowe
        //difference = guessedNumber > randomNumber? randomNumber - guessedNumber : guessedNumber - randomNumber;
        difference = difference / 10;

        //instrukcja wyboru
        switch (difference) {
            case 0:
                System.out.println("Bardzo blisko");
                break;
            case 1:
                System.out.println("Dość blisko");
                break;
            case 2:
                System.out.println("Git xd");
            default:
                System.out.println("Spróbuj czego innego");
        }
        //wyrażenie switch
        System.out.println(
                switch (difference){
                    case 0 -> "Bardzo blisko";
                    case 1 -> "Dość blisko";
                    case 2 -> "Git xd";
                    default -> "Spróbuj czego innego";
                }
        );
        //zgadywanie 10 razy
        Random random = new Random();
        randomNumber = random.nextInt(1, 101);
        for (int i = 0; i < 10; i++) {
            System.out.println("Zgadnij liczbę");
            guessedNumber = scanner.nextInt();
            if (guessedNumber == randomNumber) {
                System.out.println("Gratki");
                break;
            }
            else if(guessedNumber > randomNumber){
                System.out.println("Za dużo");
            }
            else {
                System.out.println("Za mało");
            }
        }*/
        //git
        //git init
        //git config user.email "email"
        //git config user.name "name"
        //git add .
        //git commit -m "tresc comitu"
        //git remote add
        //git push -u origin master
        //git push

        //za drugim razem
        //git add .
        //git commit -m "tresc comitu"
        //git push

        //zgadnij liczbe, dopóki nie zgadniesz
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(1, 101);
        System.out.println("Podaj losową liczbę");
        int guessedNumber = scanner.nextInt();
        while (randomNumber != guessedNumber) {
            if (randomNumber < guessedNumber) {
                System.out.println("Wpisano za dużo");
            }
            else {
                System.out.println("Wpisano za mało");
            }
            System.out.println("Podaj losową liczbę");
            guessedNumber = scanner.nextInt();
        }
    }
}

