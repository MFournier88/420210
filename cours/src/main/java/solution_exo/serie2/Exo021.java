package solution_exo.serie2;
import java.util.ArrayList;

public class Exo021 {
    public static void main(String[] args) {
        Depense test1 = new Depense("Bouf", 123.54, Categorie.nourriture);
        Depense test2 = new Depense("Salaire", -123.54, Categorie.diver);
        Depense test3 = new Depense("voiture", 10000, Categorie.diver);
        System.out.println(test1);

        Budget budget = new Budget(1000);
        budget.ajouterDepense(test1);
        budget.ajouterDepense(test2);
        budget.ajouterDepense(test3);


    }
    
}
enum Categorie{
    voyage,
    santé,
    habitation,
    nourriture,
    éducation,
    loisir,
    diver
}
class Depense{
    private String nom = "";
    private double cout = 0;
    private Categorie categorie = Categorie.diver;


    public Depense(String nom, double cout, Categorie categorie){
        this.setNom(nom);
        this.setCout(cout);
        this.setCategorie(categorie);
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void setCout(double cout){
        this.cout = cout;
    }

    public double getCout(){
        return this.cout;
    }

    public void setCategorie(Categorie categorie){
        this.categorie = categorie;
    }

    public Categorie getCategorie(){
        return this.categorie;
    }


    @Override
    public String toString(){
        return String.format("%-30s%10s%9.2f$", this.nom, this.categorie, this.cout);
       
    }
}

class Budget{
    private double montantTotal = 0;
    private double montantUtilise = 0;
    private ArrayList<Depense> depenses = new ArrayList<>();

    public Budget(double montantTotal){
        this.setMontantTotal(montantTotal);
    }

    public void setMontantTotal(double montantTotal){
        if(montantTotal < 0){
            System.out.println("Nous ne pouvons pas avoir un montant total négatif");
            return;
        }
        this.montantTotal = montantTotal;
    }

    public double getMontantTotal(){
        return this.montantTotal;
    }

    public void setMontantUtilise(double montantUtilise){
        this.montantUtilise = montantUtilise;
    }

    public double getMontantUtilise(){
        return this.montantUtilise;
    }

    public void ajouterDepense(Depense depense){
        if(this.montantUtilise + depense.getCout() > this.montantTotal){
            System.out.println("Échec de l'ajout de  : " + depense);
            System.out.println("Montant total excédé");
            return;
        }
        else if(depense.getCout() >= 0){
            this.depenses.add(depense);
        }
        else{
            System.out.println("Échec de l'ajout de  : " + depense);
            System.out.println("Le coût est négatif");
            return;
        }
    }

    public void modifierDepense(int indice, Depense depense){
        this.depenses.set(indice, depense);
    }

    public void retirerDepense(int indice){
        this.depenses.remove(indice);
    }
}