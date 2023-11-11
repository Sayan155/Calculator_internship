package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Welcome to the calculator:\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Quit");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                bc.add(num1, num2);
                break;
            case 2:
                bc.subtract(num1, num2);
                break;
            case 3:
                bc.multiply(num1, num2);
                break;
            case 4:
                bc.divide(num1, num2);
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
        }
    }
}
