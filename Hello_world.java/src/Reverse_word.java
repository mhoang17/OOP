import java.util.Scanner;
import java.lang.String;

public class Reverse_word {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word in all lowercase letters: ");
        String input = scan.nextLine();
        int strlen = input.length();
        char character;

        for (int i = strlen - 1; i >= 0; i--){
            character = Character.toUpperCase(input.charAt(i));
            System.out.print(character);
        }
    }
}
