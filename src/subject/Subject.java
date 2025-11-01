// src/subject/Subject.java（保持接口稳定性，仅实现类变化）
package subject;
import observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}