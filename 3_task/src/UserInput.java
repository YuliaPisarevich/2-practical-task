import java.util.Scanner;

public class UserInput {
    public static char nextChar() {
        System.out.println("Введите букву");
        Scanner in = new Scanner(System.in);
        char letter = in.next().toLowerCase().charAt(0);
        return letter;
    }
}