package calculatoroop;

public abstract class AbstractLeaderClass implements Operation {
    protected double[] num;

    public AbstractLeaderClass(double... num) {
        this.num = num;
    }

    public void printResult() {
        StringBuilder builder = new StringBuilder();

        appendBeginning(builder);
        appendArgs(builder);
        appendResult(builder);

        System.out.println(builder);
    }

    private void appendResult(StringBuilder builder) {
        builder.append(execute());
    }

    private void appendArgs(StringBuilder builder) {
        for (int i = 0; i < num.length; i++) {
            builder.append(num[i]);
            if (i != num.length - 1) {
                builder.append(" and ");
            } else {
                builder.append(" is ");
            }
        }
    }

    private void appendBeginning(StringBuilder builder) {
        builder.append("The result of the ").append(getClass().getSimpleName().toLowerCase()).append(" of ");
    }

}
