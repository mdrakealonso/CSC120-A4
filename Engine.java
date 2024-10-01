/**
 * This class represents an engine with a fuel type, 
 * a current fuel level, and a maximum fuel level
 */
public class Engine {
    
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    public Engine(FuelType fuelType, double maxFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
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
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}