public class Singleton {
	
	// The single instance of the class, initially null
	private static Singleton  instance;

	// Private constructor to prevent instantiation from outside 
	private Singleton() {

		// private constructor
	}

	// pulic static getInstance method to provide global access to this instance 
	public static Singleton getInstance() {

		// create instance if it does not exist 
		if(instance == null) {
			instance = new Singleton();
		}

		return instance;
	}


	// to demonstrate the Singleton pattern 
	public void showMessage(){
		System.out.println("Hello from Singleton !!! welcome to the class");
	}


}
