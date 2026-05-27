package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    ArrayList<String> arrList = new ArrayList<>();

    public void runProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.println("Enter a number for which action you want to do");
        int input = scanner.nextInt();
        switch (input) {
            case 0 -> scanner.close();
            case 1 -> addItem();
            case 2 -> removeItem();
        }
    }

    public void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add item(s) to list (comma delimited list)");
    }

    public void removeItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To remove any items (comma delimited list)");
    }
}
