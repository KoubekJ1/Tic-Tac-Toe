package src.logic;

public class Game {

    private static Game game;

    private Tile[][] tiles;

    public static void newGame() {
        game = new Game();
    }

    private Game() {
        tiles = new Tile[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tiles[i][j] = new Tile();
            }
        }
    }

    public static void setTilePressed(int x, int y, int player) {
        game.tiles[x][y].setUsed(true);
        game.tiles[x][y].setPlayer(player);
    }

    public static char switchPlayer(char player) {
        if (player == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }

}
