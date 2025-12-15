package com.roahacha.gogame.Common;

// Made for server
// Handle game rules and applies them on board
public class GameBoard extends Board {
    Board boardOne;
    Board boardTwo;

    private void updatePlayerBoards() {
        for (int i = 0; i < gridWidth; i++)
            for (int j = 0; j < gridWidth; j++) {
                boardOne.grid[i][j] = this.grid[i][j];
                boardTwo.grid[i][j] = this.grid[i][j];
            }
    }

    public GameBoard() {}

    public void connectPlayerBoards(Board boardOne, Board boardTwo) {
        this.boardOne = boardOne;
        this.boardTwo = boardTwo;
    }
    
    private void removeIfInvalid(int height, int length) {
        if (countFreeSpaces(height, length) == 0) {
            grid[height][length] = Stone.NONE;
            tileUsed[height][length] = true;
        }
    }

    // returns true on success, false on failure
    public boolean placeStone(int height, int length, Stone stone) {
        if (countFreeSpaces(height, length) == 0)   return false;
        grid[height][length] = stone;
        tileUsed[height][length] = true;

        if (height - 1 >= 0)            removeIfInvalid(height - 1, length);
        if (length + 1 < gridWidth)     removeIfInvalid(height, length + 1);
        if (height + 1 < gridWidth)     removeIfInvalid(height + 1, length);
        if (length - 1 >= 0)            removeIfInvalid(height, length - 1);

        updatePlayerBoards();

        return true;
    }
}
