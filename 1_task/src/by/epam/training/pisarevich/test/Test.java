package by.epam.training.pisarevich.test;

        import by.epam.training.pisarevich.input.UserInput;
        import by.epam.training.pisarevich.model.logic.DragonLogic;
        import by.epam.training.pisarevich.view.View;

public class Test {
    public static void main(String[] args) {
        int age = (int) UserInput.nextDouble();
        int numOfHeads = DragonLogic.solveNumOfHeads(age);
        int numOfEyes = DragonLogic.solveNumOfEyes(numOfHeads);

        View.Print("Количество голов дракона " + String.valueOf(numOfHeads));
        View.Print("Количество глаз дракона " + String.valueOf(numOfEyes));

    }
}
