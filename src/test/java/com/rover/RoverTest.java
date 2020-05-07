package com.rover;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void test1() throws Exception {

        Position position = new Position(1,2);
        Position gridPosition = new Position(5,5);
        Direction direction = Direction.NORTH;
        Grid grid = new Grid(gridPosition);

        Rover rover = new Rover(position,direction,grid);

        String expected = rover.execute("LMLMLMLMM");
        assertThat(expected).isEqualTo("1 3 N");
    }

    @Test
    public void test2() throws Exception {

        Position position = new Position(3,3);
        Position gridPosition = new Position(5,5);
        Direction direction = Direction.EAST;
        Grid grid = new Grid(gridPosition);

        Rover rover = new Rover(position,direction,grid);

        String expected = rover.execute("MMRMMRMRRM");
        assertThat(expected).isEqualTo("5 1 E");
    }
}
