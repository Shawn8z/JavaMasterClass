import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        int[] numArr = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            int count = size - i;
            System.out.printf("Enter a number %d slot remaining%n", count);
            numArr[i] = scanner.nextInt();
        }
        return numArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d contents %d%n", i, arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int temp;
        int len = arr.length - 1;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < len; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return arr;
    }
}
