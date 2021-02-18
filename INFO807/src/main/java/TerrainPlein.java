
public class TerrainPlein extends EtatTerrain {

    public TerrainPlein(Terrain terrain){
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
    }

    public void devientConstructible() {
    }

    public void majLoyer() {
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
