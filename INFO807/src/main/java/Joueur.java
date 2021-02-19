import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Joueur {

    private String pseudo;

    private int argent;

    private Case caseC;

    public Partie partie;

    public List<Propriete> propriete = new ArrayList<Propriete> ();

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }


    public Joueur(String nom, Case caseC){
        this.pseudo = nom;
        this.argent = 500;
        this.caseC = caseC;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String value) {
        this.pseudo = value;
    }


    public Case getCaseC() {
        return caseC;
    }

    public void setCaseC(Case caseC) {
        this.caseC = caseC;
    }



    public void jouerUnTour() {
        boolean fini = false;
        boolean Construit = false;
        int resDes = lancerDes();

        System.out.println("c'est au joueur :" + this.getPseudo() + " de jouer");
        System.out.println("vous avez obtenu : " + resDes + " en lancant les dès");
        caseC = partie.avancer(this, caseC, resDes);
        caseC.tombeSurCase(this);

        while(!fini){
            System.out.println("vous pouvez effectuer les actions suivantes :");
            System.out.println("1 - visualisez les terrains constructibles");
            System.out.println("2 - construire une maison sur un terrain");
            System.out.println("3 - visualisez mon compte");
            System.out.println("4 - finir son tour");

            Scanner scanIn = new Scanner(System.in);
            int choix = scanIn.nextInt();
            if(choix == 1){
                listerConstructibles();
            }
            else if(choix == 2 && !Construit){
                System.out.print("écrivez le nom di terrain sur lequel vous voulez construir votre maison : ");
                Scanner scanIn2 = new Scanner(System.in);
                String nomRue = scanIn2.nextLine();
                Terrain t = verifTerrain(nomRue);
                if(t != null){
                    construireMaison(t);
                    Construit = true;
                }else{
                    System.out.println("nom invalide");
                }
            }else if(choix == 3){
                System.out.println("mon compte contient :" + this.argent);
            }
            else if(choix == 4){
                fini = true;
            }
            else{
                System.out.println("choix invalide");
            }
        }
    }

    public int lancerDes() {
        return (int) (Math.random() * (12 - 2)) + 2;
    }

    public void ajoutArgent(int argentObt) {
        argent += argentObt;
    }

    public void enleverArgent(int argentObt) {
        argent -= argentObt;
    }

    public void vendrePropriete(Propriete propriete) {
    }

    public void achatPropriete() {
        if(caseC.getClass() == Terrain.class){
            ((Terrain)caseC).achatPropriete(this);
        }else if(caseC.getClass() == Service.class){
            ((Service)caseC).achatPropriete(this);
        }else{
            ((Gare)caseC).achatPropriete(this);
        }
    }

    public void construireMaison(Terrain terrain) {
        if(terrain.construireMaison()){
            System.out.println("votre terrain  "+ terrain.getNom() + " contient "+ terrain.getNbmaisons() + " maisons");
        }else{
            System.out.println("construction échuée");
        }
    }


    public boolean verifArgent(int prixProp) {
        if(getArgent() > prixProp){
            return true;
        }else{
            return false;
        }
    }


    public boolean paye(int prix) {
        if(verifArgent(prix)){
            enleverArgent(prix);
            return true;
        }else{
            System.out.println("allez travaillez bordellllll !!!!");
            return false;
        }
    }

    public void listerConstructibles() {
        ArrayList<Terrain> constructible = new ArrayList<Terrain>();
        for(int i = 0 ; i < propriete.size() ; i++){
            if( (propriete.get(i).getClass() == Terrain.class) && ( ((Terrain)propriete.get(i)).etatTerrain.getClass() == TerrainConstructible.class)){
                constructible.add((Terrain)propriete.get(i));
            }
        }
        int i = 1;
        for (Terrain t : constructible){
            System.out.println("Terrain numéro " + i + ":  ");
            System.out.print("Nom : " + t.getNom() + ", ");
            System.out.print("Quartier : " + t.getQuartier().getNom() + ", ");
            System.out.println("Loyer : " + t.getLoyer());
            System.out.println("**********************************");

        }
    }

    public Terrain verifTerrain(String nomRue){
        for (Propriete p : propriete){
            if(p.getNom().matches(nomRue)){
                return ((Terrain)p);
            }
        }
        return null;
    }

}
