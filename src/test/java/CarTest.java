import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Ford", false,
                10000L, 140, false,
                "vroom", 5, 10000, "Petrol");
    }

    @Test
    public void canGetModel() {
        assertThat(car.getModel()).isEqualTo("Ford");
    }

    @Test
    public void canGetIsPublicTransport() {
        assertThat(car.getIsPublicTransport()).isEqualTo(false);
    }

    @Test
    public void canGetValue() {
        assertThat(car.getValue()).isEqualTo(10000L);
    }

    @Test
    public void canGetTopSpeed() {
        assertThat(car.getTopSpeed()).isEqualTo(140);
    }

    @Test
    public void canGetNeedsMaintenance() {
        assertThat(car.getNeedsMaintenance()).isEqualTo(false);
    }

    @Test
    public void canGetSound() {
        assertThat(car.getSound()).isEqualTo("vroom");
    }

    @Test
    public void canGetNumberOfSeats() {
        assertThat(car.getNumberOfSeats()).isEqualTo(5);
    }

    @Test
    public void canSetModel() {
        car.setModel("Toyota");
        assertThat(car.getModel()).isEqualTo("Toyota");
    }

    @Test
    public void canSetIsPublicTransport() {
        car.setIsPublicTransport(true);
        assertThat(car.getIsPublicTransport()).isEqualTo(true);
    }

    @Test
    public void canSetValue() {
        car.setValue(13000L);
        assertThat(car.getValue()).isEqualTo(13000L);
    }

    @Test
    public void canSetTopSpeed() {
        car.setTopSpeed(170);
        assertThat(car.getTopSpeed()).isEqualTo(170);
    }

    @Test
    public void canSetNeedsMaintenance() {
        car.setNeedsMaintenance(true);
        assertThat(car.getNeedsMaintenance()).isEqualTo(true);
    }

    @Test
    public void canSetSound() {
        car.setSound("honk");
        assertThat(car.getSound()).isEqualTo("honk");
    }

    @Test
    public void canSetNumberOfSeats() {
        car.setNumberOfSeats(3);
        assertThat(car.getNumberOfSeats()).isEqualTo(3);
    }

    @Test
    public void canMakeSound() {
        assertThat(car.makeSound()).isEqualTo("The Ford goes vroom.");
    }

    @Test
    public void canGetMileage() {
        assertThat(car.getMileage()).isEqualTo(10000);
    }

    @Test
    public void canSetMileage() {
        car.setMileage(15000);
        assertThat(car.getMileage()).isEqualTo(15000);
    }

    @Test
    public void canGetFuelType() {
        assertThat(car.getFuelType()).isEqualTo("Petrol");
    }

    @Test
    public void canSetFuelType() {
        car.setFuelType("Electric");
        assertThat(car.getFuelType()).isEqualTo("Electric");
    }

    @Test
    public void canDrive() {
        assertThat(car.drive(20)).isEqualTo("The Ford drives 20km.");


    }
}
