public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            //System.out.println("This is not an alien!");
            //System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            //System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            //System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            //System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar == true) {
            //System.out.println("This is not supposed to happen");
        }


        double val1 = 20.00d;
        double val2 = 80.00d;
        double sum = (val1 + val2) * 100d;
        double remainder = sum % 40.00d;
        System.out.println(remainder);

        boolean hasRemainder = (remainder == 0) ? false : true;
        System.out.println(hasRemainder);

        if (hasRemainder) {
            System.out.println("got some remainder");
        }
    }

}
