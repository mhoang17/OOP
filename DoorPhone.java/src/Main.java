import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Set how many floors there is
        Building building1 = new Building(6);

        int[] aptFloorArray = new int[building1.getNumOfAptFloors()];

        // Create an array that contains number of floors
        for(int i = 0; i < building1.getNumOfAptFloors(); i++){

            aptFloorArray[i] = i + 1;
        }

        building1.setAptFloor(aptFloorArray);

        // Print Apartments
        System.out.println("Apartments");

        for(int i = 1; i <= building1.getNumOfAptFloors(); i++){

            System.out.print(i+ "tv, ");
            System.out.print(i+ "m, ");
            System.out.println(i+ "th");

        }

        // User input

        Scanner scan = new Scanner(System.in);

        boolean done = false;

        while(!done){

            try{

                System.out.println();

                System.out.print("Enter floor: ");
                int aptFloorChoice = scan.nextInt();

                System.out.print("Enter apartment: ");
                String aptChoice = scan.next();

                building1.call(aptFloorChoice, aptChoice);

                System.out.println("Hello?");

                done = true;

            } catch (IllegalAptException e){
                System.out.println("Apartment chosen doesn't exist. Try again.");
            }
        }

    }

}
