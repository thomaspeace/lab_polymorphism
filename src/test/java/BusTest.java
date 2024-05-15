import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusTest {

    private Bus bus;

    @BeforeEach
    public void setUp(){
        bus = new Bus("Volvo", true, 100000L,
                75, false, "BEEEP", 32,
                true, "Bendy", "Petrol");
    }

    @Test
    public void canGetModel(){
        assertThat(bus.getModel()).isEqualTo("Volvo");
    }
    @Test
    public void canGetIsPublicTransport(){
        assertThat(bus.getIsPublicTransport()).isEqualTo(true);
    }
    @Test
    public void canGetValue(){
        assertThat(bus.getValue()).isEqualTo(100000L);
    }
    @Test
    public void canGetTopSpeed(){
        assertThat(bus.getTopSpeed()).isEqualTo(75);
    }
    @Test
    public void canGetNeedsMaintenance(){
        assertThat(bus.getNeedsMaintenance()).isEqualTo(false);
    }
    @Test
    public void canGetSound(){
        assertThat(bus.getSound()).isEqualTo("BEEEP");
    }
    @Test
    public void canGetNumberOfSeats(){
        assertThat(bus.getNumberOfSeats()).isEqualTo(32);
    }

    @Test
    public void canSetModel(){
        bus.setModel("Toyota");
        assertThat(bus.getModel()).isEqualTo("Toyota");
    }
    @Test
    public void canSetIsPublicTransport(){
        bus.setIsPublicTransport(false);
        assertThat(bus.getIsPublicTransport()).isEqualTo(false);
    }
    @Test
    public void canSetValue(){
        bus.setValue(130000L);
        assertThat(bus.getValue()).isEqualTo(130000L);
    }
    @Test
    public void canSetTopSpeed(){
        bus.setTopSpeed(100);
        assertThat(bus.getTopSpeed()).isEqualTo(100);
    }
    @Test
    public void canSetNeedsMaintenance(){
        bus.setNeedsMaintenance(true);
        assertThat(bus.getNeedsMaintenance()).isEqualTo(true);
    }
    @Test
    public void canSetSound(){
        bus.setSound("honk");
        assertThat(bus.getSound()).isEqualTo("honk");
    }
    @Test
    public void canSetNumberOfSeats(){
        bus.setNumberOfSeats(64);
        assertThat(bus.getNumberOfSeats()).isEqualTo(64);
    }

    @Test
    public void canGetBusPass(){
        assertThat(bus.getAcceptsBussPass()).isEqualTo(true);
    }
    @Test
    public void canSetBusPass(){
        bus.setAcceptsBusPass(false);
        assertThat(bus.getAcceptsBussPass()).isEqualTo(false);
    }

    @Test
    public void canGetBusType(){
        assertThat(bus.getBusType()).isEqualTo("Bendy");
    }
    @Test
    public void canSetBusType(){
        bus.setBusType("Double Decker");
        assertThat(bus.getBusType()).isEqualTo("Double Decker");
    }

    @Test
    public void canGetFuelType(){
        assertThat(bus.getFuelType()).isEqualTo("Petrol");
    }
    @Test
    public void canSetFuelType(){
        bus.setFuelType("Electric");
        assertThat(bus.getFuelType()).isEqualTo("Electric");
    }

    @Test
    public void canBusMakeSound(){
        assertThat(bus.makeSound()).isEqualTo("The Volvo's engines go BEEEP.");
    }

    @Test
    public void canDrive(){
        assertThat(bus.drive(20)).isEqualTo("The Volvo drives 20km.");
    }

}
