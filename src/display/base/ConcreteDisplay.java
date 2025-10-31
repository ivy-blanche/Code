package display.base;

public class ConcreteDisplay implements Display {
    @Override
    public void show(double temperature) {
        System.out.printf("Temperature: %.2f°C", temperature);
    }
}
