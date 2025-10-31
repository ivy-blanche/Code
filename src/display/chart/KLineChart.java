package display.chart;

import display.base.Display;

public class KLineChart implements Display {
    private double lastValue = 24.0; // 初始值（可改为股票初始价格，如100.0）

    @Override
    public void show(double value) {
        double open = lastValue;
        double close = value;
        double high = Math.max(open, close) + 0.5;
        double low = Math.min(open, close) - 0.5;
        // 补充单位"元"，与折线图保持一致
        System.out.printf("🕯️KLineChart: O:%.2f元 C:%.2f元 H:%.2f元 L:%.2f元%n",
                open, close, high, low);
        lastValue = value;
    }
}