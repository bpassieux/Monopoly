
public class TerrainConstructible extends EtatTerrain {

    public TerrainConstructible(Terrain terrain){
        this.terrain = terrain;
    }

    @Override
    public void retireProprietaire() {
    }

    @Override
    public boolean construireMaison() {
        if (terrain.getJoueur().paye(50)){
            terrain.setNbmaisons(terrain.getNbmaisons()+1);
            verifPlein();
            System.out.println("Maison achetée");
            return true;
        }
        return false;
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        System.out.println("le terrain appartient au quartier : " + terrain.getQuartier().getNom());
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
        if( compteMaison() == 5){
            terrain.setEtatTerrain(new TerrainPlein(terrain));
        }
    }

    @Override
    public void devientOccupe() {
    }

    @Override
    public void devientConstructible() {
    }

    @Override
    public void verifConstructible(Joueur joueur) {
    }
}
