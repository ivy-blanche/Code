package observer;

import display.base.Display; // added import

public class DisplayObserver implements Observer {
    private Display display; // changed type to display.base.Display

    // constructor now accepts display.base.Display
    public DisplayObserver(Display display) {
        this.display = display;
    }

    @Override
    public void update(double value) {
        display.show(value);
    }
}
