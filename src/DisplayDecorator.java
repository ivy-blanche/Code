public abstract class DisplayDecorator implements Display {
    protected Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void show(double temperature) {
        decoratedDisplay.show(temperature);
    }
}
