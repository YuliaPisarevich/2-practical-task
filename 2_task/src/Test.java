public class Test {
    public static void main(String[] args) {

        double x1 = UserInput.nextDouble("x1");
        double y1 = UserInput.nextDouble("y1");
        double x2 = UserInput.nextDouble("x2");
        double y2 = UserInput.nextDouble("y2");
        double x3 = UserInput.nextDouble("x3");
        double y3 = UserInput.nextDouble("y3");

        boolean resultTriangle = TriangleLogic.isTriangle(x1, y1, x2, y2, x3, y3);
        boolean resultRightTriangle = TriangleLogic.isRightTriangle(x1, y1, x2, y2, x3, y3);
        if (resultTriangle) {
            if (resultRightTriangle){
                System.out.println("Является прямоугольным треугольником");
            }else {
                System.out.println("Является треугольником, но не прямоугольным");
            }
        } else {
            System.out.println("Не является треугольником");
        }

    }
}
