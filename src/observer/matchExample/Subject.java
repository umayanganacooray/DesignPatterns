package observer.matchExample;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void register(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    public void notifyAllObservers(MatchEvent event){
        for(Observer observer : observerList){
            observer.notifyMe(event);
        }
    }
}
