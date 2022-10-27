//package histoire;
//
//import personnages.*;
//
//public class Scenario {
//
//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("asterix",8);
//		Gaulois obelix = new Gaulois("obelix",9);
//		Romain minus = new Romain("minus",6);
//		Druide panoramix = new Druide("panoramix",5,10,1);
//		
//		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force de "+
//				panoramix.getEffetPotionMin()+" � "+
//				panoramix.getEffetPotionMax()+".");
//		panoramix.parler("Je vais aller pr�parer une petite potion");
//		panoramix.preparerPotion();
//		panoramix.booster(obelix);
//		panoramix.booster(asterix);
//		asterix.parler("Bonjour a tous");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		
//	}
//
//}

package histoire;

import personnages.*;
//import villagegaulois.Musee;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10,1);
		druide.parler("Je vais aller pr�parer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		druide.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0);
		
//		Partie a decommenter
		
//		Musee musee = new Musee();
//		asterix.faireUneDonnation(musee);

	}

}