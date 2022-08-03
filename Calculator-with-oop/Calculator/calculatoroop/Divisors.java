package calculatoroop;

public class Divisors extends AbstractLeaderClass {
    protected Divisors(double... num) {
        super(num);
    }

    @Override
    public double execute() {
        double division = num[0];
        int i = 1;
        do {
            if (num[i] == 0) {
                System.err.println("Fatal error");
                throw new IllegalArgumentException("You cant divide by zero");
            }
            division /= num[i++];
        } while (i < num.length);
        return division;

    }
}
