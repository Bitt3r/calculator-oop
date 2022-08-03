package calculatoroop;

public class Addition extends AbstractLeaderClass {

    protected Addition(double... num) {
        super(num);
    }

    @Override
    public double execute() {
        double sum = 0;
        int i = 0;
        while (i < num.length) {
            sum += num[i++];
        }
        return sum;
    }

}
