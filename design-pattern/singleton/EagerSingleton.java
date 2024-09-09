public class EagerSingleton {

	// Eagerly initialized instance 
	
	private static EagerSingleton  instance ;
	
	// private construtor to prevent access from out side
	private EagerSingleton() {

		// private constructor
	}
	
	// public static method to provide global acces to method
	public static EagerSingleton getInstance() {
		
			
		return instance ;

	}



	// demonstrate 
	
	public void showMessage() {
		System.out.println("Hello from EagerSingleton.  Welcome to the class");
	}

}
