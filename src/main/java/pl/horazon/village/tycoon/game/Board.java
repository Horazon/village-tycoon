package pl.horazon.village.tycoon.game;

import pl.horazon.village.tycoon.config.GameProperties;

public class Board {

    private int width = GameProperties.getGameConfig().getInt("game.board.width");
    private int height = GameProperties.getGameConfig().getInt("game.board.height");

    private int[][] borad = new int[width][height];

    private Board() {
        for (int row = 0; row < width; row ++)
            for (int col = 0; col < height; col++)
                borad[row][col] = 0;
    }

    private static class Holder {
        private static final Board INSTANCE = new Board();
    }

    public static Board getInstance() {
        return Holder.INSTANCE;
    }

    public int[][] getBorad() {
        return borad;
    }
}
