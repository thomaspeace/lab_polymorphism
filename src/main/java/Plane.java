public class Plane extends Vehicle implements Flyable{

    private String airline;
    private int numberOfWings;

    public Plane(String model, boolean isPublicTransport,
                 long value, int topSpeed, boolean needsMaintenance,
                 String sound, int numberOfSeats, String airline,
                 int numberOfWings){

        super(model, isPublicTransport, value, topSpeed,
                needsMaintenance, sound, numberOfSeats);
        this.airline = airline;
        this.numberOfWings = numberOfWings;
    }

    public String getAirline(){
        return this.airline;
    }
    public void setAirline(String newAirline){
        this.airline = newAirline;
    }

    public int getNumberOfWings(){
        return this.numberOfWings;
    }
    public void setNumberOfWings(int newNumberOfWings){
        this.numberOfWings = newNumberOfWings;
    }

    public String makeSound(){
        return "The " + this.getModel() + "'s plane engines go " + this.getSound() + ".";
    }

    public String fly(int distance){
        return "The " + this.getModel() + " flies " + distance + "km.";
    }
}
