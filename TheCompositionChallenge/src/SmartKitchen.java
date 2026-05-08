public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    private CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    private DishWasher getDishWasher() {
        return dishWasher;
    }

    private Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean isBrewMasterOn, boolean isDishWasherOn, boolean isIceBoxOn) {
        this.getBrewMaster().setHasWorkToDo(isBrewMasterOn);
        this.getDishWasher().setHasWorkToDo(isDishWasherOn);
        this.getIceBox().setHasWorkToDo(isIceBoxOn);
    }

    public void addWater() {
        this.getBrewMaster().setHasWorkToDo(true);
    }

    public void pourMilk() {
        this.getIceBox().setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        this.getDishWasher().setHasWorkToDo(true);
    }

    public void doKitchenWork() {
        this.getBrewMaster().brewCoffee();
        this.getDishWasher().doDishes();
        this.getIceBox().orderFood();
    }
}
