package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Console main = new Console();
//        main.runProgram();

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItem(ArrayList<String> groceries) {

        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for (String item : items) {
            String trimmed = item.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries) {

        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            String trimmed = item.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printActions() {

        String textBlock = """
                    Available actions:
                    
                    0 - to shutdown
                    
                    1 - to add item(s) to list (comma delimited list)
                    
                    2 - to remove any items (comma delimited list)
                    
                    Enter a number for which action you want to do"):""";
        System.out.printf(textBlock + " ");
    }
}
