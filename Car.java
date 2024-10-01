import java.util.ArrayList;

/**
 * This class represents a Train Car with an ArrayList 
 * of current passengers and a maxium capacity
 */
public class Car {

    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    public Car(int maxCapacity) {
        this.passengers = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    /**
     * Returns the maxium capacity of a Car
     * @return The maxium capacity
     */
    public int getCapacity(){
        return maxCapacity;
    }

    /**
     * Returns the number of seats remaining on a train car
     * @return The number of remaining seats
     */
    public int seatsRemaining(){
        return maxCapacity - passengers.size();
    }

    /**
     * Adds a Passenger to a train car if there are seats remaining
     * @param p A Passenger
     * @return True if the Passenger has been succesfully added to a Car
     */
    public boolean addPassenger(Passenger p) {
        if(seatsRemaining() > 0){
            passengers.add(p);
            return true;
        } else {
            System.out.println("This car is full, look somewhere else.");
            return false;
        }
    }

    /**
     * Removes a Passenger from a train car if they are found in the ArrayList
     * @param p A Passenger
     * @return True if the Passenger has been succesfully removed from a Car
     */
    public boolean removePassenger(Passenger p) {
        if(passengers.contains(p)) {
            passengers.remove(p);
            return true;
        } else {
            System.out.println("This passenger is nowhere to be found.");
            return false;
        }
    }

    /**
     * Prints the manifest of all Passengers on a Car, 
     * or "This car is EMPTY." if the Car has no Passengers
     */
    void printManifest() {
        if(passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            for(Passenger p : passengers) {
                System.out.println(p.getName());
            }
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car(1);
        Passenger newPassenger = new Passenger("Harry");
        Passenger anotherPassenger = new Passenger("Hermione");
        System.out.println(myCar.seatsRemaining());
        myCar.addPassenger(newPassenger);
        myCar.addPassenger(anotherPassenger);
        //myCar.printManifest();
        //myCar.removePassenger(newPassenger);
        myCar.printManifest();
    }
}