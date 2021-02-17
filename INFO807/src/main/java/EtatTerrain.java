import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6b78d900-354a-4907-b1f9-c3dbd537146c")
public abstract class EtatTerrain {
    @objid ("c92858b0-8961-4f0a-9c9e-ff49d49326c9")
    public Terrain terrain;

    @objid ("b6114f1a-2c6d-4726-a70d-0895293b417d")
    public void retireProprietaire() {
    }

    @objid ("50404a4a-bb16-429e-93f5-725ba2ab65a4")
    public void evalConstructible(boolean estConstructible) {
    }

    @objid ("6213db78-5c6d-46ea-bb55-0dd3c7d58216")
    public void evalPlein() {
    }

    @objid ("41e49ea2-a194-487c-b526-5857a5d8d5e7")
    public boolean construireMaison() {
    }

    @objid ("c7b45cf1-ce8e-42ac-b91e-4157aa289138")
    public void tombeSurCase(Joueur joueur) {
    }

    @objid ("6006a926-7d4b-4b8d-b9d8-af067050c2ae")
    public int achatPropriete(Joueur joueur) {
    }

    @objid ("69f2b14a-8c75-4f05-b889-439736b9ad62")
    public void verifConstructible(Joueur joueur) {
    }

    @objid ("568e071d-3082-4d68-9be1-e7eeee1a4c75")
    public void devientConstructible() {
    }

    @objid ("548c44c2-cbb3-4998-a328-ab8f2fb59f90")
    public void majLoyer() {
    }

    @objid ("0bc4c2be-642f-4816-8449-802e513ea045")
    public boolean verifJoueur(Joueur joueur) {
    }

    @objid ("f16de7ee-c5d9-47c5-913f-c7f8b67082b1")
    public int compteMaison() {
    }

    @objid ("4cc877c8-dba7-4e4c-8588-11fa909ac864")
    public boolean verifPlein() {
    }

    @objid ("7722d727-b72b-4d7f-87b0-dc2c51949d40")
    public void devientOccupe() {
    }

}
