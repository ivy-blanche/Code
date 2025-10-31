package display.decorator;

import display.base.Display;

public class LabelDecorator extends DisplayDecorator {
    public LabelDecorator(Display display) {
        super(display);
    }

    @Override
    public void show(double value) {
        System.out.print("[Sensor: T-001] ");
        super.show(value);
    }
}
