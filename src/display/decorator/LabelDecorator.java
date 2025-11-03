package display.decorator;

import display.base.Display;
import subject.StockData;

/**
 * 装饰者：仅负责添加标签，不干扰核心展示逻辑
 */
public class LabelDecorator extends DisplayDecorator {
    public LabelDecorator(Display display) {
        super(display);
    }

    @Override
    public void show(StockData data) {
        System.out.print("[实时行情] "); // 附加标签
        super.show(data); // 执行被装饰者逻辑
    }
}