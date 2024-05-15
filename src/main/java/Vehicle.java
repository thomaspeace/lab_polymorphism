public abstract class Vehicle {

    private String model;
    private boolean isPublicTransport;
    private long value;
    private int topSpeed;
    private boolean needsMaintenance;
    private String sound;
    private int numberOfSeats;

    public Vehicle(String model, boolean isPublicTransport,
                    long value, int topSpeed, boolean needsMaintenance,
                    String sound, int numberOfSeats){

        this.model = model;
        this.isPublicTransport = isPublicTransport;
        this.value = value;
        this.topSpeed = topSpeed;
        this.needsMaintenance = needsMaintenance;
        this.sound = sound;
        this.numberOfSeats = numberOfSeats;
    }


    public String getModel(){
        return this.model;
    }
    public boolean getIsPublicTransport(){
        return this.isPublicTransport;
    }
    public long getValue(){
        return this.value;
    }
    public int getTopSpeed(){
        return this.topSpeed;
    }
    public boolean getNeedsMaintenance(){
        return this.needsMaintenance;
    }
    public String getSound(){
        return this.sound;
    }
    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }


    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setIsPublicTransport(boolean changeIsPublicTransport){
        this.isPublicTransport = changeIsPublicTransport;
    }
    public void setValue(long newValue){
        this.value = newValue;
    }
    public void setTopSpeed(int newTopSpeed){
        this.topSpeed = newTopSpeed;
    }
    public void setNeedsMaintenance(boolean changeNeedsMaintenance){
        this.needsMaintenance = changeNeedsMaintenance;
    }
    public void setSound(String newSound){
        this.sound = newSound;
    }
    public void setNumberOfSeats(int newNumOfSeats){
        this.numberOfSeats = newNumOfSeats;
    }

    public abstract String makeSound();
}
