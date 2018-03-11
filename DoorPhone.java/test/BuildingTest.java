import org.junit.jupiter.api.Test;

class BuildingTest {

    @Test
    public void buildingTest(){

        // Set how many floors there is
        Building building1 = new Building(6);

        int[] aptFloorArray = new int[building1.getNumOfAptFloors()];

        // Create an array that contains number of floors
        for(int i = 0; i < building1.getNumOfAptFloors(); i++){

            aptFloorArray[i] = i + 1;
        }

        building1.setAptFloor(aptFloorArray);

        // Test variables
        int aptFloorChoice = 1;

        String aptChoice = "m";

        building1.call(aptFloorChoice, aptChoice);

    }

}