import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest{

    private Plane plane;

    @BeforeEach
    public void setUp(){
        plane = new Plane("Boeing", true, 250000000L,
                500, true, "whoosh", 250,
                "British Airways", 2);
    }

    @Test
    public void canGetModel(){
        assertThat(plane.getModel()).isEqualTo("Boeing");
    }
    @Test
    public void canGetIsPublicTransport(){
        assertThat(plane.getIsPublicTransport()).isEqualTo(true);
    }
    @Test
    public void canGetValue(){
        assertThat(plane.getValue()).isEqualTo(250000000L);
    }
    @Test
    public void canGetTopSpeed(){
        assertThat(plane.getTopSpeed()).isEqualTo(500);
    }
    @Test
    public void canGetNeedsMaintenance(){
        assertThat(plane.getNeedsMaintenance()).isEqualTo(true);
    }
    @Test
    public void canGetSound(){
        assertThat(plane.getSound()).isEqualTo("whoosh");
    }
    @Test
    public void canGetNumberOfSeats(){
        assertThat(plane.getNumberOfSeats()).isEqualTo(250);
    }

    @Test
    public void canSetModel(){
        plane.setModel("Airbus");
        assertThat(plane.getModel()).isEqualTo("Airbus");
    }
    @Test
    public void canSetIsPublicTransport(){
        plane.setIsPublicTransport(false);
        assertThat(plane.getIsPublicTransport()).isEqualTo(false);
    }
    @Test
    public void canSetValue(){
        plane.setValue(200000000L);
        assertThat(plane.getValue()).isEqualTo(200000000L);
    }
    @Test
    public void canSetTopSpeed(){
        plane.setTopSpeed(600);
        assertThat(plane.getTopSpeed()).isEqualTo(600);
    }
    @Test
    public void canSetNeedsMaintenance(){
        plane.setNeedsMaintenance(false);
        assertThat(plane.getNeedsMaintenance()).isEqualTo(false);
    }
    @Test
    public void canSetSound(){
        plane.setSound("zooom");
        assertThat(plane.getSound()).isEqualTo("zooom");
    }
    @Test
    public void canSetNumberOfSeats(){
        plane.setNumberOfSeats(300);
        assertThat(plane.getNumberOfSeats()).isEqualTo(300);
    }

    @Test
    public void canPlaneMakeNoise(){
        assertThat(plane.makeSound()).isEqualTo("The Boeing's plane engines go whoosh.");
    }

    @Test
    public void canFly(){
        assertThat(plane.fly(200)).isEqualTo("The Boeing flies 200km.");
    }

}
