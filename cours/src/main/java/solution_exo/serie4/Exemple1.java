package solution_exo.serie4;
import java.util.ArrayList;;
public class Exemple1 {
    public static void main(String[] args) {
        Billet billet1 = new Billet(101, null, 200, false);
        Billet billet2 = new Billet(102, null, 150, true);
        Billet billet3 = new Billet(201, null, 300, true);
        Billet billet4 = new Billet(301, null, 500, true);
        ArrayList<Billet> billets1 = new ArrayList<>();
        billets1.add(billet1);
        billets1.add(billet2); 

        ArrayList<Billet> billets2 = new ArrayList<>();
        billets2.add(billet3);
        
        ArrayList<Billet> billets3 = new ArrayList<>();
        billets3.add(billet4);


        Vol[] vols = new Vol[]{
            new Vol(1,TypeVol.NATIONAL, "Canada", billets1),
            new Vol(2, TypeVol.INTERNATIONAL, "France", billets2),
            new Vol(3, TypeVol.INTERNATIONAL, "Mexique", billets3)
        };


        System.out.printf("💰 Prix total des billets : %.2f$",OutilsGestion.calculPrixReelBillets(vols));

        System.out.println("\n✈️ Billets internationaux :");
        OutilsGestion.afficherInfoVolFiltre(vols, TypeVol.INTERNATIONAL);

        System.out.println("\n🏠 Billets nationaux :");
        OutilsGestion.afficherInfoVolFiltre(vols, TypeVol.NATIONAL);

    }
    
}
enum TypeVol{
    INTERNATIONAL,
    NATIONAL
}
class Billet{
    private int idBillet;
    private String nomPassager;
    private float prixBillet;
    private boolean estElectronique;
    public Billet(int idBillet, String nomPassager, float prixBillet, boolean estElectronique) {
        this.idBillet = idBillet;
        this.nomPassager = nomPassager;
        this.prixBillet = prixBillet;
        this.estElectronique = estElectronique;
    }
    public int getIdBillet() {
        return idBillet;
    }
    public void setIdBillet(int idBillet) {
        this.idBillet = idBillet;
    }
    public String getNomPassager() {
        return nomPassager;
    }
    public void setNomPassager(String nomPassager) {
        this.nomPassager = nomPassager;
    }
    public float getPrixBillet() {
        return prixBillet;
    }
    public void setPrixBillet(float prixBillet) {
        this.prixBillet = prixBillet;
    }
    public boolean getEstElectronique() {
        return estElectronique;
    }
    public void setEstElectronique(boolean estElectronique) {
        this.estElectronique = estElectronique;
    }
    


}   

class Vol{
    private int idVol;
    private TypeVol typevol;
    private String destination;
    private ArrayList<Billet> billets;
    
    public Vol(int idVol, TypeVol typevol, String destination, ArrayList<Billet> billets) {
        this.idVol = idVol;
        this.typevol = typevol;
        this.destination = destination;
        this.billets = billets;
    }
    public TypeVol getTypevol() {
        return typevol;
    }
    public void setTypevol(TypeVol typevol) {
        this.typevol = typevol;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public ArrayList<Billet> getBillets() {
        return billets;
    }
    public void setBillets(ArrayList<Billet> billets) {
        this.billets = billets;
    }
    public int getIdVol() {
        return idVol;
    }
    public void setIdVol(int idVol) {
        this.idVol = idVol;
    }
}

class OutilsGestion{
    private static final float TPS = 0.06f;
    private static final float TVQ = 0.10f;
    private static final float TVA = 0.05f;

    public static float calculPrixReelBillet(Billet billet, Vol vol){
        if(vol.getTypevol() == TypeVol.INTERNATIONAL){
            if(vol.getDestination().equals("France")){
                return billet.getEstElectronique() ? billet.getPrixBillet() * (1 + TPS + TVQ) : billet.getPrixBillet();
            }
            else{
                return billet.getEstElectronique() ? billet.getPrixBillet() * (1 + TPS) : billet.getPrixBillet();
                
            }
        }
        else{
            return billet.getEstElectronique() ? billet.getPrixBillet() * (1 + TVA) : billet.getPrixBillet();

        }
    }
    public static float calculPrixReelBillets(Vol[] vols){
        float somme = 0;
        for (Vol vol : vols) {
            for (Billet billet : vol.getBillets()) {
                somme += calculPrixReelBillet(billet, vol);
                
            }
        }
        return somme;
    }
    public static void afficherInfoVolFiltre(Vol[] vols, TypeVol typeVol){
        for (Vol vol : vols) {
            if(typeVol == vol.getTypevol()){
                afficherInfoVol(vol);
            }
            else if(typeVol == vol.getTypevol()){
                afficherInfoVol(vol);
            }
        }
    }

    public static void afficherInfoVol(Vol vol){
        for (Billet billet : vol.getBillets()) {
            System.out.printf("%10s%10d%10.2f$\n","",billet.getIdBillet(), calculPrixReelBillet(billet, vol));
        }
    }
}

