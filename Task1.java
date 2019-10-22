package HomeWork2;

import java.lang.Math;
import java.io.*;


class Task1 {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("function.txt");
		
		for (double i = 1; i <= 2; i += 0.01) {
			file.write(String.valueOf(Math.pow(i,2) + i*2 + 3) + "\n");
		}
			
		file.flush();
		file.close();
	}
}