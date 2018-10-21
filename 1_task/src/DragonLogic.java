public class DragonLogic {
    public static int solveNumOfHeads(int age) {
        int numOfHeads = 3;
        if (age < 200) {
            numOfHeads = headsAgeUpTo200(age, numOfHeads);
        } else if (age >= 200 && age < 300) {
            numOfHeads = headsAgeUpTo300(age, numOfHeads);
        } else {
            numOfHeads = headsAgeAfter300(age, numOfHeads);
        }
        return numOfHeads;
    }

    public static int headsAgeUpTo200(int age, int numOfHeads) {
        return numOfHeads + age * 3;
    }

    public static int headsAgeUpTo300(int age, int numOfHeads) {
        return numOfHeads + 199 * 3 + (age - 199) * 2;
    }

    public static int headsAgeAfter300(int age, int numOfHeads) {
        return numOfHeads + 199 * 3 + 100 * 2 + (age - 299);
    }

    public static int solveNumOfEyes(int numOfHeads) {
        return numOfHeads * 2;
    }

}
