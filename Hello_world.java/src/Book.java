import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Book {
    String title;
    String author;
    String year;
    int pages;
    String ISBN;
    String lang;
    int one_page;
    int whole_book(int pages, int one_page){
        return pages * one_page;
    }
}

class book_demo{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book = new Book();

        book.pages = 942;

        //User Command
        System.out.println("About how many minutes does it take you to read one page?");
        System.out.print("Answer: ");

        book.one_page = scan.nextInt();

        //Calculate Reading Time
        long minutes = book.whole_book(book.pages, book.one_page);

        long days = TimeUnit.MINUTES.toDays(minutes);
        minutes -= TimeUnit.DAYS.toMinutes(days);

        long hours = TimeUnit.MINUTES.toHours(minutes);
        minutes -= TimeUnit.HOURS.toMinutes(hours);

        //Print Functions
        System.out.print("It will approximately take you ");

        if(days >= 1){
            System.out.print(days == 1 ? days+ " day " : days+ " days ");
        }

        if(hours >= 1){
            System.out.print(hours == 1 ? hours+ " hour " : hours+ " hours ");
        }

        if(minutes >= 1){
            System.out.print(minutes == 1 ? minutes+ " minute " : minutes+ " minutes ");
        }

        System.out.println("to read this book.");
    }
}