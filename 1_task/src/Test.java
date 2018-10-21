
public class Test {
    public static void main(String[] args) {
        int age = (int) UserInput.nextDouble();
        int numOfHeads = DragonLogic.solveNumOfHeads(age);
        int numOfEyes = DragonLogic.solveNumOfEyes(numOfHeads);

        View.Print("Количество голов дракона " + String.valueOf(numOfHeads));
        View.Print("Количество глаз дракона " + String.valueOf(numOfEyes));

    }
}
