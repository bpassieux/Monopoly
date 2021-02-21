public class Taxe extends Case {

    private int prix;

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Taxe(String nom, int prix){
        setNom(nom);
        this.prix = prix;
    }


    @Override
    public void tombeSurCase(Joueur joueur) {
        int loyer = getPrix();
        if(loyer != 0){
            joueur.paye( loyer );
            System.out.println("vous avez payé " + loyer + " comme taxe pour " + this.getNom());
        }
    }
}
