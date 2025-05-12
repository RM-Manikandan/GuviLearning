package task7;

import java.util.ArrayList;

public class Program05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Apple");
		stringList.add("Grape");
		stringList.add("Orange");
		stringList.add("PineApple");
		stringList.add("Guva");
		
		System.out.println("Availble Arraylist String - "+stringList.size());
		
		stringList.removeAll(stringList);
		
		System.out.println("After removing the elements - "+ stringList.size());
	}

}
