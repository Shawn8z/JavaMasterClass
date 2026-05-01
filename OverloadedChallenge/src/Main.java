public class Main {

    public static void main(String[] args) {

       // System.out.println("5 foot 7 inches equals " + covertToCentimeters(5, 7) + " centimeters");
    }

    public static double covertToCentimeters(int inch) {

        return (double) inch * 2.54 ;
    }

    public static double covertToCentimeters(int feet, int inches) {

        int feet2Inch = feet * 12 + inches;
        return covertToCentimeters(feet2Inch);
    }
}
