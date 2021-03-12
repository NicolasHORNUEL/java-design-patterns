package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FactoryTestJUnit {

	@Test
	public void testFactoryEnceinteConnectee() {
		ObjetConnecte objet = ObjetConnecteFactory.getObjetConnecte(Type.EnceinteConnectee);
		assertEquals(3, objet.getLimiteVolts());
	}
	
	@Test
	public void testFactoryTablette() {
		ObjetConnecte objet = ObjetConnecteFactory.getObjetConnecte(Type.Tablette);
		assertEquals(5, objet.getLimiteVolts());
	}
	
	@Test
	public void testFactoryTelephonePortable() {
		ObjetConnecte objet = ObjetConnecteFactory.getObjetConnecte(Type.TelephonePortable);
		assertEquals(4, objet.getLimiteVolts());
	}
	
}
