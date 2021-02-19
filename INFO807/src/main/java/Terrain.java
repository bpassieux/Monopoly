


public class Terrain extends Propriete {

    // ************************ Attributs *********************************

    private int nbmaisons = 0;

    public EtatTerrain etatTerrain;

    // ************************ Getteurs/Setteurs *********************************

    public EtatTerrain getEtatTerrain() {
        return etatTerrain;
    }

    public void setEtatTerrain(EtatTerrain etatTerrain) {
        this.etatTerrain = etatTerrain;
    }

    public int getNbmaisons() {
        return this.nbmaisons;
    }

    public void setNbmaisons(int value) {
        this.nbmaisons = value;
    }

    // ************************ Méthodes *********************************

    public Terrain(String nom, int prix, int loyer, Quartier quartier) {
        setNom(nom);
        setPrix(prix);
        setLoyer(loyer);
        setQuartier(quartier);
        this.etatTerrain = new TerrainLibre(this);
    }

    /*
    public void evalConstructible(boolean estConstructible) {
        //this.etatTerrain.evalConstructible();
    }

    public void evalPlein() {
        this.etatTerrain.evalPlein();
    }
    */


    public boolean construireMaison() {
        return this.etatTerrain.construireMaison();
    }

    public void devientConstructible() {
        this.etatTerrain.devientConstructible();
    }

    public void devientOccupe() {
        this.etatTerrain.devientOccupe();
    }


    @Override
    public void tombeSurCase(Joueur joueur){
        etatTerrain.tombeSurCase(joueur);
    }

    @Override
    public void retireProprietaire() {
        etatTerrain.retireProprietaire();
    }

    @Override
    public void achatPropriete(Joueur joueur) {
        etatTerrain.achatPropriete(joueur);
    }

    @Override
    public void majLoyer() {
        etatTerrain.majLoyer();
    }


}
