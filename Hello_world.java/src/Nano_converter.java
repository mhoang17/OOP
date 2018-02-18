import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Nano_converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount of seconds: ");
        long nano = scanner.nextInt();

        long days = TimeUnit.NANOSECONDS.toDays(nano);
        nano -= TimeUnit.DAYS.toNanos(days);

        long hours = TimeUnit.NANOSECONDS.toHours(nano);
        nano -= TimeUnit.HOURS.toNanos(hours);

        long minutes = TimeUnit.NANOSECONDS.toMinutes(nano);
        nano -= TimeUnit.MINUTES.toNanos(minutes);

        long seconds = TimeUnit.NANOSECONDS.toSeconds(nano);
        nano -= TimeUnit.SECONDS.toNanos(seconds);

        System.out.println("Days: " +days+ ", Hours: " +hours+ ", Minutes: " +minutes+ ", Seconds: " +seconds+ " Nanoseconds: " +nano);

    }
}
