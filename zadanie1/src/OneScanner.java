import java.util.Scanner;

public class OneScanner {
    public static void main(String[] args) {
        int x, y;
        int pole;
        System.out.println("Podaj pierwszy bok:");
        x = getInt();
        System.out.println("Podaj drugi bok:");
        y = getInt();
        pole = x * y;
        System.out.println("Pole figury o tych bokach wynosi: " + pole);
    }

    // Funkcja do pobierania danych od użytkownika i zwracania ich jako wartość liczbową
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
