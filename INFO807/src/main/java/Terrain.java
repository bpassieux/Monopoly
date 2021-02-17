import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("93a18bc9-b05c-47a9-840c-27161c20ac32")
public class Terrain extends Propriete {
    @mdl.prop
    @objid ("bafdacbb-3def-43fd-b098-f9587ce40fab")
    private int nbmaisons = 0;

    @mdl.propgetter
    public int getNbmaisons() {
        // Automatically generated method. Please do not modify this code.
        return this.nbmaisons;
    }

    @mdl.propsetter
    public void setNbmaisons(int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbmaisons = value;
    }

    @mdl.prop
    @objid ("0de73ecc-c8f6-4a0f-ac33-750c420e95bf")
    private int nbhotels = 0;

    @mdl.propgetter
    public int getNbhotels() {
        // Automatically generated method. Please do not modify this code.
        return this.nbhotels;
    }

    @mdl.propsetter
    public void setNbhotels(int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbhotels = value;
    }

    @objid ("30ea46e7-967f-49d9-8446-07a26ef63c6b")
    public EtatTerrain etatTerrain;

    @objid ("fe168373-8ca5-4b01-a797-035fd7b4cadf")
    public boolean construireMaison() {
    }

    @objid ("d0a662e0-c44a-48ef-8205-64f5a399f848")
    public void evalConstructible(boolean estConstructible) {
    }

    @objid ("6fbbe9c4-c897-42b4-8243-f71077e59c85")
    public void evalPlein() {
    }

    @objid ("ed935e83-b893-4fcc-bb0b-bd2a12f5a737")
    public void devientConstructible() {
    }

    @objid ("117c8cfc-9abc-4d62-901a-9261ee40034d")
    public void devientOccupe() {
    }

}
