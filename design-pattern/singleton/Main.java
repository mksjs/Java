public class Main{


	public static void main(String args[]) {
		// Access the Singleton class
		Singleton instance = Singleton.getInstance();
	
		System.out.println(instance)	;

		// call method 
		instance.showMessage()	;
	
		// check ref point should same instance
		System.out.println( instance ==  Singleton.getInstance()); //  true
	}

}
