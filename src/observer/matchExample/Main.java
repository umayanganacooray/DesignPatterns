package observer.matchExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Observer winPredictor = new WinPredictorObserver();
        Observer battingCard = new BattingCardObserver();
        Observer bowlingCard = new BowlingCardObserver();
        Observer records = new RecordObserver();

        Subject subject = new Subject();

        subject.register(winPredictor);
        subject.register(battingCard);
        subject.register(bowlingCard);
        subject.register(records);

        MatchEvent event1 = new MatchEvent();

        event1.setBowlerName("Malinga");
        event1.setBat1Score(100);
        event1.setBat2Score(30);
        event1.setCurrentOver(10);
        event1.setDelivery(3);
        subject.notifyAllObservers(event1);

        Thread.sleep(1000);


        MatchEvent event2 = new MatchEvent();

        event2.setBowlerName("Malinga");
        event2.setBat1Score(102);
        event2.setBat2Score(31);
        event2.setCurrentOver(11);
        event2.setDelivery(4);
        subject.notifyAllObservers(event2);




    }
}
