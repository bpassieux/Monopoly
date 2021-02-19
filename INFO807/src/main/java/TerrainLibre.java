import java.util.Scanner;

public class TerrainLibre extends EtatTerrain {

    public Terrain terrain;

    public TerrainLibre(Terrain terrain){
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
        boolean fini = false;
        System.out.println("le terrain :" + terrain.getNom() + " est libre");
        System.out.println("le prix :" + terrain.getPrix());
        System.out.println("le loyer :" + terrain.getLoyer());
        System.out.println("vous avez " + joueur.getArgent() + " sur votre compte");
        System.out.println("voulez vous l'acheter ? ");
        System.out.println("1 - oui ");
        while(!fini){
            System.out.println("2 - non");
            Scanner scanIn = new Scanner(System.in);
            int choix = scanIn.nextInt();
            if(choix == 1){
                joueur.achatPropriete();
                fini = true;
            }
            else if(choix == 2){
                fini = true;
            }
            else{
                System.out.println("choix invalide");
            }
        }
    }

    @Override
    public void achatPropriete(Joueur joueur) {
        if(joueur.paye(terrain.getPrix())){
            terrain.setJoueur(joueur);
            terrain.setEtatTerrain(new TerrainOccupe(terrain));
            terrain.etatTerrain.verifConstructible(joueur);
            System.out.println("terrain :" + terrain.getNom() + " acheté");
        }else{
            System.out.println("allez bossez bordel !!! , pas assez d'argent");
        }
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
        return true;
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
