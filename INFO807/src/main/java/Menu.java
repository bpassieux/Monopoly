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
                    if(partie.ajouterJoueur(nom)){
                        System.out.println("le joueur " + nom + " a été créé et ajouté dans la partie");
                    }
                    break;
                case 2:
                    if (partie.joueur.size()>2){
                        finiInit = true;
                    }else{
                        System.out.println("Pas assez de joueurs");
                    }
                    break;
                default:
                    System.out.println("choix invalide ");
            }
        }
        return partie;
    }

    public static void main(String args[])
    {
        Partie partie = initPartie();
        partie.lancementPartie();
    }

}
