package LoginSystem;

public class Person {
    protected String playerName;
    protected int eatenPieces;
    protected int timer;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getEatenPieces() {
        return eatenPieces;
    }
    public void addEatenpieces(){
        eatenPieces++;
    }

    public void setEatenPieces() {
        this.eatenPieces = 0;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
