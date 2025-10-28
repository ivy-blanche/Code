import java.util.ArrayList;
import java.util.List;

public class DataSource implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double temperature;

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
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }
}
