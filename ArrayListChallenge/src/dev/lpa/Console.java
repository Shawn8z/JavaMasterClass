package dev.lpa;

public class Console {

//    ArrayList<String> arrList = new ArrayList<>();
//
//    public void runProgram() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Available actions:");
//        System.out.println("0 - to shutdown");
//        System.out.println("1 - to add item(s) to list (comma delimited list)");
//        System.out.println("2 - to remove any items (comma delimited list)");
//        System.out.println("Enter a number for which action you want to do");
//        int input = scanner.nextInt();
//        switch (input) {
//            case 1 -> addItem();
//            case 2 -> removeItem();
//            default -> scanner.close();
//        }
//    }
//
//    public void addItem() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("To add item(s) to list (comma delimited list)");
//        String str = scanner.nextLine();
//        boolean hasComma = str.indexOf(',') != -1;
//        if (hasComma) {
//            String[] strArr = str.split(",");
//            for (String item : strArr) {
//                if (arrList.contains(item.trim())) continue;
//                arrList.add(item.trim());
//            }
//        } else {
//            if (arrList.contains(str)) return;
//            arrList.add(str);
//        }
//        arrList.sort(Comparator.naturalOrder());
//        System.out.println(arrList);
//        runProgram();
//    }
//
//    public void removeItem() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("To remove any items (comma delimited list)");
//        String str = scanner.nextLine();
//        boolean hasComma = str.indexOf(',') != -1;
//        if (hasComma) {
//            ArrayList<String> tempList = new ArrayList<>();
//            String[] strArr = str.split(",");
//            for (String item : strArr) {
//                tempList.add(item.trim());
//            }
//            arrList.removeAll(tempList);
//        } else {
//            arrList.remove(str.trim());
//        }
//        arrList.sort(Comparator.naturalOrder());
//        System.out.println(arrList);
//        runProgram();
//    }
}
