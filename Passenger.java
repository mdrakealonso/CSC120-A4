/**
 * This class represents a passenger with a name.
 */
public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Gets the name of a Passenger
     * @return the name (String)
     */
    public String getName() {
        return name;
    }

    /**
     * Allows a Passenger to board a Train Car by adding the Passenger to an ArrayList of Passengers
     * @param c a Car object
     * @return True if the Passenger has succesfully "boarded" the Car
     */
    public boolean boardCar(Car c) {
        return c.addPassenger(this);
    }

    /**
     * Allows a Passenger to get off a Train Car by removing the Passenger from the ArrayList
     * @param c a Car object
     * @return True if the Passenger has succesfully gotten off the Car
     */
    public boolean getOffCar(Car c) {
        return c.removePassenger(this);
    }
}