package src.logic;

public class Game {

    private static Game game;

    private Tile[][] tiles;

    public static void newGame() {
        game = new Game();
    }

    private Game() {
        tiles = new Tile[3][3];
    }

}
