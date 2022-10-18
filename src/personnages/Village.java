package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
		nbVillageois += 1;
	}

	public Chef getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois testG) {
		villageois[nbVillageois] = testG;
		nbVillageois += 1;
	}

	public Gaulois trouverHabitant(int numeroV) {
		return villageois[numeroV];
	}

	public void afficherVillageois(Village village) {
		System.out.println("Dans village du chef " + village.getChef() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + village.trouverHabitant(i) + "\n");
		}
	}

//	public static void main(String[] args) {
//		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30 at
//		personnages.Village.trouverHabitant(Village.java:28) at
//		personnages.Village.main(Village.java:32)
//		tableau va de 0 a 29 -> indice out of range
//		Chef abraracourcix = new Chef("abraracourcix", 1, 6, village);
//		Gaulois asterix = new Gaulois("Asterix", 8);
//		Gaulois obelix = new Gaulois("Obelix",35);
//		village.setChef(abraracourcix);
//		village.ajouterHabitant(asterix);
//		village.ajouterHabitant(obelix);
//	}
}
