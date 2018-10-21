public class DragonLogic {
    private static final int TWO_HEAD_AGE = 200;
    private static final int ONE_HEAD_AGE = 300;
    private static final int EYES_NUMBER = 2;
    private static final int START_HEADS = 3;

    public static int solveNumOfHeads(int age) {
        int numOfHeads = START_HEADS;
        if (age < TWO_HEAD_AGE) {
            numOfHeads = headsAgeUpTo200(age, numOfHeads);
        } else if (age >= TWO_HEAD_AGE && age < ONE_HEAD_AGE) {
            numOfHeads = headsAgeUpTo300(age, numOfHeads);
        } else {
            numOfHeads = headsAgeAfter300(age, numOfHeads);
        }
        return numOfHeads;
    }

    private static int headsAgeUpTo200(int age, int numOfHeads) {
        return numOfHeads + age * 3;
    }

    private static int headsAgeUpTo300(int age, int numOfHeads) {
        return numOfHeads + 199 * 3 + (age - 199) * 2;
    }

    private static int headsAgeAfter300(int age, int numOfHeads) {
        return numOfHeads + 199 * 3 + 100 * 2 + (age - 299);
    }

    public static int solveNumOfEyes(int numOfHeads) {
        return numOfHeads * EYES_NUMBER;
    }

}
