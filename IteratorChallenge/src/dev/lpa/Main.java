package dev.lpa;

import java.util.Arrays;
import java.util.LinkedList;

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

        Town.sortTowns(townsList);

//        townsList.sort(Comparator.comparing(Town::getDistance));
//        System.out.println(townsList);
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

    public static LinkedList<Town> sortTowns(LinkedList<Town> list) {
        var iterator = list.listIterator(1);
        while (iterator.hasNext()) {


        }
        return list;
    }
}