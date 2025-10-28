public class TrendLineDecorator extends DisplayDecorator {
    private Double lastValue = null;

    public TrendLineDecorator(Display display) {
        super(display);
    }

    @Override
    public void show(double value) {
        super.show(value);
        if (lastValue != null) {
            if (value > lastValue) System.out.println(" (↑ Rising)");
            else if (value < lastValue) System.out.println(" (↓ Falling)");
            else System.out.println(" (→ Stable)");
        } else {
            System.out.println(" (no previous data)");
        }
        lastValue = value;
    }
}
