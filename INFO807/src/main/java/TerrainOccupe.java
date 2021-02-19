
public class TerrainOccupe extends EtatTerrain {

    public TerrainOccupe(Terrain terrain){
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
    public void verifConstructible(Joueur joueur) {
        if(terrain.getQuartier().verifAppartenance(joueur)){
            terrain.getQuartier().majQuartier(joueur);
        }
    }

    @Override
    public void devientConstructible() {
        terrain.setEtatTerrain(new TerrainConstructible(terrain));
        majLoyer();
    }

    @Override
    public void majLoyer() {
        terrain.setLoyer(terrain.getLoyer() * 2);
    }

    @Override
    public boolean verifJoueur(Joueur joueur) {
        return terrain.getJoueur().equals(joueur);
    }

    @Override
    public int compteMaison() {
        return 0;
    }

    @Override
    public void verifPlein() {
    }

    @Override
    public void devientOccupe() {
    }
}
