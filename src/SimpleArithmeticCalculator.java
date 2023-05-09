import java.util.Scanner;

public class SimpleArithmeticCalculator {
    private double x, y;

    public static void main(String[] args) {
        SimpleArithmeticCalculator c = new SimpleArithmeticCalculator();
        c.start();
    }

    public void start() {
        Scanner s = new Scanner(System.in);
        short op;
        double res = 0;
        while (true) {
            System.out.println("Available operations: 1. Add, 2. Sub, 3. Mult, 4. Div");
            System.out.print("Enter operation number: ");
            op = s.nextShort();
            if (op < 1 || op > 4) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.print("Enter x: ");
            this.x = s.nextDouble();
            System.out.print("Enter y: ");
            this.y = s.nextDouble();
            switch (op) {
                case 1: {
                    res = SimpleArithmeticCalculator.add(x, y);
                    break;
                }
                case 2: {
                    res = SimpleArithmeticCalculator.sub(x, y);
                    break;
                }
                case 3: {
                    res = SimpleArithmeticCalculator.mult(x, y);
                    break;
                }
                case 4: {
                    res = SimpleArithmeticCalculator.div(x, y);
                    break;
                }
            }
            System.out.println("Result: " + res);
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
