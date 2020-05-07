package com.rover;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Position setPosition(String roverPosition) {
        return new Position(Integer.parseInt(roverPosition.substring(0, 1)), Integer.parseInt(roverPosition.substring(2, 3)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
