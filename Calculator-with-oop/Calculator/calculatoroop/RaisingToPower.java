package calculatoroop;

public class RaisingToPower extends AbstractLeaderClass {
    protected RaisingToPower(double... num) {
        super(num);
    }

    @Override
    public double execute() {
        double involve = 0;
        int i = 0;
        while (i < num.length) {
            involve = Math.pow(num[i++], num[i++]);
        }
        return involve;
    }
}
