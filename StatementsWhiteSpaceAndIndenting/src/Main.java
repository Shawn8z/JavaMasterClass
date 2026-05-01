public class Main {

    public static void main(String[] args) {

        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.print("This is a test");

        System.out.print(
                "This is" +
                        " another" +
                        " still more."
        );

        int anotherVariable = 50;
        myVariable--;
        System.out.print("myVariable = " + myVariable);

        if (myVariable == 0) {
            System.out.println("It's now 0");
        }
    }
}
