package fr.diginamic.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		ObjetConnecte objet1 = ObjetConnecteFactory.getObjetConnecte(Type.EnceinteConnectee);
		ObjetConnecte objet2 = ObjetConnecteFactory.getObjetConnecte(Type.Tablette);
		ObjetConnecte objet3 = ObjetConnecteFactory.getObjetConnecte(Type.TelephonePortable);

		System.out.println(objet1);
		System.out.println(objet2);
		System.out.println(objet3);

	}

}
