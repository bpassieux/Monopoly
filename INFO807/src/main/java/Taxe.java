public class Taxe extends Case {

    private int prix;
    public Taxe(String nom, int prix){
        setNom(nom);
        this.prix = prix;
    }

    public void tombeSurCase() {
    }

    @Override
    public void tombeSurCase(Joueur joueur) {

    }
}
