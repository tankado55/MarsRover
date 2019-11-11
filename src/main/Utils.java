package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import direction.Direction;
import direction.EastDirection;
import direction.NorthDirection;
import direction.SouthDirection;
import direction.WestDirection;
import rover.Rover;

public class Utils {

	public static ArrayList<String> parseInputText(InputStream input) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
		
		ArrayList<String> inputRowList = new ArrayList<String>();
		String row;
		try {
			while ((row = bufferedReader.readLine()) != null)
				inputRowList.add(row);
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return inputRowList;
	}
	
	public static Altopiano parseRowAltopiano (String row) {
		String[] array = row.split(" ");
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		
		return new Altopiano (x,y);
	}
	
	public static Rover parseRowRover(String row, Altopiano altopiano) {
		String[] array = row.split(" ");
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		
		Direction direction;
		switch (array[2]) {
			case "N" : direction = new NorthDirection(); break;
			case "S" : direction = new SouthDirection(); break;
			case "W" : direction = new WestDirection(); break;
			case "E" : direction = new EastDirection(); break;
			default  : direction = null;
		}
		
		
		Rover rover = new Rover(x, y, direction, altopiano);
		return rover;
	}
	
	public static char[] parseRowInstruction(String row) {
		char[] array = row.toCharArray();
		return  array;
	}
}
