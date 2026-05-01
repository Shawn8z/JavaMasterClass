import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        boolean isInt = true;

        while (isInt) {
            System.out.println("Type a number or type any character to end:");
            String numRaw = scanner.nextLine();

            try {
                int num = Integer.parseInt(numRaw);
                if (maxNum < num) {
                    maxNum = num;
                }
                if (minNum > num) {
                    minNum = num;
                }

                System.out.println("Max number: " + maxNum + " Min number: " + minNum);
            } catch (NumberFormatException err) {
                System.out.println("None integer input detected, ending loop o/");
                isInt = false;
            }

        }
    }
}

