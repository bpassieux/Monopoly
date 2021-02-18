import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    public static int recupeChoix(){
        Scanner scanIn = new Scanner(System.in);
        System.out.println("votre choix ?");

        int choix = scanIn.nextInt();
        System.out.println("votre choix est " + choix);
        return choix;
    }

    public static Partie initPartie(){
        boolean finiInit = false;
        Partie partie = new Partie();
        Plateau plateau = new Plateau();
        partie.plateau = plateau;

        while (!finiInit){
            System.out.println("Bienvenue dans le Monopoly de Al Rasheed Hamze, Passieux Bertrand et Wagner Robin");
            System.out.println("1 - créer et ajouter un joueur");
            System.out.println("2 - lancer partie ");
            switch(recupeChoix()) {
                case 1:
                    System.out.print("écrivez le nom du joueur svp : ");
                    Scanner scanIn = new Scanner(System.in);
                    String nom = scanIn.nextLine();
                    Joueur j = new Joueur(nom, plateau.getPlateau().get(0));
                    j.partie = partie;
                    partie.joueur.add(j);
                    System.out.println("le joueur " + j + " a été créé et ajouté dans la partie");
                    break;
                case 2:
                    finiInit = true;
                    break;
                default:
                    System.out.println("choix invalide ");
            }
        }
        return partie;
    }

    public static void main(String args[])
    {
        boolean fini = false;
        Partie partie = initPartie();
        int i = 0;
        int nb_joueurs = partie.joueur.size();
        while (!fini){
            partie.joueur.get( i % nb_joueurs).jouerUnTour();
            i++;
            if (i > 5){
                fini = true;
            }
        }

       /* while( !fini ){
            switch(recupeChoix()) {
                case 1:
                    // code block
                    break;
                case 2:
                    // code block
                    break;
                case 8952156430.1:
                    gagner();
                    fini = true;
                default:
                    // code block
            }
        }*/



    }


}
