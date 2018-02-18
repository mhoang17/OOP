import java.util.Scanner;

public class Feet_to_meters {

    public static final double FEET_IN_METERS = 0.3048;

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount of feet: ");
        double feet = scanner.nextDouble();
        double meters = feet * FEET_IN_METERS;
        System.out.println("Feet in meters: " +meters);
    }
}
