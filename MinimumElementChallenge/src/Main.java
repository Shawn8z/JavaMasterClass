import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(readIntegers()));
//        int[] numArr = readIntegers();
//        System.out.println(findMin(numArr));
//        int[] test = {11, 2, 3, 5, 6, 7};
//        System.out.println(findMin(test));

//        System.out.println(readInteger());
        System.out.println(Arrays.toString(readElements(5)));
    }

//    public static int[] readIntegers() {
//        System.out.printf("Enter a list of numbers%n");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String[] strArr = input.split(",");
//        int len = strArr.length;
//        int[] numArr = new int[len];
//        for (int i = 0; i < len; i++) {
//            numArr[i] = Integer.parseInt(strArr[i].trim());
//        }
//        return numArr;
//    }

    private static int readInteger() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter an integer%n");
        return scan.nextInt();
    }

//    public static int findMin(int[] array) {
//        int min = Integer.MAX_VALUE;
//        for (int num : array) {
//            if (num < min) {
//                min = num;
//            }
//        }
//        return min;
//    }

    private static int[] readElements(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] resultArr = new int[length];
        for (int i = 0; i < length; i++) {
            int entriesLeft = length - i;
            System.out.printf("Enter a number for the array, %d to go%n", entriesLeft);
            resultArr[i] = scanner.nextInt();
        }
        return resultArr;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
}
