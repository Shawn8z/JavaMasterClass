public class Challenge {

    public static void main(String[] args) {

//        int result1 = calculateHighScorePosition(1500);
//        displayHighScorePosition("Tim", result1);
//
//        int result2 = calculateHighScorePosition(999);
//        displayHighScorePosition("Mike", result2);
//
//        int result3 = calculateHighScorePosition(499);
//        displayHighScorePosition("Tom", result3);
//
//        int result4 = calculateHighScorePosition(99);
//        displayHighScorePosition("Rob", result4);
//
//        int result5 = calculateHighScorePosition(-1000);
//        displayHighScorePosition("Shaw", result5);
        boolean result = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

    public static void displayHighScorePosition(String playName, int positon) {
        System.out.println(playName + " managed to get into position " + positon + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        long num1Rounded = (long) (num1 * 1000);
        long num2Rounded = (long) (num2 * 1000);
        System.out.println(num1Rounded);
        System.out.println(num2Rounded);

        return num1Rounded == num2Rounded;
    }
}
