import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[] intArr = new int[5];
        for (int i = 0; i < intArr.length; i++) {
            int num = random.nextInt(100);
            intArr[i] = num;
        }
        int[] decIntArr = new int[5];
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        int len = intArr.length;
        for (int i = len - 1; i >= 0; i--) {
            decIntArr[len - 1 - i] = intArr[i];
        }
        System.out.println(Arrays.toString(decIntArr));
    }
}
