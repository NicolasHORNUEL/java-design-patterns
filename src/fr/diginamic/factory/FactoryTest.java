package fr.diginamic.factory;

import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.enumeration.Type;

public class FactoryTest {

	public static void main(String[] args) {
		
		ObjetConnecte objet1 = ObjetConnecteFactory.getObjetConnecte(Type.ENCEINTE_CONNECTEE, 3);
		ObjetConnecte objet2 = ObjetConnecteFactory.getObjetConnecte(Type.TABLETTE, 5);
		ObjetConnecte objet3 = ObjetConnecteFactory.getObjetConnecte(Type.TELEPHONE_PORTABLE, 4);

		System.out.println(objet1);
		System.out.println(objet2);
		System.out.println(objet3);

	}

}
