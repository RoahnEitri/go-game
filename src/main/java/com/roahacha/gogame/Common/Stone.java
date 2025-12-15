package com.roahacha.gogame.Common;

public enum Stone {
    BLACK,
    WHITE,
    NONE;

    private Stone opposite;

    static {
        BLACK.opposite = WHITE;
        WHITE.opposite = BLACK;
        NONE.opposite = NONE;
    }

    public Stone oppositeStone() {
        return opposite;
    }
}