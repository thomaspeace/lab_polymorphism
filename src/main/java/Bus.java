public class Bus extends Vehicle implements Driveable{

    private boolean acceptsBusPass;
    private String busType;
    private String fuelType;

    public Bus(String model, boolean isPublicTransport,
               long value, int topSpeed, boolean needsMaintenance,
               String sound, int numberOfSeats, boolean acceptsBusPass,
               String busType, String fuelType){

        super(model, isPublicTransport, value, topSpeed, needsMaintenance,
                sound, numberOfSeats);
        this.acceptsBusPass = acceptsBusPass;
        this.busType = busType;
        this.fuelType = fuelType;
    }

    public boolean getAcceptsBussPass(){
        return this.acceptsBusPass;
    }
    public void setAcceptsBusPass(boolean changeBusPass){
        this.acceptsBusPass = changeBusPass;
    }

    public String getBusType(){
        return this.busType;
    }
    public void setBusType(String newBusType){
        this.busType = newBusType;
    }

    public String getFuelType(){
        return this.fuelType;
    }
    public void setFuelType(String newFuelType){
        this.fuelType = newFuelType;
    }

    public String makeSound(){
        return "The " + this.getModel() + "'s engines go " + this.getSound() + ".";
    }

    public String drive(int distance){
        return "The " + this.getModel() + " drives " + distance + "km.";
    }

}
