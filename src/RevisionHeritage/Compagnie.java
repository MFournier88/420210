package RevisionHeritage;

import java.util.ArrayList;

public class Compagnie {

    ArrayList<Employe> employes = new ArrayList<Employe>();
    public void embauche(Employe nouveau){
        employes.add(nouveau);
    }
    

}
