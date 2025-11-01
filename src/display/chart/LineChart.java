// src/display/chart/LineChart.java（修改）
package display.chart;

import display.base.Display;
import subject.StockData;

/**
 * 具体展示组件：仅负责折线图核心展示，不处理格式控制
 */
public class LineChart implements Display {
    @Override
    public void show(StockData data) {
        // 仅输出核心数据，换行由装饰者统一控制
        System.out.printf("📈 LineChart: %s 价格 %.2f元",
                data.getStockCode(), data.getPrice());
    }
}