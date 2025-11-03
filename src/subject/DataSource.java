package subject;

import observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class DataSource implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private StockData stockData; // 存储抽象数据模型
    private final String stockCode; // 股票代码（如"A股-600000"）

    public DataSource(String stockCode) {
        this.stockCode = stockCode;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // 通知时传递抽象数据模型，而非直接传递价格
        for (Observer o : observers) {
            o.update(stockData);
        }
    }

    // 对外提供设置价格的接口，内部封装为StockData
    public void setPrice(double price) {
        this.stockData = new StockData(stockCode, price);
        notifyObservers();
    }
}