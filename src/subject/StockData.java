// src/subject/StockData.java
package subject;

/**
 * 抽象股票数据模型，封装需要传递的所有数据
 * 解决观察者接口直接依赖具体参数的问题
 */
public class StockData {
    private String stockCode; // 股票代码
    private double price;     // 价格


    public StockData(String stockCode, double price) {
        this.stockCode = stockCode;
        this.price = price;

    }

    // Getter方法
    public String getStockCode() { return stockCode; }
    public double getPrice() { return price; }

}