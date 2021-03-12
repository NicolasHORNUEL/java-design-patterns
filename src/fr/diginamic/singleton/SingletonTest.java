package fr.diginamic.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void testUrl() {
		Singleton singleton = Singleton.getInstance();
		assertEquals("jdbc:mysql://localhost:3306/mabase", singleton.getValue("db.url"));
		
	}
	
	@Test
	void testUser() {
		Singleton singleton = Singleton.getInstance();
		assertEquals("root", singleton.getValue("db.user"));
		
	}
	
	@Test
	void testPassword() {
		Singleton singleton = Singleton.getInstance();
		assertEquals("1234", singleton.getValue("db.password"));
		
	}
	
	@Test
	void testAll() {
		Singleton singleton = Singleton.getInstance();
		assertEquals("jdbc:mysql://localhost:3306/mabase", singleton.getValue("db.url"));
		assertEquals("root", singleton.getValue("db.user"));
		assertEquals("1234", singleton.getValue("db.password"));
		
	}

}
