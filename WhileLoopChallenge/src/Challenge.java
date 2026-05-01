public class Challenge {

    public static void main(String[] args) {

        int i = 5;
        int count = 0;
        int totalEven = 0;
        while (i <= 20) {
            count++;
            if (isEvenNumber(i)) {
                totalEven++;
                System.out.println(i);
            }

            if (totalEven == 5) {
                break;
            }

            i += 1;
        }

        System.out.println("Total even " + totalEven);
        System.out.println("Output " + count);
    }

    public static boolean isEvenNumber(int num) {

        return num % 2 == 0;
    }


}
