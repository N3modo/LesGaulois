package personnages;

import java.util.*;

import com.sun.org.apache.xml.internal.utils.StringComparable;

import personnages.*;

public class Druide {
	 private String nom; 
	 private int effetPotionMin; 
	 private int effetPotionMax;
	 private int forcePotion=1;
	 
	 public Druide(String nom, int effetPotionMin, int effetPotionMax, int forcePotion) { 
		 this.nom = nom; 
		 this.effetPotionMin = effetPotionMin; 
		 this.effetPotionMax = effetPotionMax; 
		 this.forcePotion=forcePotion;
		 parler("Bonjour,  je  suis  le  druide  "  +  nom  +  "  et  ma  potion  peut  aller d'une force " + effetPotionMin + " à " + effetPotionMax + "."); 
	 } 
	 
	 public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public String getNom() { 
		 return nom; 
	 } 
	 
	 public void parler(String texte) { 
		 System.out.println(prendreParole() + "« " + texte + "»"); 
	 }
	 
	 private String prendreParole() { 
		 return "Le druide " + nom + " : "; 
	 } 
	 
	 public int preparerPotion() {
		 Random test = new Random();
		 forcePotion=test.nextInt(effetPotionMax-effetPotionMin)+effetPotionMin;
		 if (forcePotion>7) {
			parler("j'ai prepare une super potion de force");
		} else {
			parler("Je n'ai pas trouvé tous les ingredients, ma potion est seulement de force "+forcePotion);
		}
		 return 0;
	 }
	 
	 public void booster(Gaulois testG) {
		 if (testG.getNom().equalsIgnoreCase("Obelix")){ 
			parler("Non, Obélix !... Tu n'auras pas de potion magique!");
			testG.parler("Par Bélénos, ce n'est pas juste");
		}else{
			testG.boirePotion(forcePotion);
		}
	 }
	 
	 public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix",5,10,1);
		panoramix.preparerPotion();
	}
}
