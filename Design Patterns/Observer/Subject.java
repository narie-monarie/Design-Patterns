import java.util.ArrayList;

// Observable
public class Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (var observer : observers) {
            observer.update();
        }
    }
}