import java.util.Scanner;

public class Dealership {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Java Dealership");
        System.out.println("· Select option 'a' to buy a car");
        System.out.println("· Select option 'b' to sell a car");

        String option = scanner.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget = scanner.nextInt();
                if(budget >=10000){
                    System.out.println("Great! a Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write yes or no ");
                    scanner.nextLine();
                    String insurance = scanner.nextLine();
                    System.out.println("\nDo you have a driver licence? Write 'yes' or 'no ");
                    String licence = scanner.nextLine();
                    System.out.println("\nWhat is your credit score ?");
                    int creditScore = scanner.nextInt();
                    if(insurance.equals("yes") && licence.equals("yes") &&creditScore>660)
                        System.out.println("Sold! Pleasure doing business with you.");
                    else
                        System.out.println("We're sorry, you're not eligible");
                }
                else {
                    System.out.println("We don't sale cars under 10000$. Sorry!");
                }
            case "b":
                System.out.println("\nWhat is your car valued at? ");
                int value =scanner.nextInt();
                System.out.println("\nWhat is your selling price ?");
                int price =scanner.nextInt();

                if(value > price && (price <30000) )
                    System.out.println("\nWe will buy your car, a pleasure doing business with your");
                else
                    System.out.println("\nSorry, we are not interested.");
            default:
                System.out.println("invalid option");
        }
        scanner.close();
        // usually we close scanner because we don't want any particular memory leak

    }
}