package fr.diginamic.factory;

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
