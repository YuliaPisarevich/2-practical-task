import java.util.Scanner;

public class UserInput {
    public static double nextDouble(String coordinate) {
        System.out.println("Введите " + coordinate);
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }
}