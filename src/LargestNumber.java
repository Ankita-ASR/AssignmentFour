import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three numbers separated by spaces: ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largestNumber = Math.max(Math.max(num1, num2), num3);

        System.out.println("The largest number is " + largestNumber);

        System.out.println("Invalid input. Please enter three valid floating-point numbers separated by spaces.");
    }
}


