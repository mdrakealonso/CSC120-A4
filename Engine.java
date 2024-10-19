/**
 * This class represents an engine with a fuel type, 
 * a current fuel level, and a maximum fuel level
 */
public class Engine {
    
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /**
     * Constructor for the Engine class
     * @param fuelType the fuel type of an Engine that is 
     *                 one of STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER
     * @param maxFuel the fuel capacity of an Engine
     * @param currentFuel the current fuel level of an Engine
     */
    public Engine(FuelType fuelType, double maxFuel, double currentFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    /**
     * "Refuels" an Engine by changing the current fuel level to the maximum fuel level
     */
    void refuel(){
        currentFuel = maxFuel;
    }

    /**
     * Decreases the fuel level as long as the current fuel level is above 0
     * and as long as decreasing the fuel level will not cause it to go below 0
     * @return True if the fuel level has been succesfully decreased
     */
    public boolean go() {
        int fuelDecrease = 5;
        if(currentFuel > 0){
            if(currentFuel - fuelDecrease < 0) {
                currentFuel = 0;
                return false;
            } else {
                currentFuel-=fuelDecrease;
                System.out.println("The remaining fuel level is: " + currentFuel);
                return true;
            }
        } else {
            return false;
        }
    }
    /**
     * Main method for the Engine class
     * @param args array for command-line arguments
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 7.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}