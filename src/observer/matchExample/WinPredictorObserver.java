package observer.matchExample;

public class WinPredictorObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {

        //todo : calculate the win percentage base on the new event data.

        System.out.println("Updating the win predictor");
    }
}
