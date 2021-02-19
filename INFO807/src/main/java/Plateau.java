import java.util.ArrayList;
import java.util.List;



public class Plateau {
    private ArrayList<Case> plateau = new ArrayList<Case>();
    public ArrayList<Quartier> quartiers = new ArrayList<Quartier> ();

    public ArrayList<Quartier> getQuartiers() {
        return quartiers;
    }

    public void setQuartiers(ArrayList<Quartier> quartiers) {
        this.quartiers = quartiers;
    }



    public ArrayList<Case> getPlateau() {
        return plateau;
    }

    public void setPlateau(ArrayList<Case> plateau) {
        this.plateau = plateau;
    }

    Plateau(){
        initPlateau();
    }

    public void initPlateau(){
        // les quartiers
        Quartier rouge = new Quartier(TypeQuartier.Rouge);
        Quartier vert = new Quartier(TypeQuartier.Vert);
        Quartier bleu= new Quartier(TypeQuartier.Bleu);
        Quartier bleuClair = new Quartier(TypeQuartier.BleuClair);
        Quartier orange = new Quartier(TypeQuartier.Orange);
        Quartier marron = new Quartier(TypeQuartier.Marron);
        Quartier rose = new Quartier(TypeQuartier.Rose);
        Quartier jaune = new Quartier(TypeQuartier.Jaune);
        Quartier service = new Quartier(TypeQuartier.Service);
        Quartier gare = new Quartier(TypeQuartier.Gare);

        quartiers.add(rouge);
        quartiers.add(vert);
        quartiers.add(bleu);
        quartiers.add(bleuClair);
        quartiers.add(orange);
        quartiers.add(marron);
        quartiers.add(rose);
        quartiers.add(jaune);
        quartiers.add(service);
        quartiers.add(gare);

        //case depart
        Depart depart = new Depart();

        //les gares
        Gare gareMontparnasse = new Gare("gareMontparnasse",200,25, gare);
        Gare gareDeLyon = new Gare("gareDeLyon",200,25, gare);
        Gare gareDuNord = new Gare("gareDuNord",200,25, gare);
        Gare gareSaintLazare = new Gare("gareSaintLazare",200,25, gare);

        //les taxes
        Taxe impotsSurLeRevenu = new Taxe("impotsSurLeRevenu",200);
        Taxe luxe = new Taxe("luxe",100);

        //les cases inutiles
        Taxe caisseDeCommunaute = new Taxe("caisseDeCommunaute", 0);
        Taxe caisseDeCommunaute2 = new Taxe("caisseDeCommunaute", 0);
        Taxe caisseDeCommunaute3 = new Taxe("caisseDeCommunaute", 0);
        Taxe chance = new Taxe("chance", 0);
        Taxe chance2 = new Taxe("chance", 0);
        Taxe chance3 = new Taxe("chance", 0);
        Taxe prison = new Taxe("prison", 0);
        Taxe parcGratuit = new Taxe("parcGratuit", 0);
        Taxe allezEnPrison = new Taxe("allezEnPrison", 0);

        //les services
        Service compagnieDeDistributionDElectricite = new Service("compagnieDeDistributionDElectricite",150, 5, service);
        Service compagnieDeDistributionDesEaux = new Service("compagnieDeDistributionDesEaux",150, 5, service);

        //les terrains
        Terrain boulevardDeBelleville = new Terrain("boulevardDeBelleville",60,2, marron);
        Terrain rueLecourbe = new Terrain("rueLecourbe",60,4, marron);
        Terrain rueDeVaugirard = new Terrain("rueDeVaugirard",100,6, bleuClair);
        Terrain rueDeCourcelles = new Terrain("rueDeCourcelles",100,6, bleuClair);
        Terrain avenueDeLaRepublique = new Terrain("avenueDeLaRepublique",120,8, bleuClair);
        Terrain boulevardDeLaVillette = new Terrain("boulevardDeLaVillette",140,10, rose);
        Terrain avenueDeNeuilly = new Terrain("avenueDeNeuilly",140,10, rose);
        Terrain rueDeParadis = new Terrain("rueDeParadis",160,12, rose);
        Terrain avenueMozart = new Terrain("avenueMozart",180,14, rose);
        Terrain boulevardSaintMichel = new Terrain("boulevardSaintMichel",180,14, orange);
        Terrain placePigaille = new Terrain("placePigaille",200,16, orange);
        Terrain avenueMatignon = new Terrain("avenueMatignon",220,18, rouge);
        Terrain placeDeLaBourse = new Terrain("placeDeLaBourse",260,22, jaune);
        Terrain avenueHenriMartin = new Terrain("avenueHenriMartin",240,20, rouge);
        Terrain boulevardMalesherbes = new Terrain("boulevardMalesherbes",220,18, rouge);
        Terrain faubourgSaintHonore = new Terrain("faubourgSaintHonore",260,22, jaune);
        Terrain avenueDeBreteuil = new Terrain("avenueDeBreteuil",300,26, vert);
        Terrain rueDeLaFayette = new Terrain("rueDeLaFayette",280,24, jaune);
        Terrain avenueFoch = new Terrain("avenueFoch",300,26, vert);
        Terrain boulevardDesCapucines = new Terrain("boulevardDesCapucines",320,28, vert);
        Terrain avenueDesChampsElysees = new Terrain("avenueDesChampsElysees",350,35, bleu);
        Terrain rueDeLaPaix = new Terrain("rueDeLaPaix",400,50, bleu);

        plateau.add(depart);
        plateau.add(boulevardDeBelleville);
        plateau.add(caisseDeCommunaute);
        plateau.add(rueLecourbe);
        plateau.add(impotsSurLeRevenu);
        plateau.add(gareMontparnasse);
        plateau.add(rueDeVaugirard);
        plateau.add(chance);
        plateau.add(rueDeCourcelles);
        plateau.add(avenueDeLaRepublique);
        plateau.add(prison);
        plateau.add(boulevardDeLaVillette);
        plateau.add(compagnieDeDistributionDElectricite);
        plateau.add(avenueDeNeuilly);
        plateau.add(rueDeParadis);
        plateau.add(gareDeLyon);
        plateau.add(avenueMozart);
        plateau.add(caisseDeCommunaute2);
        plateau.add(boulevardSaintMichel);
        plateau.add(placePigaille);
        plateau.add(parcGratuit);
        plateau.add(avenueMatignon);
        plateau.add(chance2);
        plateau.add(boulevardMalesherbes);
        plateau.add(avenueHenriMartin);
        plateau.add(gareDuNord);
        plateau.add(faubourgSaintHonore);
        plateau.add(placeDeLaBourse);
        plateau.add(compagnieDeDistributionDesEaux);
        plateau.add(rueDeLaFayette);
        plateau.add(allezEnPrison);
        plateau.add(avenueDeBreteuil);
        plateau.add(avenueFoch);
        plateau.add(caisseDeCommunaute3);
        plateau.add(boulevardDesCapucines);
        plateau.add(gareSaintLazare);
        plateau.add(chance3);
        plateau.add(avenueDesChampsElysees);
        plateau.add(luxe);
        plateau.add(rueDeLaPaix);
        // les quarties

    }

    public Case avancer(Joueur joueur,Case courant, int distance) {
        Case arrivee = null;
        for (Case c : plateau)
        {
            if(courant.equals(c)){
                int index = plateau.indexOf(c);
                int indexArrivee = (index + distance) % 40;
                arrivee = plateau.get(indexArrivee);
                System.out.println("vous êtes arrivé sur la case : " + arrivee.getNom());
                if(verifPassageDepart(joueur,courant,arrivee)){
                    System.out.println("vous êtes passé pas la case départ, vous gagnez 200 !!!");
                }
            }
        }
        return arrivee;
    }

    public boolean verifPassageDepart(Joueur joueur,Case courant, Case suivant) {
        if(plateau.indexOf(courant) > plateau.indexOf(suivant)){
            joueur.ajoutArgent(200);
            return true;
        }
        return false;
    }

    public boolean verifQuartier(Propriete propriete, Joueur joueur) {
        return false;
    }

    public int vendrePropriete(Propriete propriete) {
        return 0;
    }

    /*depart
    boulevardDeBelleville, marron , 60 , 2 ------------------------
    caisseDeCommunaute ---------------------------
    rueLecourbe, marron , 60 , 4 ----------------------
    impotsSurLeRevenu , 200 -----------------------------

    gareMontparnasse , 200 , 25 pour une gare, 50 pour deux, 100 pour trois, 200 pour quatre--------------
    rueDeVaugirard, bleuClair , 100 , 6 --------------------------------
    chance --------------------
    rueDeCourcelles,bleuClair , 100 , 6 --------------------------------
    avenueDeLaRepublique, bleuClair , 120 , 8 -----------------------------
    prison -----------------------------------
    boulevardDeLaVillette, rose , 140 , 10 -----------------------------------
    compagnieDeDistributionDElectricite , 150 , 4 x le montant des des si tu en possede 1,------------------
    10x le montant des des si tu en possede les deux
    avenueDeNeuilly, rose , 140, 10 --------------------------------------
    rueDeParadis, rose , 160 , 12 ------------------------------------------
    gareDeLyon , 200 , 25 pour une gare, 50 pour deux, 100 pour trois, 200 pour quatre -----------------------
    avenueMozart, orange , 180 , 14 ------------------------------------
    caisseDeCommunaute --------------------------------------------
    boulevardSaintMichel, orange , 180 , 14 -------------------------------
    placePigaille, orange , 200 , 16 -----------------------------------
    parcGratuit ----------------------------------------------
    avenueMatignon, rouge , 220 , 18 -----------------------------
    chance ------------------------------------
    boulevardMalesherbes, rouge , 220 , 18 --------------------------
    avenueHenriMartin, rouge , 240 , 20 -----------------------------
    gareDuNord , 200 , 25 pour une gare, 50 pour deux, 100 pour trois, 200 pour quatre ----------------------------
    faubourgSaintHonore, jaune , 260 , 22 -------------------------------
    placeDeLaBourse, jaune , 260 , 22 ------------------------------------
    compagnieDeDistributionDesEaux , 150 ,  4 x le montant des des si tu en possede 1,
    10x le montant des des si tu en possede les deux --------------------------
    rueDeLaFayette, jaune , 280 , 24 -----------------------------------
    allezEnPrison -----------------------------
    avenueDeBreteuil, vert , 300 , 26 ----------------------------
    avenueFoch, vert , 300 , 26 ------------------------------
    caisseDeCommunaute ----------------------------------
    boulevardDesCapucines, vert , 320 , 28 -------------------------
    gareSaintLazare, 200 ,  25 pour une gare, 50 pour deux, 100 pour trois, 200 pour quatre --------------------------
    chance ------------------------
    avenueDesChampsElysees, bleuFonce , 350 , 35 -----------------------------------
    taxeDeLuxe , 100 ------------------------------
    rueDeLaPaix, bleuFonce , 400 , 50 ----------------------------
    */


}
