import java.util.Scanner;
public class VowelConsonantChecker {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine();
        if (input.length() == 1) {
            char ch = input.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Input is not a letter.");
            }
        } else {
            System.out.println("Error: Input is not a single character.");
        }


    }
}
