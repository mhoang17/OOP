public class Gearbox {

    int gear;

    public Gearbox(int gear) {
        assert gear != 0 : "The gear can't be zero";

        this.gear = gear;
    }

    public int getGear() {

        if(gear == 0){
            String msg = "Gear can't be zero.";
        }

        return gear;
    }

    public void gearShift(int shift){

        if(shift != 1 && shift != -1){

            int invalidShift = shift;

            throw new IllegalGearChangeException(invalidShift);

        }

        if(gear == 1 && shift == -1){

            shift = -2;

        }
        else if(gear == 1 && shift == 1){

            shift = 2;
        }

        gear += shift;

        if(gear > 6 || gear < -1 || gear == 0){

            int invalidShift = gear + shift;

            throw new IllegalGearChangeException(invalidShift);

        }

    }
}
