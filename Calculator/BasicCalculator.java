package Calculator;

interface calculator {
    double add( double num1, double num2);
    double subtract( double num1, double num2);
    double multiply( double num1, double num2);
    double divide( double num1, double num2);
}

public class BasicCalculator implements calculator {

    @Override
    public double add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("The result of adding the numbers is: " + result);
        return result;
    }

    @Override
    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("The result of subtracting the numbers is: " + result);
        return result;
    }

    @Override
    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("The result of multiplying the numbers is: " + result);
        return result;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0; // You can handle this error gracefully by returning 0.
        }
        double result = num1 / num2;
        System.out.println("The result of division is: " + result);
        return result;
    }
}
