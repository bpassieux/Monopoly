
public class ServiceOccupe extends EtatService {
    public ServiceOccupe(Service service){
        this.service = service;
    }

    @Override
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
