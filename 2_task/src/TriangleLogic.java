public class TriangleLogic {
    public static boolean isTriangle(double x1, double y1,
                                     double x2, double y2,
                                     double x3, double y3) {
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        boolean result;
        if (a < b + c && b < a + c && c < a + b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean isRightTriangle(double x1, double y1,
                                          double x2, double y2,
                                          double x3, double y3) {
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        boolean result=true;
        if (a > b && a > c) {
            result = isPythagoras(a, b, c);

        } else if (b > a && b > c) {
            result = isPythagoras(b, c, a);

        } else if (c > a && c > b) {
            result = isPythagoras(c, a, b);
        }
        return result;
    }

    public static boolean isPythagoras(double hypotenuse, double leg1, double leg2) {
        return Math.pow(hypotenuse, 2) == Math.pow(leg1, 2) + Math.pow(leg2, 2);
    }
}
