package display.chart;

import display.base.Display;

public class LineChart implements Display {
    @Override
    public void show(double value) {
        System.out.printf("📈 LineChart: Temperature %.2f°C%n", value);
    }
}
