package display.chart;

import display.base.Display;

public class KLineChart implements Display {
    private double lastValue = 24.0; // 初始值

    @Override
    public void show(double value) {
        double open = lastValue;
        double close = value;
        double high = Math.max(open, close) + 0.5;
        double low = Math.min(open, close) - 0.5;
        System.out.printf("🕯️KLineChart: O:%.2f C:%.2f H:%.2f L:%.2f%n",
                open, close, high, low);
        lastValue = value;
    }
}
