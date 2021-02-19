
public class Service extends Propriete {

    public EtatService etatService;

    public EtatService getEtatService() {
        return etatService;
    }

    public void setEtatService(EtatService etatService) {
        this.etatService = etatService;
    }

    public Service(String nom, int prix, int loyer, Quartier quartier){
        setNom(nom);
        setPrix(prix);
        setLoyer(loyer);
        setQuartier(quartier);
        this.etatService = new ServiceLibre(this);
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        etatService.tombeSurCase(joueur);
    }

    @Override
    public void retireProprietaire() {
        etatService.retireProprietaire();
    }

    @Override
    public void achatPropriete(Joueur joueur) {
        etatService.achatPropriete(joueur);
    }

    @Override
    public void majLoyer() {
        etatService.majLoyer();
    }
}
