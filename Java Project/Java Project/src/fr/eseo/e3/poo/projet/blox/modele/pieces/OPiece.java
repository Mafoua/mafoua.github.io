/**
 * 
 */
package fr.eseo.e3.poo.projet.blox.modele.pieces;
import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;
/**
 * @author jireh
 *
 */
public class OPiece extends Piece{

 public OPiece( Coordonnees coordonnees,Couleur couleur) {
		super( coordonnees,couleur);
		
		   }
 protected void setElements(Coordonnees coordonnees,Couleur couleur) {
	 getElements().clear();
	 getElements().add(new Element( coordonnees,couleur));
     getElements().add(new Element( new Coordonnees(coordonnees.getAbscisse()+1,coordonnees.getOrdonnee()-1),couleur));
     getElements().add(new Element( new Coordonnees(coordonnees.getAbscisse(),coordonnees.getOrdonnee()-1),couleur));
     getElements().add(new Element( new Coordonnees(coordonnees.getAbscisse()+1,coordonnees.getOrdonnee()),couleur));
 	
 }
 public void tourner(boolean sensHoraire) {
	    // Ne fait rien, car une O-Piece ne peut pas être tournée.
	}
}
