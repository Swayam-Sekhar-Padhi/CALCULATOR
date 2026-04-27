import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Add  2. Sub  3. Mul  4. Div");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        double result = 0;
        boolean valid = true;
        switch (choice) {
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                } else {
                    result = a / b;
                }
            }
            default -> {
                System.out.println("Invalid choice.");
                valid = false;
            }
        }
        if (valid && choice >= 1 && choice <= 4) {
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
