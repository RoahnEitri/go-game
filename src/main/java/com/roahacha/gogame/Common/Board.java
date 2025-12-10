package com.roahacha.gogame.Common;

// TODO: Board class
// Made for players
// Allow viewing board and checking if move is valid
public class Board {
    static final int gridWidth = 19;
    private Tile[][] grid = new Tile[gridWidth][gridWidth];


    enum Tile {
        EMPTY,
        BLACK,
        WHITE
    }

    public Board() {
        for (int i = 0; i < gridWidth; i++) {
            for (int j = 0; j < gridWidth; j++)
                grid[i][j] = Tile.EMPTY;
        }
    }
}
