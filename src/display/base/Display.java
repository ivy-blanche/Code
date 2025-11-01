// src/display/base/Display.java（修改）
package display.base;

import subject.StockData;

/**
 * 展示接口依赖抽象数据模型，支持扩展更多数据展示
 */
public interface Display {
    void show(StockData data); // 参数从double改为StockData
}