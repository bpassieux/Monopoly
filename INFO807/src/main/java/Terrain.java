


public class Terrain extends Propriete {

    private int nbmaisons = 0;

    public EtatTerrain etatTerrain;

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


    public Terrain(String nom, int prix, int loyer, Quartier quartier) {
        setNom(nom);
        setPrix(prix);
        setLoyer(loyer);
        setQuartier(quartier);
        this.etatTerrain = new TerrainLibre(this);
    }

    public boolean construireMaison() {
        return this.etatTerrain.construireMaison();
    }

    public void evalConstructible(boolean estConstructible) {
        //this.etatTerrain.evalConstructible();
    }

    public void evalPlein() {
        this.etatTerrain.evalPlein();
    }

    public void devientConstructible() {
        this.etatTerrain.devientConstructible();
    }

    public void devientOccupe() {
        this.etatTerrain.devientOccupe();
    }

    public void tombeSurCase(Joueur joueur){
        etatTerrain.tombeSurCase(joueur);
    }


    public void achatPropriete(Joueur joueur) {
        etatTerrain.achatPropriete(joueur);
    }


}
