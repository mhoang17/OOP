import java.util.Arrays;
import java.util.stream.IntStream;

public class Building implements DoorPhone {

    private int numOfAptFloors;

    private int[] aptFloors;

    private String[] apt = {"tv", "m", "th"};

    // Constructor
    public Building(int numOfAptFloors) {

        this.numOfAptFloors = numOfAptFloors;
    }

    // Getters and Setters
    @Override
    public int getNumOfAptFloors() {

        return numOfAptFloors;
    }

    @Override
    public void setAptFloor(int[] aptFloors) {

        this.aptFloors = aptFloors;
    }

    @Override
    public int[] getAptFloor() {

        return aptFloors;
    }

    @Override
    public String[] getApt() {

        return apt;
    }

    // Call apt method
    @Override
    public void call(int aptFloor, String apt) {

        if(!IntStream.of(aptFloors).anyMatch(n -> n == aptFloor)){
            throw new IllegalAptException();
        }

        if(!Arrays.asList(this.apt).contains(apt)){
            throw new IllegalAptException();
        }

    }

}
