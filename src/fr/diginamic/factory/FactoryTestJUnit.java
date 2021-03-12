package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FactoryTestJUnit {

	@Test
	public void testFactoryEnceinteConnectee() {
		ObjetConnecte objet = ObjetConnecteFactory.getObjetConnecte(Type.ENCEINTE_CONNECTEE, 3);
		assertEquals(3, objet.getLimiteVolts());
	}
	
	@Test
	public void testFactoryTablette() {
		ObjetConnecte objet = ObjetConnecteFactory.getObjetConnecte(Type.TABLETTE, 5);
		assertEquals(5, objet.getLimiteVolts());
	}
	
	@Test
	public void testFactoryTelephonePortable() {
		ObjetConnecte objet = ObjetConnecteFactory.getObjetConnecte(Type.TELEPHONE_PORTABLE, 4);
		assertEquals(4, objet.getLimiteVolts());
	}
	
}
