package src.logic;

public class Tile {
    private boolean used;
    private boolean player;

    public Tile() {
        used = false;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public int getPlayer() {
        return player ? 1 : 0;
    }

    public void setPlayer(int player) {
        this.player = player == 1;
    }
}
