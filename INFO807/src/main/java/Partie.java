import java.util.ArrayList;
import java.util.List;

public class Partie {
    public Plateau plateau;

    public List<Joueur> joueur = new ArrayList<Joueur> ();

    public void lancementPartie() {
        boolean fini = false;
        int i = 0;
        int nb_joueurs = joueur.size();
        while (!fini){
            joueur.get( i % nb_joueurs).jouerUnTour();
            i++;
            if (i > 5){
                fini = true;
            }
        }
        System.out.println("Partie terminée");
    }

    public boolean ajouterJoueur(String nom) {
        if(verifierInitiationJoueur(nom)){
            Joueur j = new Joueur(nom, plateau.getPlateau().get(0));
            j.partie = this;
            this.joueur.add(j);
            return true;
        }
        return false;
    }

    public boolean verifierInitiationJoueur(String nom) {
        boolean res = true;
        for (Joueur j : joueur) {
            if (j.getPseudo() == nom){
                System.out.println("le nom est déjà utilisé par un autre joueur");
                res = false;
            }
        }
        if(joueur.size() == 6){
            System.out.println("la partie est pleine, vous nous pouvez pas ajouter des joueurs");
            res = false;
        }
        return res;
    }

    public Case avancer(Joueur joueur,Case courant, int distance) {
        return plateau.avancer(joueur,courant,distance);
    }

}
