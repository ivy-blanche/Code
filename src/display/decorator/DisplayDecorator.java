// src/display/decorator/DisplayDecorator.java（修改）
package display.decorator;

import display.base.Display;
import subject.StockData;

/**
 * 抽象装饰者，规范装饰逻辑的执行方式
 */
public abstract class DisplayDecorator implements Display {
    protected Display display;

    public DisplayDecorator(Display display) {
        this.display = display;
    }

    // 默认实现：先执行被装饰者逻辑
    @Override
    public void show(StockData data) {
        display.show(data);
    }
}