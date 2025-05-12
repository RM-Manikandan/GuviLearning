package task7;

import java.util.LinkedList;
import java.util.List;

public class Program07 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(5);
		l.add(4);
		l.add(7);
		l.add(2);
		
		Integer arr[] = l.toArray(new Integer[0]);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
