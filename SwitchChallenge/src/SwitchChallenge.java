public class SwitchChallenge {

    public static void main(String[] args) {

        char character = 'B';

//        switch (character) {
//            case 'A':
//                System.out.println("Able");
//                break;
//            case 'B':
//                System.out.println("Baker");
//                break;
//            case 'C':
//                System.out.println("Charlie");
//                break;
//            case 'D':
//                System.out.println("Dog");
//                break;
//            case 'E':
//                System.out.println("Easy");
//                break;
//            default:
//                System.out.println("Message with letter " + character + " is not found");
//        }

        printDayOfWeek(6);
    }

    public static void printDayOfWeek(int day) {

       String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuseday";
            case 3 -> "Wednsday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6 -> { yield "Saturday"; }
            default -> "Invalide day";
        };

        System.out.println("Its " + dayOfTheWeek + " with value " + day);
    }
}
