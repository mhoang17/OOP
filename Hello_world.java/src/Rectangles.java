import java.util.Scanner;

public class Rectangles {
    int length;
    int height;
    int circumference(int length, int height){
        return length * 2 + height * 2;
    }
    int area(int length, int height){
        return length * height;
    }
}

class rectangles_demo{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangles input = new Rectangles();

        System.out.print("Enter a length: ");
        input.length = scan.nextInt();

        System.out.print("Enter a height: ");
        input.height = scan.nextInt();

        System.out.println("Circumference of rectangle: " +input.circumference(input.length, input.height));
        System.out.println("Area of rectangle: " +input.area(input.length, input.height));
    }
}