public class ThreadSafeSingleton {

	// The Single instance of the class, initially null
	
	private static ThreadSafeSingleton  instance ;
	
	// private construtor to prevent access from out side
	private ThreadSafeSingleton() {

		// private constructor
	}
	
	// public static method to provide global acces to method
	// synchronised ensure that only one thread access it at a time. 
	// This prevent multiple thread to creating multiple instance simultaneously	
	public static synchronized ThreadSafeSingleton getInstance() {
		
		// create instance if does not exist
		if(instance == null) {
			
			instance = new ThreadSafeSingleton();
		}

		return instance;
	}



	// demonstrate 
	
	public void showMessage() {
		System.out.println("Hello from ThreadSafeSingleton.  Welcome to the class");
	}

}
