package display.chart;

import display.base.Display;
import subject.StockData;

/**
 * 具体展示组件：仅负责K线图核心数据计算与展示
 */
public class KLineChart implements Display {
    private double lastPrice; // 仅保留必要的状态数据

    @Override
    public void show(StockData data) {
        double currentPrice = data.getPrice();
        double open = lastPrice == 0 ? currentPrice : lastPrice; // 初始值处理
        double high = Math.max(open, currentPrice) + 0.5;
        double low = Math.min(open, currentPrice) - 0.5;

        // 核心数据展示，不包含换行
        System.out.printf("🕯️ KLineChart: %s O:%.2f C:%.2f H:%.2f L:%.2f%n",
                data.getStockCode(), open, currentPrice, high, low);

        lastPrice = currentPrice; // 更新状态
    }
}