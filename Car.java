//class and object

public class Car {
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuelInLitre;
    int noOfSeat;

    public Car start() {
    if(currentFuelInLitre == 0){
        System.out.println("car is out of fuel, can not start");
    } else if (currentFuelInLitre < 5){
        System.out.println("car is reserved mode, please refuel");
    } else {
        System.out.println("car is started....bruhhh....");
    }
    return this;
}

    public void drive() {
    currentFuelInLitre--;
            System.out.println("car is driving");

    }

    public void addFuel(float fuel) {
        currentFuelInLitre += fuel;
    }
    public float getCurrentFuelInLitre(){
        return currentFuelInLitre;
    }

}
