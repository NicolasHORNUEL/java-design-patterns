package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	private ResourceBundle bundle;
	

	/** Constructeur
	 * 
	 */
	private Singleton() {
		bundle = ResourceBundle.getBundle("configuration");
	}
	
	/** Getter
	 * @return the instance
	 */
	public static Singleton getInstance() {
		return instance;
	}


	public String getValue(String key) {		
		return bundle.getString(key);
	}


}
