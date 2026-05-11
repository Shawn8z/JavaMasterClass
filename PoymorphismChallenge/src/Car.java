public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        this.runEngine();
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, int batterySize, double avgKmPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }

//    @Override
//    public void startEngine() {
//        System.out.printf("%s turns on its electric motor, it shows there are %d%% percent battery left %n", super.getDescription(), this.batterySize);
//        this.runEngine();
//    }
//
//    @Override
//    public void drive(double km) {
//        super.drive(km);
//        double usedCharges = km * this.avgKmPerCharge;
//        if ((usedCharges - this.batterySize) <= 0) {
//            System.out.println("%s ran out of battery on the way, good luck finding a charger");
//            this.batterySize = 0;
//        }
//        this.batterySize -= usedCharges;
//        System.out.printf("Used %d charges from the battery", usedCharges);
//    }
//
//    @Override
//    protected void runEngine() {
//        System.out.printf("%s's power indicator light is on, but you don't hear a thing %n", super.getDescription());
//    }
}

class HybirdCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybirdCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

//    @Override
//    public void startEngine() {
//        super.startEngine();
//        System.out.printf("%s's all %d cylinders running at full speed vroom %n", super.getDescription(), this.cylinders);
//        System.out.printf("%s turns on its electric motor, it shows there are %d%% percent battery left %n", super.getDescription(), this.batterySize);
//    }
//
//    @Override
//    public void drive(double km) {
//        super.drive(km);
//    }
//
//    @Override
//    protected void runEngine() {
//        super.runEngine();
//    }
}


