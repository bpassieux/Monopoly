
public class TerrainPlein extends EtatTerrain {

    public TerrainPlein(Terrain terrain){
        this.terrain = terrain;
    }

    @Override
    public void retireProprietaire() {
    }

    @Override
    public boolean construireMaison() {
        return false;
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        if(!verifJoueur(joueur)){
            int maisons = compteMaison();
            int loyer = terrain.getLoyer() + (maisons * 50);
            joueur.paye(loyer);
            terrain.getJoueur().ajoutArgent(loyer);
            System.out.println("vous avez payé " + loyer + " à " + terrain.getJoueur().getPseudo() + " car vous êtes sur son terrain" );
        }
    }

    @Override
    public void achatPropriete(Joueur joueur) {
    }

    @Override
    public void verifConstructible(Joueur joueur) {
    }

    @Override
    public void devientConstructible() {
    }

    @Override
    public void majLoyer() {
    }

    @Override
    public boolean verifJoueur(Joueur joueur) {
        return terrain.getJoueur().equals(joueur);
    }

    @Override
    public int compteMaison() {
        return terrain.getNbmaisons();
    }

    @Override
    public void verifPlein() {
    }

    @Override
    public void devientOccupe() {
    }
}
