package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3) * effetPotion);
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophy = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophy != null && i < trophy.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophy[i];
		}
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois decuplee");
	}

	public void faireUneDonnation(Musee muse) {
		parler("Je donne au musee tous mes trophees :");
		for(int i=0;i<nbTrophees;i++) {
			muse.donnerTrophees(this,trophees[i]);
		}
		
	}
//	 public static void main(String[] args) { 
//		 Gaulois asterix = new Gaulois("asterix",8);
//		 Romain minus = new Romain("minus",1);
//		 System.out.println(asterix.getNom());
//		 System.out.println(asterix);
//		 System.out.println(asterix.prendreParole());
//		 asterix.parler("txt");
//		 asterix.frapper(minus);
//		 asterix.boirePotion(5);
//	 } 
}