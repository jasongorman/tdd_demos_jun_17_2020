package com.codemanship.marsrover;

import java.util.Arrays;

public class Rover {
    private int[] position;
    private String facing;

    public Rover(String facing, int x, int y) {
        this.facing = facing;
        this.position = new int[]{x, y};
    }

    public String getFacing() {
        return facing;
    }

    public int[] getPosition() {
        return position;
    }

    public void go(String instructions) {
        instructions.chars().forEach((instruction) -> {
            if(instruction == 'R'){
                right();
            }

            if(instruction == 'L') {
                left();
            }

            if(instruction == 'F'){
                if(facing == "N") {
                    position[1] = position[1] + 1;
                }

                if(facing == "E"){
                    position[0] = position[0] + 1;
                }

                if(facing == "S"){
                    position[1] = position[1] - 1;
                }

                if(facing == "W"){
                    position[0] = position[0] - 1;
                }
            }

            if(instruction == 'B'){
                if(facing == "N") {
                    position[1] = position[1] - 1;
                }

                if(facing == "E"){
                    position[0] = position[0] - 1;
                }

                if(facing == "S"){
                    position[1] = position[1] + 1;
                }

                if(facing == "W"){
                    position[0] = position[0] + 1;
                }
            }
        });
    }

    private void left() {
        turn(new String[]{"N", "W", "S", "E"});
    }

    private void right() {
        turn(new String[]{"N", "E", "S", "W"});
    }

    private void turn(String[] compass) {
        int current = Arrays.asList(compass).indexOf(facing);
        facing = compass[(current + 1) % 4];
    }
}
