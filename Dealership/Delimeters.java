import java.util.Scanner;

public class Delimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers (on the same line)");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        System.out.println("Enter two very big integers (on the same line)");
        long bigNum1 = scanner.nextLong();
        long bigNum2 = scanner.nextLong();
        System.out.println("Enter two decimals (on the same line)");

        double decimal1 =scanner.nextDouble();
        double decimal2 =scanner.nextDouble();

        System.out.println("Enter two text values (on the same line)");
        String text1 = scanner.next();
        String text2 = scanner.next();

        scanner.close();
        System.out.println("\tIntegers: "+num1+" "+num2);
        System.out.println("\tBig Integers: " +bigNum1+" "+bigNum2);
        System.out.println("\tDecimals: " +decimal1+" "+decimal2);
        System.out.println("\tWords: "+text1+" "+text2);
    }
}
