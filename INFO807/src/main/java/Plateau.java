import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f415096a-016a-43f8-bff3-6a23c5a9b743")
public class Plateau {
    @objid ("b9d1079f-00ae-4ee6-8ad0-73a7f005d4f7")
    public List<Case> case = new ArrayList<Case> ();

    @objid ("beabe987-2b00-48b4-a521-883673aa6415")
    public List<Quartier> quartier = new ArrayList<Quartier> ();

    @objid ("dcbbfe3d-572e-4476-b8b6-c01c5afa12c1")
    public Case avancer(Case courant, int distance) {
    }

    @objid ("aa4f3b86-318f-4b5f-9221-ada38121b83d")
    public boolean verifPassageDepart(Case courant, Case suivant) {
    }

    @objid ("8829305a-d38b-4924-94e1-a848366164a3")
    public boolean verifQuartier(Propriete propriete, Joueur joueur) {
    }

    @objid ("2225e837-18d7-4b8b-9369-236e7bf3649c")
    public int vendrePropriete(Propriete propriete) {
    }

}
