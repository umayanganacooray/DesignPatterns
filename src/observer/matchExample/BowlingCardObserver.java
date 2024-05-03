package observer.matchExample;

public class BowlingCardObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        System.out.println("Updating the batting card - Bowler Name : "+event.getBowlerName());
    }
}
