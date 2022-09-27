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
	 
	 public String getNom() { 
		 return nom; 
	 } 
	 
	 public void parler(String texte) { 
		 System.out.println(prendreParole() + "« " + texte + "»"); 
	 }
	 
	 private String prendreParole() { 
		 return "Le druide " + nom + " : "; 
	 } 
	 
	 private int preparerPotion() {
		 Random test = new Random();
		 forcePotion=test.nextInt(effetPotionMax);
		 if (forcePotion>7) {
			parler("j'ai prepare une super potion de force");
		} else {
			parler("Je n'ai pas trouvé tous les ingredients, ma potion est seulement de force");
		}
		 return 0;
	 }
	 
	 public void booster(Gaulois test) {
		 if (test.getNom()=="Obelix"); { //string.equalIgnoreCase
			
		}
	 }
	 
	 public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix",5,10,1);
		panoramix.preparerPotion();
	}
}
