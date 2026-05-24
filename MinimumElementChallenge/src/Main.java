import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(readIntegers()));
        int[] numArr = readIntegers();
        System.out.println(findMin(numArr));
//        int[] test = {11, 2, 3, 5, 6, 7};
//        System.out.println(findMin(test));
    }

    public static int[] readIntegers() {
        System.out.printf("Enter a list of numbers%n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArr = input.split(",");
        int len = strArr.length;
        int[] numArr = new int[len];
        for (int i = 0; i < len; i++) {
            numArr[i] = Integer.parseInt(strArr[i].trim());
        }
        return numArr;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
