package subject;
import observer.Observer;
//定义被观察者管理和通知观察者的方法
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
