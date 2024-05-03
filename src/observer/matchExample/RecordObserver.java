package observer.matchExample;

public class RecordObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {

        //todo: Check whether any new record available
        // if so, add to the database
        System.out.println("Updating the records");
    }
}
