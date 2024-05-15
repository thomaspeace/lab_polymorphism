import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest{

    private Garage garage;

    @BeforeEach
    public void setUp(){
        garage = new Garage("Gary's Garage");
    }

    @Test
    public void canGetName(){
        assertThat(garage.getName()).isEqualTo("Gary's Garage");
    }

    @Test
    public void canSetName(){
        garage.setName("A Different Garage");
        assertThat(garage.getName()).isEqualTo("A Different Garage");
    }

    @Test
    public void canGetEmptyVehicleList(){
        assertThat(garage.getVehicles().isEmpty()).isEqualTo(true);
    }

    @Test
    public void canAddVehicleToVehicleList(){
        Car car = new Car("Ford", false,
                10000L, 140, false,
                "vroom", 5, 10000, "Petrol");
        garage.addVehicles(car);
        assertThat(garage.getVehicles().size()).isEqualTo(1);
    }

    @Test
    public void canGetTotalVehicleCost(){
        Car car = new Car("Ford", false,
                10000L, 140, false,
                "vroom", 5, 10000, "Petrol");
        Plane plane = new Plane("Boeing", true, 250000000L,
                500, true, "whoosh", 250,
                "British Airways", 2);
        Bus bus = new Bus("Volvo", true, 100000L,
                75, false, "BEEEP", 32,
                true, "Bendy", "Petrol");
        garage.addVehicles(car);
        garage.addVehicles(plane);
        garage.addVehicles(bus);
        assertThat(garage.totalVehicleCost()).isEqualTo(250110000L);
    }
    @Test
    public void canGetVehicleTypeCount(){
        Car car1 = new Car("Ford", false,
                10000L, 140, false,
                "vroom", 5, 10000, "Petrol");
        Car car2 = new Car("Ferrari", false,
                150000L, 220, true,
                "VRROOOM", 2, 100, "Petrol");
        Bus bus = new Bus("Volvo", true, 100000L,
                75, false, "BEEEP", 32,
                true, "Bendy", "Petrol");
        garage.addVehicles(car1);
        garage.addVehicles(car2);
        garage.addVehicles(bus);
        assertThat(garage.vehicleTypeCount()).isEqualTo("Cars: 2, Buses: 1, Planes: 0");
    }



}
