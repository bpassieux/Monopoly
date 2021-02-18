import java.util.ArrayList;
import java.util.List;

public class Partie {
    public Plateau plateau;

    public List<Joueur> joueur = new ArrayList<Joueur> ();

    public void lancementPartie() {
    }

    public boolean ajouterJoueur(String nom) {
    }

    public boolean verifierInitiationJoueur(String nom) {
    }

    public Case avancer(Joueur joueur,Case courant, int distance) {
        return plateau.avancer(joueur,courant,distance);
    }

}
