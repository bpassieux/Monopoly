import java.util.Scanner;

public class GareLibre extends EtatGare {
    public Gare gare;

    public GareLibre(Gare gare){
        this.gare = gare;
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        boolean fini = false;
        System.out.println("le terrain :" + gare.getNom() + " est libre");
        System.out.println("le prix :" + gare.getPrix());
        System.out.println("le loyer :" + gare.getLoyer());
        System.out.println("vous avez " + joueur.getArgent() + " sur votre compte");
        System.out.println("voulez vous l'acheter ? ");
        System.out.println("1 - oui ");
        System.out.println("2 - non");
        while(!fini){
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
        if(joueur.paye(gare.getPrix())){
            gare.setJoueur(joueur);
            gare.setEtatGare(new GareOccupee(gare));
        }else{
            System.out.println("allez bosser bordel, pas assez d'argent !!!!!!");
        }
    }

    @Override
    public void retireProprietaire() {
    }

    @Override
    public void majLoyer() {
    }

    @Override
    public boolean verifJoueur(Joueur joueur) {
        return true;
    }

}
