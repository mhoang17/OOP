import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class testBMI{

    @Test
    public void BMI(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Write your name: ");
        String name = scan.nextLine();

        System.out.print("Enter weight: ");
        double weight = scan.nextDouble();

        System.out.print("Enter height: ");
        double height = scan.nextDouble();

        Person data = new Person(weight, height);

        System.out.println("The BMI of " +data.name+ " is: " +data.getBodyMassIndex(data.weight, data.height));

    }

    @Test
    public void classification(Person data){

        double result = data.getBodyMassIndex(data.weight, data.height);

        if(result < 19.5){
            System.out.println("You are under-weight.");
        }
        else if(result > 19.5 && result < 24.9){
            System.out.println("You are normal weight.");
        }
        else if(result > 25 && result < 29.9){
            System.out.println("You are over-weight.");
        }
        else{
            System.out.println("You are obese.");
        }
    }
}

