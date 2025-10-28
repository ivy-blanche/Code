public class TrendLineDecorator extends DisplayDecorator {
    private static Double lastValue = null;

    public TrendLineDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void show(double temperature) {
        super.show(temperature);
        if (lastValue != null) {
            if (temperature > lastValue) {
                System.out.println(" (↑ Rising)");
            } else if (temperature < lastValue) {
                System.out.println(" (↓ Falling)");
            } else {
                System.out.println(" (→ Stable)");
            }
        } else {
            System.out.println(" (no previous data)");
        }
        lastValue = temperature;
    }
}
