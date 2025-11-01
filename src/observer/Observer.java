// src/observer/Observer.java（修改）
package observer;

import subject.StockData;

/**
 * 观察者接口依赖抽象数据模型StockData，而非具体数值
 */
public interface Observer {
    void update(StockData data); // 参数从double改为StockData
}