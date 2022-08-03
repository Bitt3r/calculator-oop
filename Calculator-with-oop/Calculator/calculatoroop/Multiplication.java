package calculatoroop;

public class Multiplication extends AbstractLeaderClass {
    protected Multiplication(double... num) {
        super(num);
    }

    @Override
    public double execute() {
        double multiplier = 1;
        int i = 0;
        while (i < num.length) {
            multiplier *= num[i++];
        }
        return multiplier;
    }
}
