package observer.theory;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type2Observer();

        subject.observerList.add(observer1);
        subject.observerList.add(observer2);

        subject.notifyAllObservers("Event 1");

        subject.observerList.remove(observer1);

        subject.notifyAllObservers("Event 2");

    }
}
