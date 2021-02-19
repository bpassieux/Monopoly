import java.util.Scanner;

public class ServiceLibre extends EtatService {

    public ServiceLibre(Service service){
        this.service = service;
    }

    public void retireProprietaire() {
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        boolean fini = false;

        while(!fini){
            System.out.println("le service :" + service.getNom() + " est libre");
            System.out.println("le prix : " + service.getPrix());
            System.out.println("le loyer : " + service.getLoyer()+ " * 4 * le montant des des si tu en possede 1," + service.getLoyer()+ " * 10 * le montant des des si tu en possède les deux");
            System.out.println("vous avez " + joueur.getArgent() + " sur votre compte");
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

    @Override
    public boolean verifJoueur(Joueur joueur) {
        return true;
    }

    @Override
    public int lancerDe() {
        return 0;
    }

    @Override
    public void achatPropriete(Joueur joueur) {
        if(joueur.paye(service.getPrix())){
            service.setJoueur(joueur);
            joueur.propriete.add(service);
            System.out.println("le joueur " + joueur.getPseudo() + " a acheté " + service.getNom());
            service.setEtatService(new ServiceOccupe(service));
        }
    }

    @Override
    public void majLoyer() {
    }
}

