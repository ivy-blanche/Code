// src/observer/DisplayObserver.java（修改）
package observer;

import display.base.Display;
import subject.StockData;

/**
 * 观察者：仅负责接收数据并转发给展示组件，不处理业务逻辑
 */
public class DisplayObserver implements Observer {
    private Display display;

    public DisplayObserver(Display display) {
        this.display = display;
    }

    @Override
    public void update(StockData data) {
        display.show(data); // 转发数据给装饰者链
    }
}