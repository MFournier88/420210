package exceptions;

import java.util.ArrayList;

public class Compagnie {
    protected ArrayList<Emp> employes = new ArrayList<Emp>();
    public void ajouterEmploye(Emp employe){
        employes.add(employe);
    }
    public void coutAnnuel(){
        double cout = 0;
        for(int i = 0; i < 26;i++){
            for(Emp val : employes){
                cout += val.paye();
            }
        }
        System.out.println("Cout Annuel : " + cout);
    }
}
