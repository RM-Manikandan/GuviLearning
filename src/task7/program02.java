package task7;

public class program02 {
	
	public static void main(String[] args) {
		
		int array[]= {1,3,5,7,9};
		
		try {
			for (int i = 0; i <= array.length; i++) {
			System.out.print(array[i] + " ");
			}
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nException Caught: " + e.getMessage());
			}
	}

}
