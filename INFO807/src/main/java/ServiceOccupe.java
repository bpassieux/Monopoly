
public class ServiceOccupe extends EtatService {
    public ServiceOccupe(Service service){
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
        if(!verifJoueur(joueur)){
            int res = service.getQuartier().compteMultiplicateurService(joueur);
            int numDes = lancerDe();
            int loyer = numDes * res * service.getLoyer();
            if(joueur.paye(loyer)){
                service.getJoueur().ajoutArgent(loyer);
            }
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
    }

    public void devientOccupe() {
    }
}
