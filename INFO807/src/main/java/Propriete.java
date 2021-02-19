public abstract class Propriete extends Case {
    //********************* attributs *****************************
    private Joueur joueur = null;

    private Quartier quartier;

    private int prix;

    private int loyer;

    //********************** Getteurs/Setteurs ***************************

    public Joueur getJoueur() {
        return this.joueur;
    }

    public void setJoueur(Joueur value) {
        this.joueur = value;
    }

    public int getPrix() {
        return this.prix;
    }

    public void setPrix(int value) {
        this.prix = value;
    }

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

//******************************** méthodes *************************************

    //public abstract void tombeSurCase(Joueur joueur);

    public abstract void retireProprietaire();

    public abstract void achatPropriete(Joueur joueur);

    public abstract void majLoyer();

}
