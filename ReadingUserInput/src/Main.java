import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int currentYear = 2026;
//
//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException e) {
//            System.out.println(getInputFromScanner(currentYear));
//        }

//        System.out.println(getInputFromScanner(currentYear));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year are you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);


        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year are you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125)
                    + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }


        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {

            try {
                String numRaw = scanner.nextLine();
                int num = Integer.parseInt(numRaw);
                count += 1;
                sum += num;
            } catch (NumberFormatException err) {
                if (count == 0) {
                    System.out.println("SUM = " + 0 + " AVG= " + 0);
                    break;
                }
                System.out.println("SUM = " + sum + " AVG= " + (sum / count));
                break;
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = width * height;
        double bucketsTotal = Math.ceil(wallArea / areaPerBucket);
        int bucketsNeeded = (int) (bucketsTotal - extraBuckets);
        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int bucketsTotal = (int) Math.ceil(area / areaPerBucket);

        return bucketsTotal;
    }
}
