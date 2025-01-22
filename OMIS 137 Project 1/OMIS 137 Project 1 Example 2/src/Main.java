import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);

            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);

            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);

            case '/':
                result = firstNumber / secondNumber;
                System.out.println("Result: " + result);
        }
    }
}