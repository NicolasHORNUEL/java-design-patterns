package fr.diginamic.factory;

import fr.diginamic.factory.entity.EnceinteConnectee;
import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.enumeration.Type;

public class ObjetConnecteFactory {

	public static ObjetConnecte getObjetConnecte(Type type, int limiteVolts) {

		ObjetConnecte objet = null;
		switch (type) {
			case ENCEINTE_CONNECTEE:
				objet =  new EnceinteConnectee(limiteVolts);
				break;
			case TABLETTE:
				objet = new EnceinteConnectee(limiteVolts);
				break;
			case TELEPHONE_PORTABLE:
				objet = new EnceinteConnectee(limiteVolts);
				break;
		}
		return objet;

	}

}
