package pl.horazon.village.tycoon.game;

public class Board {

    private int width = 10;
    private int height = 10;

    private int[][] borad = new int[width][height];

    public Board() {
        for (int row = 0; row < 3; row ++)
            for (int col = 0; col < 3; col++)
                borad[row][col] = 0;
    }
}
