public class Truck extends Vehicle {
    double milesDriven;
    double fuelConsumed;
    double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }

    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2018, 400, 30, 2);
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles per gallon");
    }
}
