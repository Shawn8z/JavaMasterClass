public class Main {

    public static void main(String[] args) {

        MealOrder defaultOrder = new MealOrder();
        System.out.println(defaultOrder);

        defaultOrder.addToppings("Bacon", 1.5);
        defaultOrder.addToppings("Tomato", 1);
        defaultOrder.addToppings("Extra cheese", 1.2);
        defaultOrder.getDrink().setSize("Medium");
        defaultOrder.getDrink().setPrice(2);
        System.out.println(defaultOrder.getBurger().getToppings());
        System.out.println(defaultOrder);
    }
}
