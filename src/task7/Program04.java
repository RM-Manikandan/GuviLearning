package task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program04 {
	
	
	public static void main(String[] args) {
		 try {
	            File file = new File("nonexistent_file.txt");
	            Scanner scanner = new Scanner(file); // This will throw FileNotFoundException
	            while (scanner.hasNextLine()) {
	                String data = scanner.nextLine();
	                System.out.println(data);
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        }
	    }
	}

