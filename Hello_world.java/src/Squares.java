import java.util.Scanner;

public class Squares {
    int length;
    int circumference(int length){
        return length * 4;
    }
    double area(int length){
        return Math.pow(length, 2);
    }
}

class squares_demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Squares input = new Squares();

        System.out.print("Enter a length: ");

        input.length = scan.nextInt();

        System.out.println("Circumference of square: " +input.circumference(input.length));
        System.out.println("Area of square: " +input.area(input.length));
    }
}