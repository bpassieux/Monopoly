
public class TerrainOccupe extends EtatTerrain {

    public TerrainOccupe(Terrain terrain){
        this.terrain = terrain;
    }

    public void retireProprietaire() {
    }

    public void evalConstructible(boolean estConstructible) {
    }

    public void evalPlein() {
    }

    public boolean construireMaison() {
    }

    public void tombeSurCase(Joueur joueur) {
        if(!verifJoueur(joueur)){
            int maisons = compteMaison();
            int loyer = terrain.getLoyer() + (maisons * 50);
            joueur.paye(loyer);
            terrain.getJoueur().ajoutArgent(loyer);
        }
    }

    public int achatPropriete(Joueur joueur) {
    }

    public void verifConstructible(Joueur joueur) {
        terrain.getQuartier().majQuartier(joueur);
    }

    public void devientConstructible() {
        terrain.setEtat(new TerrainConstructible());
        majLoyer();
    }

    public void majLoyer() {
        terrain.setLoyer(terrain.getLoyer() * 2);
    }

    public boolean verifJoueur(Joueur joueur) {
    }

    public int compteMaison() {
    }

    public void verifPlein() {
    }

    public void devientOccupe() {
    }
}
