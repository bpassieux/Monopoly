


public abstract class Propriete extends Case {

    private Joueur joueur = null;

    private Quartier quartier;

    public Joueur getJoueur() {
        return this.joueur;
    }


    public void setJoueur(Joueur value) {
        // Automatically generated method. Please do not modify this code.
        this.joueur = value;
    }


    private int prix;


    public int getPrix() {
        return this.prix;
    }


    public void setPrix(int value) {
        this.prix = value;
    }


    private int loyer;


    public int getLoyer() {
        return this.loyer;
    }


    public void setLoyer(int value) {
        this.loyer = value;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }




    public EtatTerrain setProprietaire(Joueur joueur) {
    }

    public void tombeSurCase() {
    }


    public void retireProprietaire() {
    }

    public void achatPropriete(Joueur joueur) {

    }


    public void setEtat(EtatTerrain etat) {
    }


    public void majLoyer() {
    }

}
