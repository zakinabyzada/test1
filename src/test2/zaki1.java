package test2;

public class zaki1 {
	public static void main(String[] args) {
		System.out.println("This is a method where i first commit it to the normal repository and tahn");
	}
	
	// method 2nd 
	public static void age () {
		System.out.println("age = 21");
	}
	
	// method 3rd 
	public static boolean isValid (int age ) {
		boolean result = false;
			
			if (age < 18 ) {
				result = false;
			} else {
				result = true;
			}
			System.out.println(result);
	
		return result ;
	}
}
