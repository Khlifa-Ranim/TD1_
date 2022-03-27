package exercice1;
import java.util.*;

public class Banque {  String nom;
public ArrayList <Compte> Comptes;    

Banque(String n){
  Comptes = new ArrayList<>(); 
  nom = n;
}

public void creerCompte(Compte c) {
	  Comptes.add(c);
}

public void Affiche() {
	System.out.println("Banque [nom=" + nom + ", Comptes=" + Comptes + "]");
}

}
