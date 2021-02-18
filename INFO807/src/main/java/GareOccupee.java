public class GareOccupee extends EtatGare {
    public Gare gare;

    public GareOccupee(Gare gare){
        this.gare = gare;
    }

    public void tombeSurCase(Joueur joueur) {
        if(!verifJoueur(joueur)){
            int cpt = this.gare.getLoyer() * this.gare.quartier.compteGare(gare.getJoueur());
            joueur.paye( cpt );
            this.gare.getJoueur().ajoutArgent( cpt );
        }
    }

    public void achatPropriete(Joueur joueur) {

    }

    public boolean verifJoueur(Joueur joueur) {
        return this.gare.getJoueur() == joueur;
    }
}
