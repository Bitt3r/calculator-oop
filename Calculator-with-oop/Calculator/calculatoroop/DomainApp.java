package calculatoroop;

import java.util.Scanner;

public class DomainApp {
    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        do {
            app();
        } while (scan.next().charAt(0) == 'y');
        System.out.println("Ciao Bella, thank you for using this app");
        scan.close();
    }

    private static void app() throws Exception {
        instruction();
        int choose = scan.nextInt();
        Operation operation = null;

        switch (choose) {
            case 1 -> operation = addition();
            case 2 -> operation = subtraction();
            case 3 -> operation = multiplication();
            case 4 -> operation = divisors();
            case 5 -> operation = square();
            case 6 -> operation = involve();
            default -> error(choose);
        }

        if (operation != null) {
            operation.printResult();
        }

        System.out.println("Do you want a new calculation? y/n");
    }

    private static Operation square() {
        System.out.println("Please enter one number");
        double x = scan.nextInt();
        return new Square(x);
    }

    private static Operation divisors() {
        System.out.println("Please enter two numbers");
        double x = scan.nextInt();
        double y = scan.nextInt();
        return new Divisors(x, y);
    }

    private static Operation multiplication() {
        System.out.println("Please enter two numbers");
        double x = scan.nextInt();
        double y = scan.nextInt();
        return new Multiplication(x, y);
    }

    private static Operation subtraction() {
        System.out.println("Please enter two numbers");
        double x = scan.nextInt();
        double y = scan.nextInt();
        return new Subtraction(x, y);
    }

    private static Operation addition() {
        System.out.println("Please enter two numbers");
        double x = scan.nextInt();
        double y = scan.nextInt();
        return new Addition(x, y);
    }

    private static Operation involve() {
        System.out.println("Please enter two numbers");
        double x = scan.nextInt();
        double y = scan.nextInt();
        return new RaisingToPower(x, y);
    }


    private static void instruction() {
        System.out.print("Please enter one number if you want to use the calculator \n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 for square \n 6 for rising to power \n");
    }

    private static void error(int choose) throws Exception {
        if (choose > 6) {
            throw new Exception("You choose wrong number, this will stop the program");
        }
    }
}
