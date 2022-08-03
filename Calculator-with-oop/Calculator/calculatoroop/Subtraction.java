package calculatoroop;

public class Subtraction extends AbstractLeaderClass {
    protected Subtraction(double... num) {

        super(num);
    }

    @Override
    public double execute() {
        double difference = num[0];
        int i = 1;
        while (i < num.length) {
            difference -= num[i++];
        }
        return difference;
    }
}
