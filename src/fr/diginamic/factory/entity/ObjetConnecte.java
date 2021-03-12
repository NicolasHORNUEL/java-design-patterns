package fr.diginamic.factory.entity;

public class ObjetConnecte {

	private int limiteVolts;

	/** Constructeur
	 * 
	 */
	public ObjetConnecte(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

	/** Getter
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/** Setter
	 * @param limiteVolts the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ObjetConnecte [limiteVolts=");
		builder.append(limiteVolts);
		builder.append("]");
		return builder.toString();
	}
	

	
}
