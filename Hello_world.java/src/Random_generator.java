import java.util.Random;
import java.util.Scanner;

public class Random_generator {

    public static final int MINIMUM = 1;
    public static final int MAX = 100;

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a integer from 1 to 100: ");
        int choice = scan.nextInt();

        int result = rand.nextInt(MAX) + MINIMUM;

        System.out.println("Number is: " +result);

        if(choice == result){
            System.out.println("You guessed correctly!");
        }
        else{
            System.out.println("Wrong guess.");
        }
    }
}
