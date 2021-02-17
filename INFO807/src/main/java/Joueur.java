import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("56620ce6-352c-418c-9f2c-20b414ec029c")
public class Joueur {
    @mdl.prop
    @objid ("701b8754-9ada-451d-9e5b-6fa722e1e16b")
    private String pseudo;

    @mdl.propgetter
    public String getPseudo() {
        // Automatically generated method. Please do not modify this code.
        return this.pseudo;
    }

    @mdl.propsetter
    public void setPseudo(String value) {
        // Automatically generated method. Please do not modify this code.
        this.pseudo = value;
    }

    @objid ("73007147-d622-4b97-afba-72993c6b086e")
    public Case case;

    @objid ("48f5892c-42e6-4e11-acc2-1c4ae5271c06")
    public List<Propriete> propriete = new ArrayList<Propriete> ();

    @objid ("82598e26-4bbf-46d9-b0d0-4e6f2356dcbe")
    public void jouerUnTour() {
    }

    @objid ("1b1e29bb-c352-4b02-84e9-fb69beab50ef")
    public int lancerDes() {
    }

    @objid ("e9d50812-21b7-4c75-ac5e-45492cd66ffb")
    public void ajoutArgent(int argent) {
    }

    @objid ("0a47f1e5-fa6b-46e4-8c6d-f2ff3d38f6d3")
    public void enleverArgent(int argent) {
    }

    @objid ("7234b8eb-024e-4236-bb72-6368a214ebab")
    public void vendrePropriete(Propriete propriete) {
    }

    @objid ("b20ac459-55f0-4f5f-aca5-bae8327209b2")
    public void achatPropriete() {
    }

    @objid ("d69dd20a-d5a0-4811-9bc1-5cca397c817e")
    public void construireMaison(Propriete propriete) {
    }

    @objid ("85860cdb-0619-49fe-8a4d-70835f1b0b2f")
    public void finDeTour() {
    }

    @objid ("fa5872b2-51cc-46f4-835c-c491e0365473")
    public boolean verifArgent(int prixProp) {
    }

    @objid ("2111979b-ff21-4fa9-a994-30a9cba95daf")
    public void ajouterArgentJoueur(int argent) {
    }

    @objid ("0de91eb9-822b-4725-94f5-72fe17ebf4c2")
    public boolean paye(int prix) {
    }

    @objid ("6571cbea-bc08-4366-b1c6-65d7d4469847")
    public void listerConstructibles() {
    }

}
