package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {
	
	private static Configuration instance = new Configuration();
	private ResourceBundle configuration;
	

	/** Constructeur
	 * 
	 */
	private Configuration() {
		this.configuration = ResourceBundle.getBundle("configuration");
	}
	
	/** Getter
	 * @return the instance
	 */
	public static Configuration getInstance() {
		return instance;
	}


	public String getValue(String key) {		
		return configuration.getString(key);
	}


}
