import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class testVector {

    @Test
    public static void vectorAddition(){
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

        vectorA.vectorAd(vectorA.coordinate1, vectorB.coordinate1);
        vectorB.vectorAd(vectorA.coordinate2, vectorB.coordinate2);

        vectorSubtraction(vectorA, vectorB);

    }


    @Test
    public static void vectorSubtraction(Vector vectorA, Vector vectorB){
        vectorA.vectorSub(vectorA.coordinate1, vectorB.coordinate1);
        vectorB.vectorSub(vectorA.coordinate2, vectorB.coordinate2);
    }

    @Test
    public static void scalar(Vector vectorA, Vector vectorB){
        int scalarP = vectorA.vectorAd(vectorA.coordinate1, vectorB.coordinate1) + vectorB.vectorAd(vectorA.coordinate2, vectorB.coordinate2);
    }
}
