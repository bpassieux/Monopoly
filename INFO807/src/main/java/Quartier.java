import java.util.ArrayList;
import java.util.List;


public class Quartier {
    private TypeQuartier nom;

    public TypeQuartier getNom() {
        return nom;
    }

    public void setNom(TypeQuartier nom) {
        this.nom = nom;
    }

    public Quartier(TypeQuartier nom){
        this.nom = nom;
    }

    public ArrayList<Propriete> propriete = new ArrayList<Propriete> ();

    public void majQuartier(Joueur joueur) {
        int cpt = 0;
        for(int i = 0; i < propriete.size(); i++){
            if(propriete.get(i).getJoueur() == joueur){
                cpt++;
            }
        }
        if(cpt==(propriete.size())){
            for(int i = 0 ; i < propriete.size() ; i++){
                ((Terrain)propriete.get(i)).devientConstructible();
            }
        }else{
            // Mettre seulement les propriétés du joueur en occupé (tkt ça va appeler l'état et si c'est déjà occupé on va pas toucher)
            // Mais pas envie modifier mon modelio pour l'instant
        }
    }

    public boolean verifAppartenance(Joueur joueur) {
    }

    public int compteMultiplicateurService(Joueur joueur) {
        int cpt = 0;
        for(int i = 0; i < propriete.size(); i++){
            if(propriete.get(i).getJoueur() == joueur){
                cpt++;
            }
        }
        if(cpt==(propriete.size())){
            return 4;
        }else {
            return 10;
        }
    }

    public int compteGare(Joueur joueur) {
        int cpt = 0;
        for(int i = 0; i < propriete.size(); i++){
            if(propriete.get(i).getJoueur() == joueur){
                cpt++;
            }
        }
        return cpt;
    }

}
