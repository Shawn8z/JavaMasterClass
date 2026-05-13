public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem side;

    public MealOrder() {
        this.burger = new Burger("Common", 5);
        this.drink = new Drink("coke", "small", 1);
        this.side = new SideItem("fries", 1.5);
    }

}

class Toppings {

    private String topping1;
    private String topping2;
    private String topping3;

    public Toppings() {
        this.topping1 = "";
        this.topping2 = "";
        this.topping3 = "";
    }

    public int addToppings(String topping) {
        if (this.topping1.isEmpty()) {
            this.topping1 = topping;
            return 0;
        } else if (this.topping2.isEmpty()) {
            this.topping2 = topping;
            return 0;
        } else if (this.topping3.isEmpty()) {
            this.topping3 = topping;
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "topping1='" + topping1 + '\'' +
                ", topping2='" + topping2 + '\'' +
                ", topping3='" + topping3 + '\'' +
                '}';
    }
}

class DeluxToppings extends Toppings {

    private String extraTopping1;
    private String extraTopping2;

    public DeluxToppings() {
        super();
        this.extraTopping1 = "";
        this.extraTopping2 = "";
    }

    @Override
    public int addToppings(String topping) {
        int result = super.addToppings(topping);
        if (result == -1) {
            if (this.extraTopping1.isEmpty()) {
                this.extraTopping1 = topping;
                return 0;
            } else if (this.extraTopping2.isEmpty()) {
                this.extraTopping2 = topping;
                return 0;
            } else {
                return -1;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "DeluxToppings{" +
                "extraTopping1='" + extraTopping1 + '\'' +
                ", extraTopping2='" + extraTopping2 + '\'' +
                "} " + super.toString();
    }
}

class Burger {

    private String type;
    private Toppings toppings;
    protected double price;

    public Burger(String type, double price) {
        this.type = type;
        this.toppings = new Toppings();
        this.price = price;
    }

    public int addTopping(String topping, double price) {
        int result = this.toppings.addToppings(topping);
        if (result == -1) return result;
        this.price += price;
        return 0;
    }

}

class DeluxeBurger extends Burger {

    private DeluxToppings toppings;

    public DeluxeBurger(double price) {
        super("DeluxeBurger", price);
        this.toppings = new DeluxToppings();
    }

    @Override
    public int addTopping(String topping, double price) {
        int result = toppings.addToppings(topping);
        super.price += price;
        if (result == -1) {
            System.out.println("You can't add anymore toppings");
            return result;
        }
        return 0;
    }

}

class Drink {

    private String type;
    private String size;
    private double price;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }
}

class SideItem {

    private String type;
    private double price;

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }
}
