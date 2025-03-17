class Personne {
    private String nom = "";
    
    private byte age = -1;
    
    private String ville = "";
    
    public Personne(String nom, byte age, String ville){
        this.setAge(age);
        this.setNom(nom);
        this.setVille(ville);
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setAge(byte age){
        if(age < 0 || age > 125){
            System.out.println("Age invalide"); 
        }
        this.age = age;
    }
    public byte getAge(){
        return this.age;
    }
    public void setVille(String ville){
        this.ville = ville;
    }
  
    public String getVille(){
        return this.ville;
    }
}

public class Main{
   public static void main(String[] args) {
    
   }
}