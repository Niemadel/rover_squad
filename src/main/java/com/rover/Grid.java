package com.rover;

import java.util.List;

public class Grid {

    private Position gridPosition;

    public Grid(Position gridPosition) {
        this.gridPosition = gridPosition;
    }

    static Grid setGrid(List<String> lines) {
        String gridSize = lines.get(0);
        Position gridPosition = Position.setPosition(gridSize);
        return new Grid(gridPosition);
    }

    public Position nextPosition(Position position, Direction direction) throws Exception {
        int x = position.getX();
        int y = position.getY();

        if (direction == Direction.NORTH) {
            y = y + 1;
        }
        if (direction == Direction.EAST) {
            x++;
        }
        if (direction == Direction.WEST) {
            x = x - 1;
        }
        if (direction == Direction.SOUTH) {
            y = y - 1;
        }
        if (isRoverPositionInGrid(x, y)) {
            return new Position(x, y);
        } else {
            throw new Exception("Cannot perform command: rover will be out of grid");
        }
    }

    private boolean isRoverPositionInGrid(int x, int y) {
        return x >= 0 && x <= gridPosition.getX() && y >= 0 && y <= gridPosition.getY();
    }

}
