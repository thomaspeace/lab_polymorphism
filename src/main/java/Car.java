public class Car extends Vehicle implements Driveable{

    private int mileage;
    private String fuelType;

    public Car(String model, boolean isPublicTransport,
               long value, int topSpeed, boolean needsMaintenance,
               String sound, int numberOfSeats, int mileage,
               String fuelType){
        super(model, isPublicTransport, value, topSpeed, needsMaintenance,
                sound, numberOfSeats);
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    public int getMileage(){
        return this.mileage;
    }
    public void setMileage(int newMileage){
        this.mileage = newMileage;
    }

    public String getFuelType(){
        return this.fuelType;
    }
    public void setFuelType(String newFuelType){
        this.fuelType = newFuelType;
    }

    public String makeSound() {
        return "The " + this.getModel() + " goes " + this.getSound() + ".";
    }

    public String drive(int distance){
        return "The " + this.getModel() + " drives " + distance + "km.";
    }
}
