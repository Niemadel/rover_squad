package com.rover;

public enum Direction {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private final String value;

    public String getValue() {
        return value;
    }

    Direction(String value) {
        this.value = value;
    }

    public Direction turnRight() throws DirectionException {
        switch (value) {
            case "N":
                return EAST;
            case "S":
                return WEST;
            case "E":
                return SOUTH;
            case "W":
                return NORTH;

            default:
                throw new DirectionException();
        }
    }

    public Direction turnLeft() throws DirectionException {
        switch (value) {
            case "N":
                return WEST;
            case "S":
                return EAST;
            case "E":
                return NORTH;
            case "W":
                return SOUTH;

            default:
                throw new DirectionException();
        }
    }

    public static Direction setDirection(String command) throws DirectionException {
        switch (command) {
            case "N":
                return NORTH;
            case "S":
                return SOUTH;
            case "E":
                return EAST;
            case "W":
                return WEST;

            default:
                throw new DirectionException();
        }
    }
}
