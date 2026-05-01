import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;


        boolean validInt = false;

        do {
            System.out.println("Enter number #" + count + ": ");
            try {
                String numRaw = scanner.nextLine();
                double num = Double.parseDouble(numRaw);
                validInt = true;
                count += 1;
                sum += num;
            } catch (NumberFormatException err) {
                System.out.println("Invalid number");
            }
        } while (!validInt || count <= 5);

        System.out.println("The total sum is " + sum);
    }
}
