package fr.diginamic.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void testUrl() {
		Configuration configuration = Configuration.getInstance();
		assertEquals("jdbc:mysql://localhost:3306/mabase", configuration.getValue("db.url"));
		
	}
	
	@Test
	void testUser() {
		Configuration configuration = Configuration.getInstance();
		assertEquals("root", configuration.getValue("db.user"));
		
	}
	
	@Test
	void testPassword() {
		Configuration configuration = Configuration.getInstance();
		assertEquals("1234", configuration.getValue("db.password"));
		
	}
	
	@Test
	void testAll() {
		Configuration configuration = Configuration.getInstance();
		assertEquals("jdbc:mysql://localhost:3306/mabase", configuration.getValue("db.url"));
		assertEquals("root", configuration.getValue("db.user"));
		assertEquals("1234", configuration.getValue("db.password"));
		
	}

}
