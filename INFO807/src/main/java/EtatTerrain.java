
public abstract class EtatTerrain {
    public Terrain terrain;

    public abstract void retireProprietaire();
    /*
    public abstract void evalConstructible(boolean estConstructible);

    public abstract void evalPlein();
    */
    public abstract boolean construireMaison();

    public abstract void tombeSurCase(Joueur joueur);

    public abstract void achatPropriete(Joueur joueur);

    public abstract void verifConstructible(Joueur joueur);

    public abstract void devientConstructible();

    public abstract void majLoyer();

    public abstract boolean verifJoueur(Joueur joueur);

    public abstract int compteMaison();

    public abstract void verifPlein();

    public abstract void devientOccupe();

}
