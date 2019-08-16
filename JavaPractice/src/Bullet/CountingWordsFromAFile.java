package Bullet;


import java.io.File;
import java.util.*;

public class CountingWordsFromAFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("/home/sidharth/Music/MusicList");
		Scanner input = new Scanner(file);
		System.out.println("---------------------------------");
		System.out.println("- Content of the inputted file: -");
		System.out.println("---------------------------------");
		
		int words = 0;
		int letters = 0;
		int numbers = 0;
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
			
			words += line.split(" ").length;
		}
		System.out.println("---------------------------------");
		System.out.println("-       File Content info:      -");
		System.out.println("---------------------------------");
		System.out.println("The file contains " + words + " words.");
		
		
		
		
		
	}

}
