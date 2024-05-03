package observer.matchExample;

public class MatchEvent {

    private int currentOver;
    private int delivery;
    private int bat1Score;
    private int bat2Score;
    private String bowlerName;

    public int getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(int currentOver) {
        this.currentOver = currentOver;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public int getBat1Score() {
        return bat1Score;
    }

    public void setBat1Score(int bat1Score) {
        this.bat1Score = bat1Score;
    }

    public int getBat2Score() {
        return bat2Score;
    }

    public void setBat2Score(int bat2Score) {
        this.bat2Score = bat2Score;
    }

    public String getBowlerName() {
        return bowlerName;
    }

    public void setBowlerName(String bowlerName) {
        this.bowlerName = bowlerName;
    }
}
