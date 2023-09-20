import java.util.Date;

public class Format {
    public static void main(String[] args) {
        System.out.printf("%tA %tb %tc %n", new Date(), new Date(), new Date());

        System.out.printf("%1$tA %1$tb %1$tc %n", new Date());

        String user = "user";
        System.out.printf("Witaj %s, zostałeś zalogowany w %tA %2$tF", user, new Date());
    }
}
