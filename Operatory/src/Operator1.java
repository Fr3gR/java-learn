public class Operator1 {
    public static void main(String[] args) {
        int dodawanie = 2 + 2;
        int odejmowanie = 3 - 2;
        int mnozenie = 2 * 3;
        int dzielenie = 6 / 2;
        int reszta = 8 & 3;

        System.out.format("Wynik dodawania: %d\n", dodawanie);
        System.out.format("Wynik odejmowania: %d\n", odejmowanie);
        System.out.format("Wynik mnożenia: %d\n", mnozenie);
        System.out.format("Wynik odzielenia: %d\n", dzielenie);
        System.out.format("Reszta z dzielenia: &d\n", reszta);

        System.out.println((2+2)*(2+2));

        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(9));
    }
}
