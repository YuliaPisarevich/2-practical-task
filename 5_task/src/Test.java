public class Test {
    public static void main(String[] args) {
        int day = UserInput.nextInt("число");
        int month = UserInput.nextInt("месяц");
        int year = UserInput.nextInt("год");

        System.out.println("Дата следующего дня: " + Logic.getNextDay(day, month, year));

    }
}
