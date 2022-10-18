package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipement = new Equipement[2];
		assert force > 0;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int forceInitiale = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert forceInitiale > force;
	}

	public Equipement sEquiper(Equipement stuff) {
		if (nbEquipement == 2) {
			System.out.println("Le soldat " + nom + " est deja bien protege !");
		} else {
			switch (stuff) {
			case CASQUE:
				if (equipement[0] != Equipement.CASQUE) {
					System.out.println("Le soldat " + nom + " s'equipe avec un " + stuff.toString());
					equipement[0] = Equipement.CASQUE;
					nbEquipement += 1;
				} else {
					System.out.println("le soldat " + nom + " possede deja un " + stuff.toString());
				}
				break;
			case BOUCLIER:
				if (equipement[1] != Equipement.BOUCLIER) {
					System.out.println("Le soldat " + nom + " s'equipe avec un " + stuff.toString());
					equipement[1] = Equipement.BOUCLIER;
					nbEquipement += 1;
				} else {
					System.out.println("le soldat " + nom + " possede deja un " + stuff.toString());
				}
				break;
			default:
				break;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
