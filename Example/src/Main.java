import java.util.Scanner;

public class Main {

    public static final int CM_IN_METERS = 100;
    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        //BMI();
        //vector();
        //strength();
    }

    public static void BMI(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter weight: ");
        double weight = scan.nextDouble();

        System.out.print("Enter height: ");
        double height = scan.nextDouble();

        Person data = new Person(weight, (height/CM_IN_METERS));

        System.out.println("The BMI of " +data.name+ " is: " +data.getBodyMassIndex(data.weight, data.height));

        classification(data);
    }

    public static void classification(Person data){

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

    public static void vector(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coordinates for vector A");
        System.out.print("Coordinate 1: ");
        int a1 = scan.nextInt();
        System.out.print("Coordinate 2: ");
        int a2 = scan.nextInt();

        System.out.println("Enter coordinates for vector B");
        System.out.print("Coordinate 1: ");
        int b1 = scan.nextInt();
        System.out.print("Coordinate 2: ");
        int b2 = scan.nextInt();

        Vector vectorA = new Vector(a1, a2);
        Vector vectorB = new Vector(b1, b2);

        vectorAddition(vectorA, vectorB);
        vectorSubtraction(vectorA, vectorB);
        scalar(vectorA, vectorB);
    }

    public static void vectorAddition(Vector vectorA, Vector vectorB){

        System.out.print("The two vectors added together: ");
        System.out.print(vectorA.vectorAd(vectorA.coordinate1, vectorB.coordinate1)+ ", ");
        System.out.println(vectorB.vectorAd(vectorA.coordinate2, vectorB.coordinate2));
    }

    public static void vectorSubtraction(Vector vectorA, Vector vectorB){

        System.out.print("The two vectors subtracted from each other: ");
        System.out.print(vectorA.vectorSub(vectorA.coordinate1, vectorB.coordinate1)+ ", ");
        System.out.println(vectorB.vectorSub(vectorA.coordinate2, vectorB.coordinate2));
    }

    public static void scalar(Vector vectorA, Vector vectorB){
        int scalarP = vectorA.vectorAd(vectorA.coordinate1, vectorB.coordinate1) + vectorB.vectorAd(vectorA.coordinate2, vectorB.coordinate2);
        System.out.println("The scalar product of these two vectors is: " +scalarP);
    }

    public static void strength(){
        Scanner scan = new Scanner(System.in);
        Password password = new Password();

        System.out.print("Enter password: ");

        String input = scan.nextLine();

        if(input.length() < PASSWORD_LENGTH){
            System.out.println("Password is too short.");
            System.exit(0);
        }
        else{

            for(int i = 0; i < input.length(); i++){
                if(Character.isLetter(input.charAt(i))){
                    password.alphaStrength++;
                }
                if(Character.isDigit(input.charAt(i))){
                    password.digitStrength++;
                }
                if(!Character.isLetter(input.charAt(i)) && !Character.isDigit(input.charAt(i))){
                    password.elseStrength++;
                }
            }

            if(password.digitStrength >= 1 && password.elseStrength >= 1){
                System.out.println("Password is strong.");
            }
            else if(password.digitStrength < 1 && password.elseStrength < 1){
                System.out.println("Password is weak.");
                System.out.println("Please have at least one digit and one non-digit and non-letter character in your password");
            }
            else if(password.digitStrength < 1){
                System.out.println("Password is weak.");
                System.out.println("Please have at least one digit in your password.");
            }
            else{
                System.out.println("Password is weak.");
                System.out.println("Please have at least one non-digit and non-letter character in your password.");
            }
        }
    }
}
