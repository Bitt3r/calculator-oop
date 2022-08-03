package calculatoroop;

public class Square extends AbstractLeaderClass {
    protected Square(double... num) {
        super(num);
    }

    @Override
    public double execute() {
        double square = 1;
        int i = 0;
        while (i < num.length) {
            square = Math.sqrt(num[i++]);

        }
        return square;
    }
}