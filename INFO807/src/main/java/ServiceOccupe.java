
public class ServiceOccupe extends EtatService {
    public ServiceOccupe(Service service){
        this.service = service;
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        if(!verifJoueur(joueur)){
            int res = service.getQuartier().compteMultiplicateurService(joueur);
            int numDes = lancerDe();
            System.out.println("afin de calculer le loyer du  service, vous allez lancer un dé");
            System.out.println("vous avez lancé le dé et vous avez obtenu : " + numDes );
            System.out.println("loyer service si vous avez 1 service  = 4 * le loyer de base du service '5' * le numéro obtenu en lançant le dé");
            System.out.println("loyer service si vous avez 2 service  = 10* le loyer de base du service '5' * le numéro obtenu en lançant le dé");
            int loyer = numDes * res * service.getLoyer();
            if(joueur.paye(loyer)){
                service.getJoueur().ajoutArgent(loyer);
                System.out.println("vous avez payé " + loyer + " à " + service.getJoueur().getPseudo() + " car vous êtes sur son terrain" );
            }
        }
    }

    @Override
    public void achatPropriete(Joueur joueur) {
    }

    @Override
    public boolean verifJoueur(Joueur joueur) {
        return service.getJoueur().equals(joueur);
    }

    @Override
    public int lancerDe() {
        return (int) (Math.random() * (12 - 2)) + 2;
    }

    @Override
    public void majLoyer() {
    }

    @Override
    public void retireProprietaire() {
    }

}
