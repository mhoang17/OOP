import java.util.Scanner;

public class Fahrenheit_Celsius {

    public static final int ZERO_CELSIUS_IN_FAHRENHEIT = 32;

    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        double input = scanner.nextDouble();

        System.out.println("1: Convert Fahrenheit to Celsius");
        System.out.println("2: Convert Celsius to Fahrenheit");
        System.out.print("Choice: ");

        //User input
        int choice = scanner.nextInt();

        switch (choice) {
            //Convert fahrenheit to celsius
            case 1:
                fahrenheit = input;
                celsius = (fahrenheit - ZERO_CELSIUS_IN_FAHRENHEIT)/1.8;
                System.out.println(fahrenheit+ " degrees Fahrenheit is " +celsius+ " degrees Celsius ");
                break;

            //Convert celsius to fahrenheit
            case 2:
                celsius = input;
                fahrenheit = celsius * 1.8 + ZERO_CELSIUS_IN_FAHRENHEIT;
                System.out.println(celsius+ " degrees Celsius is " +fahrenheit+ " degrees Fahrenheit ");
                break;

            //Default option
            default:
                System.out.println("Not a choice.");
                break;
        }
    }
}