package display.chart;

import display.base.Display;

public class LineChart implements Display {
    @Override
    public void show(double value) {

        System.out.printf("📈 LineChart: Stock Price %.2f元%n", value);
    }
}