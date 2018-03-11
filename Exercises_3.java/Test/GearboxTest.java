import org.junit.jupiter.api.Test;

class GearboxTest {

    @Test
    void gearShiftTest() {

        int shift = 2;

        Gearbox gear = new Gearbox(-1);

        gear.gearShift(shift);

        try{
            gear.gearShift(shift);
        }catch (IllegalGearChangeException e){
            System.out.println("Gear outcome isn't valid.");
        }

    }
}