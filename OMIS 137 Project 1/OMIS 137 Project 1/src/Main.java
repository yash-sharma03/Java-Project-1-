import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();
        System.out.println("Hello, " + fullName + "! You are " + age + " years old and your favorite color is " + favoriteColor + ".");
    }
}