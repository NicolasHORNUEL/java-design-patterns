package fr.diginamic.factory;

public class ObjetConnecteFactory {
	
	public static ObjetConnecte getObjetConnecte(Type type) {
		if (type.equals(Type.EnceinteConnectee)) {
			return new EnceinteConnectee(3);
		}
		else if (type.equals(Type.Tablette)) {
			return new EnceinteConnectee(5);
		}
		else if (type.equals(Type.TelephonePortable)) {
			return new EnceinteConnectee(4);
		}
		return null;
	}

}
