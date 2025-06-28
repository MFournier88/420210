package question1;
import java.time.LocalDate;
public class Personne {

    //2, indent
    //2
    private String nom = "Inconnu";
    private String ville = "Non renseignée";
    private String dateNaissance = "0000-00-00";

    //1
    public void setNom(String nom){
        this.nom = nom;
    }

    //1
    public String getNom(){
        return this.nom;
    }

    //5
    public int getAge(){
        LocalDate auj = LocalDate.now();
        String[] dateSplit = dateNaissance.split("-");
        
        LocalDate dateNais = LocalDate.of(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]),Integer.parseInt(dateSplit[2]));

        return auj.getYear() - dateNais.getYear() - ((dateNais.getDayOfYear() > auj.getDayOfYear()) ? 1 : 0);

    }
    //1
    public void setVille(String ville){
        this.ville = ville;
    }
    //1
    public String getVille(){
        return this.ville;
    }
    //10
    public void setDateNaissance(String dateNaissance){
        String[] dateSplit = dateNaissance.split("-");
        LocalDate auj = LocalDate.now();
        LocalDate dateNais;
        try{
            if(dateSplit.length !=3 || dateSplit[0].length() != 4 || dateSplit[1].length() != 2 || dateSplit[2].length() != 2){
                throw new IllegalArgumentException();
            }
            dateNais = LocalDate.of(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]),Integer.parseInt(dateSplit[2]));
        }
        catch(Exception e){
            System.err.println("Format de la date incorrecte");
            return;
        }
        if(auj.compareTo(dateNais) < 0){
            System.err.println("La date de naissance est dans le futur...");
            return;
        }
        this.dateNaissance = dateNaissance;
        
    }
    //2
    public String getDateNaissance(){
        return this.dateNaissance;
    } 

    //3
    public Personne(String nom, String ville, String dateNaissance){
        this.setNom(nom);
        this.setVille(ville);
        this.setDateNaissance(dateNaissance);
    }

    //4
    public String sePresenter(){
        return String.format("Je m'appelle %s et j'ai %d ans.", this.getNom(), this.getAge());
    } 
    //3
    public static boolean compare(Personne personne1, Personne personne2){
        return (personne1.getNom().equals(personne2.getNom()) && personne1.getVille().equals(personne2.getVille()));
    }
    public static void main(String[] args) {
        Personne bob = new Personne("Bob", "Chicoutimi", "1997-04-20");
        System.out.println(bob.getAge());
        //27
        System.out.println(bob.sePresenter());
        // Je m'appelle Bob et j'ai 27 ans
    }
}
