package solution_exo.serie2.exo025;
import java.time.DateTimeException;
import java.time.LocalDate;
public class Personne {
    private String nom = "Inconnu";
    private int age = -1;
    private String ville = "Non renseignée";
    private String dateNaissance = "0000-00-00";

    public Personne(String nom, String ville, String dateNaissance){
        this.setNom(nom);
        this.setVille(ville);
        this.setDateNaissance(dateNaissance);
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }

    public void setAge(int age){
       
        if(age >=0 && age <=125){
            this.age = age;
        }
        else{
            System.out.println("Age impossible");
        }
    }
    public int getAge(){
        this.setDateNaissance(this.getDateNaissance());
        return this.age;
    }

    public void setVille(String ville){
        this.ville = ville;
    }
    public String getVille(){
        return this.ville;
    }
    public void setDateNaissance(String dateNaissance){
        LocalDate cur = LocalDate.now();
        
        String[] data = dateNaissance.split("-");
        if(data.length != 3){
            System.out.println("Erreur");
            return;
        }
        LocalDate naissance;
        try{

            naissance = LocalDate.of(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]));
        }
        catch(DateTimeException e){
            System.out.println("The birthday is in the wrong format or impossible");
            return;
        }
        if(cur.compareTo(naissance) >= 0){
            this.dateNaissance = dateNaissance;
            if(cur.getDayOfYear() < naissance.getDayOfYear()){
                this.setAge(cur.getYear() - naissance.getYear() -1);

            }
            else{
                this.setAge(cur.getYear() - naissance.getYear());

            }
        }
        else{
            System.out.println("Naissance dans le future impossible");
            return;
        }
        
    }
    public String getDateNaissance(){
        return this.dateNaissance;
    }
    

    public String getPresantation(){
        return String.format("Je m'appelle %s et j'ai %d ans.",this.nom, this.age);
    }

    public static boolean compare(Personne pers1, Personne pers2){
        return (pers1.getNom() == pers2.getNom() && pers1.getVille() == pers2.getVille());
    }
    public static void main(String[] args) {
        String dateNaissance = "1998-01-03";

        Personne maxime = new Personne("Maxime", "Mtl", dateNaissance);
        System.out.println(maxime.getAge());
        maxime.setDateNaissance("12312312-45-10");;
    }
}
