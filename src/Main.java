import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Wypisz wszystkie liczby dwucyfrowe parzyste
        //Zapytaj użytkownika ile chce gwiazdek i tyle mu napisz
        //Poproś użytkownika o 0 i wczytuj liczby tak długo, aż będzie 0
        //Oblicz sume wszystkich liczb od a do b wczytanych z klawiatury

        //Zadanie 1
        System.out.println("Liczby dwucyfrowe parzyste");
        for (int i = 10; i < 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Zadanie 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile gwiazdek wypisać?");
        int starAmount = scanner.nextInt();
        for (int j = 0; j < starAmount; j++) {
            System.out.print("*");
        }
        System.out.println();
        //Zadanie 3
        int scannedValue;
        do {
            System.out.println("Podaj zero");
            scannedValue = scanner.nextInt();
        }while (scannedValue != 0);
        System.out.println();
        //Zadanie 4
        int usersA, usersB, sumFromAToB = 0;
        System.out.println("Podaj wartość A");
        usersA = scanner.nextInt();
        System.out.println("Podaj wartość B");
        usersB = scanner.nextInt();
        for (int k = usersA; k <= usersB; k++) {
            sumFromAToB = sumFromAToB + k;
        }
        System.out.println("Suma wszystkich liczb od A do B to " + sumFromAToB);

        System.out.println();
    }

}
