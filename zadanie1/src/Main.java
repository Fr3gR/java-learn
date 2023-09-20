import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("To jest główna funkcja w klasie Main");
        System.out.println("Wywołanie funkcji name:");
        name();
        System.out.println("Funkcja o nazwie numer:");
        numer();
    }

    public static void name() {
        System.out.println("Wpisz imię");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        System.out.println("Podałeś: " + name);
    }

    private static void numer() {
        System.out.println("Liczba razy 2:");
        Scanner licz1 = new Scanner(System.in);
        System.out.println("Wynik "+licz1.nextInt()*2);
        licz1.nextLine();
        System.out.println("Linia testowa");
        String test = licz1.nextLine();
        System.out.println("Wpisałeś"+ test);
    }
}