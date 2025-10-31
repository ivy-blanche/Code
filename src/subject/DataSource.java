package subject;

import observer.Observer;


import java.util.ArrayList;
import java.util.List;

public class DataSource implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    @Override
    //java的多态性允许接口类型作为方法的参数
    //但是o必须指向实现了observer接口的类的对象
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
