
public abstract class EtatGare {
    public Gare gare;

    public abstract void tombeSurCase(Joueur joueur);

    public abstract boolean verifJoueur(Joueur joueur);

    public abstract void achatPropriete(Joueur joueur);

    public abstract void retireProprietaire();

    public abstract void majLoyer();
}
