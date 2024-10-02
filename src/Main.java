import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // TODO: Define the US, French, and Japanese locales using the appropriate Locale constants or constructor
        Locale usLocale = Locale.US; // Define Locale for US
        Locale franceLocale = Locale.FRANCE; // Define Locale for France
        Locale japanLocale = Locale.JAPAN; // Define Locale for Japan

        // TODO: Obtain the current date using LocalDate.now()
        LocalDate now = LocalDate.now(); // Initialize the current date

        // TODO: Call printFormattedDate method for each locale (US, France, Japan), passing the locale and current date
        printFormattedDate(usLocale, now);
        printFormattedDate(franceLocale, now);
        printFormattedDate(japanLocale, now);
    }

    private static void printFormattedDate(Locale locale, LocalDate date) {
        // TODO: Print the language and country of the locale using locale.getLanguage() and locale.getCountry()
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        // TODO: Format and print the date in LONG format using DateTimeFormatter and the provided locale
        DateTimeFormatter longFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy", locale);
        System.out.println(longFormatter.format(date));

        // TODO: Format and print the date in FULL format using DateTimeFormatter and the provided locale
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE MMMM d yyyy", locale);
        System.out.println(fullFormatter.format(date));

        // TODO: Print an empty line to separate the output for each locale
        System.out.println();
    }
}