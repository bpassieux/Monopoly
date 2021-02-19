public class GareOccupee extends EtatGare {
    public Gare gare;

    public GareOccupee(Gare gare){
        this.gare = gare;
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        if(!verifJoueur(joueur)){
            int cpt = this.gare.getLoyer() * this.gare.quartier.compteGare(gare.getJoueur());
            joueur.paye( cpt );
            gare.getJoueur().ajoutArgent( cpt );
        }
    }

    @Override
    public void achatPropriete(Joueur joueur) {
    }

    @Override
    public void retireProprietaire() {
    }

    @Override
    public void majLoyer() {
    }

    @Override
    public boolean verifJoueur(Joueur joueur) {
        return gare.getJoueur().equals(joueur);
    }
}
