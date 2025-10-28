public class DisplayObserver implements Observer {
    private Display display;

    public DisplayObserver(Display display) {
        this.display = display;
    }

    @Override
    public void update(double temperature) {
        display.show(temperature);
    }
}
