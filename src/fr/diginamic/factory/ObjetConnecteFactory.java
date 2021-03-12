package fr.diginamic.factory;

import fr.diginamic.factory.entity.EnceinteConnectee;
import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.enumeration.Type;

public class ObjetConnecteFactory {
	
	public static ObjetConnecte getObjetConnecte(Type type, int limiteVolts) {
		
		if (type.equals(Type.ENCEINTE_CONNECTEE)) {
			return new EnceinteConnectee(limiteVolts);
		}
		else if (type.equals(Type.TABLETTE)) {
			return new EnceinteConnectee(limiteVolts);
		}
		else if (type.equals(Type.TELEPHONE_PORTABLE)) {
			return new EnceinteConnectee(limiteVolts);
		}
		return null;
	}

}
