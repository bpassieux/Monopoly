public class Gare extends Propriete {

    public EtatGare etatGare;

    public  Quartier quartier;

    public EtatGare getEtatGare() {
        return etatGare;
    }

    public void setEtatGare(EtatGare etatGare) {
        this.etatGare = etatGare;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    public Gare(String nom, int prix, int loyer, Quartier quartier) {
        setNom(nom);
        setPrix(prix);
        setLoyer(loyer);
        setQuartier(quartier);
        setEtatGare(new GareLibre(this));
    }

    @Override
    public void tombeSurCase(Joueur joueur) {
        this.etatGare.tombeSurCase(joueur);
    }

    @Override
    public void retireProprietaire() {
        etatGare.retireProprietaire();

    }
    @Override
    public void achatPropriete(Joueur joueur) {
        etatGare.achatPropriete(joueur);
    }

    @Override
    public void majLoyer() {
        etatGare.majLoyer();
    }
}
