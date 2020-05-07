package com.rover;

import java.util.List;

public class RoverProgram {

    public static void main(String[] args) throws Exception {
        String file = args[0];

        List<String> lines = Parser.fileParser(file);

        Rover.moveRovers(lines);

    }


}

