package dev.lpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Town Sydney = new Town("Sydney", 0);
        Town Adelaide = new Town("Adelaide", 1374);
        Town AliceSprings = new Town("Alice Springs", 2771);
        Town Brisbane = new Town("Brisbane", 917);
        Town Darwin = new Town("Darwin", 3972);
        Town Melbourne = new Town("Melbourne", 877);
        Town Perth = new Town("Perth", 3923);


        Town[] townArray = {Sydney, Adelaide, AliceSprings, Brisbane, Darwin, Melbourne, Perth};

        LinkedList<Town> townsList = new LinkedList<>(Arrays.asList(townArray));
        Town.sortTownByDistance(townsList);

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                       Available actions (select word or letter):
                       (F)orward
                       (B)ackward
                       (L)ist Places
                       (M)enu
                       (Q)uit
                    """);
        System.out.println("-".repeat(50));


        ListIterator<Town> townIterator = townsList.listIterator(1);
        boolean keepGoing = true;
        while (keepGoing) {
            String input = scanner.nextLine();
            switch (input) {
                case "F" -> {
                    if (!townIterator.hasNext()) {
                        System.out.println("Can't move any further, you are at the end");
                        break;
                    }
                    Town town = townIterator.next();
                    System.out.println("Moved forward to " + town);
                }
                case "B" -> {
                    if (!townIterator.hasPrevious()) {
                        System.out.println("Can't move back any further, you are at the start");
                        break;
                    }
                    Town town = townIterator.previous();
                    System.out.println("Moved Backwards to " + town);
                }
                case "L" -> {
                    System.out.println("Null");
                }
                case "M" -> {

                }
                case "Q" -> {
                    keepGoing = false;
                    scanner.close();
                }
            }
        }



    }

}

class Town {
    String name;
    int distanceFromSydney;

    public Town(String name, int distant) {
        this.name = name;
        this.distanceFromSydney = distant;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distanceFromSydney;
    }

    @Override
    public String toString() {
        return name +  " (" + distanceFromSydney + ")";
    }


    public static void move(String str, LinkedList<Town> list) {
        ListIterator<Town> townIterator = list.listIterator();
        if (str.equals("F")) {
            townIterator.next();
            System.out.println(townIterator);
        }
        if (str.equals("B")) {
            townIterator.previous();
            System.out.println(townIterator);
        }
    }

    public static void sortTownByDistance(LinkedList<Town> townsList) {
        townsList.sort(Comparator.comparing(Town::getDistance));
    }

}