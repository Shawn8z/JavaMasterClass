import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArr = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(testArr));
//        int[] resultArr = reverse(testArr);
//        System.out.println(Arrays.toString(resultArr));
        reverse(testArr);
        System.out.println(Arrays.toString(testArr));
    }

//    public static int[] reverse(int[] arr) {
//        int len = arr.length;
//        int[] resultArr = new int[len];
//        for (int i = len - 1; i >= 0; i--) {
//            int idx = len - 1 - i;
//            resultArr[idx] = arr[i];
//        }
//        return resultArr;
//    }

    private static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}
