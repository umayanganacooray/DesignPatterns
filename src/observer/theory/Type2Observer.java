package observer.theory;

public class Type2Observer implements Observer {
    @Override
    public void notifyMe(String event) {
        System.out.println("Type2 observer received an event "+ event);
    }
}
