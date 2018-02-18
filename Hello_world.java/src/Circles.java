import java.util.Scanner;

public class Circles {
    int radius;
    double circumference(int radius){
        return radius * 2 * Math.PI;
    }
    double area(int radius){
        return Math.PI * Math.pow(radius, 2);
    }
}

class circle_demo{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circles input = new Circles();

        System.out.print("Enter an radius: ");

        input.radius = scan.nextInt();

        System.out.println("Circumference of circle: " +input.circumference(input.radius));
        System.out.println("Area of circle: " +input.area(input.radius));
    }
}