import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {

    @Test
    @Parameters({
            "N,E",
            "E,S",
            "S,W",
            "W,N"
    })
    public void turnsRightClockwise(String startsFacing, String endsFacing){
        Rover rover = new Rover(startsFacing, 0, 0);
        rover.go("R");
        assertEquals(endsFacing, rover.getFacing());
    }

    @Test
    @Parameters({
            "N,W",
            "W,S",
            "S,E",
            "E,N"
    })
    public void turnsLeftAntiClockwise(String startsFacing, String endsFacing){
        Rover rover = new Rover(startsFacing, 0, 0);
        rover.go("L");
        assertEquals(endsFacing, rover.getFacing());
    }

    @Test
    @Parameters({
            "N,5,6",
            "E,6,5",
            "S,5,4",
            "W,4,5"
    })
    public void movesForwardInDirectionFacing(String facing, int endX, int endY){
        Rover rover = new Rover(facing, 5, 5);
        rover.go("F");
        assertArrayEquals(new int[]{endX, endY}, rover.getPosition());
    }

    @Test
    @Parameters({
            "N,5,4",
            "E,4,5",
            "S,5,6",
            "W,6,5"
    })
    public void movesBackInOppositeDirectionToFacing(String facing, int endX, int endY){
        Rover rover = new Rover(facing, 5, 5);
        rover.go("B");
        assertArrayEquals(new int[]{endX, endY}, rover.getPosition());
    }

    @Test
    public void executesSequenceOfInstructions(){
        Rover rover = new Rover("N", 5, 5);
        rover.go("RFF");
        assertEquals("E", rover.getFacing());
    }
}
