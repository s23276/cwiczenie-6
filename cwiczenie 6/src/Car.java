public class Car extends Vehicle {
    double milesDriven;
    double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / fuelConsumed;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 500, 25);
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");
    }
}

