import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2ec4f982-6de1-4f52-9090-7c07fd3a3414")
public abstract class Propriete extends Case {
    @mdl.prop
    @objid ("0f8cb720-e6e9-46f0-8f94-b07ee9845b81")
    private Joueur joueur = null;

    @mdl.propgetter
    public Joueur getJoueur() {
        // Automatically generated method. Please do not modify this code.
        return this.joueur;
    }

    @mdl.propsetter
    public void setJoueur(Joueur value) {
        // Automatically generated method. Please do not modify this code.
        this.joueur = value;
    }

    @mdl.prop
    @objid ("e72bf611-7e60-453f-8001-6e0de4031d4d")
    private int prix;

    @mdl.propgetter
    public int getPrix() {
        // Automatically generated method. Please do not modify this code.
        return this.prix;
    }

    @mdl.propsetter
    public void setPrix(int value) {
        // Automatically generated method. Please do not modify this code.
        this.prix = value;
    }

    @mdl.prop
    @objid ("2b4ca648-a7da-444f-be2d-6aeda91afa0c")
    private int loyer;

    @mdl.propgetter
    public int getLoyer() {
        // Automatically generated method. Please do not modify this code.
        return this.loyer;
    }

    @mdl.propsetter
    public void setLoyer(int value) {
        // Automatically generated method. Please do not modify this code.
        this.loyer = value;
    }

    @objid ("440958db-7255-431f-84b6-857eb6e8710d")
    public Quartier ;

    @objid ("545d35d6-a127-4105-a254-7ae0e870c81e")
    public EtatTerrain setProprietaire(Joueur joueur) {
    }

    @objid ("eddee858-7484-423e-95a9-baca28ec045c")
    public void retireProprietaire() {
    }

    @objid ("0d7b4ed2-4097-4cc5-9cff-7265340d8d7f")
    public int achatPropriete(Joueur joueur) {
    }

    @objid ("8b6336fe-ec11-4cc6-bd1a-1f914e8e6768")
    public void setEtat(EtatTerrain etat) {
    }

    @objid ("2588f56d-c443-400c-bfc8-89bb984e0c48")
    public void majLoyer() {
    }

}
