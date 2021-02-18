import java.util.Scanner;

public class TerrainLibre extends EtatTerrain {

    public TerrainLibre(Terrain terrain){
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

    public int achatPropriete(Joueur joueur) {
        if(joueur.paye(terrain.getPrix())){
            terrain.setJoueur(joueur);
            terrain.setEtatTerrain(new TerrainOccupe(terrain));
            terrain.etatTerrain.verifConstructible(joueur);
        }else{

        }
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
