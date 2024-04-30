package PreExam1.R5;

public class Service {
    public static void main(String[] args){
        Produit produit1 = new Produit(14,"Lait","Viens de la vache",14.25,false);
        Produit produit2 = new Produit(15,"Biscuit","Miam",13.25,true);
        Produit produit3 = new Produit(16,"Farine","Blanc",19.25,true);

        Produit[] listeProduits = {produit1,produit2,produit3};

        for(Produit produit : listeProduits){

            if(produit.hasPromotion) {
                produit.affichePrixPromotion();
            }else{
                produit.affiche();
            }
        }
    }

}
