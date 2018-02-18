import java.util.Scanner;

public class Vowel_or_consonant {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter exactly one letter: ");

        char character = scanner.next().charAt(0);
        System.out.println(is_vowel(character) ? "This is a vowel." : "This is a consonant.");
    }

    public static boolean is_vowel(char c){
        return "AEIOUYaeiouy".indexOf(c) != -1;
    }
}
