import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(testArr));
        int[] resultArr = reverse(testArr);
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] reverse(int[] arr) {
        int len = arr.length;
        int[] resultArr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            int idx = len - 1 - i;
            resultArr[idx] = arr[i];
        }
        return resultArr;
    }
}
