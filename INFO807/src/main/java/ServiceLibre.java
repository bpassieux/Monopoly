import java.util.Scanner;

public class ServiceLibre extends EtatService {

    public ServiceLibre(Service service){
        this.service = service;
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
        System.out.println("le service :" + service.getNom() + " est libre");
        System.out.println("le prix : " + service.getPrix());
        System.out.println("le loyer : " + service.getLoyer()+ " * 4 * le montant des des si tu en possede 1, 10x le montant des des si tu en possède les deux");
        System.out.println("vous avez " + joueur.getArgent() + " sur votre compte");

        while(!fini){
            System.out.println("voulez vous l'acheter ? ");
            System.out.println("1 - oui ");
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

    public void achatPropriete(Joueur joueur) {
        if(joueur.paye(service.getPrix())){
            service.setJoueur(joueur);
            service.setEtatService(new ServiceOccupe(service));
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

