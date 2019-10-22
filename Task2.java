package HomeWork2;

import java.io.*;
import java.util.*;


class Task2 {
	public static void main(String[] args) throws Exception {
		BufferedReader fileR = new BufferedReader(new FileReader("function.txt"));
		
		String doubleAsString;
		
		List<Double> listOfDoubles = new ArrayList<Double>();
		
		while ((doubleAsString = fileR.readLine()) != null) {
			listOfDoubles.add(Double.parseDouble(doubleAsString));
		}
		
		System.out.println("Min: " + Collections.min(listOfDoubles) + "\n" + "Max: " + Collections.max(listOfDoubles));
	}
}