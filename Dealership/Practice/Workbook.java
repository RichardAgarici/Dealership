package Practice;
import java.util.Scanner;

public class Workbook {

private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input = scanner.nextLine().toLowerCase().trim();
        String res = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println("Hey, are you free " + res);
        System.out.println("Hmmmm... let me check my calendar");
       calendarDay(input);
    }

    public static void calendarDay(String day) {
        switch(day.toLowerCase()) {
            case "monday" :
            System.out.println("Can't");
            break;
            case "tuesday" : System.out.println("Busy.");
            break;
            case "wednesday" : System.out.println("Let's do it!");
            break;
            case "thursday" : System.out.println("Yeah!");
            break;
            case "friday" : System.out.println("Perhaps.");
            break;
            case "saturday" : System.out.println("Sure! ");
            break;
            case "sunday" : System.out.println("Certainly");
            break;
            default: 
        System.out.println("You didn't chose a day.");
        }
        
    }
}
