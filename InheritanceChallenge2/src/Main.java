public class Main {

    public static void main(String[] args) {

        SalariedEmployee mike = new SalariedEmployee("Mike", "1976/02/15", "2012/04/01", 35000 );
        mike.retire();

        System.out.println(mike);
        System.out.println("Mike got paied " + mike.collectPay());
    }
}

class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {};

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthDate, String endDate) {
        this(name, birthDate);
        this.endDate = endDate;
    }

    public int getAge() {
        int age = 2026 - Integer.parseInt(this.birthDate);
        return age;
    }

    public double collectPay() {
        return 500.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

class Employee extends Worker {

    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        String date = "xx/xx/xxxx";
        this.isRetired = true;
        super.terminate(date);
    }

    @Override
    public double collectPay() {
        return (int) annualSalary / 26;
    }

    @Override
    public String toString() {
        System.out.println();
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}


