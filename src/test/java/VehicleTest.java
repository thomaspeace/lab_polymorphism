//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class VehicleTest {
//
//    private Vehicle vehicle;
//
//    @BeforeEach
//    public void setUp(){
//        vehicle = new Vehicle("Ford", false,
//                10000L, 140, false,
//                "vroom", 5);
//    }
//
//    @Test
//    public void canGetModel(){
//        assertThat(vehicle.getModel()).isEqualTo("Ford");
//    }
//    @Test
//    public void canGetIsPublicTransport(){
//        assertThat(vehicle.getIsPublicTransport()).isEqualTo(false);
//    }
//    @Test
//    public void canGetValue(){
//        assertThat(vehicle.getValue()).isEqualTo(10000L);
//    }
//    @Test
//    public void canGetTopSpeed(){
//        assertThat(vehicle.getTopSpeed()).isEqualTo(140);
//    }
//    @Test
//    public void canGetNeedsMaintenance(){
//        assertThat(vehicle.getNeedsMaintenance()).isEqualTo(false);
//    }
//    @Test
//    public void canGetSound(){
//        assertThat(vehicle.getSound()).isEqualTo("vroom");
//    }
//    @Test
//    public void canGetNumberOfSeats(){
//        assertThat(vehicle.getNumberOfSeats()).isEqualTo(5);
//    }
//
//    @Test
//    public void canSetModel(){
//        vehicle.setModel("Toyota");
//        assertThat(vehicle.getModel()).isEqualTo("Toyota");
//    }
//    @Test
//    public void canSetIsPublicTransport(){
//        vehicle.setIsPublicTransport(true);
//        assertThat(vehicle.getIsPublicTransport()).isEqualTo(true);
//    }
//    @Test
//    public void canSetValue(){
//        vehicle.setValue(13000L);
//        assertThat(vehicle.getValue()).isEqualTo(13000L);
//    }
//    @Test
//    public void canSetTopSpeed(){
//        vehicle.setTopSpeed(170);
//        assertThat(vehicle.getTopSpeed()).isEqualTo(170);
//    }
//    @Test
//    public void canSetNeedsMaintenance(){
//        vehicle.setNeedsMaintenance(true);
//        assertThat(vehicle.getNeedsMaintenance()).isEqualTo(true);
//    }
//    @Test
//    public void canSetSound(){
//        vehicle.setSound("honk");
//        assertThat(vehicle.getSound()).isEqualTo("honk");
//    }
//    @Test
//    public void canSetNumberOfSeats(){
//        vehicle.setNumberOfSeats(3);
//        assertThat(vehicle.getNumberOfSeats()).isEqualTo(3);
//    }
//
//    @Test
//    public void canMakeSound(){
//        assertThat(vehicle.makeSound()).isEqualTo("The Ford goes vroom.");
//    }
//
//}
