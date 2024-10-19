import java.util.ArrayList;

/**
 * This class represents a train with a fuel type, fuel capacity, 
 * number of train cars, and passenger capacity.
 */
public class Train {

    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructor for the Train class
     * @param fuelType Engine fuel type that is one of
     *                 STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER
     * @param fuelCapacity Engine fuel capacity
     * @param nCars desired number of Train Cars
     * @param passengerCapacity desired passenger capacity for each Train Car
     */
    public Train(FuelType fuelType, double fuelCapacity, double currentFuel, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, currentFuel);
        this.cars = new ArrayList<>();
        for(int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Returns the Train Engine
     * @return The Engine with fuel type and capacity
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Returns the Train Car at index i
     * @param i The desired index
     * @return The Car at index i
     */
    public Car getCar(int i) {
        if(i < cars.size() && i > 0){
            return(cars.get(i));
        }
        return null;
    }

    /**
     * Returns the max capacity of all Train Cars
     * @return The maximum capacity of a Train (int)
     */
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car c : cars) {
            totalCapacity += c.getCapacity();
        }
        return totalCapacity;
    }

    /**
     * Returns the total number of seats remaining in all Train Cars
     * @return The total number of remaining seats (int)
     */
    public int seatsRemaining() {
        int totalSeatsRemaining = 0;
        for (Car c : cars) {
            totalSeatsRemaining += c.seatsRemaining();
        }
        return totalSeatsRemaining;
    }

    /**
     * Prints the manifest of all Passengers on a Train, 
     * or "This train has NO CARS." if the Train has no Passenger Cars.
     */
    void printManifest() {
        if(cars.isEmpty()) {
            System.out.println("This train has NO CARS.");
        } else {
            for(Car c : cars) {
                c.printManifest();
            }
        }
    }
}
