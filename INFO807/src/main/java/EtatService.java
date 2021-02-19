
public abstract class EtatService {
    public Service service;

    public abstract void tombeSurCase(Joueur joueur);

    public abstract boolean verifJoueur(Joueur joueur);

    public abstract int lancerDe();

    public abstract void achatPropriete(Joueur joueur);

    public abstract void majLoyer();

    public abstract void retireProprietaire();
}
