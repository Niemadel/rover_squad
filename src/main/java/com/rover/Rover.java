package com.rover;

import java.util.List;

public class Rover {

    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    static void moveRovers(List<String> lines) throws Exception {
        for (int i = 1; i < lines.size(); i += 2) {
            Grid grid = Grid.setGrid(lines);
            String roverPosition = lines.get(i);
            Rover rover = InitializeRover(grid, roverPosition);
            System.out.println(rover.execute(lines.get(i + 1)));
        }
    }

    private static Rover InitializeRover(Grid grid, String roverPosition) throws DirectionException {
        Position startingPosition = Position.setPosition(roverPosition);
        String startingDirection = roverPosition.substring(4, 5);
        Direction direction = Direction.setDirection(startingDirection);
        return new Rover(startingPosition, direction, grid);
    }

    public String execute(String command) throws Exception {
        for (char c : command.toCharArray()) {
            if (c == 'R') {
                direction = direction.turnRight();
            }
            if (c == 'L') {
                direction = direction.turnLeft();
            }
            if (c == 'M') {
                position = grid.nextPosition(position, direction);
            }
        }
        return position.getX() + " " + position.getY() + " " + direction.getValue();
    }

}
