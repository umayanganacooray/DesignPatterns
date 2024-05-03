package observer.theory;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList = new ArrayList<>();

    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyAllObservers(String event){
        for(Observer observer: observerList){
            observer.notifyMe(event);
        }
    }

}
