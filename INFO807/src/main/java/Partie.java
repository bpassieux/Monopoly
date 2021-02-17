import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8cd168b4-e8fe-4c54-ab15-a70df2dea3c0")
public class Partie {
    @objid ("42ed6ab1-d808-46e2-bdc8-4b56822bc418")
    public Plateau plateau;

    @objid ("ebb9d364-27c7-4ecd-a8b2-a63b7e9c12d7")
    public List<Joueur> joueur = new ArrayList<Joueur> ();

    @objid ("8cc6aa45-4ffc-4496-ae2e-b2828d707858")
    public void lancementPartie() {
    }

    @objid ("7c087c85-952f-4953-9f24-591cfd8a6479")
    public boolean ajouterJoueur(String nom) {
    }

    @objid ("bc9d3595-c4af-45d6-a759-1700893a7636")
    public boolean verifierInitiationJoueur(String nom) {
    }

    @objid ("c30da167-3ed7-4e36-b18c-3afe2c863e47")
    public Case avancer(Case courant, int distance) {
    }

    @objid ("b58d95b4-ffa2-4ff8-a468-9f0e0f5227de")
    public void finDuTour() {
    }

}
