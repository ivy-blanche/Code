// src/display/decorator/TrendLineDecorator.java（修改）
package display.decorator;

import display.base.Display;
import subject.StockData;

/**
 * 装饰者：仅负责添加趋势判断，统一控制换行
 */
public class TrendLineDecorator extends DisplayDecorator {
    private Double lastPrice;

    public TrendLineDecorator(Display display) {
        super(display);
    }

    @Override
    public void show(StockData data) {
        super.show(data); // 先执行被装饰者的核心展示

        // 附加趋势判断，并统一添加换行
        if (lastPrice != null) {
            if (data.getPrice() > lastPrice) {
                System.out.println(" (↑ 上涨)");
            } else if (data.getPrice() < lastPrice) {
                System.out.println(" (↓ 下跌)");
            } else {
                System.out.println(" (→ 持平)");
            }
        } else {
            System.out.println(" (无历史数据)");
        }

        lastPrice = data.getPrice();
    }
}