import java.util.Scanner;

public class UserInput {
    public static double nextDouble() {
        System.out.println("Введите возраст дракона");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        if (num < 0){
            num = Math.abs(num);
            System.out.println("Отрицательный возраст невозможен. Подсчет для возраста равному " + num);
        }
        return num;
    }
}
