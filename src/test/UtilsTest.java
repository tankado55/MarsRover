package test;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Altopiano;
import main.Utils;
import rover.Rover;

public class UtilsTest {

	
	@Test
	public void parseInputTextTest() throws Exception {
		InputStream testFileInputStream = getClass().getResourceAsStream("/testInput.txt");
		
        String expectedInputStringOne = "5 5";
        String expectedInputStringTwo = "1 2 N";
        String expectedInputStringThree = "LMLMLMLMM";
        String expectedInputStringFour = "3 3 E";
        String expectedInputStringFive = "MMRMMRMRRM";
        ArrayList<String> testFileLines = Utils.parseInputText(testFileInputStream);

        assertEquals(5, testFileLines.size());
        assertEquals(expectedInputStringOne, testFileLines.get(0));
        assertEquals(expectedInputStringTwo, testFileLines.get(1));
        assertEquals(expectedInputStringThree, testFileLines.get(2));
        assertEquals(expectedInputStringFour, testFileLines.get(3));
        assertEquals(expectedInputStringFive, testFileLines.get(4));
	}
	
	@Test
	public void parseRowAltopiano() throws Exception {
		String row = "5 5";
		Altopiano altopiano = Utils.parseRowAltopiano(row);
		
		
		
		assertEquals(5, altopiano.getX());
        assertEquals(5, altopiano.getY());
		
	}
	
	@Test
	public void parseRowRoverTest() throws Exception {
		
		String row = "1 2 N";
		Altopiano altopiano = new Altopiano(5,5);
		
		Rover rover = Utils.parseRowRover(row, altopiano);
		
		assertEquals(1, rover.getX());
        assertEquals(2, rover.getY());
        assertEquals('N', rover.getDirectionChar());		
	}
	
}

