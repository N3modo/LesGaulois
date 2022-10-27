package personnages;

public class Musee {
	private Trophee[] trophee;
	private int nbTrophee;
	
	public Musee(int nbTrophee) {
		super();
		this.trophee = new Trophee[200];
		this.nbTrophee = nbTrophee;
	}

	public int getNbTrophee() {
		return nbTrophee;
	}

	public void donnerTrophees(Gaulois donneur, Equipement objet) {
		trophee[nbTrophee]=new Trophee(donneur,objet);
		nbTrophee++;
	}
}
