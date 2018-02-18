import java.util.Scanner;
import java.lang.String;

public class Number_of_vowels_consonants {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scan.nextLine();

        int strlen = input.length();

        int count_vowel = 0;
        int count_consonant = 0;

        for(int i = 0; i < strlen; i++){
            if(is_vowel(input.charAt(i))){
                count_vowel++;
            }
            else{
                count_consonant++;
            }
        }

        System.out.println("Number of vowels in word: " +count_vowel);
        System.out.println("Number of consonants in word: " +count_consonant);
    }

    public static boolean is_vowel(char c){
        return "AEIOUYaeiouy".indexOf(c) != -1;
    }

}
