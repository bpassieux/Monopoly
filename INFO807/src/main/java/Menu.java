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
        // God mod player
        partie.ajouterJoueur("God");
        Joueur god = partie.joueur.get(0);
        // 2 quartiers de la première partie du plateau
        /*partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(1));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(3));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(6));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(8));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(9));*/
        ((Terrain)partie.plateau.getPlateau().get(1)).etatTerrain.achatPropriete(god);
        ((Terrain)partie.plateau.getPlateau().get(3)).etatTerrain.achatPropriete(god);
        ((Terrain)partie.plateau.getPlateau().get(6)).etatTerrain.achatPropriete(god);
        ((Terrain)partie.plateau.getPlateau().get(8)).etatTerrain.achatPropriete(god);
        ((Terrain)partie.plateau.getPlateau().get(9)).etatTerrain.achatPropriete(god);
        // Les gares
        /*partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(5));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(15));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(25));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(35));*/
        ((Gare)partie.plateau.getPlateau().get(5)).etatGare.achatPropriete(god);
        ((Gare)partie.plateau.getPlateau().get(15)).etatGare.achatPropriete(god);
        ((Gare)partie.plateau.getPlateau().get(25)).etatGare.achatPropriete(god);
        ((Gare)partie.plateau.getPlateau().get(35)).etatGare.achatPropriete(god);
        // Les services
        /*partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(12));
        partie.joueur.get(0).propriete.add((Propriete) partie.plateau.getPlateau().get(28));*/
        ((Service)partie.plateau.getPlateau().get(12)).etatService.achatPropriete(god);
        ((Service)partie.plateau.getPlateau().get(28)).etatService.achatPropriete(god);

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
