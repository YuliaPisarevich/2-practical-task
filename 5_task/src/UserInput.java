import java.util.Scanner;

public class UserInput {
    public static int nextInt(String str) {
        System.out.println("Введите "+str);
        Scanner in = new Scanner(System.in);
        int letter = in.nextInt();
        return letter;
    }
}