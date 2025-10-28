public abstract class DisplayDecorator implements Display {
    protected Display display;
    public DisplayDecorator(Display display) {
        this.display = display;
    }

    @Override
    public void show(double value) {
        display.show(value);
    }
}
