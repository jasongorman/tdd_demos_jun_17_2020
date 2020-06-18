package com.codemanship.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void turnRightNtoE(){
        Rover rover = new Rover("N", 5, 5);
        rover.go("R");
        assertEquals("E", rover.getFacing());
    }

    @Test
    public void turnRightEtoS(){
        Rover rover = new Rover("E", 5, 5);
        rover.go("R");
        assertEquals("S", rover.getFacing());
    }

    @Test
    public void turnRightStoW(){
        Rover rover = new Rover("S", 5, 5);
        rover.go("R");
        assertEquals("W", rover.getFacing());
    }

    @Test
    public void turnRightWtoN(){
        Rover rover = new Rover("W", 5, 5);
        rover.go("R");
        assertEquals("N", rover.getFacing());
    }

    @Test
    public void turnLeftNtoW(){
        Rover rover = new Rover("N", 5, 5);
        rover.go("L");
        assertEquals("W", rover.getFacing());
    }

    @Test
    public void turnLeftWtoS(){
        Rover rover = new Rover("W", 5, 5);
        rover.go("L");
        assertEquals("S", rover.getFacing());
    }

    @Test
    public void turnLeftStoE(){
        Rover rover = new Rover("S", 5, 5);
        rover.go("L");
        assertEquals("E", rover.getFacing());
    }

    @Test
    public void turnLeftEtoN(){
        Rover rover = new Rover("E", 5, 5);
        rover.go("L");
        assertEquals("N", rover.getFacing());
    }

    @Test
    public void moveFowardFacingN(){
        Rover rover = new Rover("N", 5, 5);
        rover.go("F");
        assertArrayEquals(new int[]{5, 6}, rover.getPosition());
    }

    @Test
    public void moveFowardFacingE(){
        Rover rover = new Rover("E", 5, 5);
        rover.go("F");
        assertArrayEquals(new int[]{6, 5}, rover.getPosition());
    }

    @Test
    public void moveFowardFacingS(){
        Rover rover = new Rover("S", 5, 5);
        rover.go("F");
        assertArrayEquals(new int[]{5, 4}, rover.getPosition());
    }

    @Test
    public void moveFowardFacingW(){
        Rover rover = new Rover("W", 5, 5);
        rover.go("F");
        assertArrayEquals(new int[]{4, 5}, rover.getPosition());
    }

    @Test
    public void moveBackFacingN(){
        Rover rover = new Rover("N", 5, 5);
        rover.go("B");
        assertArrayEquals(new int[]{5, 4}, rover.getPosition());
    }

    @Test
    public void moveBackFacingE(){
        Rover rover = new Rover("E", 5, 5);
        rover.go("B");
        assertArrayEquals(new int[]{4, 5}, rover.getPosition());
    }

    @Test
    public void moveBackFacingS(){
        Rover rover = new Rover("S", 5, 5);
        rover.go("B");
        assertArrayEquals(new int[]{5, 6}, rover.getPosition());
    }

    @Test
    public void moveBackFacingW(){
        Rover rover = new Rover("W", 5, 5);
        rover.go("B");
        assertArrayEquals(new int[]{6, 5}, rover.getPosition());
    }

    @Test
    public void executesSequenceOfInstructions(){
        Rover rover = new Rover("N", 5, 5);
        rover.go("RFF");
        assertEquals("E", rover.getFacing());
        assertArrayEquals(new int[]{7, 5}, rover.getPosition());
    }
}
