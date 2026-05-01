public class Challenge {

    public static void main(String[] args) {
//        System.out.println((int) (1 / 10) );

//        System.out.println(sumDigits(1234));

//        System.out.println(hasSharedDigit(13, 12));

//        numberToWords(-12);
        printSquareStar(8);

    }

    public static int sumDigits(int num) {

        if (num < 0) {
            return -1;
        }

        if (num < 10) {
            return num;
        }

        int targetNum = num;
        int sum = 0;

        while (targetNum != 0) {
            int digit = targetNum % 10;
            sum += digit;
            targetNum /= 10;
        }

        return sum;
    }

    public static boolean isPalindrome(int num) {

        int tempNum = num;
        int reversedVal = 0;
        int digitCount = 0;


        while (tempNum != 0) {
            tempNum /= 10;
            digitCount += 1;
        }

        tempNum = num;


        while (tempNum != 0) {
            int digit = tempNum % 10;

            if (digitCount > 0) {
                reversedVal += digit * ((int) Math.pow( 10, (digitCount - 1)) );
            } else {
                reversedVal += digit;
            }

            tempNum /= 10;
            digitCount -= 1;
            System.out.println(reversedVal);
        }

        return num == reversedVal;
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        int last = num % 10;
        int first = 0;

        while (num != 0) {
            first = num % 10;
            num /= 10;
        }

        return last + first;
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        boolean num1InRange = number1 >= 10 && number1 <= 99;
        boolean num2InRange = number2 >= 10 && number2 <= 99;

        if ( !(num1InRange && num2InRange) ) {
            System.out.println("here");
            return false;
        }

        while (number1 != 0) {
            int num2 = number2;

            int digit = number1 % 10;
            number1 /= 10;

            while (num2 != 0) {
                int num = num2 % 10;
                num2 /= 10;

                if (digit == num) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ( (first < 10) || (second < 10) ) {
            return -1;
        }



        int divisor = Math.min(first, second);

        while (true) {

            boolean isDivisor = (first % divisor == 0) && (second % divisor == 0);

            if (!isDivisor) {
                break;
            }

            divisor -= 1;
        }

        return divisor;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {
            count += 1;
            number /= 10;
        }

        return count;
    }

    public static int reverse(int number) {
        int result = 0;
        int processingNum = (number >= 0) ? number : number * -1;
        int numCount = getDigitCount(processingNum);

        for (int i = numCount; i >= 1; i--) {

            int lastDigit = processingNum % 10;
            processingNum /= 10;
            int placement = 1;

            for (int j = 1; j < i; j++) {
                placement *= 10;
            }

            result += lastDigit * placement;
        }

        result = (number >= 0) ? result : result * -1;
        return result;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        String output = "";
        int reversedNum = reverse(number);
        int count = getDigitCount(number);

        while (count > 0) {
            int lastDigit = reversedNum % 10;


            switch (lastDigit) {
                case 0 -> output += "Zero ";
                case 1 -> output += "One ";
                case 2 -> output += "Two ";
                case 3 -> output += "Three ";
                case 4 -> output += "Four ";
                case 5 -> output += "Five ";
                case 6 -> output += "Six ";
                case 7 -> output += "Seven ";
                case 8 -> output += "Eight ";
                case 9 -> output += "Nine ";
            }

            reversedNum /= 10;
            count -= 1;
        }

        System.out.println(output);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if ((number % i) == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        if ((bigCount != 0) && (goal % (bigCount * 5) == 0) ) {
            return true;
        }

        if ((smallCount != 0) && (goal % smallCount == 0)) {
            return true;
        }

        if (bigCount * 5 + smallCount < goal) {
            return false;
        }

        if (goal - bigCount * 5 < 0) {
            return false;
        }

        return goal - bigCount * 5 <= smallCount;

    };

    public static int getLargestPrime(int number) {

        if (number <= 0 || number == 1) {
            return -1;
        }

        int result = -1;
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                int factor = number / i;
                int candidate = 0;
                if (isPrime(factor)) {
                    candidate = factor;
                } else {
                    continue;
                }

                if (candidate > result) {
                    result = candidate;
                }
            }
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printSquareStar(int num) {
        if (num < 5) {
            System.out.println("Invalid Value");
        }
        for (int row = 1; row <= num; row++) {
            String stars = "";
            boolean InFirstRow = (row == 1);
            boolean InLastRow = (row == num);
            for (int column = 1; column <= num; column++) {
                boolean InFirstColumn = (column == 1);
                boolean InLastColumn = (column == num);

                if (InFirstRow || InLastRow) {
                    stars += "*";
                } else if (InFirstColumn || InLastColumn) {
                    stars += "*";
                } else if (row == column) {
                    stars += "*";
                } else if (column == (num - row)) {
                    stars += " ";
                } else if (column == (num - row + 1)) {
                    stars += "*";
                } else {
                    stars += " ";
                }
            }

            System.out.println(stars);
        }
    }
}
