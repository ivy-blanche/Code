public class LabelDecorator extends DisplayDecorator {
    public LabelDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void show(double temperature) {
        System.out.print("[Sensor: T-001] ");
        super.show(temperature);
    }
}
