import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class testPassword {

    @Test
    public static void strength(){
        Scanner scan = new Scanner(System.in);
        Password password = new Password();

        System.out.print("Enter password: ");

        String input = scan.nextLine();

        if(input.length() < 8){
            System.out.println("Password is weak.");
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
            else{
                System.out.println("Password is weak.");
            }
        }
    }
}
