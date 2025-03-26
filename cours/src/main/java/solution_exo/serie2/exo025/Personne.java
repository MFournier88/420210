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
        String[] dateNaissanceSplit = dateNaissance.split("-");
        if(dateNaissanceSplit[0].length() == 4 && dateNaissanceSplit[1].length() == 2 && dateNaissanceSplit[2].length() == 2){
            try{
                int[] dateNais = {Integer.parseInt(dateNaissanceSplit[0]), Integer.parseInt(dateNaissanceSplit[0]), Integer.parseInt(dateNaissanceSplit[0])};
                LocalDate auj = LocalDate.now();
    
                if(auj.getYear() < dateNais[0]){
                    this.setDateNaissance(dateNaissance);
                }
                if(auj.getYear() == dateNais[0] && auj.getMonthValue() < dateNais[1]){
                    this.setDateNaissance(dateNaissance);

                }
                if(auj.getYear() == dateNais[0] && auj.getMonthValue() == dateNais[1] && auj.getDayOfMonth() <= dateNais[2]){
                    this.setDateNaissance(dateNaissance);

                    
                }
            }
            catch(Exception e){
                System.out.println("Erreur");
                return;
            }

        }
        else{
            System.out.println("Erreur");
        }
    }
    public String getDateNaissance(){
        return this.dateNaissance;
    }
    

    public String getPresentation(){
        return String.format("Je m'appelle %s et j'ai %d ans.",this.nom, this.age);
    }

    public static boolean compare(Personne pers1, Personne pers2){
        return (pers1.getNom().equals(pers2.getNom()) && pers1.getVille().equals(pers2.getVille()));
    }
    public static void main(String[] args) {
        String dateNaissance = "1996-01-03";
       

        // Personne maxime = new Personne("Maxime", "Mtl", dateNaissance);
        // System.out.println(maxime.getAge());
        // maxime.setDateNaissance("12312312-45-10");;
    }
}








// String[] dateNaissanceSplit = dateNaissance.split("-");
// if(dateNaissanceSplit.length != 3){
//     System.out.println("Erreur format de la date");
//     return;
// }
// try{
//     LocalDate dateNaissanceFormat = LocalDate.of(Integer.parseInt(dateNaissanceSplit[0]),Integer.parseInt(dateNaissanceSplit[0]),Integer.parseInt(dateNaissanceSplit[0]));
//     LocalDate auj = LocalDate.now();
//     if(auj.getYear() > dateNaissanceFormat.getYear() || ( auj.getYear() == dateNaissanceFormat.getYear() && auj.getMonth().compareTo(dateNaissanceFormat.getMonth()) > 0 )|| ( auj.getYear() == dateNaissanceFormat.getYear() && auj.getMonthValue() == dateNaissanceFormat.getMonthValue() && auj.getDayOfMonth() > dateNaissanceFormat.getDayOfMonth())){
//         this.setDateNaissance(dateNaissance);
//     }
//     else{
//         System.out.println("Erreur");
//         return;
//     }
// }
// catch(Exception e){
//     System.out.println(" Erreur Format de la date");
//     return;
// }






































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