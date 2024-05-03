package observer.theory;

public class Type1Observer implements Observer {
    @Override
    public void notifyMe(String event) {
        System.out.println("Type1 observer received an event "+event);
    }
}
