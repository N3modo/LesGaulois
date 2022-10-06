package histoire;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix",8);
		Gaulois obelix = new Gaulois("obelix",9);
		Romain minus = new Romain("minus",6);
		Druide panoramix = new Druide("panoramix",5,10,1);
		
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force de "+
				panoramix.getEffetPotionMin()+" à "+
				panoramix.getEffetPotionMax()+".");
		panoramix.parler("Je vais aller préparer une petite potion");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}

}
