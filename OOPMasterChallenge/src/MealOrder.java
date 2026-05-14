public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem side;
    private boolean isDeluxe = false;
    private double orderTotal = 0;

    public MealOrder() {
        this.burger = new Burger("Common", 5);
        this.drink = new Drink("coke", "small", 1);
        this.side = new SideItem("fries", 1.5);
        this.orderTotal += (burger.getPrice() + drink.getPrice() + side.getPrice());
    }

    public MealOrder(Burger burger, Drink drink, SideItem side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        this.orderTotal += (burger.getPrice() + drink.getPrice() + side.getPrice());
    }

    public MealOrder(DeluxeBurger deluxe, Drink drink, SideItem side) {
        this.isDeluxe = true;
        this.burger = deluxe;
        this.drink = drink;
        this.side = side;
        this.orderTotal += (burger.getPrice() + drink.getPrice() + side.getPrice());
    }

    public void addToppings(String topping, double price) {
        this.burger.addTopping(topping, price);
    }

    @Override
    public String toString() {
        return "MealOrder details --" +
                " burger -" + burger.toString() +
                ", drink -" + drink.toString() +
                ", side -" + side.toString() +
                ", orderTotal = " + orderTotal;
    }
}

class Toppings {

    protected String topping1;
    protected String topping2;
    protected String topping3;

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
        String baseStr = " ";
        if (!this.topping1.isEmpty()) {
            baseStr.concat(this.topping1 + " ");
        } else if (!this.topping1.isEmpty()) {
            baseStr.concat(this.topping2 + " ");
        } else if (!this.topping3.isEmpty()) {
            baseStr.concat(this.topping3 + " ");
        }
        return "No extra toppings";
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
        String baseStr = " ";
        if (!this.topping1.isEmpty()) {
            baseStr.concat(this.topping1 + " ");
        } else if (!this.topping1.isEmpty()) {
            baseStr.concat(this.topping2 + " ");
        } else if (!this.topping3.isEmpty()) {
            baseStr.concat(this.topping3 + " ");
        } else if (!this.extraTopping1.isEmpty()) {
            baseStr.concat(this.extraTopping1 + " ");
        } else if (!this.extraTopping2.isEmpty()) {
            baseStr.concat(this.extraTopping2 + " ");
        }
        return "No extra toppings";
    }
}

class Burger {

    protected String type;
    protected Toppings toppings;
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

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String baseStr = " " + this.type + " with ";
        return " " + this.type + " with " + this.toppings.toString();
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
        if (result == -1) {
            System.out.println("You can't add anymore toppings");
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {
        String baseStr = "Burger: " + this.type + " with ";
        return " " + this.type + " with " + this.toppings.toString();
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

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " " + this.size + " " + this.type;
    }

}

class SideItem {

    private String type;
    private double price;

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " " + this.type;
    }
}
