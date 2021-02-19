
public abstract class Case {
    private String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }


    public abstract void tombeSurCase(Joueur joueur);



}
