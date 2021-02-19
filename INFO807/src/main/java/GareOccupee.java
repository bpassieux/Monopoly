public class GareOccupee extends EtatGare {
    public Gare gare;

    public GareOccupee(Gare gare){
        this.gare = gare;
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        if(!verifJoueur(joueur)){
            int loyer = this.gare.getLoyer() * this.gare.quartier.compteGare(gare.getJoueur());
            joueur.paye( loyer );
            gare.getJoueur().ajoutArgent( loyer );
            System.out.println("vous avez payé " + loyer + " à " + gare.getJoueur().getPseudo() + " car vous êtes sur son terrain" );
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
