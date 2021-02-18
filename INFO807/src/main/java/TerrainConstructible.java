
public class TerrainConstructible extends EtatTerrain {

    public void retireProprietaire() {
    }

    public void evalConstructible(boolean estConstructible) {
    }

    public void evalPlein() {
    }

    public boolean construireMaison() {
        if (terrain.getJoueur().paye(50)){
            terrain.setNbmaisons(terrain.getNbmaisons()+1);
            verifPlein();
            return true;
        }
        return false;
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
        if(terrain.getNbmaisons() == 5){
            terrain.setEtatTerrain(new TerrainPlein(terrain));
        }
    }

    public void devientOccupe() {
    }
}
