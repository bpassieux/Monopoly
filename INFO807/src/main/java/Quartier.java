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
        for(int i = 0 ; i < propriete.size() ; i++){
            ((Terrain)propriete.get(i)).devientConstructible();
        }
    }

    public boolean verifAppartenance(Joueur joueur) {
        int cpt = 0;
        for(int i = 0; i < propriete.size(); i++){
            if(propriete.get(i).getJoueur() != null) {
                if (propriete.get(i).getJoueur().equals(joueur)) {
                    cpt++;
                }
            }
        }
        System.out.println("le joueur a " + cpt + " propriétés dans le quartier " + this.getNom());
        if(cpt==(propriete.size())){
            return true;
        }else{
            return false;
        }
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
