public class Appliance {

    protected boolean hasWorkToDo;

    public Appliance() {
        this.hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends Appliance {

    public Refrigerator() {
    }

    public void orderFood() {
        if (super.hasWorkToDo) {
            System.out.println("The ice box ordered some food");
            super.setHasWorkToDo(false);
        }
    }
}

class DishWasher extends Appliance {

    public DishWasher() {
    }

    public void doDishes() {
        System.out.println("The dish washer finished washing the dishes");
        super.setHasWorkToDo(false);
    }
}

class CoffeeMaker extends Appliance {

    public CoffeeMaker() {
    }

    public void brewCoffee() {
        System.out.println("The coffee maker finished brewing the coffee");
        super.setHasWorkToDo(false);
    }
}
