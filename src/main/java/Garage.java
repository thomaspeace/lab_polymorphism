import java.util.ArrayList;

public class Garage {

    private String name;
    private ArrayList<Vehicle> vehicles;

    public Garage(String name){
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }
    public void addVehicles(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int howManyVehicles(){
        return this.vehicles.size();
    }

    public long totalVehicleCost(){
        long total = 0L;
        for(int i = 0; i < this.vehicles.size(); i++){
            total += this.vehicles.get(i).getValue();
        }
        return total;
    }

    public String vehicleTypeCount(){
        int carTotal = 0; int busTotal = 0; int planeTotal = 0;
        for(Vehicle vehicle: this.vehicles){
            if(vehicle instanceof Car){
                carTotal += 1;
            } else if(vehicle instanceof Bus) {
                busTotal += 1;
            } else if (vehicle instanceof Plane) {
                planeTotal += 1;
            }
        }
        return "Cars: " + carTotal + ", Buses: " + busTotal + ", Planes: " + planeTotal;
    }
}
